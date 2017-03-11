import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import com.mchange.v2.c3p0.ComboPooledDataSource;


import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.HashMap;

/**
 * Created by chenyongkai on 2017/3/1.
 */
@Configuration
@PropertySource({ "classpath:persistence-multiple-db.properties" })
@ComponentScan(basePackages = "com.sinopec.chememall.dt.dao")
@EnableJpaRepositories(
        basePackages = "com.sinopec.chememall.dt.dao.OracleRepo",
        entityManagerFactoryRef = "OracleEntityManager",
        transactionManagerRef = "OracleTransactionManager"
)
public class OracleDaoConfig {
    @Autowired
    private Environment env;

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean OracleEntityManager() throws PropertyVetoException {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(OracleDataSource());
        em.setPackagesToScan(
                new String[] { "com.sinopec.chememall.dt.dao","com.sinopec.chememall.dt.entityo","com.sinopec.chememall.dt.service" });
        em.setPersistenceUnitName("PSUOr");

        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
                env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect",
                env.getProperty("hibernate.dialect"));
        properties.put("hibernate.show-sql",
                env.getProperty("hibernate.show-sql"));
        properties.put("hibernate.format-sql",
                env.getProperty("hibernate.format-sql"));
        properties.put("hibernate.ejb.entitymanager_factory_name",
                env.getProperty("hibernate.ejb.entitymanager_factory_name"));

        em.setJpaPropertyMap(properties);

        return em;
    }

    @Primary
    @Bean
    public DataSource OracleDataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource=new ComboPooledDataSource();
//
//        dataSource.setDriverClass(env.getProperty("jdbc.driverClassName"));
//        dataSource.setUser(env.getProperty("jdbc.user"));
//        dataSource.setJdbcUrl(env.getProperty("user.jdbc.url"));
//        dataSource.setPassword(env.getProperty("jdbc.pass"));

                DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("user.jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user"));
        dataSource.setPassword(env.getProperty("jdbc.pass"));

        return dataSource;
    }

    @Primary
    @Bean
    public PlatformTransactionManager OracleTransactionManager() throws PropertyVetoException {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                OracleEntityManager().getObject());
        return transactionManager;
    }
}
