package ni.org.ics.zpo.domain;

import ni.org.ics.zpo.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by ics on 1/6/2017.
 */
@Entity
@Table(name = "zpo07c_infant_image_studies", catalog = "zika_zpo")
public class Zpo07cInfantImageStudies extends BaseMetaData implements Auditable {

    private String recordId;
    private String eventName;
    private Date infantImageDt;
    private String infantHeadAltra;
    private String infantUltraObtained;
    private Date infantUltraDt;
    private String infantResultsSpecify;
    private String infantUltraOther;
    private String infantUltraFile;
    private String infantHeadCt;
    private String infantCtObtained;
    private Date infantCtDt;
    private String infantCtspecify;
    private String infantCtotherSpecify;
    private String infantCtFile;
    private String infantCerebrospinal;
    private String infantCerebroStored;
    private Date infantCerebroDt;
    private Float infantCerebroAmount;
    private String infantResultsCerebro;
    private String infantCerebroSpecify;
    private String infantMri;
    private String infantMriObtained;
    private Date infantMriDt;
    private String infantMriSpecify;
    private String infantMriotherSpecify;
    private String infantMriFile;
    private String infantIgcom;
    private String infantIgcomDetail;
    private String infantIgidCom;
    private Date infantIgdtCom;
    private String infantIgeyeIdRevi;
    private Date infantIgdtRevi;
    private String infantIgidEntry;
    private Date infantIgdateEnt;


    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Id
    @Column(name = "event_name", nullable = false, length = 100)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Column(name = "infant_image_dt", nullable = false)
    public Date getInfantImageDt() {
        return infantImageDt;
    }

    public void setInfantImageDt(Date infantImageDt) {
        this.infantImageDt = infantImageDt;
    }

    @Column(name = "infant_head_altra", length = 2)
    public String getInfantHeadAltra() {
        return infantHeadAltra;
    }

    public void setInfantHeadAltra(String infantHeadAltra) {
        this.infantHeadAltra = infantHeadAltra;
    }

    @Column(name = "infant_ultra_obtained", length = 2)
    public String getInfantUltraObtained() {
        return infantUltraObtained;
    }

    public void setInfantUltraObtained(String infantUltraObtained) {
        this.infantUltraObtained = infantUltraObtained;
    }

    @Column(name = "infant_ultra_dt")
    public Date getInfantUltraDt() {
        return infantUltraDt;
    }

    public void setInfantUltraDt(Date infantUltraDt) {
        this.infantUltraDt = infantUltraDt;
    }

    @Column(name = "infant_results_specify", length = 1)
    public String getInfantResultsSpecify() {
        return infantResultsSpecify;
    }

    public void setInfantResultsSpecify(String infantResultsSpecify) {
        this.infantResultsSpecify = infantResultsSpecify;
    }

    @Column(name = "infant_ultra_other", length = 100)
    public String getInfantUltraOther() {
        return infantUltraOther;
    }

    public void setInfantUltraOther(String infantUltraOther) {
        this.infantUltraOther = infantUltraOther;
    }

    @Column(name = "infant_ultra_file")
    public String getInfantUltraFile() {
        return infantUltraFile;
    }

    public void setInfantUltraFile(String infantUltraFile) {
        this.infantUltraFile = infantUltraFile;
    }


    @Column(name = "infant_head_ct", length = 2)
    public String getInfantHeadCt() {
        return infantHeadCt;
    }

    public void setInfantHeadCt(String infantHeadCt) {
        this.infantHeadCt = infantHeadCt;
    }

    @Column(name = "infant_ct_obtained", length = 2)
    public String getInfantCtObtained() {
        return infantCtObtained;
    }

    public void setInfantCtObtained(String infantCtObtained) {
        this.infantCtObtained = infantCtObtained;
    }

    @Column(name = "infant_ct_dt")
    public Date getInfantCtDt() {
        return infantCtDt;
    }

    public void setInfantCtDt(Date infantCtDt) {
        this.infantCtDt = infantCtDt;
    }

    @Column(name = "infant_ctspecify", length = 1)
    public String getInfantCtspecify() {
        return infantCtspecify;
    }

    public void setInfantCtspecify(String infantCtspecify) {
        this.infantCtspecify = infantCtspecify;
    }

    @Column(name = "infant_ctother_specify", length = 100)
    public String getInfantCtotherSpecify() {
        return infantCtotherSpecify;
    }

    public void setInfantCtotherSpecify(String infantCtotherSpecify) {
        this.infantCtotherSpecify = infantCtotherSpecify;
    }

    @Column(name = "infant_ct_file")
    public String getInfantCtFile() {
        return infantCtFile;
    }

    public void setInfantCtFile(String infantCtFile) {
        this.infantCtFile = infantCtFile;
    }


    @Column(name = "infant_cerebrospinal", length = 2)
    public String getInfantCerebrospinal() {
        return infantCerebrospinal;
    }

    public void setInfantCerebrospinal(String infantCerebrospinal) {
        this.infantCerebrospinal = infantCerebrospinal;
    }

    @Column(name = "infant_cerebro_stored", length = 2)
    public String getInfantCerebroStored() {
        return infantCerebroStored;
    }

    public void setInfantCerebroStored(String infantCerebroStored) {
        this.infantCerebroStored = infantCerebroStored;
    }

    @Column(name = "infant_cerebro_dt")
    public Date getInfantCerebroDt() {
        return infantCerebroDt;
    }

    public void setInfantCerebroDt(Date infantCerebroDt) {
        this.infantCerebroDt = infantCerebroDt;
    }

    @Column(name = "infant_cerebro_amount")
    public Float getInfantCerebroAmount() {
        return infantCerebroAmount;
    }

    public void setInfantCerebroAmount(Float infantCerebroAmount) {
        this.infantCerebroAmount = infantCerebroAmount;
    }

    @Column(name = "infant_results_cerebro", length = 1)
    public String getInfantResultsCerebro() {
        return infantResultsCerebro;
    }

    public void setInfantResultsCerebro(String infantResultsCerebro) {
        this.infantResultsCerebro = infantResultsCerebro;
    }

    @Column(name = "infant_cerebro_specify", length = 100)
    public String getInfantCerebroSpecify() {
        return infantCerebroSpecify;
    }

    public void setInfantCerebroSpecify(String infantCerebroSpecify) {
        this.infantCerebroSpecify = infantCerebroSpecify;
    }

    @Column(name = "infant_mri", length = 2)
    public String getInfantMri() {
        return infantMri;
    }

    public void setInfantMri(String infantMri) {
        this.infantMri = infantMri;
    }

    @Column(name = "infant_mri_obtained", length = 2)
    public String getInfantMriObtained() {
        return infantMriObtained;
    }

    public void setInfantMriObtained(String infantMriObtained) {
        this.infantMriObtained = infantMriObtained;
    }

    @Column(name = "infant_mri_dt")
    public Date getInfantMriDt() {
        return infantMriDt;
    }

    public void setInfantMriDt(Date infantMriDt) {
        this.infantMriDt = infantMriDt;
    }

    @Column(name = "infant_mri_specify", length = 1)
    public String getInfantMriSpecify() {
        return infantMriSpecify;
    }

    public void setInfantMriSpecify(String infantMriSpecify) {
        this.infantMriSpecify = infantMriSpecify;
    }

    @Column(name = "infant_mriother_specify", length = 100)
    public String getInfantMriotherSpecify() {
        return infantMriotherSpecify;
    }

    public void setInfantMriotherSpecify(String infantMriotherSpecify) {
        this.infantMriotherSpecify = infantMriotherSpecify;
    }

    @Column(name = "infant_mri_file")
    public String getInfantMriFile() {
        return infantMriFile;
    }

    public void setInfantMriFile(String infantMriFile) {
        this.infantMriFile = infantMriFile;
    }


    @Column(name = "infant_igcom", length = 1)
    public String getInfantIgcom() {
        return infantIgcom;
    }

    public void setInfantIgcom(String infantIgcom) {
        this.infantIgcom = infantIgcom;
    }

    @Column(name = "infant_igcom_detail", length = 100)
    public String getInfantIgcomDetail() {
        return infantIgcomDetail;
    }

    public void setInfantIgcomDetail(String infantIgcomDetail) {
        this.infantIgcomDetail = infantIgcomDetail;
    }

    @Column(name = "infant_igid_com", length = 50)
    public String getInfantIgidCom() {
        return infantIgidCom;
    }

    public void setInfantIgidCom(String infantIgidCom) {
        this.infantIgidCom = infantIgidCom;
    }

    @Column(name = "infant_igdt_com")
    public Date getInfantIgdtCom() {
        return infantIgdtCom;
    }

    public void setInfantIgdtCom(Date infantIgdtCom) {
        this.infantIgdtCom = infantIgdtCom;
    }

    @Column(name = "infant_igeye_id_revi", length = 50)
    public String getInfantIgeyeIdRevi() {
        return infantIgeyeIdRevi;
    }

    public void setInfantIgeyeIdRevi(String infantIgeyeIdRevi) {
        this.infantIgeyeIdRevi = infantIgeyeIdRevi;
    }

    @Column(name = "infant_igdt_revi")
    public Date getInfantIgdtRevi() {
        return infantIgdtRevi;
    }

    public void setInfantIgdtRevi(Date infantIgdtRevi) {
        this.infantIgdtRevi = infantIgdtRevi;
    }

    @Column(name = "infant_igid_entry", length = 50)
    public String getInfantIgidEntry() {
        return infantIgidEntry;
    }

    public void setInfantIgidEntry(String infantIgidEntry) {
        this.infantIgidEntry = infantIgidEntry;
    }

    @Column(name = "infant_igdate_ent")
    public Date getInfantIgdateEnt() {
        return infantIgdateEnt;
    }

    public void setInfantIgdateEnt(Date infantIgdateEnt) {
        this.infantIgdateEnt = infantIgdateEnt;
    }

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public String toString() {
        return "ZPO07c{" + recordId + ", " + eventName + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zpo07cInfantImageStudies)) return false;

        Zpo07cInfantImageStudies that = (Zpo07cInfantImageStudies) o;

        if (!recordId.equals(that.recordId)) return false;
        if (!eventName.equals(that.eventName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordId.hashCode();
        result = 31 * result + eventName.hashCode();
        return result;
    }

}
