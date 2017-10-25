package ni.org.ics.zpo.domain;

import ni.org.ics.zpo.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/7/2016.
 * V1.0
 */
@Entity
@Table(name = "zpo01_study_entry_section_c", catalog = "zika_zpo")
public class Zpo01StudyEntrySectionC extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String eventName;
    private String seaDiseases; //multiple
    private String seaOtherSpecify;
    private String seaHepatitis;
    private Date seaHepatitisDate1;
    private Date seaHepatitisDate2;
    private Date seaHepatitisDate3;
    private String seaMeasles;
    private Date seaMeaslesDate1;
    private Date seaMeaslesDate2;
    private Date seaMeaslesDate3;
    private String seaChickenpox;
    private Date seaChickenpoxDate1;
    private Date seaChickenpoxDate2;
    private Date seaChickenpoxDate3;
    private String seaInfluenza;
    private Date seaInfluenzaDate1;
    private Date seaInfluenzaDate2;
    private Date seaInfluenzaDate3;
    private String seaYellow;
    private Date seaYellowDate1;
    private Date seaYellowDate2;
    private Date seaYellowDate3;
    private String seaDengue;
    private Date seaDengueDate1;
    private Date seaDengueDate2;
    private Date seaDengueDate3;
    private String seaVacOther;
    private String seaVacotherSpecify;
    private Date seaOtherDate1;
    private Date seaOtherDate2;
    private Date seaOtherDate3;
    private String seaRubella;
    private Date seaRubellaDate1;
    private Date seaRubellaDate2;
    private Date seaRubellaDate3;
    private String seaRubellaDoc;
    private String seaCmv;
    private Date seaCmvDate1;
    private Date seaCmvDate2;
    private Date seaCmvDate3;
    private String seaCmvDoc;
    private String seaHerpes;
    private Date seaHerpesDate1;
    private Date seaHerpesDate2;
    private Date seaHerpesDate3;
    private String seaHerpesDoc;
    private String seaParvovirus;
    private Date seaParvovirusDate1;
    private Date seaParvovirusDate2;
    private Date seaParvovirusDate3;
    private String seaParvovirusDoc;
    private String seaToxoplasmosis;
    private Date seaToxoplasmosisDate1;
    private Date seaToxoplasmosisDate2;
    private Date seaToxoplasmosisDate3;
    private String seaToxoplasmosisDoc;
    private String seaSyphillis;
    private Date seaSyphillisDate1;
    private Date seaSyphillisDate2;
    private Date seaSyphillisDate3;
    private String seaSyphillisDoc;
    private String seaHiv;
    private Date seaHivDate1;
    private Date seaHivDate2;
    private Date seaHivDate3;
    private String seaHivDoc;
    private String seaZika;
    private Date seaZikaDate1;
    private Date seaZikaDate2;
    private Date seaZikaDate3;
    private String seaZikaDoc;
    private String seaChikung;
    private Date seaChikungDate1;
    private Date seaChikungDate2;
    private Date seaChikungDate3;
    private String seaChikungDoc;
    private String seaInfluInfect;
    private Date seaInflueInfectDate1;
    private Date seaInfluInfectDate2;
    private Date seaInfluInfectDate3;
    private String seaInfluInfectDoc;
    private String seaDengueInfect;
    private Date seaDengueInfectDate1;
    private Date seaDengueInfectDate2;
    private Date seaDengueInfectDate3;
    private String seaDengueInfectDoc;
    private String seaFeverSymptom;
    private String seaRash;
    private String seaItch;
    private String seaRashFirst;//multiple
    private String seaRashDay;
    private String seaRashMonth;
    private String seaRashYear;
    private Integer seaRashDuration;
    private String seaRashSpread;
    private String seaSpreadPart;//multiple
    private String seaFeverExperience;
    private String  seaTempMeasure;
    private Float seaHighTemp;
    private String seaHightemUnit;
    private String seaTempunknown;
    private String seaFeverDay;
    private String seaFeverMonth;
    private String seaFeverYear;
    private Integer seaFeverDuration;
    private String seaFDurationunknown;
    private String seaRedeyes;
    private String seaRedeyesDay;
    private String seaRedeyesMonth;
    private String seaRedeyesYear;
    private Integer seaRedeyesDuration;
    private String seaOccurSame;
    private String seaSameSymptom;//multiple
    private String seaJoint;
    private String seaJointDay;
    private String seaJointMonth;
    private String seaJointYear;
    private Integer seaJointDuration;
    private String seaHeadache;
    private String seaHeadacheDay;
    private String seaHeadacheMonth;
    private String seaHeadacheYear;
    private Integer seaHeadacheDuration;
    private String seaSymptomOther;
    private String seaSpecifySymptom;//multiple
    private String seaOtherSymptom;
    private String seaMedicare;
    private String seaCareDay;
    private String seaCareMonth;
    private String seaCareYear;
    private String seaCareFacility;
    private String seaHospitalized;
    private String seaHospital;
    private String seaDiagRubella;
    private String seaDiagDengue;
    private String seaDiagChikung;
    private String seaDiagZika;
    private String seaDiagCytome;
    private String seaMedicine;
    private String seaMedcineName;
    private String seaGuillainbarre;
    private String seaTingling;
    private String seaTinglingArm;//multiple
    private String seaTinglingLeg;//multiple
    private String seaTinglingHand;//multiple
    private String seaTinglingFoot;//multiple
    private String seaTinglingFace;//multiple
    private String seaTinglingOther;//multiple
    private String seaSensationMin;
    private String seaSensationHr;
    private String seaSenstaionDay;
    private String seaInjury;
    private String seaTinglingDay;
    private String seaTinglingMonth;
    private String seaTinglingYear;
    private Integer seaTinglingDuration;
    private String seaNumbness;
    private String seaNumbArm;//multiple
    private String seaNumbLeg;//multiple
    private String seaNumbHand;//multiple
    private String seaNumbFoot;//multiple
    private String seaNumbFace;//multiple
    private String seaNumbOther;
    private String seaNumbDay;
    private String seaNumbMonth;
    private String seaNumbYear;
    private Integer seaNumbDuration;
    private String seaParalysis;
    private String seaParaArm;//multiple
    private String seaParaLeg;//multiple
    private String seaParaHand;//multiple
    private String seaParaFoot;//multiple
    private String seaParaFace;//multiple
    private String seaParaOther;
    private String seaParaDay;
    private String seaParaMonth;
    private String seaParaYear;
    private Integer seaParaDuration;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "event_name", nullable = true, length = 100)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Column(name = "sea_diseases", nullable = true, length = 30)
    public String getSeaDiseases() {
        return seaDiseases;
    }

    public void setSeaDiseases(String seaDiseases) {
        this.seaDiseases = seaDiseases;
    }

    @Column(name = "sea_other_specify", nullable = true)
    public String getSeaOtherSpecify() {
        return seaOtherSpecify;
    }

    public void setSeaOtherSpecify(String seaOtherSpecify) {
        this.seaOtherSpecify = seaOtherSpecify;
    }

    @Column(name = "sea_hepatitis", nullable = true, length = 1)
    public String getSeaHepatitis() {
        return seaHepatitis;
    }

    public void setSeaHepatitis(String seaHepatitis) {
        this.seaHepatitis = seaHepatitis;
    }

    @Column(name = "sea_hepatitis_date1", nullable = true)
    public Date getSeaHepatitisDate1() {
        return seaHepatitisDate1;
    }

    public void setSeaHepatitisDate1(Date seaHepatitisDate1) {
        this.seaHepatitisDate1 = seaHepatitisDate1;
    }

    @Column(name = "sea_hepatitis_date2", nullable = true)
    public Date getSeaHepatitisDate2() {
        return seaHepatitisDate2;
    }

    public void setSeaHepatitisDate2(Date seaHepatitisDate2) {
        this.seaHepatitisDate2 = seaHepatitisDate2;
    }

    @Column(name = "sea_hepatitis_date3", nullable = true)
    public Date getSeaHepatitisDate3() {
        return seaHepatitisDate3;
    }

    public void setSeaHepatitisDate3(Date seaHepatitisDate3) {
        this.seaHepatitisDate3 = seaHepatitisDate3;
    }

    @Column(name = "sea_measles", nullable = true, length = 1)
    public String getSeaMeasles() {
        return seaMeasles;
    }

    public void setSeaMeasles(String seaMeasles) {
        this.seaMeasles = seaMeasles;
    }

    @Column(name = "sea_measles_date1", nullable = true)
    public Date getSeaMeaslesDate1() {
        return seaMeaslesDate1;
    }

    public void setSeaMeaslesDate1(Date seaMeaslesDate1) {
        this.seaMeaslesDate1 = seaMeaslesDate1;
    }

    @Column(name = "sea_measles_date2", nullable = true)
    public Date getSeaMeaslesDate2() {
        return seaMeaslesDate2;
    }

    public void setSeaMeaslesDate2(Date seaMeaslesDate2) {
        this.seaMeaslesDate2 = seaMeaslesDate2;
    }

    @Column(name = "sea_measles_date3", nullable = true)
    public Date getSeaMeaslesDate3() {
        return seaMeaslesDate3;
    }

    public void setSeaMeaslesDate3(Date seaMeaslesDate3) {
        this.seaMeaslesDate3 = seaMeaslesDate3;
    }

    @Column(name = "sea_chickenpox", nullable = true, length = 1)
    public String getSeaChickenpox() {
        return seaChickenpox;
    }

    public void setSeaChickenpox(String seaChickenpox) {
        this.seaChickenpox = seaChickenpox;
    }

    @Column(name = "sea_chickenpox_date1", nullable = true)
    public Date getSeaChickenpoxDate1() {
        return seaChickenpoxDate1;
    }

    public void setSeaChickenpoxDate1(Date seaChickenpoxDate1) {
        this.seaChickenpoxDate1 = seaChickenpoxDate1;
    }

    @Column(name = "sea_chickenpox_date2", nullable = true)
    public Date getSeaChickenpoxDate2() {
        return seaChickenpoxDate2;
    }

    public void setSeaChickenpoxDate2(Date seaChickenpoxDate2) {
        this.seaChickenpoxDate2 = seaChickenpoxDate2;
    }

    @Column(name = "sea_chickenpox_date3", nullable = true)
    public Date getSeaChickenpoxDate3() {
        return seaChickenpoxDate3;
    }

    public void setSeaChickenpoxDate3(Date seaChickenpoxDate3) {
        this.seaChickenpoxDate3 = seaChickenpoxDate3;
    }

    @Column(name = "sea_influenza", nullable = true, length = 1)
    public String getSeaInfluenza() {
        return seaInfluenza;
    }

    public void setSeaInfluenza(String seaInfluenza) {
        this.seaInfluenza = seaInfluenza;
    }

    @Column(name = "sea_influenza_date1", nullable = true)
    public Date getSeaInfluenzaDate1() {
        return seaInfluenzaDate1;
    }

    public void setSeaInfluenzaDate1(Date seaInfluenzaDate1) {
        this.seaInfluenzaDate1 = seaInfluenzaDate1;
    }

    @Column(name = "sea_influenza_date2", nullable = true)
    public Date getSeaInfluenzaDate2() {
        return seaInfluenzaDate2;
    }

    public void setSeaInfluenzaDate2(Date seaInfluenzaDate2) {
        this.seaInfluenzaDate2 = seaInfluenzaDate2;
    }

    @Column(name = "sea_influenza_date3", nullable = true)
    public Date getSeaInfluenzaDate3() {
        return seaInfluenzaDate3;
    }

    public void setSeaInfluenzaDate3(Date seaInfluenzaDate3) {
        this.seaInfluenzaDate3 = seaInfluenzaDate3;
    }

    @Column(name = "sea_yellow", nullable = true, length = 1)
    public String getSeaYellow() {
        return seaYellow;
    }

    public void setSeaYellow(String seaYellow) {
        this.seaYellow = seaYellow;
    }

    @Column(name = "sea_yellow_date1", nullable = true)
    public Date getSeaYellowDate1() {
        return seaYellowDate1;
    }

    public void setSeaYellowDate1(Date seaYellowDate1) {
        this.seaYellowDate1 = seaYellowDate1;
    }

    @Column(name = "sea_yellow_date2", nullable = true)
    public Date getSeaYellowDate2() {
        return seaYellowDate2;
    }

    public void setSeaYellowDate2(Date seaYellowDate2) {
        this.seaYellowDate2 = seaYellowDate2;
    }

    @Column(name = "sea_yellow_date3", nullable = true)
    public Date getSeaYellowDate3() {
        return seaYellowDate3;
    }

    public void setSeaYellowDate3(Date seaYellowDate3) {
        this.seaYellowDate3 = seaYellowDate3;
    }

    @Column(name = "sea_dengue", nullable = true, length = 1)
    public String getSeaDengue() {
        return seaDengue;
    }

    public void setSeaDengue(String seaDengue) {
        this.seaDengue = seaDengue;
    }

    @Column(name = "sea_dengue_date1", nullable = true)
    public Date getSeaDengueDate1() {
        return seaDengueDate1;
    }

    public void setSeaDengueDate1(Date seaDengueDate1) {
        this.seaDengueDate1 = seaDengueDate1;
    }

    @Column(name = "sea_dengue_date2", nullable = true)
    public Date getSeaDengueDate2() {
        return seaDengueDate2;
    }

    public void setSeaDengueDate2(Date seaDengueDate2) {
        this.seaDengueDate2 = seaDengueDate2;
    }

    @Column(name = "sea_dengue_date3", nullable = true)
    public Date getSeaDengueDate3() {
        return seaDengueDate3;
    }

    public void setSeaDengueDate3(Date seaDengueDate3) {
        this.seaDengueDate3 = seaDengueDate3;
    }

    @Column(name = "sea_vac_other", nullable = true, length = 1)
    public String getSeaVacOther() {
        return seaVacOther;
    }

    public void setSeaVacOther(String seaVacOther) {
        this.seaVacOther = seaVacOther;
    }

    @Column(name = "sea_vacother_specify", nullable = true)
    public String getSeaVacotherSpecify() {
        return seaVacotherSpecify;
    }

    public void setSeaVacotherSpecify(String seaVacotherSpecify) {
        this.seaVacotherSpecify = seaVacotherSpecify;
    }

    @Column(name = "sea_other_date1", nullable = true)
    public Date getSeaOtherDate1() {
        return seaOtherDate1;
    }

    public void setSeaOtherDate1(Date seaOtherDate1) {
        this.seaOtherDate1 = seaOtherDate1;
    }

    @Column(name = "sea_other_date2", nullable = true)
    public Date getSeaOtherDate2() {
        return seaOtherDate2;
    }

    public void setSeaOtherDate2(Date seaOtherDate2) {
        this.seaOtherDate2 = seaOtherDate2;
    }

    @Column(name = "sea_other_date3", nullable = true)
    public Date getSeaOtherDate3() {
        return seaOtherDate3;
    }

    public void setSeaOtherDate3(Date seaOtherDate3) {
        this.seaOtherDate3 = seaOtherDate3;
    }

    @Column(name = "sea_rubella", nullable = true, length = 1)
    public String getSeaRubella() {
        return seaRubella;
    }

    public void setSeaRubella(String seaRubella) {
        this.seaRubella = seaRubella;
    }

    @Column(name = "sea_rubella_date1", nullable = true)
    public Date getSeaRubellaDate1() {
        return seaRubellaDate1;
    }

    public void setSeaRubellaDate1(Date seaRubellaDate1) {
        this.seaRubellaDate1 = seaRubellaDate1;
    }

    @Column(name = "sea_rubella_date2", nullable = true)
    public Date getSeaRubellaDate2() {
        return seaRubellaDate2;
    }

    public void setSeaRubellaDate2(Date seaRubellaDate2) {
        this.seaRubellaDate2 = seaRubellaDate2;
    }

    @Column(name = "sea_rubella_date3", nullable = true)
    public Date getSeaRubellaDate3() {
        return seaRubellaDate3;
    }

    public void setSeaRubellaDate3(Date seaRubellaDate3) {
        this.seaRubellaDate3 = seaRubellaDate3;
    }

    @Column(name = "sea_rubella_doc", nullable = true, length = 1)
    public String getSeaRubellaDoc() {
        return seaRubellaDoc;
    }

    public void setSeaRubellaDoc(String seaRubellaDoc) {
        this.seaRubellaDoc = seaRubellaDoc;
    }

    @Column(name = "sea_cmv", nullable = true, length = 1)
    public String getSeaCmv() {
        return seaCmv;
    }

    public void setSeaCmv(String seaCmv) {
        this.seaCmv = seaCmv;
    }

    @Column(name = "sea_cmv_date1", nullable = true)
    public Date getSeaCmvDate1() {
        return seaCmvDate1;
    }

    public void setSeaCmvDate1(Date seaCmvDate1) {
        this.seaCmvDate1 = seaCmvDate1;
    }

    @Column(name = "sea_cmv_date2", nullable = true)
    public Date getSeaCmvDate2() {
        return seaCmvDate2;
    }

    public void setSeaCmvDate2(Date seaCmvDate2) {
        this.seaCmvDate2 = seaCmvDate2;
    }

    @Column(name = "sea_cmv_date3", nullable = true)
    public Date getSeaCmvDate3() {
        return seaCmvDate3;
    }

    public void setSeaCmvDate3(Date seaCmvDate3) {
        this.seaCmvDate3 = seaCmvDate3;
    }

    @Column(name = "sea_cmv_doc", nullable = true, length = 1)
    public String getSeaCmvDoc() {
        return seaCmvDoc;
    }

    public void setSeaCmvDoc(String seaCmvDoc) {
        this.seaCmvDoc = seaCmvDoc;
    }

    @Column(name = "sea_herpes", nullable = true, length = 1)
    public String getSeaHerpes() {
        return seaHerpes;
    }

    public void setSeaHerpes(String seaHerpes) {
        this.seaHerpes = seaHerpes;
    }

    @Column(name = "sea_herpes_date1", nullable = true)
    public Date getSeaHerpesDate1() {
        return seaHerpesDate1;
    }

    public void setSeaHerpesDate1(Date seaHerpesDate1) {
        this.seaHerpesDate1 = seaHerpesDate1;
    }

    @Column(name = "sea_herpes_date2", nullable = true)
    public Date getSeaHerpesDate2() {
        return seaHerpesDate2;
    }

    public void setSeaHerpesDate2(Date seaHerpesDate2) {
        this.seaHerpesDate2 = seaHerpesDate2;
    }

    @Column(name = "sea_herpes_date3", nullable = true)
    public Date getSeaHerpesDate3() {
        return seaHerpesDate3;
    }

    public void setSeaHerpesDate3(Date seaHerpesDate3) {
        this.seaHerpesDate3 = seaHerpesDate3;
    }

    @Column(name = "sea_herpes_doc", nullable = true, length = 1)
    public String getSeaHerpesDoc() {
        return seaHerpesDoc;
    }

    public void setSeaHerpesDoc(String seaHerpesDoc) {
        this.seaHerpesDoc = seaHerpesDoc;
    }

    @Column(name = "sea_parvovirus", nullable = true, length = 1)
    public String getSeaParvovirus() {
        return seaParvovirus;
    }

    public void setSeaParvovirus(String seaParvovirus) {
        this.seaParvovirus = seaParvovirus;
    }

    @Column(name = "sea_parvovirus_date1", nullable = true)
    public Date getSeaParvovirusDate1() {
        return seaParvovirusDate1;
    }

    public void setSeaParvovirusDate1(Date seaParvovirusDate1) {
        this.seaParvovirusDate1 = seaParvovirusDate1;
    }

    @Column(name = "sea_parvovirus_date2", nullable = true)
    public Date getSeaParvovirusDate2() {
        return seaParvovirusDate2;
    }

    public void setSeaParvovirusDate2(Date seaParvovirusDate2) {
        this.seaParvovirusDate2 = seaParvovirusDate2;
    }

    @Column(name = "sea_parvovirus_date3", nullable = true)
    public Date getSeaParvovirusDate3() {
        return seaParvovirusDate3;
    }

    public void setSeaParvovirusDate3(Date seaParvovirusDate3) {
        this.seaParvovirusDate3 = seaParvovirusDate3;
    }

    @Column(name = "sea_parvovirus_doc", nullable = true, length = 1)
    public String getSeaParvovirusDoc() {
        return seaParvovirusDoc;
    }

    public void setSeaParvovirusDoc(String seaParvovirusDoc) {
        this.seaParvovirusDoc = seaParvovirusDoc;
    }

    @Column(name = "sea_toxoplasmosis", nullable = true, length = 1)
    public String getSeaToxoplasmosis() {
        return seaToxoplasmosis;
    }

    public void setSeaToxoplasmosis(String seaToxoplasmosis) {
        this.seaToxoplasmosis = seaToxoplasmosis;
    }

    @Column(name = "sea_toxoplasmosis_date1", nullable = true)
    public Date getSeaToxoplasmosisDate1() {
        return seaToxoplasmosisDate1;
    }

    public void setSeaToxoplasmosisDate1(Date seaToxoplasmosisDate1) {
        this.seaToxoplasmosisDate1 = seaToxoplasmosisDate1;
    }

    @Column(name = "sea_toxoplasmosis_date2", nullable = true)
    public Date getSeaToxoplasmosisDate2() {
        return seaToxoplasmosisDate2;
    }

    public void setSeaToxoplasmosisDate2(Date seaToxoplasmosisDate2) {
        this.seaToxoplasmosisDate2 = seaToxoplasmosisDate2;
    }

    @Column(name = "sea_toxoplasmosis_date3", nullable = true)
    public Date getSeaToxoplasmosisDate3() {
        return seaToxoplasmosisDate3;
    }

    public void setSeaToxoplasmosisDate3(Date seaToxoplasmosisDate3) {
        this.seaToxoplasmosisDate3 = seaToxoplasmosisDate3;
    }

    @Column(name = "sea_toxoplasmosis_doc", nullable = true, length = 1)
    public String getSeaToxoplasmosisDoc() {
        return seaToxoplasmosisDoc;
    }

    public void setSeaToxoplasmosisDoc(String seaToxoplasmosisDoc) {
        this.seaToxoplasmosisDoc = seaToxoplasmosisDoc;
    }

    @Column(name = "sea_syphillis", nullable = true, length = 1)
    public String getSeaSyphillis() {
        return seaSyphillis;
    }

    public void setSeaSyphillis(String seaSyphillis) {
        this.seaSyphillis = seaSyphillis;
    }

    @Column(name = "sea_syphillis_date1", nullable = true)
    public Date getSeaSyphillisDate1() {
        return seaSyphillisDate1;
    }

    public void setSeaSyphillisDate1(Date seaSyphillisDate1) {
        this.seaSyphillisDate1 = seaSyphillisDate1;
    }

    @Column(name = "sea_syphillis_date2", nullable = true)
    public Date getSeaSyphillisDate2() {
        return seaSyphillisDate2;
    }

    public void setSeaSyphillisDate2(Date seaSyphillisDate2) {
        this.seaSyphillisDate2 = seaSyphillisDate2;
    }

    @Column(name = "sea_syphillis_date3", nullable = true)
    public Date getSeaSyphillisDate3() {
        return seaSyphillisDate3;
    }

    public void setSeaSyphillisDate3(Date seaSyphillisDate3) {
        this.seaSyphillisDate3 = seaSyphillisDate3;
    }

    @Column(name = "sea_syphillis_doc", nullable = true, length = 1)
    public String getSeaSyphillisDoc() {
        return seaSyphillisDoc;
    }

    public void setSeaSyphillisDoc(String seaSyphillisDoc) {
        this.seaSyphillisDoc = seaSyphillisDoc;
    }

    @Column(name = "sea_hiv", nullable = true, length = 1)
    public String getSeaHiv() {
        return seaHiv;
    }

    public void setSeaHiv(String seaHiv) {
        this.seaHiv = seaHiv;
    }

    @Column(name = "sea_hiv_date1", nullable = true)
    public Date getSeaHivDate1() {
        return seaHivDate1;
    }

    public void setSeaHivDate1(Date seaHivDate1) {
        this.seaHivDate1 = seaHivDate1;
    }

    @Column(name = "sea_hiv_date2", nullable = true)
    public Date getSeaHivDate2() {
        return seaHivDate2;
    }

    public void setSeaHivDate2(Date seaHivDate2) {
        this.seaHivDate2 = seaHivDate2;
    }

    @Column(name = "sea_hiv_date3", nullable = true)
    public Date getSeaHivDate3() {
        return seaHivDate3;
    }

    public void setSeaHivDate3(Date seaHivDate3) {
        this.seaHivDate3 = seaHivDate3;
    }

    @Column(name = "sea_hiv_doc", nullable = true, length = 1)
    public String getSeaHivDoc() {
        return seaHivDoc;
    }

    public void setSeaHivDoc(String seaHivDoc) {
        this.seaHivDoc = seaHivDoc;
    }

    @Column(name = "sea_zika", nullable = true, length = 1)
    public String getSeaZika() {
        return seaZika;
    }

    public void setSeaZika(String seaZika) {
        this.seaZika = seaZika;
    }

    @Column(name = "sea_zika_date1", nullable = true)
    public Date getSeaZikaDate1() {
        return seaZikaDate1;
    }

    public void setSeaZikaDate1(Date seaZikaDate1) {
        this.seaZikaDate1 = seaZikaDate1;
    }

    @Column(name = "sea_zika_date2", nullable = true)
    public Date getSeaZikaDate2() {
        return seaZikaDate2;
    }

    public void setSeaZikaDate2(Date seaZikaDate2) {
        this.seaZikaDate2 = seaZikaDate2;
    }

    @Column(name = "sea_zika_date3", nullable = true)
    public Date getSeaZikaDate3() {
        return seaZikaDate3;
    }

    public void setSeaZikaDate3(Date seaZikaDate3) {
        this.seaZikaDate3 = seaZikaDate3;
    }

    @Column(name = "sea_zika_doc", nullable = true, length = 1)
    public String getSeaZikaDoc() {
        return seaZikaDoc;
    }

    public void setSeaZikaDoc(String seaZikaDoc) {
        this.seaZikaDoc = seaZikaDoc;
    }

    @Column(name = "sea_chikung", nullable = true, length = 1)
    public String getSeaChikung() {
        return seaChikung;
    }

    public void setSeaChikung(String seaChikung) {
        this.seaChikung = seaChikung;
    }

    @Column(name = "sea_chikung_date1", nullable = true)
    public Date getSeaChikungDate1() {
        return seaChikungDate1;
    }

    public void setSeaChikungDate1(Date seaChikungDate1) {
        this.seaChikungDate1 = seaChikungDate1;
    }

    @Column(name = "sea_chikung_date2", nullable = true)
    public Date getSeaChikungDate2() {
        return seaChikungDate2;
    }

    public void setSeaChikungDate2(Date seaChikungDate2) {
        this.seaChikungDate2 = seaChikungDate2;
    }

    @Column(name = "sea_chikung_date3", nullable = true)
    public Date getSeaChikungDate3() {
        return seaChikungDate3;
    }

    public void setSeaChikungDate3(Date seaChikungDate3) {
        this.seaChikungDate3 = seaChikungDate3;
    }

    @Column(name = "sea_chikung_doc", nullable = true, length = 1)
    public String getSeaChikungDoc() {
        return seaChikungDoc;
    }

    public void setSeaChikungDoc(String seaChikungDoc) {
        this.seaChikungDoc = seaChikungDoc;
    }

    @Column(name = "sea_influ_infect", nullable = true, length = 1)
    public String getSeaInfluInfect() {
        return seaInfluInfect;
    }

    public void setSeaInfluInfect(String seaInfluInfect) {
        this.seaInfluInfect = seaInfluInfect;
    }

    @Column(name = "sea_influe_infect_date1", nullable = true)
    public Date getSeaInflueInfectDate1() {
        return seaInflueInfectDate1;
    }

    public void setSeaInflueInfectDate1(Date seaInflueInfectDate1) {
        this.seaInflueInfectDate1 = seaInflueInfectDate1;
    }

    @Column(name = "sea_influ_infect_date2", nullable = true)
    public Date getSeaInfluInfectDate2() {
        return seaInfluInfectDate2;
    }

    public void setSeaInfluInfectDate2(Date seaInfluInfectDate2) {
        this.seaInfluInfectDate2 = seaInfluInfectDate2;
    }

    @Column(name = "sea_influ_infect_date3", nullable = true)
    public Date getSeaInfluInfectDate3() {
        return seaInfluInfectDate3;
    }

    public void setSeaInfluInfectDate3(Date seaInfluInfectDate3) {
        this.seaInfluInfectDate3 = seaInfluInfectDate3;
    }

    @Column(name = "sea_influ_infect_doc", nullable = true, length = 1)
    public String getSeaInfluInfectDoc() {
        return seaInfluInfectDoc;
    }

    public void setSeaInfluInfectDoc(String seaInfluInfectDoc) {
        this.seaInfluInfectDoc = seaInfluInfectDoc;
    }

    @Column(name = "sea_dengue_infect", nullable = true, length = 1)
    public String getSeaDengueInfect() {
        return seaDengueInfect;
    }

    public void setSeaDengueInfect(String seaDengueInfect) {
        this.seaDengueInfect = seaDengueInfect;
    }

    @Column(name = "sea_dengue_infect_date1", nullable = true)
    public Date getSeaDengueInfectDate1() {
        return seaDengueInfectDate1;
    }

    public void setSeaDengueInfectDate1(Date seaDengueInfectDate1) {
        this.seaDengueInfectDate1 = seaDengueInfectDate1;
    }

    @Column(name = "sea_dengue_infect_date2", nullable = true)
    public Date getSeaDengueInfectDate2() {
        return seaDengueInfectDate2;
    }

    public void setSeaDengueInfectDate2(Date seaDengueInfectDate2) {
        this.seaDengueInfectDate2 = seaDengueInfectDate2;
    }

    @Column(name = "sea_dengue_infect_date3", nullable = true)
    public Date getSeaDengueInfectDate3() {
        return seaDengueInfectDate3;
    }

    public void setSeaDengueInfectDate3(Date seaDengueInfectDate3) {
        this.seaDengueInfectDate3 = seaDengueInfectDate3;
    }

    @Column(name = "sea_dengue_infect_doc", nullable = true, length = 1)
    public String getSeaDengueInfectDoc() {
        return seaDengueInfectDoc;
    }

    public void setSeaDengueInfectDoc(String seaDengueInfectDoc) {
        this.seaDengueInfectDoc = seaDengueInfectDoc;
    }

    @Column(name = "sea_fever_symptom", nullable = true, length = 1)
    public String getSeaFeverSymptom() {
        return seaFeverSymptom;
    }

    public void setSeaFeverSymptom(String seaFeverSymptom) {
        this.seaFeverSymptom = seaFeverSymptom;
    }

    @Column(name = "sea_rash", nullable = true, length = 1)
    public String getSeaRash() {
        return seaRash;
    }

    public void setSeaRash(String seaRash) {
        this.seaRash = seaRash;
    }

    @Column(name = "sea_itch", nullable = true, length = 1)
    public String getSeaItch() {
        return seaItch;
    }

    public void setSeaItch(String seaItch) {
        this.seaItch = seaItch;
    }

    @Column(name = "sea_rash_first", nullable = true, length = 30)
    public String getSeaRashFirst() {
        return seaRashFirst;
    }

    public void setSeaRashFirst(String seaRashFirst) {
        this.seaRashFirst = seaRashFirst;
    }

    @Column(name = "sea_rash_day", nullable = true, length = 2)
    public String getSeaRashDay() {
        return seaRashDay;
    }

    public void setSeaRashDay(String seaRashDay) {
        this.seaRashDay = seaRashDay;
    }

    @Column(name = "sea_rash_month", nullable = true, length = 2)
    public String getSeaRashMonth() {
        return seaRashMonth;
    }

    public void setSeaRashMonth(String seaRashMonth) {
        this.seaRashMonth = seaRashMonth;
    }

    @Column(name = "sea_rash_year", nullable = true, length = 4)
    public String getSeaRashYear() {
        return seaRashYear;
    }

    public void setSeaRashYear(String seaRashYear) {
        this.seaRashYear = seaRashYear;
    }

    @Column(name = "sea_rash_duration", nullable = true)
    public Integer getSeaRashDuration() {
        return seaRashDuration;
    }

    public void setSeaRashDuration(Integer seaRashDuration) {
        this.seaRashDuration = seaRashDuration;
    }

    @Column(name = "sea_rash_spread", nullable = true, length = 1)
    public String getSeaRashSpread() {
        return seaRashSpread;
    }

    public void setSeaRashSpread(String seaRashSpread) {
        this.seaRashSpread = seaRashSpread;
    }

    @Column(name = "sea_spread_part", nullable = true, length = 30)
    public String getSeaSpreadPart() {
        return seaSpreadPart;
    }

    public void setSeaSpreadPart(String seaSpreadPart) {
        this.seaSpreadPart = seaSpreadPart;
    }

    @Column(name = "sea_fever_experience", nullable = true, length = 1)
    public String getSeaFeverExperience() {
        return seaFeverExperience;
    }

    public void setSeaFeverExperience(String seaFeverExperience) {
        this.seaFeverExperience = seaFeverExperience;
    }

    @Column(name = "sea_temp_measure", nullable = true, length = 1)
    public String getSeaTempMeasure() {
        return seaTempMeasure;
    }

    public void setSeaTempMeasure(String seaTempMeasure) {
        this.seaTempMeasure = seaTempMeasure;
    }

    @Column(name = "sea_high_temp", nullable = true)
    public Float getSeaHighTemp() {
        return seaHighTemp;
    }

    public void setSeaHighTemp(Float seaHighTemp) {
        this.seaHighTemp = seaHighTemp;
    }

    @Column(name = "sea_hightem_unit", nullable = true, length = 1)
    public String getSeaHightemUnit() {
        return seaHightemUnit;
    }

    public void setSeaHightemUnit(String seaHightemUnit) {
        this.seaHightemUnit = seaHightemUnit;
    }

    @Column(name = "sea_tempunknown", nullable = true, length = 1)
    public String getSeaTempunknown() {
        return seaTempunknown;
    }

    public void setSeaTempunknown(String seaTempunknown) {
        this.seaTempunknown = seaTempunknown;
    }

    @Column(name = "sea_fever_day", nullable = true, length = 2)
    public String getSeaFeverDay() {
        return seaFeverDay;
    }

    public void setSeaFeverDay(String seaFeverDay) {
        this.seaFeverDay = seaFeverDay;
    }

    @Column(name = "sea_fever_month", nullable = true, length = 2)
    public String getSeaFeverMonth() {
        return seaFeverMonth;
    }

    public void setSeaFeverMonth(String seaFeverMonth) {
        this.seaFeverMonth = seaFeverMonth;
    }

    @Column(name = "sea_fever_year", nullable = true, length = 4)
    public String getSeaFeverYear() {
        return seaFeverYear;
    }

    public void setSeaFeverYear(String seaFeverYear) {
        this.seaFeverYear = seaFeverYear;
    }

    @Column(name = "sea_fever_duration", nullable = true)
    public Integer getSeaFeverDuration() {
        return seaFeverDuration;
    }

    public void setSeaFeverDuration(Integer seaFeverDuration) {
        this.seaFeverDuration = seaFeverDuration;
    }

    @Column(name = "sea_fduration_unknown", nullable = true, length = 1)
    public String getSeaFDurationunknown() {
        return seaFDurationunknown;
    }

    public void setSeaFDurationunknown(String seaFDurationunknown) {
        this.seaFDurationunknown = seaFDurationunknown;
    }

    @Column(name = "sea_redeyes", nullable = true, length = 1)
    public String getSeaRedeyes() {
        return seaRedeyes;
    }

    public void setSeaRedeyes(String seaRedeyes) {
        this.seaRedeyes = seaRedeyes;
    }

    @Column(name = "sea_redeyes_day", nullable = true, length = 2)
    public String getSeaRedeyesDay() {
        return seaRedeyesDay;
    }

    public void setSeaRedeyesDay(String seaRedeyesDay) {
        this.seaRedeyesDay = seaRedeyesDay;
    }

    @Column(name = "sea_redeyes_month", nullable = true, length = 2)
    public String getSeaRedeyesMonth() {
        return seaRedeyesMonth;
    }

    public void setSeaRedeyesMonth(String seaRedeyesMonth) {
        this.seaRedeyesMonth = seaRedeyesMonth;
    }

    @Column(name = "sea_redeyes_year", nullable = true, length = 4)
    public String getSeaRedeyesYear() {
        return seaRedeyesYear;
    }

    public void setSeaRedeyesYear(String seaRedeyesYear) {
        this.seaRedeyesYear = seaRedeyesYear;
    }

    @Column(name = "sea_redeyes_duration", nullable = true)
    public Integer getSeaRedeyesDuration() {
        return seaRedeyesDuration;
    }

    public void setSeaRedeyesDuration(Integer seaRedeyesDuration) {
        this.seaRedeyesDuration = seaRedeyesDuration;
    }

    @Column(name = "sea_occur_same", nullable = true, length = 1)
    public String getSeaOccurSame() {
        return seaOccurSame;
    }

    public void setSeaOccurSame(String seaOccurSame) {
        this.seaOccurSame = seaOccurSame;
    }

    @Column(name = "sea_same_symptom", nullable = true, length = 10)
    public String getSeaSameSymptom() {
        return seaSameSymptom;
    }

    public void setSeaSameSymptom(String seaSameSymptom) {
        this.seaSameSymptom = seaSameSymptom;
    }

    @Column(name = "sea_joint", nullable = true, length = 1)
    public String getSeaJoint() {
        return seaJoint;
    }

    public void setSeaJoint(String seaJoint) {
        this.seaJoint = seaJoint;
    }

    @Column(name = "sea_joint_day", nullable = true, length = 2)
    public String getSeaJointDay() {
        return seaJointDay;
    }

    public void setSeaJointDay(String seaJointDay) {
        this.seaJointDay = seaJointDay;
    }

    @Column(name = "sea_joint_month", nullable = true, length = 2)
    public String getSeaJointMonth() {
        return seaJointMonth;
    }

    public void setSeaJointMonth(String seaJointMonth) {
        this.seaJointMonth = seaJointMonth;
    }

    @Column(name = "sea_joint_year", nullable = true, length = 4)
    public String getSeaJointYear() {
        return seaJointYear;
    }

    public void setSeaJointYear(String seaJointYear) {
        this.seaJointYear = seaJointYear;
    }

    @Column(name = "sea_joint_duration", nullable = true)
    public Integer getSeaJointDuration() {
        return seaJointDuration;
    }

    public void setSeaJointDuration(Integer seaJointDuration) {
        this.seaJointDuration = seaJointDuration;
    }

    @Column(name = "sea_headache", nullable = true, length = 1)
    public String getSeaHeadache() {
        return seaHeadache;
    }

    public void setSeaHeadache(String seaHeadache) {
        this.seaHeadache = seaHeadache;
    }

    @Column(name = "sea_headache_day", nullable = true, length = 2)
    public String getSeaHeadacheDay() {
        return seaHeadacheDay;
    }

    public void setSeaHeadacheDay(String seaHeadacheDay) {
        this.seaHeadacheDay = seaHeadacheDay;
    }

    @Column(name = "sea_headache_month", nullable = true, length = 2)
    public String getSeaHeadacheMonth() {
        return seaHeadacheMonth;
    }

    public void setSeaHeadacheMonth(String seaHeadacheMonth) {
        this.seaHeadacheMonth = seaHeadacheMonth;
    }

    @Column(name = "sea_headache_year", nullable = true, length = 4)
    public String getSeaHeadacheYear() {
        return seaHeadacheYear;
    }

    public void setSeaHeadacheYear(String seaHeadacheYear) {
        this.seaHeadacheYear = seaHeadacheYear;
    }

    @Column(name = "sea_headache_duration", nullable = true)
    public Integer getSeaHeadacheDuration() {
        return seaHeadacheDuration;
    }

    public void setSeaHeadacheDuration(Integer seaHeadacheDuration) {
        this.seaHeadacheDuration = seaHeadacheDuration;
    }

    @Column(name = "sea_symptom_other", nullable = true, length = 1)
    public String getSeaSymptomOther() {
        return seaSymptomOther;
    }

    public void setSeaSymptomOther(String seaSymptomOther) {
        this.seaSymptomOther = seaSymptomOther;
    }

    @Column(name = "sea_specify_symptom", nullable = true, length = 50)
    public String getSeaSpecifySymptom() {
        return seaSpecifySymptom;
    }

    public void setSeaSpecifySymptom(String seaSpecifySymptom) {
        this.seaSpecifySymptom = seaSpecifySymptom;
    }

    @Column(name = "sea_other_symptom", nullable = true)
    public String getSeaOtherSymptom() {
        return seaOtherSymptom;
    }

    public void setSeaOtherSymptom(String seaOtherSymptom) {
        this.seaOtherSymptom = seaOtherSymptom;
    }

    @Column(name = "sea_medicare", nullable = true, length = 1)
    public String getSeaMedicare() {
        return seaMedicare;
    }

    public void setSeaMedicare(String seaMedicare) {
        this.seaMedicare = seaMedicare;
    }

    @Column(name = "sea_care_day", nullable = true, length = 2)
    public String getSeaCareDay() {
        return seaCareDay;
    }

    public void setSeaCareDay(String seaCareDay) {
        this.seaCareDay = seaCareDay;
    }

    @Column(name = "sea_care_month", nullable = true, length = 2)
    public String getSeaCareMonth() {
        return seaCareMonth;
    }

    public void setSeaCareMonth(String seaCareMonth) {
        this.seaCareMonth = seaCareMonth;
    }

    @Column(name = "sea_care_year", nullable = true, length = 4)
    public String getSeaCareYear() {
        return seaCareYear;
    }

    public void setSeaCareYear(String seaCareYear) {
        this.seaCareYear = seaCareYear;
    }

    @Column(name = "sea_care_facility", nullable = true, length = 10)
    public String getSeaCareFacility() {
        return seaCareFacility;
    }

    public void setSeaCareFacility(String seaCareFacility) {
        this.seaCareFacility = seaCareFacility;
    }

    @Column(name = "sea_hospitalized", nullable = true, length = 1)
    public String getSeaHospitalized() {
        return seaHospitalized;
    }

    public void setSeaHospitalized(String seaHospitalized) {
        this.seaHospitalized = seaHospitalized;
    }

    @Column(name = "sea_hospital", nullable = true, length = 10)
    public String getSeaHospital() {
        return seaHospital;
    }

    public void setSeaHospital(String seaHospital) {
        this.seaHospital = seaHospital;
    }

    @Column(name = "sea_diag_rubella", nullable = true, length = 1)
    public String getSeaDiagRubella() {
        return seaDiagRubella;
    }

    public void setSeaDiagRubella(String seaDiagRubella) {
        this.seaDiagRubella = seaDiagRubella;
    }

    @Column(name = "sea_diag_dengue", nullable = true, length = 1)
    public String getSeaDiagDengue() {
        return seaDiagDengue;
    }

    public void setSeaDiagDengue(String seaDiagDengue) {
        this.seaDiagDengue = seaDiagDengue;
    }

    @Column(name = "sea_diag_chikung", nullable = true, length = 1)
    public String getSeaDiagChikung() {
        return seaDiagChikung;
    }

    public void setSeaDiagChikung(String seaDiagChikung) {
        this.seaDiagChikung = seaDiagChikung;
    }

    @Column(name = "sea_diag_zika", nullable = true, length = 1)
    public String getSeaDiagZika() {
        return seaDiagZika;
    }

    public void setSeaDiagZika(String seaDiagZika) {
        this.seaDiagZika = seaDiagZika;
    }

    @Column(name = "sea_diag_cytome", nullable = true, length = 1)
    public String getSeaDiagCytome() {
        return seaDiagCytome;
    }

    public void setSeaDiagCytome(String seaDiagCytome) {
        this.seaDiagCytome = seaDiagCytome;
    }

    @Column(name = "sea_medicine", nullable = true, length = 1)
    public String getSeaMedicine() {
        return seaMedicine;
    }

    public void setSeaMedicine(String seaMedicine) {
        this.seaMedicine = seaMedicine;
    }

    @Column(name = "sea_medcine_name", nullable = true)
    public String getSeaMedcineName() {
        return seaMedcineName;
    }

    public void setSeaMedcineName(String seaMedcineName) {
        this.seaMedcineName = seaMedcineName;
    }

    @Column(name = "sea_guillainbarre", nullable = true, length = 1)
    public String getSeaGuillainbarre() {
        return seaGuillainbarre;
    }

    public void setSeaGuillainbarre(String seaGuillainbarre) {
        this.seaGuillainbarre = seaGuillainbarre;
    }

    @Column(name = "sea_tingling", nullable = true, length = 1)
    public String getSeaTingling() {
        return seaTingling;
    }

    public void setSeaTingling(String seaTingling) {
        this.seaTingling = seaTingling;
    }

    @Column(name = "sea_tingling_arm", nullable = true, length = 5)
    public String getSeaTinglingArm() {
        return seaTinglingArm;
    }

    public void setSeaTinglingArm(String seaTinglingArm) {
        this.seaTinglingArm = seaTinglingArm;
    }

    @Column(name = "sea_tingling_leg", nullable = true, length = 5)
    public String getSeaTinglingLeg() {
        return seaTinglingLeg;
    }

    public void setSeaTinglingLeg(String seaTinglingLeg) {
        this.seaTinglingLeg = seaTinglingLeg;
    }

    @Column(name = "sea_tingling_hand", nullable = true, length = 5)
    public String getSeaTinglingHand() {
        return seaTinglingHand;
    }

    public void setSeaTinglingHand(String seaTinglingHand) {
        this.seaTinglingHand = seaTinglingHand;
    }

    @Column(name = "sea_tingling_foot", nullable = true, length = 5)
    public String getSeaTinglingFoot() {
        return seaTinglingFoot;
    }

    public void setSeaTinglingFoot(String seaTinglingFoot) {
        this.seaTinglingFoot = seaTinglingFoot;
    }

    @Column(name = "sea_tingling_face", nullable = true, length = 5)
    public String getSeaTinglingFace() {
        return seaTinglingFace;
    }

    public void setSeaTinglingFace(String seaTinglingFace) {
        this.seaTinglingFace = seaTinglingFace;
    }

    @Column(name = "sea_tingling_other", nullable = true)
    public String getSeaTinglingOther() {
        return seaTinglingOther;
    }

    public void setSeaTinglingOther(String seaTinglingOther) {
        this.seaTinglingOther = seaTinglingOther;
    }

    @Column(name = "sea_sensation_min", nullable = true, length = 2)
    public String getSeaSensationMin() {
        return seaSensationMin;
    }

    public void setSeaSensationMin(String seaSensationMin) {
        this.seaSensationMin = seaSensationMin;
    }

    @Column(name = "sea_sensation_hr", nullable = true, length = 2)
    public String getSeaSensationHr() {
        return seaSensationHr;
    }

    public void setSeaSensationHr(String seaSensationHr) {
        this.seaSensationHr = seaSensationHr;
    }

    @Column(name = "sea_senstaion_day", nullable = true, length = 2)
    public String getSeaSenstaionDay() {
        return seaSenstaionDay;
    }

    public void setSeaSenstaionDay(String seaSenstaionDay) {
        this.seaSenstaionDay = seaSenstaionDay;
    }

    @Column(name = "sea_injury", nullable = true, length = 1)
    public String getSeaInjury() {
        return seaInjury;
    }

    public void setSeaInjury(String seaInjury) {
        this.seaInjury = seaInjury;
    }

    @Column(name = "sea_tingling_day", nullable = true, length = 2)
    public String getSeaTinglingDay() {
        return seaTinglingDay;
    }

    public void setSeaTinglingDay(String seaTinglingDay) {
        this.seaTinglingDay = seaTinglingDay;
    }

    @Column(name = "sea_tingling_month", nullable = true, length = 2)
    public String getSeaTinglingMonth() {
        return seaTinglingMonth;
    }

    public void setSeaTinglingMonth(String seaTinglingMonth) {
        this.seaTinglingMonth = seaTinglingMonth;
    }

    @Column(name = "sea_tingling_year", nullable = true, length = 4)
    public String getSeaTinglingYear() {
        return seaTinglingYear;
    }

    public void setSeaTinglingYear(String seaTinglingYear) {
        this.seaTinglingYear = seaTinglingYear;
    }

    @Column(name = "sea_tingling_duration", nullable = true)
    public Integer getSeaTinglingDuration() {
        return seaTinglingDuration;
    }

    public void setSeaTinglingDuration(Integer seaTinglingDuration) {
        this.seaTinglingDuration = seaTinglingDuration;
    }

    @Column(name = "sea_numbness", nullable = true, length = 1)
    public String getSeaNumbness() {
        return seaNumbness;
    }

    public void setSeaNumbness(String seaNumbness) {
        this.seaNumbness = seaNumbness;
    }

    @Column(name = "sea_numb_arm", nullable = true, length = 5)
    public String getSeaNumbArm() {
        return seaNumbArm;
    }

    public void setSeaNumbArm(String seaNumbArm) {
        this.seaNumbArm = seaNumbArm;
    }

    @Column(name = "sea_numb_leg", nullable = true, length = 5)
    public String getSeaNumbLeg() {
        return seaNumbLeg;
    }

    public void setSeaNumbLeg(String seaNumbLeg) {
        this.seaNumbLeg = seaNumbLeg;
    }

    @Column(name = "sea_numb_hand", nullable = true, length = 5)
    public String getSeaNumbHand() {
        return seaNumbHand;
    }

    public void setSeaNumbHand(String seaNumbHand) {
        this.seaNumbHand = seaNumbHand;
    }

    @Column(name = "sea_numb_foot", nullable = true, length = 5)
    public String getSeaNumbFoot() {
        return seaNumbFoot;
    }

    public void setSeaNumbFoot(String seaNumbFoot) {
        this.seaNumbFoot = seaNumbFoot;
    }

    @Column(name = "sea_numb_face", nullable = true, length = 5)
    public String getSeaNumbFace() {
        return seaNumbFace;
    }

    public void setSeaNumbFace(String seaNumbFace) {
        this.seaNumbFace = seaNumbFace;
    }

    @Column(name = "sea_numb_other", nullable = true)
    public String getSeaNumbOther() {
        return seaNumbOther;
    }

    public void setSeaNumbOther(String seaNumbOther) {
        this.seaNumbOther = seaNumbOther;
    }

    @Column(name = "sea_numb_day", nullable = true, length = 2)
    public String getSeaNumbDay() {
        return seaNumbDay;
    }

    public void setSeaNumbDay(String seaNumbDay) {
        this.seaNumbDay = seaNumbDay;
    }

    @Column(name = "sea_numb_month", nullable = true, length = 2)
    public String getSeaNumbMonth() {
        return seaNumbMonth;
    }

    public void setSeaNumbMonth(String seaNumbMonth) {
        this.seaNumbMonth = seaNumbMonth;
    }

    @Column(name = "sea_numb_year", nullable = true, length = 4)
    public String getSeaNumbYear() {
        return seaNumbYear;
    }

    public void setSeaNumbYear(String seaNumbYear) {
        this.seaNumbYear = seaNumbYear;
    }

    @Column(name = "sea_numb_duration", nullable = true)
    public Integer getSeaNumbDuration() {
        return seaNumbDuration;
    }

    public void setSeaNumbDuration(Integer seaNumbDuration) {
        this.seaNumbDuration = seaNumbDuration;
    }

    @Column(name = "sea_paralysis", nullable = true, length = 1)
    public String getSeaParalysis() {
        return seaParalysis;
    }

    public void setSeaParalysis(String seaParalysis) {
        this.seaParalysis = seaParalysis;
    }

    @Column(name = "sea_para_arm", nullable = true, length = 5)
    public String getSeaParaArm() {
        return seaParaArm;
    }

    public void setSeaParaArm(String seaParaArm) {
        this.seaParaArm = seaParaArm;
    }

    @Column(name = "sea_para_leg", nullable = true, length = 5)
    public String getSeaParaLeg() {
        return seaParaLeg;
    }

    public void setSeaParaLeg(String seaParaLeg) {
        this.seaParaLeg = seaParaLeg;
    }

    @Column(name = "sea_para_hand", nullable = true, length = 5)
    public String getSeaParaHand() {
        return seaParaHand;
    }

    public void setSeaParaHand(String seaParaHand) {
        this.seaParaHand = seaParaHand;
    }

    @Column(name = "sea_para_foot", nullable = true, length = 5)
    public String getSeaParaFoot() {
        return seaParaFoot;
    }

    public void setSeaParaFoot(String seaParaFoot) {
        this.seaParaFoot = seaParaFoot;
    }

    @Column(name = "sea_para_face", nullable = true, length = 5)
    public String getSeaParaFace() {
        return seaParaFace;
    }

    public void setSeaParaFace(String seaParaFace) {
        this.seaParaFace = seaParaFace;
    }

    @Column(name = "sea_para_other", nullable = true)
    public String getSeaParaOther() {
        return seaParaOther;
    }

    public void setSeaParaOther(String seaParaOther) {
        this.seaParaOther = seaParaOther;
    }

    @Column(name = "sea_para_day", nullable = true, length = 2)
    public String getSeaParaDay() {
        return seaParaDay;
    }

    public void setSeaParaDay(String seaParaDay) {
        this.seaParaDay = seaParaDay;
    }

    @Column(name = "sea_para_month", nullable = true, length = 2)
    public String getSeaParaMonth() {
        return seaParaMonth;
    }

    public void setSeaParaMonth(String seaParaMonth) {
        this.seaParaMonth = seaParaMonth;
    }

    @Column(name = "sea_para_year", nullable = true, length = 4)
    public String getSeaParaYear() {
        return seaParaYear;
    }

    public void setSeaParaYear(String seaParaYear) {
        this.seaParaYear = seaParaYear;
    }

    @Column(name = "sea_para_duration", nullable = true)
    public Integer getSeaParaDuration() {
        return seaParaDuration;
    }

    public void setSeaParaDuration(Integer seaParaDuration) {
        this.seaParaDuration = seaParaDuration;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return this.recordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Zpo01StudyEntrySectionC)) return false;

        Zpo01StudyEntrySectionC that = (Zpo01StudyEntrySectionC) o;

        return (recordId.equals(that.recordId));
    }
}
