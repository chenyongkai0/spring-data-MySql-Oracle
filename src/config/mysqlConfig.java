import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * Created by chenyongkai on 2017/3/1.
 */
@Configuration
@PropertySource({"classpath:persistence-multiple-db.properties"})
@ComponentScan("com.sinopec.chememall.dt.dao")
@EnableJpaRepositories(
        basePackages = "com.sinopec.chememall.dt.dao.MySqlRepo",
        entityManagerFactoryRef = "MySqlEntityManager",
        transactionManagerRef = "MySqlTransactionManager"
)
public class MySqlDaoConfig {
    @Autowired
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean MySqlEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(MySqlDataSource());
        em.setPackagesToScan(
                new String[]{"com.sinopec.chememall.dt.dao", "com.sinopec.chememall.dt.entitym", "com.sinopec.chememall.dt.service"});
        em.setPersistenceUnitName("PSUMy");

        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2ddl.auto2"));
        properties.put("hibernate.dialect",
                env.getProperty("hibernate.dialect2"));
        properties.put("hibernate.show-sql",
                env.getProperty("hibernate.show-sql2"));
        properties.put("hibernate.format-sql",
                env.getProperty("hibernate.format-sql2"));
        properties.put("hibernate.ejb.entitymanager_factory_name",
                env.getProperty("hibernate.ejb.entitymanager_factory_name2"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    public DataSource MySqlDataSource() {

        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                env.getProperty("jdbc.driverClassName2"));
        dataSource.setUrl(env.getProperty("user.jdbc.url2"));
        dataSource.setUsername(env.getProperty("jdbc.user2"));
        dataSource.setPassword(env.getProperty("jdbc.pass2"));

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager MySqlTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                MySqlEntityManager().getObject());
        return transactionManager;
    }
}