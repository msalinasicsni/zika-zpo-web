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
