package ni.org.ics.zpo.domain;

import ni.org.ics.zpo.domain.audit.Auditable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zpo01_study_entry_section_a_to_b", catalog = "zika_zpo")
public class Zpo01StudyEntrySectionAtoB extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String eventName;
    private Date seaVdate;
    private Date seaBirthdate;
    private String seaPregnantBefore;
    private String seaPregStillDeliAfter;
    private String seaCity;
    private String seaState;
    private String seaCountry;
    private String seaLive;
    private Integer seaAgeLeave;
    private String seaLeavena;
    private String seaMstatus;
    private String seaRace;
    private String seaEthnicityOther;
    private String seaDegreeYou;
    private Float seaYdegreeYears;
    private String seaDegreeSpouse;
    private Float seaSdegreeYears;
    //campos adicionales que no pertenecen a redcap
    private String seaAddtChronicDiseases;
    private String seaAddtChronicDiseases1;
    private String seaAddtChronicDiseases2;
    private String seaAddtChronicDiseases3;
    private String seaAddtMedicines;
    private String seaAddtDrugsType;
    private String seaAddtOthDrugsType1;
    private String seaAddtOthDrugsBrand1;
    private String seaAddtOthDrugsType2;
    private String seaAddtOthDrugsBrand2;
    private String  seaAddtOthDrugsType3;
    private String seaAddtOthDrugsBrand3;
    private String seaAddtOthDrugsType4;
    private String seaAddtOthDrugsBrand4;
    private String seaAddtOthDrugsType5;
    private String seaAddtOthDrugsBrand5;

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

    @Column(name = "sea_vdate", nullable = true)
    public Date getSeaVdate() {
        return seaVdate;
    }

    public void setSeaVdate(Date seaVdate) {
        this.seaVdate = seaVdate;
    }

    @Column(name = "sea_birthdate", nullable = true)
    public Date getSeaBirthdate() {
        return seaBirthdate;
    }

    public void setSeaBirthdate(Date seaBirthdate) {
        this.seaBirthdate = seaBirthdate;
    }

    @Column(name = "sea_pregnant_before15Jun", nullable = true, length = 1)
    public String getSeaPregnantBefore() {
        return seaPregnantBefore;
    }

    public void setSeaPregnantBefore(String seaPregnantBefore) {
        this.seaPregnantBefore = seaPregnantBefore;
    }

    @Column(name = "sea_preg_stilldeli_after15Sep", nullable = true, length = 1)
    public String getSeaPregStillDeliAfter() {
        return seaPregStillDeliAfter;
    }

    public void setSeaPregStillDeliAfter(String seaPregStillDeliAfter) {
        this.seaPregStillDeliAfter = seaPregStillDeliAfter;
    }

    @Column(name = "sea_city", nullable = true)
    public String getSeaCity() {
        return seaCity;
    }

    public void setSeaCity(String seaCity) {
        this.seaCity = seaCity;
    }

    @Column(name = "sea_state", nullable = true)
    public String getSeaState() {
        return seaState;
    }

    public void setSeaState(String seaState) {
        this.seaState = seaState;
    }

    @Column(name = "sea_country", nullable = true)
    public String getSeaCountry() {
        return seaCountry;
    }

    public void setSeaCountry(String seaCountry) {
        this.seaCountry = seaCountry;
    }

    @Column(name = "sea_live", nullable = true, length = 1)
    public String getSeaLive() {
        return seaLive;
    }

    public void setSeaLive(String seaLive) {
        this.seaLive = seaLive;
    }

    @Column(name = "sea_age_leave", nullable = true)
    public Integer getSeaAgeLeave() {
        return seaAgeLeave;
    }

    public void setSeaAgeLeave(Integer seaAgeLeave) {
        this.seaAgeLeave = seaAgeLeave;
    }

    @Column(name = "sea_leavena", nullable = true, length = 1)
    public String getSeaLeavena() {
        return seaLeavena;
    }

    public void setSeaLeavena(String seaLeavena) {
        this.seaLeavena = seaLeavena;
    }

    @Column(name = "sea_mstatus", nullable = true, length = 2)
    public String getSeaMstatus() {
        return seaMstatus;
    }

    public void setSeaMstatus(String seaMstatus) {
        this.seaMstatus = seaMstatus;
    }

    @Column(name = "sea_race", nullable = true, length = 2)
    public String getSeaRace() {
        return seaRace;
    }

    public void setSeaRace(String seaRace) {
        this.seaRace = seaRace;
    }

    @Column(name = "sea_ethnicity_other", nullable = true)
    public String getSeaEthnicityOther() {
        return seaEthnicityOther;
    }

    public void setSeaEthnicityOther(String seaEthnicityOther) {
        this.seaEthnicityOther = seaEthnicityOther;
    }

    @Column(name = "sea_degree_you", nullable = true, length = 2)
    public String getSeaDegreeYou() {
        return seaDegreeYou;
    }

    public void setSeaDegreeYou(String seaDegreeYou) {
        this.seaDegreeYou = seaDegreeYou;
    }

    @Column(name = "sea_ydegree_years", nullable = true)
    public Float getSeaYdegreeYears() {
        return seaYdegreeYears;
    }

    public void setSeaYdegreeYears(Float seaYdegreeYears) {
        this.seaYdegreeYears = seaYdegreeYears;
    }

    @Column(name = "sea_degree_spouse", nullable = true, length = 2)
    public String getSeaDegreeSpouse() {
        return seaDegreeSpouse;
    }

    public void setSeaDegreeSpouse(String seaDegreeSpouse) {
        this.seaDegreeSpouse = seaDegreeSpouse;
    }

    @Column(name = "sea_sdegree_years", nullable = true)
    public Float getSeaSdegreeYears() {
        return seaSdegreeYears;
    }

    public void setSeaSdegreeYears(Float seaSdegreeYears) {
        this.seaSdegreeYears = seaSdegreeYears;
    }

    //campos adicionales que no pertenecen a redcap
    @Column(name = "sea_addt_chronicdiseases", nullable = true, length = 1)
    public String getSeaAddtChronicDiseases() {
        return seaAddtChronicDiseases;
    }

    public void setSeaAddtChronicDiseases(String seaAddtChronicDiseases) {
        this.seaAddtChronicDiseases = seaAddtChronicDiseases;
    }

    @Column(name = "sea_addt_chronicdiseases_1", nullable = true)
    public String getSeaAddtChronicDiseases1() {
        return seaAddtChronicDiseases1;
    }

    public void setSeaAddtChronicDiseases1(String seaAddtChronicDiseases1) {
        this.seaAddtChronicDiseases1 = seaAddtChronicDiseases1;
    }

    @Column(name = "sea_addt_chronicdiseases_2", nullable = true)
    public String getSeaAddtChronicDiseases2() {
        return seaAddtChronicDiseases2;
    }

    public void setSeaAddtChronicDiseases2(String seaAddtChronicDiseases2) {
        this.seaAddtChronicDiseases2 = seaAddtChronicDiseases2;
    }

    @Column(name = "sea_addt_chronicdiseases_3", nullable = true)
    public String getSeaAddtChronicDiseases3() {
        return seaAddtChronicDiseases3;
    }

    public void setSeaAddtChronicDiseases3(String seaAddtChronicDiseases3) {
        this.seaAddtChronicDiseases3 = seaAddtChronicDiseases3;
    }

    @Column(name = "sea_addt_medicines", nullable = true, length = 1)
    public String getSeaAddtMedicines() {
        return seaAddtMedicines;
    }

    public void setSeaAddtMedicines(String seaAddtMedicines) {
        this.seaAddtMedicines = seaAddtMedicines;
    }

    @Column(name = "sea_addt_drugs_type", nullable = true, length = 8)
    public String getSeaAddtDrugsType() {
        return seaAddtDrugsType;
    }

    public void setSeaAddtDrugsType(String seaAddtDrugsType) {
        this.seaAddtDrugsType = seaAddtDrugsType;
    }

    @Column(name = "sea_addt_othdrugs_type1", nullable = true)
    public String getSeaAddtOthDrugsType1() {
        return seaAddtOthDrugsType1;
    }

    public void setSeaAddtOthDrugsType1(String seaAddtOthDrugsType1) {
        this.seaAddtOthDrugsType1 = seaAddtOthDrugsType1;
    }

    @Column(name = "sea_addt_othdrugs_brand1", nullable = true)
    public String getSeaAddtOthDrugsBrand1() {
        return seaAddtOthDrugsBrand1;
    }

    public void setSeaAddtOthDrugsBrand1(String seaAddtOthDrugsBrand1) {
        this.seaAddtOthDrugsBrand1 = seaAddtOthDrugsBrand1;
    }

    @Column(name = "sea_addt_othdrugs_type2", nullable = true)
    public String getSeaAddtOthDrugsType2() {
        return seaAddtOthDrugsType2;
    }

    public void setSeaAddtOthDrugsType2(String seaAddtOthDrugsType2) {
        this.seaAddtOthDrugsType2 = seaAddtOthDrugsType2;
    }

    @Column(name = "sea_addt_othdrugs_brand2", nullable = true)
    public String getSeaAddtOthDrugsBrand2() {
        return seaAddtOthDrugsBrand2;
    }

    public void setSeaAddtOthDrugsBrand2(String seaAddtOthDrugsBrand2) {
        this.seaAddtOthDrugsBrand2 = seaAddtOthDrugsBrand2;
    }

    @Column(name = "sea_addt_othdrugs_type3", nullable = true)
    public String getSeaAddtOthDrugsType3() {
        return seaAddtOthDrugsType3;
    }

    public void setSeaAddtOthDrugsType3(String seaAddtOthDrugsType3) {
        this.seaAddtOthDrugsType3 = seaAddtOthDrugsType3;
    }

    @Column(name = "sea_addt_othdrugs_brand3", nullable = true)
    public String getSeaAddtOthDrugsBrand3() {
        return seaAddtOthDrugsBrand3;
    }

    public void setSeaAddtOthDrugsBrand3(String seaAddtOthDrugsBrand3) {
        this.seaAddtOthDrugsBrand3 = seaAddtOthDrugsBrand3;
    }

    @Column(name = "sea_addt_othdrugs_type4", nullable = true)
    public String getSeaAddtOthDrugsType4() {
        return seaAddtOthDrugsType4;
    }

    public void setSeaAddtOthDrugsType4(String seaAddtOthDrugsType4) {
        this.seaAddtOthDrugsType4 = seaAddtOthDrugsType4;
    }

    @Column(name = "sea_addt_othdrugs_brand4", nullable = true)
    public String getSeaAddtOthDrugsBrand4() {
        return seaAddtOthDrugsBrand4;
    }

    public void setSeaAddtOthDrugsBrand4(String seaAddtOthDrugsBrand4) {
        this.seaAddtOthDrugsBrand4 = seaAddtOthDrugsBrand4;
    }

    @Column(name = "sea_addt_othdrugs_type5", nullable = true)
    public String getSeaAddtOthDrugsType5() {
        return seaAddtOthDrugsType5;
    }

    public void setSeaAddtOthDrugsType5(String seaAddtOthDrugsType5) {
        this.seaAddtOthDrugsType5 = seaAddtOthDrugsType5;
    }

    @Column(name = "sea_addt_othdrugs_brand5", nullable = true)
    public String getSeaAddtOthDrugsBrand5() {
        return seaAddtOthDrugsBrand5;
    }

    public void setSeaAddtOthDrugsBrand5(String seaAddtOthDrugsBrand5) {
        this.seaAddtOthDrugsBrand5 = seaAddtOthDrugsBrand5;
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
        if (!(o instanceof Zpo01StudyEntrySectionAtoB)) return false;

        Zpo01StudyEntrySectionAtoB that = (Zpo01StudyEntrySectionAtoB) o;

        return (recordId.equals(that.recordId));
    }
}
