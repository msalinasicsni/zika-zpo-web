package ni.org.ics.zpo.domain;

import ni.org.ics.zpo.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Entity
@Table(name = "zpo05_delivery", catalog = "zika_zpo")
public class Zpo05Delivery extends BaseMetaData implements Auditable {

    private static final long serialVersionUID = 1L;
    private String recordId;
    private String eventName;
    private Date deliVisitDate;
    private String deliOriginInfo;//multiple
    private Float deliMotherWt;
    private String deliWtUnit;
    private Integer deliSystolic;
    private Integer deliDiastolic;
    private Float deliTemperature;
    private String deliTempUnit;
    private Date deliDeliveryDate;
    private String deliMode;
    private String deliDeliveryWho;
    private String deliDeliveryOccur;
    private String deliHospitalId;
    private String deliClinicId;
    private String deliDeliveryOther;
    private String deliNumBirth;
    private String deliFetalOutcome1;
    private String deliCauseDeath1;
    private String deliSexBaby1;
    private String deliFetalOutcome2;
    private String deliCauseDeath2;
    private String deliSexBaby2;
    private String deliFetalOutcome3;
    private String deliCauseDeath3;
    private String deliSexBaby3;
    private String deliConsentInfant;
    private String deliReasonNoconsent;
    private String deliNoconsentOther;
    private String deliIdCompleting;
    private Date deliDateCompleted;
    private String deliIdReviewer;
    private Date deliDateReviewed;
    private String deliIdDataEntry;
    private Date deliDateEntered;
    
    //v2.4
    private String deliHyperDisease;
    private String deliPreterm1;
    private String deliPreterm2;
    private String deliPreterm3;
    private String deliDeliverEarly;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Id
    @Column(name = "event_name", nullable = true, length = 100)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Column(name = "deli_visit_date", nullable = true)
    public Date getDeliVisitDate() {
        return deliVisitDate;
    }

    public void setDeliVisitDate(Date deliVisitDate) {
        this.deliVisitDate = deliVisitDate;
    }

    @Column(name = "deli_origin_info", nullable = true, length = 10)
    public String getDeliOriginInfo() {
        return deliOriginInfo;
    }

    public void setDeliOriginInfo(String deliVisitStatus) {
        this.deliOriginInfo = deliVisitStatus;
    }

    @Column(name = "deli_mother_wt", nullable = true)
    public Float getDeliMotherWt() {
        return deliMotherWt;
    }

    public void setDeliMotherWt(Float deliMotherWt) {
        this.deliMotherWt = deliMotherWt;
    }

    @Column(name = "deli_wt_unit", nullable = true, length = 1)
    public String getDeliWtUnit() {
        return deliWtUnit;
    }

    public void setDeliWtUnit(String deliWtUnit) {
        this.deliWtUnit = deliWtUnit;
    }

    @Column(name = "deli_systolic", nullable = true)
    public Integer getDeliSystolic() {
        return deliSystolic;
    }

    public void setDeliSystolic(Integer deliSystolic) {
        this.deliSystolic = deliSystolic;
    }

    @Column(name = "deli_diastolic", nullable = true)
    public Integer getDeliDiastolic() {
        return deliDiastolic;
    }

    public void setDeliDiastolic(Integer deliDiastolic) {
        this.deliDiastolic = deliDiastolic;
    }

    @Column(name = "deli_temperature", nullable = true)
    public Float getDeliTemperature() {
        return deliTemperature;
    }

    public void setDeliTemperature(Float deliTemperature) {
        this.deliTemperature = deliTemperature;
    }

    @Column(name = "deli_temp_unit", nullable = true, length = 1)
    public String getDeliTempUnit() {
        return deliTempUnit;
    }

    public void setDeliTempUnit(String deliTempUnit) {
        this.deliTempUnit = deliTempUnit;
    }

    @Column(name = "deli_delivery_date", nullable = true)
    public Date getDeliDeliveryDate() {
        return deliDeliveryDate;
    }

    public void setDeliDeliveryDate(Date deliDeliveryDate) {
        this.deliDeliveryDate = deliDeliveryDate;
    }

    @Column(name = "deli_mode", nullable = true, length = 2)
    public String getDeliMode() {
        return deliMode;
    }

    public void setDeliMode(String deliMode) {
        this.deliMode = deliMode;
    }

    @Column(name = "deli_delivery_who", nullable = true, length = 2)
    public String getDeliDeliveryWho() {
        return deliDeliveryWho;
    }

    public void setDeliDeliveryWho(String deliDeliveryWho) {
        this.deliDeliveryWho = deliDeliveryWho;
    }

    @Column(name = "deli_delivery_occur", nullable = true, length = 2)
    public String getDeliDeliveryOccur() {
        return deliDeliveryOccur;
    }

    public void setDeliDeliveryOccur(String deliDeliveryOccur) {
        this.deliDeliveryOccur = deliDeliveryOccur;
    }

    @Column(name = "deli_hospital_id", nullable = true, length = 25)
    public String getDeliHospitalId() {
        return deliHospitalId;
    }

    public void setDeliHospitalId(String deliHospitalId) {
        this.deliHospitalId = deliHospitalId;
    }

    @Column(name = "deli_clinic_id", nullable = true, length = 25)
    public String getDeliClinicId() {
        return deliClinicId;
    }

    public void setDeliClinicId(String deliClinicId) {
        this.deliClinicId = deliClinicId;
    }

    @Column(name = "deli_delivery_other", nullable = true)
    public String getDeliDeliveryOther() {
        return deliDeliveryOther;
    }

    public void setDeliDeliveryOther(String deliDeliveryOther) {
        this.deliDeliveryOther = deliDeliveryOther;
    }

    @Column(name = "deli_num_birth", nullable = true, length = 1)
    public String getDeliNumBirth() {
        return deliNumBirth;
    }

    public void setDeliNumBirth(String deliNumBirth) {
        this.deliNumBirth = deliNumBirth;
    }

    @Column(name = "deli_fetal_outcome1", nullable = true, length = 2)
    public String getDeliFetalOutcome1() {
        return deliFetalOutcome1;
    }

    public void setDeliFetalOutcome1(String deliFetalOutcome1) {
        this.deliFetalOutcome1 = deliFetalOutcome1;
    }

    @Column(name = "deli_cause_death1", nullable = true)
    public String getDeliCauseDeath1() {
        return deliCauseDeath1;
    }

    public void setDeliCauseDeath1(String deliCauseDeath1) {
        this.deliCauseDeath1 = deliCauseDeath1;
    }

    @Column(name = "deli_sex_baby1", nullable = true, length = 1)
    public String getDeliSexBaby1() {
        return deliSexBaby1;
    }

    public void setDeliSexBaby1(String deliSexBaby1) {
        this.deliSexBaby1 = deliSexBaby1;
    }

    @Column(name = "deli_fetal_outcome2", nullable = true, length = 2)
    public String getDeliFetalOutcome2() {
        return deliFetalOutcome2;
    }

    public void setDeliFetalOutcome2(String deliFetalOutcome2) {
        this.deliFetalOutcome2 = deliFetalOutcome2;
    }

    @Column(name = "deli_cause_death2", nullable = true)
    public String getDeliCauseDeath2() {
        return deliCauseDeath2;
    }

    public void setDeliCauseDeath2(String deliCauseDeath2) {
        this.deliCauseDeath2 = deliCauseDeath2;
    }

    @Column(name = "deli_sex_baby2", nullable = true, length = 1)
    public String getDeliSexBaby2() {
        return deliSexBaby2;
    }

    public void setDeliSexBaby2(String deliSexBaby2) {
        this.deliSexBaby2 = deliSexBaby2;
    }

    @Column(name = "deli_fetal_outcome3", nullable = true, length = 2)
    public String getDeliFetalOutcome3() {
        return deliFetalOutcome3;
    }

    public void setDeliFetalOutcome3(String deliFetalOutcome3) {
        this.deliFetalOutcome3 = deliFetalOutcome3;
    }

    @Column(name = "deli_cause_death3", nullable = true)
    public String getDeliCauseDeath3() {
        return deliCauseDeath3;
    }

    public void setDeliCauseDeath3(String deliCauseDeath3) {
        this.deliCauseDeath3 = deliCauseDeath3;
    }

    @Column(name = "deli_sex_baby3", nullable = true, length = 1)
    public String getDeliSexBaby3() {
        return deliSexBaby3;
    }

    public void setDeliSexBaby3(String deliSexBaby3) {
        this.deliSexBaby3 = deliSexBaby3;
    }

    @Column(name = "deli_consent_infant", nullable = true, length = 1)
    public String getDeliConsentInfant() {
        return deliConsentInfant;
    }

    public void setDeliConsentInfant(String deliConsentInfant) {
        this.deliConsentInfant = deliConsentInfant;
    }

    @Column(name = "deli_reason_noconsent", nullable = true, length = 1)
    public String getDeliReasonNoconsent() {
        return deliReasonNoconsent;
    }

    public void setDeliReasonNoconsent(String deliReasonNoconsent) {
        this.deliReasonNoconsent = deliReasonNoconsent;
    }

    @Column(name = "deli_noconsent_other", nullable = true)
    public String getDeliNoconsentOther() {
        return deliNoconsentOther;
    }

    public void setDeliNoconsentOther(String deliNoconsentOther) {
        this.deliNoconsentOther = deliNoconsentOther;
    }

    @Column(name = "deli_id_completing", nullable = true, length = 50)
    public String getDeliIdCompleting() {
        return deliIdCompleting;
    }

    public void setDeliIdCompleting(String deliIdCompleting) {
        this.deliIdCompleting = deliIdCompleting;
    }

    @Column(name = "deli_date_completed", nullable = true)
    public Date getDeliDateCompleted() {
        return deliDateCompleted;
    }

    public void setDeliDateCompleted(Date deliDateCompleted) {
        this.deliDateCompleted = deliDateCompleted;
    }

    @Column(name = "deli_id_reviewer", nullable = true, length = 50)
    public String getDeliIdReviewer() {
        return deliIdReviewer;
    }

    public void setDeliIdReviewer(String deliIdReviewer) {
        this.deliIdReviewer = deliIdReviewer;
    }

    @Column(name = "deli_date_reviewed", nullable = true)
    public Date getDeliDateReviewed() {
        return deliDateReviewed;
    }

    public void setDeliDateReviewed(Date deliDateReviewed) {
        this.deliDateReviewed = deliDateReviewed;
    }

    @Column(name = "deli_id_data_entry", nullable = true, length = 50)
    public String getDeliIdDataEntry() {
        return deliIdDataEntry;
    }

    public void setDeliIdDataEntry(String deliIdDataEntry) {
        this.deliIdDataEntry = deliIdDataEntry;
    }

    @Column(name = "deli_date_entered", nullable = true)
    public Date getDeliDateEntered() {
        return deliDateEntered;
    }

    public void setDeliDateEntered(Date deliDateEntered) {
        this.deliDateEntered = deliDateEntered;
    }
    
    //v2.4
    @Column(name = "deli_hyper_disease", nullable = true)
    public String getDeliHyperDisease() {
		return deliHyperDisease;
	}

	public void setDeliHyperDisease(String deliHyperDisease) {
		this.deliHyperDisease = deliHyperDisease;
	}
	
	
	@Column(name = "deli_preterm1", nullable = true)
	public String getDeliPreterm1() {
		return deliPreterm1;
	}

	public void setDeliPreterm1(String deliPreterm1) {
		this.deliPreterm1 = deliPreterm1;
	}

	@Column(name = "deli_preterm2", nullable = true)
	public String getDeliPreterm2() {
		return deliPreterm2;
	}

	public void setDeliPreterm2(String deliPreterm2) {
		this.deliPreterm2 = deliPreterm2;
	}

	@Column(name = "deli_preterm3", nullable = true)
	public String getDeliPreterm3() {
		return deliPreterm3;
	}

	public void setDeliPreterm3(String deliPreterm3) {
		this.deliPreterm3 = deliPreterm3;
	}

	@Column(name = "deli_deliver_early", nullable = true)
	public String getDeliDeliverEarly() {
		return deliDeliverEarly;
	}

	public void setDeliDeliverEarly(String deliDeliverEarly) {
		this.deliDeliverEarly = deliDeliverEarly;
	}

	@Override
    public String toString() {
        return this.recordId;
    }
	
	@Override
    public boolean isFieldAuditable(String fieldname) {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Zpo05Delivery)) return false;

        Zpo05Delivery that = (Zpo05Delivery) o;

        return (recordId.equals(that.recordId));
    }
}
