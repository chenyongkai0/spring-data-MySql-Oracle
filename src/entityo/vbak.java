package com.sinopec.chememall.dt.entityo;

import javax.persistence.*;

/**
 * Created by chenyongkai on 2017/3/4.
 */
@Entity
@Table(name = "VBAK", schema = "CHEM", catalog = "")
@IdClass(EnoVbakPK.class)
public class EnoVbak {
    private String bicLogsys;
    private String mandt;
    private String vbeln;
    private String erdat;
    private String erzet;
    private String ernam;
    private String angdt;
    private String bnddt;
    private String audat;
    private String vbtyp;
    private String trvog;
    private String auart;
    private String augru;
    private String gwldt;
    private String submi;
    private String lifsk;
    private String faksk;
    private Long netwr;
    private String waerk;
    private String vkorg;
    private String vtweg;
    private String spart;
    private String vkgrp;
    private String vkbur;
    private String gsber;
    private String gskst;
    private String guebg;
    private String gueen;
    private String knumv;
    private String vdatu;
    private String vprgr;
    private String autlf;
    private String vbkla;
    private String vbklt;
    private String kalsm;
    private String vsbed;
    private String fkara;
    private String awahr;
    private String ktext;
    private String bstnk;
    private String bsark;
    private String bstdk;
    private String bstzd;
    private String ihrez;
    private String bname;
    private String telf1;
    private Byte mahza;
    private String mahdt;
    private String kunnr;
    private String kostl;
    private String stafo;
    private String stwae;
    private String aedat;
    private String kvgr1;
    private String kvgr2;
    private String kvgr3;
    private String kvgr4;
    private String kvgr5;
    private String knuma;
    private String kokrs;
    private String psPspPnr;
    private String kurst;
    private String kkber;
    private String knkli;
    private String grupp;
    private String sbgrp;
    private String ctlpc;
    private String cmwae;
    private String cmfre;
    private String cmnup;
    private String cmngv;
    private Long amtbl;
    private String hitypPr;
    private String abrvw;
    private String abdis;
    private String vgbel;
    private String objnr;
    private String bukrsVf;
    private String taxk1;
    private String taxk2;
    private String taxk3;
    private String taxk4;
    private String taxk5;
    private String taxk6;
    private String taxk7;
    private String taxk8;
    private String taxk9;
    private String xblnr;
    private String zuonr;
    private String vgtyp;
    private String kalsmCh;
    private String agrzr;
    private String aufnr;
    private String qmnum;
    private String vbelnGrp;
    private String schemeGrp;
    private String abrufPart;
    private String abhod;
    private String abhov;
    private String abhob;
    private String rplnr;
    private String vzeit;
    private String stcegL;
    private String landtx;
    private String xegdr;
    private String enqueueGrp;
    private String datFzau;
    private String fmbdat;
    private String vsnmrV;
    private String handle;
    private String proli;
    private String contDg;
    private String crmGuid;
    private Long updTmstmp;
    private String msrId;
    private String tmCtrlKey;
    private String psmBudat;
    private String swenr;
    private String smenr;
    private String phase;
    private String mtlaur;
    private Integer stage;
    private String hbContReason;
    private String hbExpdate;
    private String hbResdate;
    private String millApplId;
    private String oidExtbol;
    private String oidMiscdl;
    private String oidmsgShp;
    private String oidstsShp;
    private String oipipeval;
    private String oicLifnr;
    private String oicDcityc;
    private String oicDcounc;
    private String oicDregio;
    private String oicDland1;
    private String oicOcityc;
    private String oicOcounc;
    private String oicOregio;
    private String oicOland1;
    private String oicPorgin;
    private String oicPdestn;
    private String oicPtrip;
    private String oicPbatch;
    private String oicMot;
    private String oicAorgin;
    private String oicAdestn;
    private String oicTruckn;
    private String oiaBaselo;
    private String oiinex;
    private String oiisoil;
    private String oiptrfnc;
    private String oipartnr;
    private String oilastor;
    private String oidrc;
    private String oiexgnum;
    private String oiexgtyp;
    private String oicheadoff;
    private String oipbl;
    private String oidrestr;
    private String oidmsgPrd;
    private String oidmsgQty;
    private String oidmsgUom;
    private String oidmsgDat;
    private String oidmsgTrm;
    private String oicntper;
    private String oicntnte;
    private String oicntpho;
    private String oidSortl;
    private String oidSort2;
    private String oicfkartdi;
    private String oiaevgtype;
    private String oiuCtTypeCd;
    private String oiuCustVendCd;
    private String oiuApprFl;
    private String oiuApprDt;
    private String oiuExecDt;
    private String oiuStdCtFl;
    private String oiuPrevCtNo;
    private String oiuGpltCompany;
    private String oiuGpltVname;
    private String oiuGpltDoiNo;
    private String oiuMkRepNo;
    private String oiuMkRepIsq;
    private String oiuDestSaleCd;
    private String oiuLifeLseFl;
    private String oiuInvNo;
    private String oiuInvFl;
    private String oiuObligDt;
    private String oiuDeskCd;
    private String oiuEiaGinaCd;
    private String oiuCtStatusCd;
    private String oiuSpotTermCd;
    private String oiuStndedqCd;
    private String oiuIotrFl;
    private String oiuIntraInter;
    private String oiuExresSplt;
    private String oiuEvgnFl;
    private String oiuEvgnpdBas;
    private String oiuEvgnPerdQy;
    private String oiuPreimTmCd;
    private String oiuPrimTmQy;
    private String oiuSecTmCd;
    private String oiuSecTmQy;
    private String oiuExpNotifDt;
    private String oiuIntitRdtDt;
    private String oiuNextRdtDt;
    private String oiuRtcDt;
    private Long oiuRdtNPerd;
    private String oiuRdtRefqCd;
    private String oiuRtfCd;
    private String oiuImbPrvsnFl;
    private String oiuFfeeRmbFl;
    private String oiuFirmIntrpt;
    private String oiuBalBasCd;
    private String oiuPntyBasCd;
    private String oiuTranspBa;
    private Long oiuDlyMaxTQy;
    private String oiuPrcsFl;
    private String oiuSprFl;
    private String oiuDehydFl;
    private String oiuComprFl;
    private String oiuPymtMethCd;
    private String oiuConMatnr;
    private String oiuConMaxQy;
    private String oiuAffilFl;
    private String oiuMmsTypeCd;
    private String oiuMmsEtpayFl;
    private String oiuhCtNo;
    private String tas;
    private String betc;
    private String modAllow;
    private String cancelAllow;
    private String payMethod;
    private String bpn;
    private String repFreq;
    private String logsysb;
    private String kalcd;
    private String multi;
    private String sppaym;
    private String wtyscClmHdr;

    @Id
    @Column(name = "\"/BIC/LOGSYS\"", nullable = false, length = 20)
    public String getBicLogsys() {
        return bicLogsys;
    }

    public void setBicLogsys(String bicLogsys) {
        this.bicLogsys = bicLogsys;
    }

    @Basic
    @Column(name = "MANDT", nullable = true, length = 18)
    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    @Id
    @Column(name = "VBELN", nullable = false, length = 60)
    public String getVbeln() {
        return vbeln;
    }

    public void setVbeln(String vbeln) {
        this.vbeln = vbeln;
    }

    @Basic
    @Column(name = "ERDAT", nullable = true, length = 48)
    public String getErdat() {
        return erdat;
    }

    public void setErdat(String erdat) {
        this.erdat = erdat;
    }

    @Basic
    @Column(name = "ERZET", nullable = true, length = 36)
    public String getErzet() {
        return erzet;
    }

    public void setErzet(String erzet) {
        this.erzet = erzet;
    }

    @Basic
    @Column(name = "ERNAM", nullable = true, length = 72)
    public String getErnam() {
        return ernam;
    }

    public void setErnam(String ernam) {
        this.ernam = ernam;
    }

    @Basic
    @Column(name = "ANGDT", nullable = true, length = 48)
    public String getAngdt() {
        return angdt;
    }

    public void setAngdt(String angdt) {
        this.angdt = angdt;
    }

    @Basic
    @Column(name = "BNDDT", nullable = true, length = 48)
    public String getBnddt() {
        return bnddt;
    }

    public void setBnddt(String bnddt) {
        this.bnddt = bnddt;
    }

    @Basic
    @Column(name = "AUDAT", nullable = true, length = 48)
    public String getAudat() {
        return audat;
    }

    public void setAudat(String audat) {
        this.audat = audat;
    }

    @Basic
    @Column(name = "VBTYP", nullable = true, length = 6)
    public String getVbtyp() {
        return vbtyp;
    }

    public void setVbtyp(String vbtyp) {
        this.vbtyp = vbtyp;
    }

    @Basic
    @Column(name = "TRVOG", nullable = true, length = 6)
    public String getTrvog() {
        return trvog;
    }

    public void setTrvog(String trvog) {
        this.trvog = trvog;
    }

    @Basic
    @Column(name = "AUART", nullable = true, length = 24)
    public String getAuart() {
        return auart;
    }

    public void setAuart(String auart) {
        this.auart = auart;
    }

    @Basic
    @Column(name = "AUGRU", nullable = true, length = 18)
    public String getAugru() {
        return augru;
    }

    public void setAugru(String augru) {
        this.augru = augru;
    }

    @Basic
    @Column(name = "GWLDT", nullable = true, length = 48)
    public String getGwldt() {
        return gwldt;
    }

    public void setGwldt(String gwldt) {
        this.gwldt = gwldt;
    }

    @Basic
    @Column(name = "SUBMI", nullable = true, length = 60)
    public String getSubmi() {
        return submi;
    }

    public void setSubmi(String submi) {
        this.submi = submi;
    }

    @Basic
    @Column(name = "LIFSK", nullable = true, length = 12)
    public String getLifsk() {
        return lifsk;
    }

    public void setLifsk(String lifsk) {
        this.lifsk = lifsk;
    }

    @Basic
    @Column(name = "FAKSK", nullable = true, length = 12)
    public String getFaksk() {
        return faksk;
    }

    public void setFaksk(String faksk) {
        this.faksk = faksk;
    }

    @Basic
    @Column(name = "NETWR", nullable = true, precision = 2)
    public Long getNetwr() {
        return netwr;
    }

    public void setNetwr(Long netwr) {
        this.netwr = netwr;
    }

    @Basic
    @Column(name = "WAERK", nullable = true, length = 30)
    public String getWaerk() {
        return waerk;
    }

    public void setWaerk(String waerk) {
        this.waerk = waerk;
    }

    @Basic
    @Column(name = "VKORG", nullable = true, length = 24)
    public String getVkorg() {
        return vkorg;
    }

    public void setVkorg(String vkorg) {
        this.vkorg = vkorg;
    }

    @Basic
    @Column(name = "VTWEG", nullable = true, length = 12)
    public String getVtweg() {
        return vtweg;
    }

    public void setVtweg(String vtweg) {
        this.vtweg = vtweg;
    }

    @Basic
    @Column(name = "SPART", nullable = true, length = 12)
    public String getSpart() {
        return spart;
    }

    public void setSpart(String spart) {
        this.spart = spart;
    }

    @Basic
    @Column(name = "VKGRP", nullable = true, length = 18)
    public String getVkgrp() {
        return vkgrp;
    }

    public void setVkgrp(String vkgrp) {
        this.vkgrp = vkgrp;
    }

    @Basic
    @Column(name = "VKBUR", nullable = true, length = 24)
    public String getVkbur() {
        return vkbur;
    }

    public void setVkbur(String vkbur) {
        this.vkbur = vkbur;
    }

    @Basic
    @Column(name = "GSBER", nullable = true, length = 24)
    public String getGsber() {
        return gsber;
    }

    public void setGsber(String gsber) {
        this.gsber = gsber;
    }

    @Basic
    @Column(name = "GSKST", nullable = true, length = 24)
    public String getGskst() {
        return gskst;
    }

    public void setGskst(String gskst) {
        this.gskst = gskst;
    }

    @Basic
    @Column(name = "GUEBG", nullable = true, length = 48)
    public String getGuebg() {
        return guebg;
    }

    public void setGuebg(String guebg) {
        this.guebg = guebg;
    }

    @Basic
    @Column(name = "GUEEN", nullable = true, length = 48)
    public String getGueen() {
        return gueen;
    }

    public void setGueen(String gueen) {
        this.gueen = gueen;
    }

    @Basic
    @Column(name = "KNUMV", nullable = true, length = 60)
    public String getKnumv() {
        return knumv;
    }

    public void setKnumv(String knumv) {
        this.knumv = knumv;
    }

    @Basic
    @Column(name = "VDATU", nullable = true, length = 48)
    public String getVdatu() {
        return vdatu;
    }

    public void setVdatu(String vdatu) {
        this.vdatu = vdatu;
    }

    @Basic
    @Column(name = "VPRGR", nullable = true, length = 6)
    public String getVprgr() {
        return vprgr;
    }

    public void setVprgr(String vprgr) {
        this.vprgr = vprgr;
    }

    @Basic
    @Column(name = "AUTLF", nullable = true, length = 6)
    public String getAutlf() {
        return autlf;
    }

    public void setAutlf(String autlf) {
        this.autlf = autlf;
    }

    @Basic
    @Column(name = "VBKLA", nullable = true, length = 54)
    public String getVbkla() {
        return vbkla;
    }

    public void setVbkla(String vbkla) {
        this.vbkla = vbkla;
    }

    @Basic
    @Column(name = "VBKLT", nullable = true, length = 6)
    public String getVbklt() {
        return vbklt;
    }

    public void setVbklt(String vbklt) {
        this.vbklt = vbklt;
    }

    @Basic
    @Column(name = "KALSM", nullable = true, length = 36)
    public String getKalsm() {
        return kalsm;
    }

    public void setKalsm(String kalsm) {
        this.kalsm = kalsm;
    }

    @Basic
    @Column(name = "VSBED", nullable = true, length = 12)
    public String getVsbed() {
        return vsbed;
    }

    public void setVsbed(String vsbed) {
        this.vsbed = vsbed;
    }

    @Basic
    @Column(name = "FKARA", nullable = true, length = 24)
    public String getFkara() {
        return fkara;
    }

    public void setFkara(String fkara) {
        this.fkara = fkara;
    }

    @Basic
    @Column(name = "AWAHR", nullable = true, length = 18)
    public String getAwahr() {
        return awahr;
    }

    public void setAwahr(String awahr) {
        this.awahr = awahr;
    }

    @Basic
    @Column(name = "KTEXT", nullable = true, length = 240)
    public String getKtext() {
        return ktext;
    }

    public void setKtext(String ktext) {
        this.ktext = ktext;
    }

    @Basic
    @Column(name = "BSTNK", nullable = true, length = 120)
    public String getBstnk() {
        return bstnk;
    }

    public void setBstnk(String bstnk) {
        this.bstnk = bstnk;
    }

    @Basic
    @Column(name = "BSARK", nullable = true, length = 24)
    public String getBsark() {
        return bsark;
    }

    public void setBsark(String bsark) {
        this.bsark = bsark;
    }

    @Basic
    @Column(name = "BSTDK", nullable = true, length = 48)
    public String getBstdk() {
        return bstdk;
    }

    public void setBstdk(String bstdk) {
        this.bstdk = bstdk;
    }

    @Basic
    @Column(name = "BSTZD", nullable = true, length = 24)
    public String getBstzd() {
        return bstzd;
    }

    public void setBstzd(String bstzd) {
        this.bstzd = bstzd;
    }

    @Basic
    @Column(name = "IHREZ", nullable = true, length = 72)
    public String getIhrez() {
        return ihrez;
    }

    public void setIhrez(String ihrez) {
        this.ihrez = ihrez;
    }

    @Basic
    @Column(name = "BNAME", nullable = true, length = 210)
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Basic
    @Column(name = "TELF1", nullable = true, length = 96)
    public String getTelf1() {
        return telf1;
    }

    public void setTelf1(String telf1) {
        this.telf1 = telf1;
    }

    @Basic
    @Column(name = "MAHZA", nullable = true, precision = 0)
    public Byte getMahza() {
        return mahza;
    }

    public void setMahza(Byte mahza) {
        this.mahza = mahza;
    }

    @Basic
    @Column(name = "MAHDT", nullable = true, length = 48)
    public String getMahdt() {
        return mahdt;
    }

    public void setMahdt(String mahdt) {
        this.mahdt = mahdt;
    }

    @Basic
    @Column(name = "KUNNR", nullable = true, length = 60)
    public String getKunnr() {
        return kunnr;
    }

    public void setKunnr(String kunnr) {
        this.kunnr = kunnr;
    }

    @Basic
    @Column(name = "KOSTL", nullable = true, length = 60)
    public String getKostl() {
        return kostl;
    }

    public void setKostl(String kostl) {
        this.kostl = kostl;
    }

    @Basic
    @Column(name = "STAFO", nullable = true, length = 36)
    public String getStafo() {
        return stafo;
    }

    public void setStafo(String stafo) {
        this.stafo = stafo;
    }

    @Basic
    @Column(name = "STWAE", nullable = true, length = 30)
    public String getStwae() {
        return stwae;
    }

    public void setStwae(String stwae) {
        this.stwae = stwae;
    }

    @Basic
    @Column(name = "AEDAT", nullable = true, length = 48)
    public String getAedat() {
        return aedat;
    }

    public void setAedat(String aedat) {
        this.aedat = aedat;
    }

    @Basic
    @Column(name = "KVGR1", nullable = true, length = 18)
    public String getKvgr1() {
        return kvgr1;
    }

    public void setKvgr1(String kvgr1) {
        this.kvgr1 = kvgr1;
    }

    @Basic
    @Column(name = "KVGR2", nullable = true, length = 18)
    public String getKvgr2() {
        return kvgr2;
    }

    public void setKvgr2(String kvgr2) {
        this.kvgr2 = kvgr2;
    }

    @Basic
    @Column(name = "KVGR3", nullable = true, length = 18)
    public String getKvgr3() {
        return kvgr3;
    }

    public void setKvgr3(String kvgr3) {
        this.kvgr3 = kvgr3;
    }

    @Basic
    @Column(name = "KVGR4", nullable = true, length = 18)
    public String getKvgr4() {
        return kvgr4;
    }

    public void setKvgr4(String kvgr4) {
        this.kvgr4 = kvgr4;
    }

    @Basic
    @Column(name = "KVGR5", nullable = true, length = 18)
    public String getKvgr5() {
        return kvgr5;
    }

    public void setKvgr5(String kvgr5) {
        this.kvgr5 = kvgr5;
    }

    @Basic
    @Column(name = "KNUMA", nullable = true, length = 60)
    public String getKnuma() {
        return knuma;
    }

    public void setKnuma(String knuma) {
        this.knuma = knuma;
    }

    @Basic
    @Column(name = "KOKRS", nullable = true, length = 24)
    public String getKokrs() {
        return kokrs;
    }

    public void setKokrs(String kokrs) {
        this.kokrs = kokrs;
    }

    @Basic
    @Column(name = "PS_PSP_PNR", nullable = true, length = 48)
    public String getPsPspPnr() {
        return psPspPnr;
    }

    public void setPsPspPnr(String psPspPnr) {
        this.psPspPnr = psPspPnr;
    }

    @Basic
    @Column(name = "KURST", nullable = true, length = 24)
    public String getKurst() {
        return kurst;
    }

    public void setKurst(String kurst) {
        this.kurst = kurst;
    }

    @Basic
    @Column(name = "KKBER", nullable = true, length = 24)
    public String getKkber() {
        return kkber;
    }

    public void setKkber(String kkber) {
        this.kkber = kkber;
    }

    @Basic
    @Column(name = "KNKLI", nullable = true, length = 60)
    public String getKnkli() {
        return knkli;
    }

    public void setKnkli(String knkli) {
        this.knkli = knkli;
    }

    @Basic
    @Column(name = "GRUPP", nullable = true, length = 24)
    public String getGrupp() {
        return grupp;
    }

    public void setGrupp(String grupp) {
        this.grupp = grupp;
    }

    @Basic
    @Column(name = "SBGRP", nullable = true, length = 18)
    public String getSbgrp() {
        return sbgrp;
    }

    public void setSbgrp(String sbgrp) {
        this.sbgrp = sbgrp;
    }

    @Basic
    @Column(name = "CTLPC", nullable = true, length = 18)
    public String getCtlpc() {
        return ctlpc;
    }

    public void setCtlpc(String ctlpc) {
        this.ctlpc = ctlpc;
    }

    @Basic
    @Column(name = "CMWAE", nullable = true, length = 30)
    public String getCmwae() {
        return cmwae;
    }

    public void setCmwae(String cmwae) {
        this.cmwae = cmwae;
    }

    @Basic
    @Column(name = "CMFRE", nullable = true, length = 48)
    public String getCmfre() {
        return cmfre;
    }

    public void setCmfre(String cmfre) {
        this.cmfre = cmfre;
    }

    @Basic
    @Column(name = "CMNUP", nullable = true, length = 48)
    public String getCmnup() {
        return cmnup;
    }

    public void setCmnup(String cmnup) {
        this.cmnup = cmnup;
    }

    @Basic
    @Column(name = "CMNGV", nullable = true, length = 48)
    public String getCmngv() {
        return cmngv;
    }

    public void setCmngv(String cmngv) {
        this.cmngv = cmngv;
    }

    @Basic
    @Column(name = "AMTBL", nullable = true, precision = 2)
    public Long getAmtbl() {
        return amtbl;
    }

    public void setAmtbl(Long amtbl) {
        this.amtbl = amtbl;
    }

    @Basic
    @Column(name = "HITYP_PR", nullable = true, length = 6)
    public String getHitypPr() {
        return hitypPr;
    }

    public void setHitypPr(String hitypPr) {
        this.hitypPr = hitypPr;
    }

    @Basic
    @Column(name = "ABRVW", nullable = true, length = 18)
    public String getAbrvw() {
        return abrvw;
    }

    public void setAbrvw(String abrvw) {
        this.abrvw = abrvw;
    }

    @Basic
    @Column(name = "ABDIS", nullable = true, length = 6)
    public String getAbdis() {
        return abdis;
    }

    public void setAbdis(String abdis) {
        this.abdis = abdis;
    }

    @Basic
    @Column(name = "VGBEL", nullable = true, length = 60)
    public String getVgbel() {
        return vgbel;
    }

    public void setVgbel(String vgbel) {
        this.vgbel = vgbel;
    }

    @Basic
    @Column(name = "OBJNR", nullable = true, length = 132)
    public String getObjnr() {
        return objnr;
    }

    public void setObjnr(String objnr) {
        this.objnr = objnr;
    }

    @Basic
    @Column(name = "BUKRS_VF", nullable = true, length = 24)
    public String getBukrsVf() {
        return bukrsVf;
    }

    public void setBukrsVf(String bukrsVf) {
        this.bukrsVf = bukrsVf;
    }

    @Basic
    @Column(name = "TAXK1", nullable = true, length = 6)
    public String getTaxk1() {
        return taxk1;
    }

    public void setTaxk1(String taxk1) {
        this.taxk1 = taxk1;
    }

    @Basic
    @Column(name = "TAXK2", nullable = true, length = 6)
    public String getTaxk2() {
        return taxk2;
    }

    public void setTaxk2(String taxk2) {
        this.taxk2 = taxk2;
    }

    @Basic
    @Column(name = "TAXK3", nullable = true, length = 6)
    public String getTaxk3() {
        return taxk3;
    }

    public void setTaxk3(String taxk3) {
        this.taxk3 = taxk3;
    }

    @Basic
    @Column(name = "TAXK4", nullable = true, length = 6)
    public String getTaxk4() {
        return taxk4;
    }

    public void setTaxk4(String taxk4) {
        this.taxk4 = taxk4;
    }

    @Basic
    @Column(name = "TAXK5", nullable = true, length = 6)
    public String getTaxk5() {
        return taxk5;
    }

    public void setTaxk5(String taxk5) {
        this.taxk5 = taxk5;
    }

    @Basic
    @Column(name = "TAXK6", nullable = true, length = 6)
    public String getTaxk6() {
        return taxk6;
    }

    public void setTaxk6(String taxk6) {
        this.taxk6 = taxk6;
    }

    @Basic
    @Column(name = "TAXK7", nullable = true, length = 6)
    public String getTaxk7() {
        return taxk7;
    }

    public void setTaxk7(String taxk7) {
        this.taxk7 = taxk7;
    }

    @Basic
    @Column(name = "TAXK8", nullable = true, length = 6)
    public String getTaxk8() {
        return taxk8;
    }

    public void setTaxk8(String taxk8) {
        this.taxk8 = taxk8;
    }

    @Basic
    @Column(name = "TAXK9", nullable = true, length = 6)
    public String getTaxk9() {
        return taxk9;
    }

    public void setTaxk9(String taxk9) {
        this.taxk9 = taxk9;
    }

    @Basic
    @Column(name = "XBLNR", nullable = true, length = 96)
    public String getXblnr() {
        return xblnr;
    }

    public void setXblnr(String xblnr) {
        this.xblnr = xblnr;
    }

    @Basic
    @Column(name = "ZUONR", nullable = true, length = 108)
    public String getZuonr() {
        return zuonr;
    }

    public void setZuonr(String zuonr) {
        this.zuonr = zuonr;
    }

    @Basic
    @Column(name = "VGTYP", nullable = true, length = 6)
    public String getVgtyp() {
        return vgtyp;
    }

    public void setVgtyp(String vgtyp) {
        this.vgtyp = vgtyp;
    }

    @Basic
    @Column(name = "KALSM_CH", nullable = true, length = 36)
    public String getKalsmCh() {
        return kalsmCh;
    }

    public void setKalsmCh(String kalsmCh) {
        this.kalsmCh = kalsmCh;
    }

    @Basic
    @Column(name = "AGRZR", nullable = true, length = 12)
    public String getAgrzr() {
        return agrzr;
    }

    public void setAgrzr(String agrzr) {
        this.agrzr = agrzr;
    }

    @Basic
    @Column(name = "AUFNR", nullable = true, length = 72)
    public String getAufnr() {
        return aufnr;
    }

    public void setAufnr(String aufnr) {
        this.aufnr = aufnr;
    }

    @Basic
    @Column(name = "QMNUM", nullable = true, length = 72)
    public String getQmnum() {
        return qmnum;
    }

    public void setQmnum(String qmnum) {
        this.qmnum = qmnum;
    }

    @Basic
    @Column(name = "VBELN_GRP", nullable = true, length = 60)
    public String getVbelnGrp() {
        return vbelnGrp;
    }

    public void setVbelnGrp(String vbelnGrp) {
        this.vbelnGrp = vbelnGrp;
    }

    @Basic
    @Column(name = "SCHEME_GRP", nullable = true, length = 24)
    public String getSchemeGrp() {
        return schemeGrp;
    }

    public void setSchemeGrp(String schemeGrp) {
        this.schemeGrp = schemeGrp;
    }

    @Basic
    @Column(name = "ABRUF_PART", nullable = true, length = 6)
    public String getAbrufPart() {
        return abrufPart;
    }

    public void setAbrufPart(String abrufPart) {
        this.abrufPart = abrufPart;
    }

    @Basic
    @Column(name = "ABHOD", nullable = true, length = 48)
    public String getAbhod() {
        return abhod;
    }

    public void setAbhod(String abhod) {
        this.abhod = abhod;
    }

    @Basic
    @Column(name = "ABHOV", nullable = true, length = 36)
    public String getAbhov() {
        return abhov;
    }

    public void setAbhov(String abhov) {
        this.abhov = abhov;
    }

    @Basic
    @Column(name = "ABHOB", nullable = true, length = 36)
    public String getAbhob() {
        return abhob;
    }

    public void setAbhob(String abhob) {
        this.abhob = abhob;
    }

    @Basic
    @Column(name = "RPLNR", nullable = true, length = 60)
    public String getRplnr() {
        return rplnr;
    }

    public void setRplnr(String rplnr) {
        this.rplnr = rplnr;
    }

    @Basic
    @Column(name = "VZEIT", nullable = true, length = 36)
    public String getVzeit() {
        return vzeit;
    }

    public void setVzeit(String vzeit) {
        this.vzeit = vzeit;
    }

    @Basic
    @Column(name = "STCEG_L", nullable = true, length = 18)
    public String getStcegL() {
        return stcegL;
    }

    public void setStcegL(String stcegL) {
        this.stcegL = stcegL;
    }

    @Basic
    @Column(name = "LANDTX", nullable = true, length = 18)
    public String getLandtx() {
        return landtx;
    }

    public void setLandtx(String landtx) {
        this.landtx = landtx;
    }

    @Basic
    @Column(name = "XEGDR", nullable = true, length = 6)
    public String getXegdr() {
        return xegdr;
    }

    public void setXegdr(String xegdr) {
        this.xegdr = xegdr;
    }

    @Basic
    @Column(name = "ENQUEUE_GRP", nullable = true, length = 6)
    public String getEnqueueGrp() {
        return enqueueGrp;
    }

    public void setEnqueueGrp(String enqueueGrp) {
        this.enqueueGrp = enqueueGrp;
    }

    @Basic
    @Column(name = "DAT_FZAU", nullable = true, length = 48)
    public String getDatFzau() {
        return datFzau;
    }

    public void setDatFzau(String datFzau) {
        this.datFzau = datFzau;
    }

    @Basic
    @Column(name = "FMBDAT", nullable = true, length = 48)
    public String getFmbdat() {
        return fmbdat;
    }

    public void setFmbdat(String fmbdat) {
        this.fmbdat = fmbdat;
    }

    @Basic
    @Column(name = "VSNMR_V", nullable = true, length = 72)
    public String getVsnmrV() {
        return vsnmrV;
    }

    public void setVsnmrV(String vsnmrV) {
        this.vsnmrV = vsnmrV;
    }

    @Basic
    @Column(name = "HANDLE", nullable = true, length = 132)
    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Basic
    @Column(name = "PROLI", nullable = true, length = 18)
    public String getProli() {
        return proli;
    }

    public void setProli(String proli) {
        this.proli = proli;
    }

    @Basic
    @Column(name = "CONT_DG", nullable = true, length = 6)
    public String getContDg() {
        return contDg;
    }

    public void setContDg(String contDg) {
        this.contDg = contDg;
    }

    @Basic
    @Column(name = "CRM_GUID", nullable = true, length = 420)
    public String getCrmGuid() {
        return crmGuid;
    }

    public void setCrmGuid(String crmGuid) {
        this.crmGuid = crmGuid;
    }

    @Basic
    @Column(name = "UPD_TMSTMP", nullable = true, precision = 7)
    public Long getUpdTmstmp() {
        return updTmstmp;
    }

    public void setUpdTmstmp(Long updTmstmp) {
        this.updTmstmp = updTmstmp;
    }

    @Basic
    @Column(name = "MSR_ID", nullable = true, length = 60)
    public String getMsrId() {
        return msrId;
    }

    public void setMsrId(String msrId) {
        this.msrId = msrId;
    }

    @Basic
    @Column(name = "TM_CTRL_KEY", nullable = true, length = 24)
    public String getTmCtrlKey() {
        return tmCtrlKey;
    }

    public void setTmCtrlKey(String tmCtrlKey) {
        this.tmCtrlKey = tmCtrlKey;
    }

    @Basic
    @Column(name = "PSM_BUDAT", nullable = true, length = 48)
    public String getPsmBudat() {
        return psmBudat;
    }

    public void setPsmBudat(String psmBudat) {
        this.psmBudat = psmBudat;
    }

    @Basic
    @Column(name = "SWENR", nullable = true, length = 48)
    public String getSwenr() {
        return swenr;
    }

    public void setSwenr(String swenr) {
        this.swenr = swenr;
    }

    @Basic
    @Column(name = "SMENR", nullable = true, length = 48)
    public String getSmenr() {
        return smenr;
    }

    public void setSmenr(String smenr) {
        this.smenr = smenr;
    }

    @Basic
    @Column(name = "PHASE", nullable = true, length = 66)
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Basic
    @Column(name = "MTLAUR", nullable = true, length = 6)
    public String getMtlaur() {
        return mtlaur;
    }

    public void setMtlaur(String mtlaur) {
        this.mtlaur = mtlaur;
    }

    @Basic
    @Column(name = "STAGE", nullable = true, precision = 0)
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    @Basic
    @Column(name = "HB_CONT_REASON", nullable = true, length = 12)
    public String getHbContReason() {
        return hbContReason;
    }

    public void setHbContReason(String hbContReason) {
        this.hbContReason = hbContReason;
    }

    @Basic
    @Column(name = "HB_EXPDATE", nullable = true, length = 48)
    public String getHbExpdate() {
        return hbExpdate;
    }

    public void setHbExpdate(String hbExpdate) {
        this.hbExpdate = hbExpdate;
    }

    @Basic
    @Column(name = "HB_RESDATE", nullable = true, length = 48)
    public String getHbResdate() {
        return hbResdate;
    }

    public void setHbResdate(String hbResdate) {
        this.hbResdate = hbResdate;
    }

    @Basic
    @Column(name = "MILL_APPL_ID", nullable = true, length = 12)
    public String getMillApplId() {
        return millApplId;
    }

    public void setMillApplId(String millApplId) {
        this.millApplId = millApplId;
    }

    @Basic
    @Column(name = "OID_EXTBOL", nullable = true, length = 96)
    public String getOidExtbol() {
        return oidExtbol;
    }

    public void setOidExtbol(String oidExtbol) {
        this.oidExtbol = oidExtbol;
    }

    @Basic
    @Column(name = "OID_MISCDL", nullable = true, length = 96)
    public String getOidMiscdl() {
        return oidMiscdl;
    }

    public void setOidMiscdl(String oidMiscdl) {
        this.oidMiscdl = oidMiscdl;
    }

    @Basic
    @Column(name = "OIDMSG_SHP", nullable = true, length = 6)
    public String getOidmsgShp() {
        return oidmsgShp;
    }

    public void setOidmsgShp(String oidmsgShp) {
        this.oidmsgShp = oidmsgShp;
    }

    @Basic
    @Column(name = "OIDSTS_SHP", nullable = true, length = 6)
    public String getOidstsShp() {
        return oidstsShp;
    }

    public void setOidstsShp(String oidstsShp) {
        this.oidstsShp = oidstsShp;
    }

    @Basic
    @Column(name = "OIPIPEVAL", nullable = true, length = 6)
    public String getOipipeval() {
        return oipipeval;
    }

    public void setOipipeval(String oipipeval) {
        this.oipipeval = oipipeval;
    }

    @Basic
    @Column(name = "OIC_LIFNR", nullable = true, length = 60)
    public String getOicLifnr() {
        return oicLifnr;
    }

    public void setOicLifnr(String oicLifnr) {
        this.oicLifnr = oicLifnr;
    }

    @Basic
    @Column(name = "OIC_DCITYC", nullable = true, length = 24)
    public String getOicDcityc() {
        return oicDcityc;
    }

    public void setOicDcityc(String oicDcityc) {
        this.oicDcityc = oicDcityc;
    }

    @Basic
    @Column(name = "OIC_DCOUNC", nullable = true, length = 18)
    public String getOicDcounc() {
        return oicDcounc;
    }

    public void setOicDcounc(String oicDcounc) {
        this.oicDcounc = oicDcounc;
    }

    @Basic
    @Column(name = "OIC_DREGIO", nullable = true, length = 18)
    public String getOicDregio() {
        return oicDregio;
    }

    public void setOicDregio(String oicDregio) {
        this.oicDregio = oicDregio;
    }

    @Basic
    @Column(name = "OIC_DLAND1", nullable = true, length = 18)
    public String getOicDland1() {
        return oicDland1;
    }

    public void setOicDland1(String oicDland1) {
        this.oicDland1 = oicDland1;
    }

    @Basic
    @Column(name = "OIC_OCITYC", nullable = true, length = 24)
    public String getOicOcityc() {
        return oicOcityc;
    }

    public void setOicOcityc(String oicOcityc) {
        this.oicOcityc = oicOcityc;
    }

    @Basic
    @Column(name = "OIC_OCOUNC", nullable = true, length = 18)
    public String getOicOcounc() {
        return oicOcounc;
    }

    public void setOicOcounc(String oicOcounc) {
        this.oicOcounc = oicOcounc;
    }

    @Basic
    @Column(name = "OIC_OREGIO", nullable = true, length = 18)
    public String getOicOregio() {
        return oicOregio;
    }

    public void setOicOregio(String oicOregio) {
        this.oicOregio = oicOregio;
    }

    @Basic
    @Column(name = "OIC_OLAND1", nullable = true, length = 18)
    public String getOicOland1() {
        return oicOland1;
    }

    public void setOicOland1(String oicOland1) {
        this.oicOland1 = oicOland1;
    }

    @Basic
    @Column(name = "OIC_PORGIN", nullable = true, length = 90)
    public String getOicPorgin() {
        return oicPorgin;
    }

    public void setOicPorgin(String oicPorgin) {
        this.oicPorgin = oicPorgin;
    }

    @Basic
    @Column(name = "OIC_PDESTN", nullable = true, length = 90)
    public String getOicPdestn() {
        return oicPdestn;
    }

    public void setOicPdestn(String oicPdestn) {
        this.oicPdestn = oicPdestn;
    }

    @Basic
    @Column(name = "OIC_PTRIP", nullable = true, length = 96)
    public String getOicPtrip() {
        return oicPtrip;
    }

    public void setOicPtrip(String oicPtrip) {
        this.oicPtrip = oicPtrip;
    }

    @Basic
    @Column(name = "OIC_PBATCH", nullable = true, length = 96)
    public String getOicPbatch() {
        return oicPbatch;
    }

    public void setOicPbatch(String oicPbatch) {
        this.oicPbatch = oicPbatch;
    }

    @Basic
    @Column(name = "OIC_MOT", nullable = true, length = 12)
    public String getOicMot() {
        return oicMot;
    }

    public void setOicMot(String oicMot) {
        this.oicMot = oicMot;
    }

    @Basic
    @Column(name = "OIC_AORGIN", nullable = true, length = 90)
    public String getOicAorgin() {
        return oicAorgin;
    }

    public void setOicAorgin(String oicAorgin) {
        this.oicAorgin = oicAorgin;
    }

    @Basic
    @Column(name = "OIC_ADESTN", nullable = true, length = 90)
    public String getOicAdestn() {
        return oicAdestn;
    }

    public void setOicAdestn(String oicAdestn) {
        this.oicAdestn = oicAdestn;
    }

    @Basic
    @Column(name = "OIC_TRUCKN", nullable = true, length = 60)
    public String getOicTruckn() {
        return oicTruckn;
    }

    public void setOicTruckn(String oicTruckn) {
        this.oicTruckn = oicTruckn;
    }

    @Basic
    @Column(name = "OIA_BASELO", nullable = true, length = 90)
    public String getOiaBaselo() {
        return oiaBaselo;
    }

    public void setOiaBaselo(String oiaBaselo) {
        this.oiaBaselo = oiaBaselo;
    }

    @Basic
    @Column(name = "OIINEX", nullable = true, length = 12)
    public String getOiinex() {
        return oiinex;
    }

    public void setOiinex(String oiinex) {
        this.oiinex = oiinex;
    }

    @Basic
    @Column(name = "OIISOIL", nullable = true, length = 6)
    public String getOiisoil() {
        return oiisoil;
    }

    public void setOiisoil(String oiisoil) {
        this.oiisoil = oiisoil;
    }

    @Basic
    @Column(name = "OIPTRFNC", nullable = true, length = 12)
    public String getOiptrfnc() {
        return oiptrfnc;
    }

    public void setOiptrfnc(String oiptrfnc) {
        this.oiptrfnc = oiptrfnc;
    }

    @Basic
    @Column(name = "OIPARTNR", nullable = true, length = 60)
    public String getOipartnr() {
        return oipartnr;
    }

    public void setOipartnr(String oipartnr) {
        this.oipartnr = oipartnr;
    }

    @Basic
    @Column(name = "OILASTOR", nullable = true, length = 60)
    public String getOilastor() {
        return oilastor;
    }

    public void setOilastor(String oilastor) {
        this.oilastor = oilastor;
    }

    @Basic
    @Column(name = "OIDRC", nullable = true, length = 30)
    public String getOidrc() {
        return oidrc;
    }

    public void setOidrc(String oidrc) {
        this.oidrc = oidrc;
    }

    @Basic
    @Column(name = "OIEXGNUM", nullable = true, length = 60)
    public String getOiexgnum() {
        return oiexgnum;
    }

    public void setOiexgnum(String oiexgnum) {
        this.oiexgnum = oiexgnum;
    }

    @Basic
    @Column(name = "OIEXGTYP", nullable = true, length = 24)
    public String getOiexgtyp() {
        return oiexgtyp;
    }

    public void setOiexgtyp(String oiexgtyp) {
        this.oiexgtyp = oiexgtyp;
    }

    @Basic
    @Column(name = "OICHEADOFF", nullable = true, length = 60)
    public String getOicheadoff() {
        return oicheadoff;
    }

    public void setOicheadoff(String oicheadoff) {
        this.oicheadoff = oicheadoff;
    }

    @Basic
    @Column(name = "OIPBL", nullable = true, length = 60)
    public String getOipbl() {
        return oipbl;
    }

    public void setOipbl(String oipbl) {
        this.oipbl = oipbl;
    }

    @Basic
    @Column(name = "OIDRESTR", nullable = true, length = 6)
    public String getOidrestr() {
        return oidrestr;
    }

    public void setOidrestr(String oidrestr) {
        this.oidrestr = oidrestr;
    }

    @Basic
    @Column(name = "OIDMSG_PRD", nullable = true, length = 6)
    public String getOidmsgPrd() {
        return oidmsgPrd;
    }

    public void setOidmsgPrd(String oidmsgPrd) {
        this.oidmsgPrd = oidmsgPrd;
    }

    @Basic
    @Column(name = "OIDMSG_QTY", nullable = true, length = 6)
    public String getOidmsgQty() {
        return oidmsgQty;
    }

    public void setOidmsgQty(String oidmsgQty) {
        this.oidmsgQty = oidmsgQty;
    }

    @Basic
    @Column(name = "OIDMSG_UOM", nullable = true, length = 6)
    public String getOidmsgUom() {
        return oidmsgUom;
    }

    public void setOidmsgUom(String oidmsgUom) {
        this.oidmsgUom = oidmsgUom;
    }

    @Basic
    @Column(name = "OIDMSG_DAT", nullable = true, length = 6)
    public String getOidmsgDat() {
        return oidmsgDat;
    }

    public void setOidmsgDat(String oidmsgDat) {
        this.oidmsgDat = oidmsgDat;
    }

    @Basic
    @Column(name = "OIDMSG_TRM", nullable = true, length = 6)
    public String getOidmsgTrm() {
        return oidmsgTrm;
    }

    public void setOidmsgTrm(String oidmsgTrm) {
        this.oidmsgTrm = oidmsgTrm;
    }

    @Basic
    @Column(name = "OICNTPER", nullable = true, length = 210)
    public String getOicntper() {
        return oicntper;
    }

    public void setOicntper(String oicntper) {
        this.oicntper = oicntper;
    }

    @Basic
    @Column(name = "OICNTNTE", nullable = true, length = 210)
    public String getOicntnte() {
        return oicntnte;
    }

    public void setOicntnte(String oicntnte) {
        this.oicntnte = oicntnte;
    }

    @Basic
    @Column(name = "OICNTPHO", nullable = true, length = 96)
    public String getOicntpho() {
        return oicntpho;
    }

    public void setOicntpho(String oicntpho) {
        this.oicntpho = oicntpho;
    }

    @Basic
    @Column(name = "OID_SORTL", nullable = true, length = 60)
    public String getOidSortl() {
        return oidSortl;
    }

    public void setOidSortl(String oidSortl) {
        this.oidSortl = oidSortl;
    }

    @Basic
    @Column(name = "OID_SORT2", nullable = true, length = 60)
    public String getOidSort2() {
        return oidSort2;
    }

    public void setOidSort2(String oidSort2) {
        this.oidSort2 = oidSort2;
    }

    @Basic
    @Column(name = "OICFKARTDI", nullable = true, length = 24)
    public String getOicfkartdi() {
        return oicfkartdi;
    }

    public void setOicfkartdi(String oicfkartdi) {
        this.oicfkartdi = oicfkartdi;
    }

    @Basic
    @Column(name = "OIAEVGTYPE", nullable = true, length = 6)
    public String getOiaevgtype() {
        return oiaevgtype;
    }

    public void setOiaevgtype(String oiaevgtype) {
        this.oiaevgtype = oiaevgtype;
    }

    @Basic
    @Column(name = "OIU_CT_TYPE_CD", nullable = true, length = 12)
    public String getOiuCtTypeCd() {
        return oiuCtTypeCd;
    }

    public void setOiuCtTypeCd(String oiuCtTypeCd) {
        this.oiuCtTypeCd = oiuCtTypeCd;
    }

    @Basic
    @Column(name = "OIU_CUST_VEND_CD", nullable = true, length = 6)
    public String getOiuCustVendCd() {
        return oiuCustVendCd;
    }

    public void setOiuCustVendCd(String oiuCustVendCd) {
        this.oiuCustVendCd = oiuCustVendCd;
    }

    @Basic
    @Column(name = "OIU_APPR_FL", nullable = true, length = 6)
    public String getOiuApprFl() {
        return oiuApprFl;
    }

    public void setOiuApprFl(String oiuApprFl) {
        this.oiuApprFl = oiuApprFl;
    }

    @Basic
    @Column(name = "OIU_APPR_DT", nullable = true, length = 48)
    public String getOiuApprDt() {
        return oiuApprDt;
    }

    public void setOiuApprDt(String oiuApprDt) {
        this.oiuApprDt = oiuApprDt;
    }

    @Basic
    @Column(name = "OIU_EXEC_DT", nullable = true, length = 48)
    public String getOiuExecDt() {
        return oiuExecDt;
    }

    public void setOiuExecDt(String oiuExecDt) {
        this.oiuExecDt = oiuExecDt;
    }

    @Basic
    @Column(name = "OIU_STD_CT_FL", nullable = true, length = 6)
    public String getOiuStdCtFl() {
        return oiuStdCtFl;
    }

    public void setOiuStdCtFl(String oiuStdCtFl) {
        this.oiuStdCtFl = oiuStdCtFl;
    }

    @Basic
    @Column(name = "OIU_PREV_CT_NO", nullable = true, length = 60)
    public String getOiuPrevCtNo() {
        return oiuPrevCtNo;
    }

    public void setOiuPrevCtNo(String oiuPrevCtNo) {
        this.oiuPrevCtNo = oiuPrevCtNo;
    }

    @Basic
    @Column(name = "OIU_GPLT_COMPANY", nullable = true, length = 24)
    public String getOiuGpltCompany() {
        return oiuGpltCompany;
    }

    public void setOiuGpltCompany(String oiuGpltCompany) {
        this.oiuGpltCompany = oiuGpltCompany;
    }

    @Basic
    @Column(name = "OIU_GPLT_VNAME", nullable = true, length = 36)
    public String getOiuGpltVname() {
        return oiuGpltVname;
    }

    public void setOiuGpltVname(String oiuGpltVname) {
        this.oiuGpltVname = oiuGpltVname;
    }

    @Basic
    @Column(name = "OIU_GPLT_DOI_NO", nullable = true, length = 30)
    public String getOiuGpltDoiNo() {
        return oiuGpltDoiNo;
    }

    public void setOiuGpltDoiNo(String oiuGpltDoiNo) {
        this.oiuGpltDoiNo = oiuGpltDoiNo;
    }

    @Basic
    @Column(name = "OIU_MK_REP_NO", nullable = true, length = 60)
    public String getOiuMkRepNo() {
        return oiuMkRepNo;
    }

    public void setOiuMkRepNo(String oiuMkRepNo) {
        this.oiuMkRepNo = oiuMkRepNo;
    }

    @Basic
    @Column(name = "OIU_MK_REP_ISQ", nullable = true, length = 12)
    public String getOiuMkRepIsq() {
        return oiuMkRepIsq;
    }

    public void setOiuMkRepIsq(String oiuMkRepIsq) {
        this.oiuMkRepIsq = oiuMkRepIsq;
    }

    @Basic
    @Column(name = "OIU_DEST_SALE_CD", nullable = true, length = 6)
    public String getOiuDestSaleCd() {
        return oiuDestSaleCd;
    }

    public void setOiuDestSaleCd(String oiuDestSaleCd) {
        this.oiuDestSaleCd = oiuDestSaleCd;
    }

    @Basic
    @Column(name = "OIU_LIFE_LSE_FL", nullable = true, length = 6)
    public String getOiuLifeLseFl() {
        return oiuLifeLseFl;
    }

    public void setOiuLifeLseFl(String oiuLifeLseFl) {
        this.oiuLifeLseFl = oiuLifeLseFl;
    }

    @Basic
    @Column(name = "OIU_INV_NO", nullable = true, length = 36)
    public String getOiuInvNo() {
        return oiuInvNo;
    }

    public void setOiuInvNo(String oiuInvNo) {
        this.oiuInvNo = oiuInvNo;
    }

    @Basic
    @Column(name = "OIU_INV_FL", nullable = true, length = 6)
    public String getOiuInvFl() {
        return oiuInvFl;
    }

    public void setOiuInvFl(String oiuInvFl) {
        this.oiuInvFl = oiuInvFl;
    }

    @Basic
    @Column(name = "OIU_OBLIG_DT", nullable = true, length = 48)
    public String getOiuObligDt() {
        return oiuObligDt;
    }

    public void setOiuObligDt(String oiuObligDt) {
        this.oiuObligDt = oiuObligDt;
    }

    @Basic
    @Column(name = "OIU_DESK_CD", nullable = true, length = 18)
    public String getOiuDeskCd() {
        return oiuDeskCd;
    }

    public void setOiuDeskCd(String oiuDeskCd) {
        this.oiuDeskCd = oiuDeskCd;
    }

    @Basic
    @Column(name = "OIU_EIA_GINA_CD", nullable = true, length = 12)
    public String getOiuEiaGinaCd() {
        return oiuEiaGinaCd;
    }

    public void setOiuEiaGinaCd(String oiuEiaGinaCd) {
        this.oiuEiaGinaCd = oiuEiaGinaCd;
    }

    @Basic
    @Column(name = "OIU_CT_STATUS_CD", nullable = true, length = 12)
    public String getOiuCtStatusCd() {
        return oiuCtStatusCd;
    }

    public void setOiuCtStatusCd(String oiuCtStatusCd) {
        this.oiuCtStatusCd = oiuCtStatusCd;
    }

    @Basic
    @Column(name = "OIU_SPOT_TERM_CD", nullable = true, length = 6)
    public String getOiuSpotTermCd() {
        return oiuSpotTermCd;
    }

    public void setOiuSpotTermCd(String oiuSpotTermCd) {
        this.oiuSpotTermCd = oiuSpotTermCd;
    }

    @Basic
    @Column(name = "OIU_STNDEDQ_CD", nullable = true, length = 6)
    public String getOiuStndedqCd() {
        return oiuStndedqCd;
    }

    public void setOiuStndedqCd(String oiuStndedqCd) {
        this.oiuStndedqCd = oiuStndedqCd;
    }

    @Basic
    @Column(name = "OIU_IOTR_FL", nullable = true, length = 6)
    public String getOiuIotrFl() {
        return oiuIotrFl;
    }

    public void setOiuIotrFl(String oiuIotrFl) {
        this.oiuIotrFl = oiuIotrFl;
    }

    @Basic
    @Column(name = "OIU_INTRA_INTER", nullable = true, length = 6)
    public String getOiuIntraInter() {
        return oiuIntraInter;
    }

    public void setOiuIntraInter(String oiuIntraInter) {
        this.oiuIntraInter = oiuIntraInter;
    }

    @Basic
    @Column(name = "OIU_EXRES_SPLT", nullable = true, length = 6)
    public String getOiuExresSplt() {
        return oiuExresSplt;
    }

    public void setOiuExresSplt(String oiuExresSplt) {
        this.oiuExresSplt = oiuExresSplt;
    }

    @Basic
    @Column(name = "OIU_EVGN_FL", nullable = true, length = 6)
    public String getOiuEvgnFl() {
        return oiuEvgnFl;
    }

    public void setOiuEvgnFl(String oiuEvgnFl) {
        this.oiuEvgnFl = oiuEvgnFl;
    }

    @Basic
    @Column(name = "OIU_EVGNPD_BAS", nullable = true, length = 12)
    public String getOiuEvgnpdBas() {
        return oiuEvgnpdBas;
    }

    public void setOiuEvgnpdBas(String oiuEvgnpdBas) {
        this.oiuEvgnpdBas = oiuEvgnpdBas;
    }

    @Basic
    @Column(name = "OIU_EVGN_PERD_QY", nullable = true, length = 18)
    public String getOiuEvgnPerdQy() {
        return oiuEvgnPerdQy;
    }

    public void setOiuEvgnPerdQy(String oiuEvgnPerdQy) {
        this.oiuEvgnPerdQy = oiuEvgnPerdQy;
    }

    @Basic
    @Column(name = "OIU_PREIM_TM_CD", nullable = true, length = 12)
    public String getOiuPreimTmCd() {
        return oiuPreimTmCd;
    }

    public void setOiuPreimTmCd(String oiuPreimTmCd) {
        this.oiuPreimTmCd = oiuPreimTmCd;
    }

    @Basic
    @Column(name = "OIU_PRIM_TM_QY", nullable = true, length = 18)
    public String getOiuPrimTmQy() {
        return oiuPrimTmQy;
    }

    public void setOiuPrimTmQy(String oiuPrimTmQy) {
        this.oiuPrimTmQy = oiuPrimTmQy;
    }

    @Basic
    @Column(name = "OIU_SEC_TM_CD", nullable = true, length = 12)
    public String getOiuSecTmCd() {
        return oiuSecTmCd;
    }

    public void setOiuSecTmCd(String oiuSecTmCd) {
        this.oiuSecTmCd = oiuSecTmCd;
    }

    @Basic
    @Column(name = "OIU_SEC_TM_QY", nullable = true, length = 18)
    public String getOiuSecTmQy() {
        return oiuSecTmQy;
    }

    public void setOiuSecTmQy(String oiuSecTmQy) {
        this.oiuSecTmQy = oiuSecTmQy;
    }

    @Basic
    @Column(name = "OIU_EXP_NOTIF_DT", nullable = true, length = 48)
    public String getOiuExpNotifDt() {
        return oiuExpNotifDt;
    }

    public void setOiuExpNotifDt(String oiuExpNotifDt) {
        this.oiuExpNotifDt = oiuExpNotifDt;
    }

    @Basic
    @Column(name = "OIU_INTIT_RDT_DT", nullable = true, length = 48)
    public String getOiuIntitRdtDt() {
        return oiuIntitRdtDt;
    }

    public void setOiuIntitRdtDt(String oiuIntitRdtDt) {
        this.oiuIntitRdtDt = oiuIntitRdtDt;
    }

    @Basic
    @Column(name = "OIU_NEXT_RDT_DT", nullable = true, length = 48)
    public String getOiuNextRdtDt() {
        return oiuNextRdtDt;
    }

    public void setOiuNextRdtDt(String oiuNextRdtDt) {
        this.oiuNextRdtDt = oiuNextRdtDt;
    }

    @Basic
    @Column(name = "OIU_RTC_DT", nullable = true, length = 48)
    public String getOiuRtcDt() {
        return oiuRtcDt;
    }

    public void setOiuRtcDt(String oiuRtcDt) {
        this.oiuRtcDt = oiuRtcDt;
    }

    @Basic
    @Column(name = "OIU_RDT_N_PERD", nullable = true, precision = 3)
    public Long getOiuRdtNPerd() {
        return oiuRdtNPerd;
    }

    public void setOiuRdtNPerd(Long oiuRdtNPerd) {
        this.oiuRdtNPerd = oiuRdtNPerd;
    }

    @Basic
    @Column(name = "OIU_RDT_REFQ_CD", nullable = true, length = 12)
    public String getOiuRdtRefqCd() {
        return oiuRdtRefqCd;
    }

    public void setOiuRdtRefqCd(String oiuRdtRefqCd) {
        this.oiuRdtRefqCd = oiuRdtRefqCd;
    }

    @Basic
    @Column(name = "OIU_RTF_CD", nullable = true, length = 48)
    public String getOiuRtfCd() {
        return oiuRtfCd;
    }

    public void setOiuRtfCd(String oiuRtfCd) {
        this.oiuRtfCd = oiuRtfCd;
    }

    @Basic
    @Column(name = "OIU_IMB_PRVSN_FL", nullable = true, length = 6)
    public String getOiuImbPrvsnFl() {
        return oiuImbPrvsnFl;
    }

    public void setOiuImbPrvsnFl(String oiuImbPrvsnFl) {
        this.oiuImbPrvsnFl = oiuImbPrvsnFl;
    }

    @Basic
    @Column(name = "OIU_FFEE_RMB_FL", nullable = true, length = 6)
    public String getOiuFfeeRmbFl() {
        return oiuFfeeRmbFl;
    }

    public void setOiuFfeeRmbFl(String oiuFfeeRmbFl) {
        this.oiuFfeeRmbFl = oiuFfeeRmbFl;
    }

    @Basic
    @Column(name = "OIU_FIRM_INTRPT", nullable = true, length = 6)
    public String getOiuFirmIntrpt() {
        return oiuFirmIntrpt;
    }

    public void setOiuFirmIntrpt(String oiuFirmIntrpt) {
        this.oiuFirmIntrpt = oiuFirmIntrpt;
    }

    @Basic
    @Column(name = "OIU_BAL_BAS_CD", nullable = true, length = 6)
    public String getOiuBalBasCd() {
        return oiuBalBasCd;
    }

    public void setOiuBalBasCd(String oiuBalBasCd) {
        this.oiuBalBasCd = oiuBalBasCd;
    }

    @Basic
    @Column(name = "OIU_PNTY_BAS_CD", nullable = true, length = 6)
    public String getOiuPntyBasCd() {
        return oiuPntyBasCd;
    }

    public void setOiuPntyBasCd(String oiuPntyBasCd) {
        this.oiuPntyBasCd = oiuPntyBasCd;
    }

    @Basic
    @Column(name = "OIU_TRANSP_BA", nullable = true, length = 6)
    public String getOiuTranspBa() {
        return oiuTranspBa;
    }

    public void setOiuTranspBa(String oiuTranspBa) {
        this.oiuTranspBa = oiuTranspBa;
    }

    @Basic
    @Column(name = "OIU_DLY_MAX_T_QY", nullable = true, precision = 3)
    public Long getOiuDlyMaxTQy() {
        return oiuDlyMaxTQy;
    }

    public void setOiuDlyMaxTQy(Long oiuDlyMaxTQy) {
        this.oiuDlyMaxTQy = oiuDlyMaxTQy;
    }

    @Basic
    @Column(name = "OIU_PRCS_FL", nullable = true, length = 6)
    public String getOiuPrcsFl() {
        return oiuPrcsFl;
    }

    public void setOiuPrcsFl(String oiuPrcsFl) {
        this.oiuPrcsFl = oiuPrcsFl;
    }

    @Basic
    @Column(name = "OIU_SPR_FL", nullable = true, length = 6)
    public String getOiuSprFl() {
        return oiuSprFl;
    }

    public void setOiuSprFl(String oiuSprFl) {
        this.oiuSprFl = oiuSprFl;
    }

    @Basic
    @Column(name = "OIU_DEHYD_FL", nullable = true, length = 6)
    public String getOiuDehydFl() {
        return oiuDehydFl;
    }

    public void setOiuDehydFl(String oiuDehydFl) {
        this.oiuDehydFl = oiuDehydFl;
    }

    @Basic
    @Column(name = "OIU_COMPR_FL", nullable = true, length = 6)
    public String getOiuComprFl() {
        return oiuComprFl;
    }

    public void setOiuComprFl(String oiuComprFl) {
        this.oiuComprFl = oiuComprFl;
    }

    @Basic
    @Column(name = "OIU_PYMT_METH_CD", nullable = true, length = 6)
    public String getOiuPymtMethCd() {
        return oiuPymtMethCd;
    }

    public void setOiuPymtMethCd(String oiuPymtMethCd) {
        this.oiuPymtMethCd = oiuPymtMethCd;
    }

    @Basic
    @Column(name = "OIU_CON_MATNR", nullable = true, length = 108)
    public String getOiuConMatnr() {
        return oiuConMatnr;
    }

    public void setOiuConMatnr(String oiuConMatnr) {
        this.oiuConMatnr = oiuConMatnr;
    }

    @Basic
    @Column(name = "OIU_CON_MAX_QY", nullable = true, length = 18)
    public String getOiuConMaxQy() {
        return oiuConMaxQy;
    }

    public void setOiuConMaxQy(String oiuConMaxQy) {
        this.oiuConMaxQy = oiuConMaxQy;
    }

    @Basic
    @Column(name = "OIU_AFFIL_FL", nullable = true, length = 6)
    public String getOiuAffilFl() {
        return oiuAffilFl;
    }

    public void setOiuAffilFl(String oiuAffilFl) {
        this.oiuAffilFl = oiuAffilFl;
    }

    @Basic
    @Column(name = "OIU_MMS_TYPE_CD", nullable = true, length = 24)
    public String getOiuMmsTypeCd() {
        return oiuMmsTypeCd;
    }

    public void setOiuMmsTypeCd(String oiuMmsTypeCd) {
        this.oiuMmsTypeCd = oiuMmsTypeCd;
    }

    @Basic
    @Column(name = "OIU_MMS_ETPAY_FL", nullable = true, length = 6)
    public String getOiuMmsEtpayFl() {
        return oiuMmsEtpayFl;
    }

    public void setOiuMmsEtpayFl(String oiuMmsEtpayFl) {
        this.oiuMmsEtpayFl = oiuMmsEtpayFl;
    }

    @Basic
    @Column(name = "OIUH_CT_NO", nullable = true, length = 36)
    public String getOiuhCtNo() {
        return oiuhCtNo;
    }

    public void setOiuhCtNo(String oiuhCtNo) {
        this.oiuhCtNo = oiuhCtNo;
    }

    @Basic
    @Column(name = "TAS", nullable = true, length = 180)
    public String getTas() {
        return tas;
    }

    public void setTas(String tas) {
        this.tas = tas;
    }

    @Basic
    @Column(name = "BETC", nullable = true, length = 60)
    public String getBetc() {
        return betc;
    }

    public void setBetc(String betc) {
        this.betc = betc;
    }

    @Basic
    @Column(name = "MOD_ALLOW", nullable = true, length = 6)
    public String getModAllow() {
        return modAllow;
    }

    public void setModAllow(String modAllow) {
        this.modAllow = modAllow;
    }

    @Basic
    @Column(name = "CANCEL_ALLOW", nullable = true, length = 6)
    public String getCancelAllow() {
        return cancelAllow;
    }

    public void setCancelAllow(String cancelAllow) {
        this.cancelAllow = cancelAllow;
    }

    @Basic
    @Column(name = "PAY_METHOD", nullable = true, length = 60)
    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    @Basic
    @Column(name = "BPN", nullable = true, length = 36)
    public String getBpn() {
        return bpn;
    }

    public void setBpn(String bpn) {
        this.bpn = bpn;
    }

    @Basic
    @Column(name = "REP_FREQ", nullable = true, length = 18)
    public String getRepFreq() {
        return repFreq;
    }

    public void setRepFreq(String repFreq) {
        this.repFreq = repFreq;
    }

    @Basic
    @Column(name = "LOGSYSB", nullable = true, length = 60)
    public String getLogsysb() {
        return logsysb;
    }

    public void setLogsysb(String logsysb) {
        this.logsysb = logsysb;
    }

    @Basic
    @Column(name = "KALCD", nullable = true, length = 36)
    public String getKalcd() {
        return kalcd;
    }

    public void setKalcd(String kalcd) {
        this.kalcd = kalcd;
    }

    @Basic
    @Column(name = "MULTI", nullable = true, length = 6)
    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

    @Basic
    @Column(name = "SPPAYM", nullable = true, length = 12)
    public String getSppaym() {
        return sppaym;
    }

    public void setSppaym(String sppaym) {
        this.sppaym = sppaym;
    }

    @Basic
    @Column(name = "WTYSC_CLM_HDR", nullable = true, length = 96)
    public String getWtyscClmHdr() {
        return wtyscClmHdr;
    }

    public void setWtyscClmHdr(String wtyscClmHdr) {
        this.wtyscClmHdr = wtyscClmHdr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnoVbak enoVbak = (EnoVbak) o;

        if (bicLogsys != null ? !bicLogsys.equals(enoVbak.bicLogsys) : enoVbak.bicLogsys != null) return false;
        if (mandt != null ? !mandt.equals(enoVbak.mandt) : enoVbak.mandt != null) return false;
        if (vbeln != null ? !vbeln.equals(enoVbak.vbeln) : enoVbak.vbeln != null) return false;
        if (erdat != null ? !erdat.equals(enoVbak.erdat) : enoVbak.erdat != null) return false;
        if (erzet != null ? !erzet.equals(enoVbak.erzet) : enoVbak.erzet != null) return false;
        if (ernam != null ? !ernam.equals(enoVbak.ernam) : enoVbak.ernam != null) return false;
        if (angdt != null ? !angdt.equals(enoVbak.angdt) : enoVbak.angdt != null) return false;
        if (bnddt != null ? !bnddt.equals(enoVbak.bnddt) : enoVbak.bnddt != null) return false;
        if (audat != null ? !audat.equals(enoVbak.audat) : enoVbak.audat != null) return false;
        if (vbtyp != null ? !vbtyp.equals(enoVbak.vbtyp) : enoVbak.vbtyp != null) return false;
        if (trvog != null ? !trvog.equals(enoVbak.trvog) : enoVbak.trvog != null) return false;
        if (auart != null ? !auart.equals(enoVbak.auart) : enoVbak.auart != null) return false;
        if (augru != null ? !augru.equals(enoVbak.augru) : enoVbak.augru != null) return false;
        if (gwldt != null ? !gwldt.equals(enoVbak.gwldt) : enoVbak.gwldt != null) return false;
        if (submi != null ? !submi.equals(enoVbak.submi) : enoVbak.submi != null) return false;
        if (lifsk != null ? !lifsk.equals(enoVbak.lifsk) : enoVbak.lifsk != null) return false;
        if (faksk != null ? !faksk.equals(enoVbak.faksk) : enoVbak.faksk != null) return false;
        if (netwr != null ? !netwr.equals(enoVbak.netwr) : enoVbak.netwr != null) return false;
        if (waerk != null ? !waerk.equals(enoVbak.waerk) : enoVbak.waerk != null) return false;
        if (vkorg != null ? !vkorg.equals(enoVbak.vkorg) : enoVbak.vkorg != null) return false;
        if (vtweg != null ? !vtweg.equals(enoVbak.vtweg) : enoVbak.vtweg != null) return false;
        if (spart != null ? !spart.equals(enoVbak.spart) : enoVbak.spart != null) return false;
        if (vkgrp != null ? !vkgrp.equals(enoVbak.vkgrp) : enoVbak.vkgrp != null) return false;
        if (vkbur != null ? !vkbur.equals(enoVbak.vkbur) : enoVbak.vkbur != null) return false;
        if (gsber != null ? !gsber.equals(enoVbak.gsber) : enoVbak.gsber != null) return false;
        if (gskst != null ? !gskst.equals(enoVbak.gskst) : enoVbak.gskst != null) return false;
        if (guebg != null ? !guebg.equals(enoVbak.guebg) : enoVbak.guebg != null) return false;
        if (gueen != null ? !gueen.equals(enoVbak.gueen) : enoVbak.gueen != null) return false;
        if (knumv != null ? !knumv.equals(enoVbak.knumv) : enoVbak.knumv != null) return false;
        if (vdatu != null ? !vdatu.equals(enoVbak.vdatu) : enoVbak.vdatu != null) return false;
        if (vprgr != null ? !vprgr.equals(enoVbak.vprgr) : enoVbak.vprgr != null) return false;
        if (autlf != null ? !autlf.equals(enoVbak.autlf) : enoVbak.autlf != null) return false;
        if (vbkla != null ? !vbkla.equals(enoVbak.vbkla) : enoVbak.vbkla != null) return false;
        if (vbklt != null ? !vbklt.equals(enoVbak.vbklt) : enoVbak.vbklt != null) return false;
        if (kalsm != null ? !kalsm.equals(enoVbak.kalsm) : enoVbak.kalsm != null) return false;
        if (vsbed != null ? !vsbed.equals(enoVbak.vsbed) : enoVbak.vsbed != null) return false;
        if (fkara != null ? !fkara.equals(enoVbak.fkara) : enoVbak.fkara != null) return false;
        if (awahr != null ? !awahr.equals(enoVbak.awahr) : enoVbak.awahr != null) return false;
        if (ktext != null ? !ktext.equals(enoVbak.ktext) : enoVbak.ktext != null) return false;
        if (bstnk != null ? !bstnk.equals(enoVbak.bstnk) : enoVbak.bstnk != null) return false;
        if (bsark != null ? !bsark.equals(enoVbak.bsark) : enoVbak.bsark != null) return false;
        if (bstdk != null ? !bstdk.equals(enoVbak.bstdk) : enoVbak.bstdk != null) return false;
        if (bstzd != null ? !bstzd.equals(enoVbak.bstzd) : enoVbak.bstzd != null) return false;
        if (ihrez != null ? !ihrez.equals(enoVbak.ihrez) : enoVbak.ihrez != null) return false;
        if (bname != null ? !bname.equals(enoVbak.bname) : enoVbak.bname != null) return false;
        if (telf1 != null ? !telf1.equals(enoVbak.telf1) : enoVbak.telf1 != null) return false;
        if (mahza != null ? !mahza.equals(enoVbak.mahza) : enoVbak.mahza != null) return false;
        if (mahdt != null ? !mahdt.equals(enoVbak.mahdt) : enoVbak.mahdt != null) return false;
        if (kunnr != null ? !kunnr.equals(enoVbak.kunnr) : enoVbak.kunnr != null) return false;
        if (kostl != null ? !kostl.equals(enoVbak.kostl) : enoVbak.kostl != null) return false;
        if (stafo != null ? !stafo.equals(enoVbak.stafo) : enoVbak.stafo != null) return false;
        if (stwae != null ? !stwae.equals(enoVbak.stwae) : enoVbak.stwae != null) return false;
        if (aedat != null ? !aedat.equals(enoVbak.aedat) : enoVbak.aedat != null) return false;
        if (kvgr1 != null ? !kvgr1.equals(enoVbak.kvgr1) : enoVbak.kvgr1 != null) return false;
        if (kvgr2 != null ? !kvgr2.equals(enoVbak.kvgr2) : enoVbak.kvgr2 != null) return false;
        if (kvgr3 != null ? !kvgr3.equals(enoVbak.kvgr3) : enoVbak.kvgr3 != null) return false;
        if (kvgr4 != null ? !kvgr4.equals(enoVbak.kvgr4) : enoVbak.kvgr4 != null) return false;
        if (kvgr5 != null ? !kvgr5.equals(enoVbak.kvgr5) : enoVbak.kvgr5 != null) return false;
        if (knuma != null ? !knuma.equals(enoVbak.knuma) : enoVbak.knuma != null) return false;
        if (kokrs != null ? !kokrs.equals(enoVbak.kokrs) : enoVbak.kokrs != null) return false;
        if (psPspPnr != null ? !psPspPnr.equals(enoVbak.psPspPnr) : enoVbak.psPspPnr != null) return false;
        if (kurst != null ? !kurst.equals(enoVbak.kurst) : enoVbak.kurst != null) return false;
        if (kkber != null ? !kkber.equals(enoVbak.kkber) : enoVbak.kkber != null) return false;
        if (knkli != null ? !knkli.equals(enoVbak.knkli) : enoVbak.knkli != null) return false;
        if (grupp != null ? !grupp.equals(enoVbak.grupp) : enoVbak.grupp != null) return false;
        if (sbgrp != null ? !sbgrp.equals(enoVbak.sbgrp) : enoVbak.sbgrp != null) return false;
        if (ctlpc != null ? !ctlpc.equals(enoVbak.ctlpc) : enoVbak.ctlpc != null) return false;
        if (cmwae != null ? !cmwae.equals(enoVbak.cmwae) : enoVbak.cmwae != null) return false;
        if (cmfre != null ? !cmfre.equals(enoVbak.cmfre) : enoVbak.cmfre != null) return false;
        if (cmnup != null ? !cmnup.equals(enoVbak.cmnup) : enoVbak.cmnup != null) return false;
        if (cmngv != null ? !cmngv.equals(enoVbak.cmngv) : enoVbak.cmngv != null) return false;
        if (amtbl != null ? !amtbl.equals(enoVbak.amtbl) : enoVbak.amtbl != null) return false;
        if (hitypPr != null ? !hitypPr.equals(enoVbak.hitypPr) : enoVbak.hitypPr != null) return false;
        if (abrvw != null ? !abrvw.equals(enoVbak.abrvw) : enoVbak.abrvw != null) return false;
        if (abdis != null ? !abdis.equals(enoVbak.abdis) : enoVbak.abdis != null) return false;
        if (vgbel != null ? !vgbel.equals(enoVbak.vgbel) : enoVbak.vgbel != null) return false;
        if (objnr != null ? !objnr.equals(enoVbak.objnr) : enoVbak.objnr != null) return false;
        if (bukrsVf != null ? !bukrsVf.equals(enoVbak.bukrsVf) : enoVbak.bukrsVf != null) return false;
        if (taxk1 != null ? !taxk1.equals(enoVbak.taxk1) : enoVbak.taxk1 != null) return false;
        if (taxk2 != null ? !taxk2.equals(enoVbak.taxk2) : enoVbak.taxk2 != null) return false;
        if (taxk3 != null ? !taxk3.equals(enoVbak.taxk3) : enoVbak.taxk3 != null) return false;
        if (taxk4 != null ? !taxk4.equals(enoVbak.taxk4) : enoVbak.taxk4 != null) return false;
        if (taxk5 != null ? !taxk5.equals(enoVbak.taxk5) : enoVbak.taxk5 != null) return false;
        if (taxk6 != null ? !taxk6.equals(enoVbak.taxk6) : enoVbak.taxk6 != null) return false;
        if (taxk7 != null ? !taxk7.equals(enoVbak.taxk7) : enoVbak.taxk7 != null) return false;
        if (taxk8 != null ? !taxk8.equals(enoVbak.taxk8) : enoVbak.taxk8 != null) return false;
        if (taxk9 != null ? !taxk9.equals(enoVbak.taxk9) : enoVbak.taxk9 != null) return false;
        if (xblnr != null ? !xblnr.equals(enoVbak.xblnr) : enoVbak.xblnr != null) return false;
        if (zuonr != null ? !zuonr.equals(enoVbak.zuonr) : enoVbak.zuonr != null) return false;
        if (vgtyp != null ? !vgtyp.equals(enoVbak.vgtyp) : enoVbak.vgtyp != null) return false;
        if (kalsmCh != null ? !kalsmCh.equals(enoVbak.kalsmCh) : enoVbak.kalsmCh != null) return false;
        if (agrzr != null ? !agrzr.equals(enoVbak.agrzr) : enoVbak.agrzr != null) return false;
        if (aufnr != null ? !aufnr.equals(enoVbak.aufnr) : enoVbak.aufnr != null) return false;
        if (qmnum != null ? !qmnum.equals(enoVbak.qmnum) : enoVbak.qmnum != null) return false;
        if (vbelnGrp != null ? !vbelnGrp.equals(enoVbak.vbelnGrp) : enoVbak.vbelnGrp != null) return false;
        if (schemeGrp != null ? !schemeGrp.equals(enoVbak.schemeGrp) : enoVbak.schemeGrp != null) return false;
        if (abrufPart != null ? !abrufPart.equals(enoVbak.abrufPart) : enoVbak.abrufPart != null) return false;
        if (abhod != null ? !abhod.equals(enoVbak.abhod) : enoVbak.abhod != null) return false;
        if (abhov != null ? !abhov.equals(enoVbak.abhov) : enoVbak.abhov != null) return false;
        if (abhob != null ? !abhob.equals(enoVbak.abhob) : enoVbak.abhob != null) return false;
        if (rplnr != null ? !rplnr.equals(enoVbak.rplnr) : enoVbak.rplnr != null) return false;
        if (vzeit != null ? !vzeit.equals(enoVbak.vzeit) : enoVbak.vzeit != null) return false;
        if (stcegL != null ? !stcegL.equals(enoVbak.stcegL) : enoVbak.stcegL != null) return false;
        if (landtx != null ? !landtx.equals(enoVbak.landtx) : enoVbak.landtx != null) return false;
        if (xegdr != null ? !xegdr.equals(enoVbak.xegdr) : enoVbak.xegdr != null) return false;
        if (enqueueGrp != null ? !enqueueGrp.equals(enoVbak.enqueueGrp) : enoVbak.enqueueGrp != null) return false;
        if (datFzau != null ? !datFzau.equals(enoVbak.datFzau) : enoVbak.datFzau != null) return false;
        if (fmbdat != null ? !fmbdat.equals(enoVbak.fmbdat) : enoVbak.fmbdat != null) return false;
        if (vsnmrV != null ? !vsnmrV.equals(enoVbak.vsnmrV) : enoVbak.vsnmrV != null) return false;
        if (handle != null ? !handle.equals(enoVbak.handle) : enoVbak.handle != null) return false;
        if (proli != null ? !proli.equals(enoVbak.proli) : enoVbak.proli != null) return false;
        if (contDg != null ? !contDg.equals(enoVbak.contDg) : enoVbak.contDg != null) return false;
        if (crmGuid != null ? !crmGuid.equals(enoVbak.crmGuid) : enoVbak.crmGuid != null) return false;
        if (updTmstmp != null ? !updTmstmp.equals(enoVbak.updTmstmp) : enoVbak.updTmstmp != null) return false;
        if (msrId != null ? !msrId.equals(enoVbak.msrId) : enoVbak.msrId != null) return false;
        if (tmCtrlKey != null ? !tmCtrlKey.equals(enoVbak.tmCtrlKey) : enoVbak.tmCtrlKey != null) return false;
        if (psmBudat != null ? !psmBudat.equals(enoVbak.psmBudat) : enoVbak.psmBudat != null) return false;
        if (swenr != null ? !swenr.equals(enoVbak.swenr) : enoVbak.swenr != null) return false;
        if (smenr != null ? !smenr.equals(enoVbak.smenr) : enoVbak.smenr != null) return false;
        if (phase != null ? !phase.equals(enoVbak.phase) : enoVbak.phase != null) return false;
        if (mtlaur != null ? !mtlaur.equals(enoVbak.mtlaur) : enoVbak.mtlaur != null) return false;
        if (stage != null ? !stage.equals(enoVbak.stage) : enoVbak.stage != null) return false;
        if (hbContReason != null ? !hbContReason.equals(enoVbak.hbContReason) : enoVbak.hbContReason != null)
            return false;
        if (hbExpdate != null ? !hbExpdate.equals(enoVbak.hbExpdate) : enoVbak.hbExpdate != null) return false;
        if (hbResdate != null ? !hbResdate.equals(enoVbak.hbResdate) : enoVbak.hbResdate != null) return false;
        if (millApplId != null ? !millApplId.equals(enoVbak.millApplId) : enoVbak.millApplId != null) return false;
        if (oidExtbol != null ? !oidExtbol.equals(enoVbak.oidExtbol) : enoVbak.oidExtbol != null) return false;
        if (oidMiscdl != null ? !oidMiscdl.equals(enoVbak.oidMiscdl) : enoVbak.oidMiscdl != null) return false;
        if (oidmsgShp != null ? !oidmsgShp.equals(enoVbak.oidmsgShp) : enoVbak.oidmsgShp != null) return false;
        if (oidstsShp != null ? !oidstsShp.equals(enoVbak.oidstsShp) : enoVbak.oidstsShp != null) return false;
        if (oipipeval != null ? !oipipeval.equals(enoVbak.oipipeval) : enoVbak.oipipeval != null) return false;
        if (oicLifnr != null ? !oicLifnr.equals(enoVbak.oicLifnr) : enoVbak.oicLifnr != null) return false;
        if (oicDcityc != null ? !oicDcityc.equals(enoVbak.oicDcityc) : enoVbak.oicDcityc != null) return false;
        if (oicDcounc != null ? !oicDcounc.equals(enoVbak.oicDcounc) : enoVbak.oicDcounc != null) return false;
        if (oicDregio != null ? !oicDregio.equals(enoVbak.oicDregio) : enoVbak.oicDregio != null) return false;
        if (oicDland1 != null ? !oicDland1.equals(enoVbak.oicDland1) : enoVbak.oicDland1 != null) return false;
        if (oicOcityc != null ? !oicOcityc.equals(enoVbak.oicOcityc) : enoVbak.oicOcityc != null) return false;
        if (oicOcounc != null ? !oicOcounc.equals(enoVbak.oicOcounc) : enoVbak.oicOcounc != null) return false;
        if (oicOregio != null ? !oicOregio.equals(enoVbak.oicOregio) : enoVbak.oicOregio != null) return false;
        if (oicOland1 != null ? !oicOland1.equals(enoVbak.oicOland1) : enoVbak.oicOland1 != null) return false;
        if (oicPorgin != null ? !oicPorgin.equals(enoVbak.oicPorgin) : enoVbak.oicPorgin != null) return false;
        if (oicPdestn != null ? !oicPdestn.equals(enoVbak.oicPdestn) : enoVbak.oicPdestn != null) return false;
        if (oicPtrip != null ? !oicPtrip.equals(enoVbak.oicPtrip) : enoVbak.oicPtrip != null) return false;
        if (oicPbatch != null ? !oicPbatch.equals(enoVbak.oicPbatch) : enoVbak.oicPbatch != null) return false;
        if (oicMot != null ? !oicMot.equals(enoVbak.oicMot) : enoVbak.oicMot != null) return false;
        if (oicAorgin != null ? !oicAorgin.equals(enoVbak.oicAorgin) : enoVbak.oicAorgin != null) return false;
        if (oicAdestn != null ? !oicAdestn.equals(enoVbak.oicAdestn) : enoVbak.oicAdestn != null) return false;
        if (oicTruckn != null ? !oicTruckn.equals(enoVbak.oicTruckn) : enoVbak.oicTruckn != null) return false;
        if (oiaBaselo != null ? !oiaBaselo.equals(enoVbak.oiaBaselo) : enoVbak.oiaBaselo != null) return false;
        if (oiinex != null ? !oiinex.equals(enoVbak.oiinex) : enoVbak.oiinex != null) return false;
        if (oiisoil != null ? !oiisoil.equals(enoVbak.oiisoil) : enoVbak.oiisoil != null) return false;
        if (oiptrfnc != null ? !oiptrfnc.equals(enoVbak.oiptrfnc) : enoVbak.oiptrfnc != null) return false;
        if (oipartnr != null ? !oipartnr.equals(enoVbak.oipartnr) : enoVbak.oipartnr != null) return false;
        if (oilastor != null ? !oilastor.equals(enoVbak.oilastor) : enoVbak.oilastor != null) return false;
        if (oidrc != null ? !oidrc.equals(enoVbak.oidrc) : enoVbak.oidrc != null) return false;
        if (oiexgnum != null ? !oiexgnum.equals(enoVbak.oiexgnum) : enoVbak.oiexgnum != null) return false;
        if (oiexgtyp != null ? !oiexgtyp.equals(enoVbak.oiexgtyp) : enoVbak.oiexgtyp != null) return false;
        if (oicheadoff != null ? !oicheadoff.equals(enoVbak.oicheadoff) : enoVbak.oicheadoff != null) return false;
        if (oipbl != null ? !oipbl.equals(enoVbak.oipbl) : enoVbak.oipbl != null) return false;
        if (oidrestr != null ? !oidrestr.equals(enoVbak.oidrestr) : enoVbak.oidrestr != null) return false;
        if (oidmsgPrd != null ? !oidmsgPrd.equals(enoVbak.oidmsgPrd) : enoVbak.oidmsgPrd != null) return false;
        if (oidmsgQty != null ? !oidmsgQty.equals(enoVbak.oidmsgQty) : enoVbak.oidmsgQty != null) return false;
        if (oidmsgUom != null ? !oidmsgUom.equals(enoVbak.oidmsgUom) : enoVbak.oidmsgUom != null) return false;
        if (oidmsgDat != null ? !oidmsgDat.equals(enoVbak.oidmsgDat) : enoVbak.oidmsgDat != null) return false;
        if (oidmsgTrm != null ? !oidmsgTrm.equals(enoVbak.oidmsgTrm) : enoVbak.oidmsgTrm != null) return false;
        if (oicntper != null ? !oicntper.equals(enoVbak.oicntper) : enoVbak.oicntper != null) return false;
        if (oicntnte != null ? !oicntnte.equals(enoVbak.oicntnte) : enoVbak.oicntnte != null) return false;
        if (oicntpho != null ? !oicntpho.equals(enoVbak.oicntpho) : enoVbak.oicntpho != null) return false;
        if (oidSortl != null ? !oidSortl.equals(enoVbak.oidSortl) : enoVbak.oidSortl != null) return false;
        if (oidSort2 != null ? !oidSort2.equals(enoVbak.oidSort2) : enoVbak.oidSort2 != null) return false;
        if (oicfkartdi != null ? !oicfkartdi.equals(enoVbak.oicfkartdi) : enoVbak.oicfkartdi != null) return false;
        if (oiaevgtype != null ? !oiaevgtype.equals(enoVbak.oiaevgtype) : enoVbak.oiaevgtype != null) return false;
        if (oiuCtTypeCd != null ? !oiuCtTypeCd.equals(enoVbak.oiuCtTypeCd) : enoVbak.oiuCtTypeCd != null) return false;
        if (oiuCustVendCd != null ? !oiuCustVendCd.equals(enoVbak.oiuCustVendCd) : enoVbak.oiuCustVendCd != null)
            return false;
        if (oiuApprFl != null ? !oiuApprFl.equals(enoVbak.oiuApprFl) : enoVbak.oiuApprFl != null) return false;
        if (oiuApprDt != null ? !oiuApprDt.equals(enoVbak.oiuApprDt) : enoVbak.oiuApprDt != null) return false;
        if (oiuExecDt != null ? !oiuExecDt.equals(enoVbak.oiuExecDt) : enoVbak.oiuExecDt != null) return false;
        if (oiuStdCtFl != null ? !oiuStdCtFl.equals(enoVbak.oiuStdCtFl) : enoVbak.oiuStdCtFl != null) return false;
        if (oiuPrevCtNo != null ? !oiuPrevCtNo.equals(enoVbak.oiuPrevCtNo) : enoVbak.oiuPrevCtNo != null) return false;
        if (oiuGpltCompany != null ? !oiuGpltCompany.equals(enoVbak.oiuGpltCompany) : enoVbak.oiuGpltCompany != null)
            return false;
        if (oiuGpltVname != null ? !oiuGpltVname.equals(enoVbak.oiuGpltVname) : enoVbak.oiuGpltVname != null)
            return false;
        if (oiuGpltDoiNo != null ? !oiuGpltDoiNo.equals(enoVbak.oiuGpltDoiNo) : enoVbak.oiuGpltDoiNo != null)
            return false;
        if (oiuMkRepNo != null ? !oiuMkRepNo.equals(enoVbak.oiuMkRepNo) : enoVbak.oiuMkRepNo != null) return false;
        if (oiuMkRepIsq != null ? !oiuMkRepIsq.equals(enoVbak.oiuMkRepIsq) : enoVbak.oiuMkRepIsq != null) return false;
        if (oiuDestSaleCd != null ? !oiuDestSaleCd.equals(enoVbak.oiuDestSaleCd) : enoVbak.oiuDestSaleCd != null)
            return false;
        if (oiuLifeLseFl != null ? !oiuLifeLseFl.equals(enoVbak.oiuLifeLseFl) : enoVbak.oiuLifeLseFl != null)
            return false;
        if (oiuInvNo != null ? !oiuInvNo.equals(enoVbak.oiuInvNo) : enoVbak.oiuInvNo != null) return false;
        if (oiuInvFl != null ? !oiuInvFl.equals(enoVbak.oiuInvFl) : enoVbak.oiuInvFl != null) return false;
        if (oiuObligDt != null ? !oiuObligDt.equals(enoVbak.oiuObligDt) : enoVbak.oiuObligDt != null) return false;
        if (oiuDeskCd != null ? !oiuDeskCd.equals(enoVbak.oiuDeskCd) : enoVbak.oiuDeskCd != null) return false;
        if (oiuEiaGinaCd != null ? !oiuEiaGinaCd.equals(enoVbak.oiuEiaGinaCd) : enoVbak.oiuEiaGinaCd != null)
            return false;
        if (oiuCtStatusCd != null ? !oiuCtStatusCd.equals(enoVbak.oiuCtStatusCd) : enoVbak.oiuCtStatusCd != null)
            return false;
        if (oiuSpotTermCd != null ? !oiuSpotTermCd.equals(enoVbak.oiuSpotTermCd) : enoVbak.oiuSpotTermCd != null)
            return false;
        if (oiuStndedqCd != null ? !oiuStndedqCd.equals(enoVbak.oiuStndedqCd) : enoVbak.oiuStndedqCd != null)
            return false;
        if (oiuIotrFl != null ? !oiuIotrFl.equals(enoVbak.oiuIotrFl) : enoVbak.oiuIotrFl != null) return false;
        if (oiuIntraInter != null ? !oiuIntraInter.equals(enoVbak.oiuIntraInter) : enoVbak.oiuIntraInter != null)
            return false;
        if (oiuExresSplt != null ? !oiuExresSplt.equals(enoVbak.oiuExresSplt) : enoVbak.oiuExresSplt != null)
            return false;
        if (oiuEvgnFl != null ? !oiuEvgnFl.equals(enoVbak.oiuEvgnFl) : enoVbak.oiuEvgnFl != null) return false;
        if (oiuEvgnpdBas != null ? !oiuEvgnpdBas.equals(enoVbak.oiuEvgnpdBas) : enoVbak.oiuEvgnpdBas != null)
            return false;
        if (oiuEvgnPerdQy != null ? !oiuEvgnPerdQy.equals(enoVbak.oiuEvgnPerdQy) : enoVbak.oiuEvgnPerdQy != null)
            return false;
        if (oiuPreimTmCd != null ? !oiuPreimTmCd.equals(enoVbak.oiuPreimTmCd) : enoVbak.oiuPreimTmCd != null)
            return false;
        if (oiuPrimTmQy != null ? !oiuPrimTmQy.equals(enoVbak.oiuPrimTmQy) : enoVbak.oiuPrimTmQy != null) return false;
        if (oiuSecTmCd != null ? !oiuSecTmCd.equals(enoVbak.oiuSecTmCd) : enoVbak.oiuSecTmCd != null) return false;
        if (oiuSecTmQy != null ? !oiuSecTmQy.equals(enoVbak.oiuSecTmQy) : enoVbak.oiuSecTmQy != null) return false;
        if (oiuExpNotifDt != null ? !oiuExpNotifDt.equals(enoVbak.oiuExpNotifDt) : enoVbak.oiuExpNotifDt != null)
            return false;
        if (oiuIntitRdtDt != null ? !oiuIntitRdtDt.equals(enoVbak.oiuIntitRdtDt) : enoVbak.oiuIntitRdtDt != null)
            return false;
        if (oiuNextRdtDt != null ? !oiuNextRdtDt.equals(enoVbak.oiuNextRdtDt) : enoVbak.oiuNextRdtDt != null)
            return false;
        if (oiuRtcDt != null ? !oiuRtcDt.equals(enoVbak.oiuRtcDt) : enoVbak.oiuRtcDt != null) return false;
        if (oiuRdtNPerd != null ? !oiuRdtNPerd.equals(enoVbak.oiuRdtNPerd) : enoVbak.oiuRdtNPerd != null) return false;
        if (oiuRdtRefqCd != null ? !oiuRdtRefqCd.equals(enoVbak.oiuRdtRefqCd) : enoVbak.oiuRdtRefqCd != null)
            return false;
        if (oiuRtfCd != null ? !oiuRtfCd.equals(enoVbak.oiuRtfCd) : enoVbak.oiuRtfCd != null) return false;
        if (oiuImbPrvsnFl != null ? !oiuImbPrvsnFl.equals(enoVbak.oiuImbPrvsnFl) : enoVbak.oiuImbPrvsnFl != null)
            return false;
        if (oiuFfeeRmbFl != null ? !oiuFfeeRmbFl.equals(enoVbak.oiuFfeeRmbFl) : enoVbak.oiuFfeeRmbFl != null)
            return false;
        if (oiuFirmIntrpt != null ? !oiuFirmIntrpt.equals(enoVbak.oiuFirmIntrpt) : enoVbak.oiuFirmIntrpt != null)
            return false;
        if (oiuBalBasCd != null ? !oiuBalBasCd.equals(enoVbak.oiuBalBasCd) : enoVbak.oiuBalBasCd != null) return false;
        if (oiuPntyBasCd != null ? !oiuPntyBasCd.equals(enoVbak.oiuPntyBasCd) : enoVbak.oiuPntyBasCd != null)
            return false;
        if (oiuTranspBa != null ? !oiuTranspBa.equals(enoVbak.oiuTranspBa) : enoVbak.oiuTranspBa != null) return false;
        if (oiuDlyMaxTQy != null ? !oiuDlyMaxTQy.equals(enoVbak.oiuDlyMaxTQy) : enoVbak.oiuDlyMaxTQy != null)
            return false;
        if (oiuPrcsFl != null ? !oiuPrcsFl.equals(enoVbak.oiuPrcsFl) : enoVbak.oiuPrcsFl != null) return false;
        if (oiuSprFl != null ? !oiuSprFl.equals(enoVbak.oiuSprFl) : enoVbak.oiuSprFl != null) return false;
        if (oiuDehydFl != null ? !oiuDehydFl.equals(enoVbak.oiuDehydFl) : enoVbak.oiuDehydFl != null) return false;
        if (oiuComprFl != null ? !oiuComprFl.equals(enoVbak.oiuComprFl) : enoVbak.oiuComprFl != null) return false;
        if (oiuPymtMethCd != null ? !oiuPymtMethCd.equals(enoVbak.oiuPymtMethCd) : enoVbak.oiuPymtMethCd != null)
            return false;
        if (oiuConMatnr != null ? !oiuConMatnr.equals(enoVbak.oiuConMatnr) : enoVbak.oiuConMatnr != null) return false;
        if (oiuConMaxQy != null ? !oiuConMaxQy.equals(enoVbak.oiuConMaxQy) : enoVbak.oiuConMaxQy != null) return false;
        if (oiuAffilFl != null ? !oiuAffilFl.equals(enoVbak.oiuAffilFl) : enoVbak.oiuAffilFl != null) return false;
        if (oiuMmsTypeCd != null ? !oiuMmsTypeCd.equals(enoVbak.oiuMmsTypeCd) : enoVbak.oiuMmsTypeCd != null)
            return false;
        if (oiuMmsEtpayFl != null ? !oiuMmsEtpayFl.equals(enoVbak.oiuMmsEtpayFl) : enoVbak.oiuMmsEtpayFl != null)
            return false;
        if (oiuhCtNo != null ? !oiuhCtNo.equals(enoVbak.oiuhCtNo) : enoVbak.oiuhCtNo != null) return false;
        if (tas != null ? !tas.equals(enoVbak.tas) : enoVbak.tas != null) return false;
        if (betc != null ? !betc.equals(enoVbak.betc) : enoVbak.betc != null) return false;
        if (modAllow != null ? !modAllow.equals(enoVbak.modAllow) : enoVbak.modAllow != null) return false;
        if (cancelAllow != null ? !cancelAllow.equals(enoVbak.cancelAllow) : enoVbak.cancelAllow != null) return false;
        if (payMethod != null ? !payMethod.equals(enoVbak.payMethod) : enoVbak.payMethod != null) return false;
        if (bpn != null ? !bpn.equals(enoVbak.bpn) : enoVbak.bpn != null) return false;
        if (repFreq != null ? !repFreq.equals(enoVbak.repFreq) : enoVbak.repFreq != null) return false;
        if (logsysb != null ? !logsysb.equals(enoVbak.logsysb) : enoVbak.logsysb != null) return false;
        if (kalcd != null ? !kalcd.equals(enoVbak.kalcd) : enoVbak.kalcd != null) return false;
        if (multi != null ? !multi.equals(enoVbak.multi) : enoVbak.multi != null) return false;
        if (sppaym != null ? !sppaym.equals(enoVbak.sppaym) : enoVbak.sppaym != null) return false;
        if (wtyscClmHdr != null ? !wtyscClmHdr.equals(enoVbak.wtyscClmHdr) : enoVbak.wtyscClmHdr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bicLogsys != null ? bicLogsys.hashCode() : 0;
        result = 31 * result + (mandt != null ? mandt.hashCode() : 0);
        result = 31 * result + (vbeln != null ? vbeln.hashCode() : 0);
        result = 31 * result + (erdat != null ? erdat.hashCode() : 0);
        result = 31 * result + (erzet != null ? erzet.hashCode() : 0);
        result = 31 * result + (ernam != null ? ernam.hashCode() : 0);
        result = 31 * result + (angdt != null ? angdt.hashCode() : 0);
        result = 31 * result + (bnddt != null ? bnddt.hashCode() : 0);
        result = 31 * result + (audat != null ? audat.hashCode() : 0);
        result = 31 * result + (vbtyp != null ? vbtyp.hashCode() : 0);
        result = 31 * result + (trvog != null ? trvog.hashCode() : 0);
        result = 31 * result + (auart != null ? auart.hashCode() : 0);
        result = 31 * result + (augru != null ? augru.hashCode() : 0);
        result = 31 * result + (gwldt != null ? gwldt.hashCode() : 0);
        result = 31 * result + (submi != null ? submi.hashCode() : 0);
        result = 31 * result + (lifsk != null ? lifsk.hashCode() : 0);
        result = 31 * result + (faksk != null ? faksk.hashCode() : 0);
        result = 31 * result + (netwr != null ? netwr.hashCode() : 0);
        result = 31 * result + (waerk != null ? waerk.hashCode() : 0);
        result = 31 * result + (vkorg != null ? vkorg.hashCode() : 0);
        result = 31 * result + (vtweg != null ? vtweg.hashCode() : 0);
        result = 31 * result + (spart != null ? spart.hashCode() : 0);
        result = 31 * result + (vkgrp != null ? vkgrp.hashCode() : 0);
        result = 31 * result + (vkbur != null ? vkbur.hashCode() : 0);
        result = 31 * result + (gsber != null ? gsber.hashCode() : 0);
        result = 31 * result + (gskst != null ? gskst.hashCode() : 0);
        result = 31 * result + (guebg != null ? guebg.hashCode() : 0);
        result = 31 * result + (gueen != null ? gueen.hashCode() : 0);
        result = 31 * result + (knumv != null ? knumv.hashCode() : 0);
        result = 31 * result + (vdatu != null ? vdatu.hashCode() : 0);
        result = 31 * result + (vprgr != null ? vprgr.hashCode() : 0);
        result = 31 * result + (autlf != null ? autlf.hashCode() : 0);
        result = 31 * result + (vbkla != null ? vbkla.hashCode() : 0);
        result = 31 * result + (vbklt != null ? vbklt.hashCode() : 0);
        result = 31 * result + (kalsm != null ? kalsm.hashCode() : 0);
        result = 31 * result + (vsbed != null ? vsbed.hashCode() : 0);
        result = 31 * result + (fkara != null ? fkara.hashCode() : 0);
        result = 31 * result + (awahr != null ? awahr.hashCode() : 0);
        result = 31 * result + (ktext != null ? ktext.hashCode() : 0);
        result = 31 * result + (bstnk != null ? bstnk.hashCode() : 0);
        result = 31 * result + (bsark != null ? bsark.hashCode() : 0);
        result = 31 * result + (bstdk != null ? bstdk.hashCode() : 0);
        result = 31 * result + (bstzd != null ? bstzd.hashCode() : 0);
        result = 31 * result + (ihrez != null ? ihrez.hashCode() : 0);
        result = 31 * result + (bname != null ? bname.hashCode() : 0);
        result = 31 * result + (telf1 != null ? telf1.hashCode() : 0);
        result = 31 * result + (mahza != null ? mahza.hashCode() : 0);
        result = 31 * result + (mahdt != null ? mahdt.hashCode() : 0);
        result = 31 * result + (kunnr != null ? kunnr.hashCode() : 0);
        result = 31 * result + (kostl != null ? kostl.hashCode() : 0);
        result = 31 * result + (stafo != null ? stafo.hashCode() : 0);
        result = 31 * result + (stwae != null ? stwae.hashCode() : 0);
        result = 31 * result + (aedat != null ? aedat.hashCode() : 0);
        result = 31 * result + (kvgr1 != null ? kvgr1.hashCode() : 0);
        result = 31 * result + (kvgr2 != null ? kvgr2.hashCode() : 0);
        result = 31 * result + (kvgr3 != null ? kvgr3.hashCode() : 0);
        result = 31 * result + (kvgr4 != null ? kvgr4.hashCode() : 0);
        result = 31 * result + (kvgr5 != null ? kvgr5.hashCode() : 0);
        result = 31 * result + (knuma != null ? knuma.hashCode() : 0);
        result = 31 * result + (kokrs != null ? kokrs.hashCode() : 0);
        result = 31 * result + (psPspPnr != null ? psPspPnr.hashCode() : 0);
        result = 31 * result + (kurst != null ? kurst.hashCode() : 0);
        result = 31 * result + (kkber != null ? kkber.hashCode() : 0);
        result = 31 * result + (knkli != null ? knkli.hashCode() : 0);
        result = 31 * result + (grupp != null ? grupp.hashCode() : 0);
        result = 31 * result + (sbgrp != null ? sbgrp.hashCode() : 0);
        result = 31 * result + (ctlpc != null ? ctlpc.hashCode() : 0);
        result = 31 * result + (cmwae != null ? cmwae.hashCode() : 0);
        result = 31 * result + (cmfre != null ? cmfre.hashCode() : 0);
        result = 31 * result + (cmnup != null ? cmnup.hashCode() : 0);
        result = 31 * result + (cmngv != null ? cmngv.hashCode() : 0);
        result = 31 * result + (amtbl != null ? amtbl.hashCode() : 0);
        result = 31 * result + (hitypPr != null ? hitypPr.hashCode() : 0);
        result = 31 * result + (abrvw != null ? abrvw.hashCode() : 0);
        result = 31 * result + (abdis != null ? abdis.hashCode() : 0);
        result = 31 * result + (vgbel != null ? vgbel.hashCode() : 0);
        result = 31 * result + (objnr != null ? objnr.hashCode() : 0);
        result = 31 * result + (bukrsVf != null ? bukrsVf.hashCode() : 0);
        result = 31 * result + (taxk1 != null ? taxk1.hashCode() : 0);
        result = 31 * result + (taxk2 != null ? taxk2.hashCode() : 0);
        result = 31 * result + (taxk3 != null ? taxk3.hashCode() : 0);
        result = 31 * result + (taxk4 != null ? taxk4.hashCode() : 0);
        result = 31 * result + (taxk5 != null ? taxk5.hashCode() : 0);
        result = 31 * result + (taxk6 != null ? taxk6.hashCode() : 0);
        result = 31 * result + (taxk7 != null ? taxk7.hashCode() : 0);
        result = 31 * result + (taxk8 != null ? taxk8.hashCode() : 0);
        result = 31 * result + (taxk9 != null ? taxk9.hashCode() : 0);
        result = 31 * result + (xblnr != null ? xblnr.hashCode() : 0);
        result = 31 * result + (zuonr != null ? zuonr.hashCode() : 0);
        result = 31 * result + (vgtyp != null ? vgtyp.hashCode() : 0);
        result = 31 * result + (kalsmCh != null ? kalsmCh.hashCode() : 0);
        result = 31 * result + (agrzr != null ? agrzr.hashCode() : 0);
        result = 31 * result + (aufnr != null ? aufnr.hashCode() : 0);
        result = 31 * result + (qmnum != null ? qmnum.hashCode() : 0);
        result = 31 * result + (vbelnGrp != null ? vbelnGrp.hashCode() : 0);
        result = 31 * result + (schemeGrp != null ? schemeGrp.hashCode() : 0);
        result = 31 * result + (abrufPart != null ? abrufPart.hashCode() : 0);
        result = 31 * result + (abhod != null ? abhod.hashCode() : 0);
        result = 31 * result + (abhov != null ? abhov.hashCode() : 0);
        result = 31 * result + (abhob != null ? abhob.hashCode() : 0);
        result = 31 * result + (rplnr != null ? rplnr.hashCode() : 0);
        result = 31 * result + (vzeit != null ? vzeit.hashCode() : 0);
        result = 31 * result + (stcegL != null ? stcegL.hashCode() : 0);
        result = 31 * result + (landtx != null ? landtx.hashCode() : 0);
        result = 31 * result + (xegdr != null ? xegdr.hashCode() : 0);
        result = 31 * result + (enqueueGrp != null ? enqueueGrp.hashCode() : 0);
        result = 31 * result + (datFzau != null ? datFzau.hashCode() : 0);
        result = 31 * result + (fmbdat != null ? fmbdat.hashCode() : 0);
        result = 31 * result + (vsnmrV != null ? vsnmrV.hashCode() : 0);
        result = 31 * result + (handle != null ? handle.hashCode() : 0);
        result = 31 * result + (proli != null ? proli.hashCode() : 0);
        result = 31 * result + (contDg != null ? contDg.hashCode() : 0);
        result = 31 * result + (crmGuid != null ? crmGuid.hashCode() : 0);
        result = 31 * result + (updTmstmp != null ? updTmstmp.hashCode() : 0);
        result = 31 * result + (msrId != null ? msrId.hashCode() : 0);
        result = 31 * result + (tmCtrlKey != null ? tmCtrlKey.hashCode() : 0);
        result = 31 * result + (psmBudat != null ? psmBudat.hashCode() : 0);
        result = 31 * result + (swenr != null ? swenr.hashCode() : 0);
        result = 31 * result + (smenr != null ? smenr.hashCode() : 0);
        result = 31 * result + (phase != null ? phase.hashCode() : 0);
        result = 31 * result + (mtlaur != null ? mtlaur.hashCode() : 0);
        result = 31 * result + (stage != null ? stage.hashCode() : 0);
        result = 31 * result + (hbContReason != null ? hbContReason.hashCode() : 0);
        result = 31 * result + (hbExpdate != null ? hbExpdate.hashCode() : 0);
        result = 31 * result + (hbResdate != null ? hbResdate.hashCode() : 0);
        result = 31 * result + (millApplId != null ? millApplId.hashCode() : 0);
        result = 31 * result + (oidExtbol != null ? oidExtbol.hashCode() : 0);
        result = 31 * result + (oidMiscdl != null ? oidMiscdl.hashCode() : 0);
        result = 31 * result + (oidmsgShp != null ? oidmsgShp.hashCode() : 0);
        result = 31 * result + (oidstsShp != null ? oidstsShp.hashCode() : 0);
        result = 31 * result + (oipipeval != null ? oipipeval.hashCode() : 0);
        result = 31 * result + (oicLifnr != null ? oicLifnr.hashCode() : 0);
        result = 31 * result + (oicDcityc != null ? oicDcityc.hashCode() : 0);
        result = 31 * result + (oicDcounc != null ? oicDcounc.hashCode() : 0);
        result = 31 * result + (oicDregio != null ? oicDregio.hashCode() : 0);
        result = 31 * result + (oicDland1 != null ? oicDland1.hashCode() : 0);
        result = 31 * result + (oicOcityc != null ? oicOcityc.hashCode() : 0);
        result = 31 * result + (oicOcounc != null ? oicOcounc.hashCode() : 0);
        result = 31 * result + (oicOregio != null ? oicOregio.hashCode() : 0);
        result = 31 * result + (oicOland1 != null ? oicOland1.hashCode() : 0);
        result = 31 * result + (oicPorgin != null ? oicPorgin.hashCode() : 0);
        result = 31 * result + (oicPdestn != null ? oicPdestn.hashCode() : 0);
        result = 31 * result + (oicPtrip != null ? oicPtrip.hashCode() : 0);
        result = 31 * result + (oicPbatch != null ? oicPbatch.hashCode() : 0);
        result = 31 * result + (oicMot != null ? oicMot.hashCode() : 0);
        result = 31 * result + (oicAorgin != null ? oicAorgin.hashCode() : 0);
        result = 31 * result + (oicAdestn != null ? oicAdestn.hashCode() : 0);
        result = 31 * result + (oicTruckn != null ? oicTruckn.hashCode() : 0);
        result = 31 * result + (oiaBaselo != null ? oiaBaselo.hashCode() : 0);
        result = 31 * result + (oiinex != null ? oiinex.hashCode() : 0);
        result = 31 * result + (oiisoil != null ? oiisoil.hashCode() : 0);
        result = 31 * result + (oiptrfnc != null ? oiptrfnc.hashCode() : 0);
        result = 31 * result + (oipartnr != null ? oipartnr.hashCode() : 0);
        result = 31 * result + (oilastor != null ? oilastor.hashCode() : 0);
        result = 31 * result + (oidrc != null ? oidrc.hashCode() : 0);
        result = 31 * result + (oiexgnum != null ? oiexgnum.hashCode() : 0);
        result = 31 * result + (oiexgtyp != null ? oiexgtyp.hashCode() : 0);
        result = 31 * result + (oicheadoff != null ? oicheadoff.hashCode() : 0);
        result = 31 * result + (oipbl != null ? oipbl.hashCode() : 0);
        result = 31 * result + (oidrestr != null ? oidrestr.hashCode() : 0);
        result = 31 * result + (oidmsgPrd != null ? oidmsgPrd.hashCode() : 0);
        result = 31 * result + (oidmsgQty != null ? oidmsgQty.hashCode() : 0);
        result = 31 * result + (oidmsgUom != null ? oidmsgUom.hashCode() : 0);
        result = 31 * result + (oidmsgDat != null ? oidmsgDat.hashCode() : 0);
        result = 31 * result + (oidmsgTrm != null ? oidmsgTrm.hashCode() : 0);
        result = 31 * result + (oicntper != null ? oicntper.hashCode() : 0);
        result = 31 * result + (oicntnte != null ? oicntnte.hashCode() : 0);
        result = 31 * result + (oicntpho != null ? oicntpho.hashCode() : 0);
        result = 31 * result + (oidSortl != null ? oidSortl.hashCode() : 0);
        result = 31 * result + (oidSort2 != null ? oidSort2.hashCode() : 0);
        result = 31 * result + (oicfkartdi != null ? oicfkartdi.hashCode() : 0);
        result = 31 * result + (oiaevgtype != null ? oiaevgtype.hashCode() : 0);
        result = 31 * result + (oiuCtTypeCd != null ? oiuCtTypeCd.hashCode() : 0);
        result = 31 * result + (oiuCustVendCd != null ? oiuCustVendCd.hashCode() : 0);
        result = 31 * result + (oiuApprFl != null ? oiuApprFl.hashCode() : 0);
        result = 31 * result + (oiuApprDt != null ? oiuApprDt.hashCode() : 0);
        result = 31 * result + (oiuExecDt != null ? oiuExecDt.hashCode() : 0);
        result = 31 * result + (oiuStdCtFl != null ? oiuStdCtFl.hashCode() : 0);
        result = 31 * result + (oiuPrevCtNo != null ? oiuPrevCtNo.hashCode() : 0);
        result = 31 * result + (oiuGpltCompany != null ? oiuGpltCompany.hashCode() : 0);
        result = 31 * result + (oiuGpltVname != null ? oiuGpltVname.hashCode() : 0);
        result = 31 * result + (oiuGpltDoiNo != null ? oiuGpltDoiNo.hashCode() : 0);
        result = 31 * result + (oiuMkRepNo != null ? oiuMkRepNo.hashCode() : 0);
        result = 31 * result + (oiuMkRepIsq != null ? oiuMkRepIsq.hashCode() : 0);
        result = 31 * result + (oiuDestSaleCd != null ? oiuDestSaleCd.hashCode() : 0);
        result = 31 * result + (oiuLifeLseFl != null ? oiuLifeLseFl.hashCode() : 0);
        result = 31 * result + (oiuInvNo != null ? oiuInvNo.hashCode() : 0);
        result = 31 * result + (oiuInvFl != null ? oiuInvFl.hashCode() : 0);
        result = 31 * result + (oiuObligDt != null ? oiuObligDt.hashCode() : 0);
        result = 31 * result + (oiuDeskCd != null ? oiuDeskCd.hashCode() : 0);
        result = 31 * result + (oiuEiaGinaCd != null ? oiuEiaGinaCd.hashCode() : 0);
        result = 31 * result + (oiuCtStatusCd != null ? oiuCtStatusCd.hashCode() : 0);
        result = 31 * result + (oiuSpotTermCd != null ? oiuSpotTermCd.hashCode() : 0);
        result = 31 * result + (oiuStndedqCd != null ? oiuStndedqCd.hashCode() : 0);
        result = 31 * result + (oiuIotrFl != null ? oiuIotrFl.hashCode() : 0);
        result = 31 * result + (oiuIntraInter != null ? oiuIntraInter.hashCode() : 0);
        result = 31 * result + (oiuExresSplt != null ? oiuExresSplt.hashCode() : 0);
        result = 31 * result + (oiuEvgnFl != null ? oiuEvgnFl.hashCode() : 0);
        result = 31 * result + (oiuEvgnpdBas != null ? oiuEvgnpdBas.hashCode() : 0);
        result = 31 * result + (oiuEvgnPerdQy != null ? oiuEvgnPerdQy.hashCode() : 0);
        result = 31 * result + (oiuPreimTmCd != null ? oiuPreimTmCd.hashCode() : 0);
        result = 31 * result + (oiuPrimTmQy != null ? oiuPrimTmQy.hashCode() : 0);
        result = 31 * result + (oiuSecTmCd != null ? oiuSecTmCd.hashCode() : 0);
        result = 31 * result + (oiuSecTmQy != null ? oiuSecTmQy.hashCode() : 0);
        result = 31 * result + (oiuExpNotifDt != null ? oiuExpNotifDt.hashCode() : 0);
        result = 31 * result + (oiuIntitRdtDt != null ? oiuIntitRdtDt.hashCode() : 0);
        result = 31 * result + (oiuNextRdtDt != null ? oiuNextRdtDt.hashCode() : 0);
        result = 31 * result + (oiuRtcDt != null ? oiuRtcDt.hashCode() : 0);
        result = 31 * result + (oiuRdtNPerd != null ? oiuRdtNPerd.hashCode() : 0);
        result = 31 * result + (oiuRdtRefqCd != null ? oiuRdtRefqCd.hashCode() : 0);
        result = 31 * result + (oiuRtfCd != null ? oiuRtfCd.hashCode() : 0);
        result = 31 * result + (oiuImbPrvsnFl != null ? oiuImbPrvsnFl.hashCode() : 0);
        result = 31 * result + (oiuFfeeRmbFl != null ? oiuFfeeRmbFl.hashCode() : 0);
        result = 31 * result + (oiuFirmIntrpt != null ? oiuFirmIntrpt.hashCode() : 0);
        result = 31 * result + (oiuBalBasCd != null ? oiuBalBasCd.hashCode() : 0);
        result = 31 * result + (oiuPntyBasCd != null ? oiuPntyBasCd.hashCode() : 0);
        result = 31 * result + (oiuTranspBa != null ? oiuTranspBa.hashCode() : 0);
        result = 31 * result + (oiuDlyMaxTQy != null ? oiuDlyMaxTQy.hashCode() : 0);
        result = 31 * result + (oiuPrcsFl != null ? oiuPrcsFl.hashCode() : 0);
        result = 31 * result + (oiuSprFl != null ? oiuSprFl.hashCode() : 0);
        result = 31 * result + (oiuDehydFl != null ? oiuDehydFl.hashCode() : 0);
        result = 31 * result + (oiuComprFl != null ? oiuComprFl.hashCode() : 0);
        result = 31 * result + (oiuPymtMethCd != null ? oiuPymtMethCd.hashCode() : 0);
        result = 31 * result + (oiuConMatnr != null ? oiuConMatnr.hashCode() : 0);
        result = 31 * result + (oiuConMaxQy != null ? oiuConMaxQy.hashCode() : 0);
        result = 31 * result + (oiuAffilFl != null ? oiuAffilFl.hashCode() : 0);
        result = 31 * result + (oiuMmsTypeCd != null ? oiuMmsTypeCd.hashCode() : 0);
        result = 31 * result + (oiuMmsEtpayFl != null ? oiuMmsEtpayFl.hashCode() : 0);
        result = 31 * result + (oiuhCtNo != null ? oiuhCtNo.hashCode() : 0);
        result = 31 * result + (tas != null ? tas.hashCode() : 0);
        result = 31 * result + (betc != null ? betc.hashCode() : 0);
        result = 31 * result + (modAllow != null ? modAllow.hashCode() : 0);
        result = 31 * result + (cancelAllow != null ? cancelAllow.hashCode() : 0);
        result = 31 * result + (payMethod != null ? payMethod.hashCode() : 0);
        result = 31 * result + (bpn != null ? bpn.hashCode() : 0);
        result = 31 * result + (repFreq != null ? repFreq.hashCode() : 0);
        result = 31 * result + (logsysb != null ? logsysb.hashCode() : 0);
        result = 31 * result + (kalcd != null ? kalcd.hashCode() : 0);
        result = 31 * result + (multi != null ? multi.hashCode() : 0);
        result = 31 * result + (sppaym != null ? sppaym.hashCode() : 0);
        result = 31 * result + (wtyscClmHdr != null ? wtyscClmHdr.hashCode() : 0);
        return result;
    }
}
