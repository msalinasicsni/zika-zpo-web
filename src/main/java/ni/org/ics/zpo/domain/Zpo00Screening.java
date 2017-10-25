package ni.org.ics.zpo.domain;

import javax.persistence.*;
import ni.org.ics.zpo.domain.audit.Auditable;

import java.util.Date;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zpo00_screening", catalog = "zika_zpo")
public class Zpo00Screening extends BaseMetaData implements Auditable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String recordId;
    private String preScreenId;
    private String eventName;
    private Date scrVisitDate;
    private String scrConsentA; //envio muestras a EEUU
    private String scrConsentB; //USO FUTORO DE MUESTRAS BIOLOGICAS
    private String scrConsentC; //ESTUDIOS GENETICOS
    private String nombre1Tutor;
    private String nombre2Tutor;
    private String apellido1Tutor;
    private String apellido2Tutor;
    private String relacionFamiliarTutor;
    private String participanteOTutorAlfabeto;
    private String testigoPresente;
    private String nombre1Testigo;
    private String nombre2Testigo;
    private String apellido1Testigo;
    private String apellido2Testigo;

    @Id
    @Column(name = "record_id", nullable = false, length = 25)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Column(name = "prescreen_id", nullable = true, length = 50)
    public String getPreScreenId() {
        return preScreenId;
    }

    public void setPreScreenId(String preScreenId) {
        this.preScreenId = preScreenId;
    }

    @Column(name = "event_name", nullable = true, length = 100)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Column(name = "scr_visit_date", nullable = false)
    public Date getScrVisitDate() {
        return scrVisitDate;
    }

    public void setScrVisitDate(Date scrVisitDate) {
        this.scrVisitDate = scrVisitDate;
    }

    @Column(name = "scr_consent_a",columnDefinition = "", nullable = true, length = 2)
    public String getScrConsentA() {
        return scrConsentA;
    }

    public void setScrConsentA(String scrConsentA) {
        this.scrConsentA = scrConsentA;
    }

    @Column(name = "scr_consent_b", nullable = true, length = 2)
    public String getScrConsentB() {
        return scrConsentB;
    }

    public void setScrConsentB(String scrConsentB) {
        this.scrConsentB = scrConsentB;
    }

    @Column(name = "scr_consent_c", nullable = true, length = 2)
    public String getScrConsentC() {
        return scrConsentC;
    }

    public void setScrConsentC(String scrConsentC) {
        this.scrConsentC = scrConsentC;
    }

    @Column(name = "nombre1_tutor", length = 100)
    public String getNombre1Tutor() {
        return nombre1Tutor;
    }

    public void setNombre1Tutor(String nombre1Tutor) {
        this.nombre1Tutor = nombre1Tutor;
    }

    @Column(name = "nombre2_tutor", length = 100)
    public String getNombre2Tutor() {
        return nombre2Tutor;
    }

    public void setNombre2Tutor(String nombre2Tutor) {
        this.nombre2Tutor = nombre2Tutor;
    }

    @Column(name = "apellido1_tutor", length = 100)
    public String getApellido1Tutor() {
        return apellido1Tutor;
    }

    public void setApellido1Tutor(String apellido1Tutor) {
        this.apellido1Tutor = apellido1Tutor;
    }

    @Column(name = "apellido2_tutor", length = 100)
    public String getApellido2Tutor() {
        return apellido2Tutor;
    }

    public void setApellido2Tutor(String apellido2Tutor) {
        this.apellido2Tutor = apellido2Tutor;
    }

    @Column(name = "relacion_familiar", nullable = true, length = 50)
    public String getRelacionFamiliarTutor() {
        return relacionFamiliarTutor;
    }

    public void setRelacionFamiliarTutor(String relacionFamiliar) {
        this.relacionFamiliarTutor = relacionFamiliar;
    }


    @Column(name = "participante_tutor_alfabeto", length = 1)
    public String getParticipanteOTutorAlfabeto() {
        return participanteOTutorAlfabeto;
    }

    public void setParticipanteOTutorAlfabeto(String participanteOTutorAlfabeto) {
        this.participanteOTutorAlfabeto = participanteOTutorAlfabeto;
    }

    @Column(name = "testigo_presente", length = 1)
    public String getTestigoPresente() {
        return testigoPresente;
    }

    public void setTestigoPresente(String testigoPresente) {
        this.testigoPresente = testigoPresente;
    }

    @Column(name = "nombre1_testigo", length = 100)
    public String getNombre1Testigo() {
        return nombre1Testigo;
    }

    public void setNombre1Testigo(String nombre1Testigo) {
        this.nombre1Testigo = nombre1Testigo;
    }

    @Column(name = "nombre2_testigo", length = 100)
    public String getNombre2Testigo() {
        return nombre2Testigo;
    }

    public void setNombre2Testigo(String nombre2Testigo) {
        this.nombre2Testigo = nombre2Testigo;
    }

    @Column(name = "apellido1_testigo", length = 100)
    public String getApellido1Testigo() {
        return apellido1Testigo;
    }

    public void setApellido1Testigo(String apellido1Testigo) {
        this.apellido1Testigo = apellido1Testigo;
    }

    @Column(name = "apellido2_testigo", length = 100)
    public String getApellido2Testigo() {
        return apellido2Testigo;
    }

    public void setApellido2Testigo(String apellido2Testigo) {
        this.apellido2Testigo = apellido2Testigo;
    }

	@Override
	public boolean isFieldAuditable(String fieldname) {
		return true;
	}
	
	@Override
	public String toString(){
		return this.recordId;
	}
	
	@Override
	public boolean equals(Object other) {
		
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Zpo00Screening))
			return false;
		
		Zpo00Screening castOther = (Zpo00Screening) other;

		return (this.getRecordId().equals(castOther.getRecordId()));
	}
}

