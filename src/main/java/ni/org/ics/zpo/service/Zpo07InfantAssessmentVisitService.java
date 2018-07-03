package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo07InfantAssessmentVisit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 2/1/2017.
 * V1.0
 */
@Service("zpo07InfantAssessmentVisitService")
@Transactional
public class Zpo07InfantAssessmentVisitService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo07InfantAssessmentVisit
     * @return una lista de Zpo07InfantAssessmentVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07InfantAssessmentVisit> getZpo07InfantAssessmentVisit(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07InfantAssessmentVisit");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zpo07InfantAssessmentVisit
     * @return una lista de Zpo07InfantAssessmentVisit
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07InfantAssessmentVisit> getZpo07InfantAssessmentVisitByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07InfantAssessmentVisit zpo07 where zpo07.pasive = '0' and zpo07.recordId in (select zpoI.recordId from Zpo00Screening zpo00, ZpoInfantData zpoI where zpo00.recordId = zpoI.pregnantId and zpo00.pasive = '0')");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zpo07InfantAssessmentVisit
     * @param zpo07InfantAssessmentVisit a guardar
     */
    public void saveZpo07InfantAssessmentVisit(Zpo07InfantAssessmentVisit zpo07InfantAssessmentVisit) {
        Session session = sessionFactory.getCurrentSession();

        if (zpo07InfantAssessmentVisit != null) {
            Zpo07InfantAssessmentVisit zpo07 = getZpo07InfantAssessmentVisit(zpo07InfantAssessmentVisit.getRecordId(), zpo07InfantAssessmentVisit.getEventName());

            if (zpo07 != null) {
                if (zpo07InfantAssessmentVisit.getPart1() != null) {
                    if ((zpo07InfantAssessmentVisit.getPart1() == 2) || (zpo07InfantAssessmentVisit.getPart1() == 1 && zpo07.getPart1() == null)) {
                        zpo07.setInfantVisitDate(zpo07InfantAssessmentVisit.getInfantVisitDate());
                        zpo07.setInfantStatus(zpo07InfantAssessmentVisit.getInfantStatus());
                        zpo07.setInfantDeathDt(zpo07InfantAssessmentVisit.getInfantDeathDt());
                        zpo07.setInfantVisit(zpo07InfantAssessmentVisit.getInfantVisit());
                        zpo07.setInfantTemp(zpo07InfantAssessmentVisit.getInfantTemp());
                        zpo07.setInfantTmpUnit(zpo07InfantAssessmentVisit.getInfantTmpUnit());
                        zpo07.setInfantWt(zpo07InfantAssessmentVisit.getInfantWt());
                        zpo07.setInfantWtUnit(zpo07InfantAssessmentVisit.getInfantWtUnit());
                        zpo07.setInfantWtPercen(zpo07InfantAssessmentVisit.getInfantWtPercen());
                        zpo07.setInfantWtpercenNa(zpo07InfantAssessmentVisit.getInfantWtpercenNa());
                        zpo07.setInfantLength(zpo07InfantAssessmentVisit.getInfantLength());
                        zpo07.setInfantLengthPercen(zpo07InfantAssessmentVisit.getInfantLengthPercen());
                        zpo07.setInfantLenpercenNa(zpo07InfantAssessmentVisit.getInfantLenpercenNa());
                        zpo07.setInfantHeadcircu(zpo07InfantAssessmentVisit.getInfantHeadcircu());
                        zpo07.setInfantHeapercen(zpo07InfantAssessmentVisit.getInfantHeapercen());
                        zpo07.setInfantHeapercenNa(zpo07InfantAssessmentVisit.getInfantHeapercenNa());
                        zpo07.setInfantHeasize(zpo07InfantAssessmentVisit.getInfantHeasize());
                    //  zpo07.setInfantApgarNa(zpo07InfantAssessmentVisit.getInfantApgarNa());
                    //  zpo07.setInfantApgar1min(zpo07InfantAssessmentVisit.getInfantApgar1min());
                    //  zpo07.setInfantApgar5min(zpo07InfantAssessmentVisit.getInfantApgar5min());
                        zpo07.setInfantSkinEvalu(zpo07InfantAssessmentVisit.getInfantSkinEvalu());
                        zpo07.setInfantRash(zpo07InfantAssessmentVisit.getInfantRash());
                        zpo07.setInfantScarring(zpo07InfantAssessmentVisit.getInfantScarring());
                        zpo07.setInfantOrganEvalu(zpo07InfantAssessmentVisit.getInfantOrganEvalu());
                        zpo07.setInfantAbdominal(zpo07InfantAssessmentVisit.getInfantAbdominal());
                        zpo07.setInfantLiverSpleen(zpo07InfantAssessmentVisit.getInfantLiverSpleen());
                        zpo07.setInfantOae(zpo07InfantAssessmentVisit.getInfantOae());
                        zpo07.setInfantHearingTest(zpo07InfantAssessmentVisit.getInfantHearingTest());
                        zpo07.setInfantHearingOverall(zpo07InfantAssessmentVisit.getInfantHearingOverall());
                        zpo07.setInfantRoae(zpo07InfantAssessmentVisit.getInfantRoae());
                        zpo07.setInfantRaabr(zpo07InfantAssessmentVisit.getInfantRaabr());
                        zpo07.setInfantLoae(zpo07InfantAssessmentVisit.getInfantLoae());
                        zpo07.setInfantLaabr(zpo07InfantAssessmentVisit.getInfantLaabr());
                        zpo07.setInfantBreastfeeding(zpo07InfantAssessmentVisit.getInfantBreastfeeding());
                        zpo07.setInfantBreastReason(zpo07InfantAssessmentVisit.getInfantBreastReason());
                        zpo07.setInfantBreastOther(zpo07InfantAssessmentVisit.getInfantBreastOther());
                        zpo07.setInfantNeurodeve(zpo07InfantAssessmentVisit.getInfantNeurodeve());
                        zpo07.setInfantAsymType(zpo07InfantAssessmentVisit.getInfantAsymType());
                        zpo07.setInfantOtherMove(zpo07InfantAssessmentVisit.getInfantOtherMove());
                        zpo07.setInfantExhibitOther(zpo07InfantAssessmentVisit.getInfantExhibitOther());
                        zpo07.setInfantMicroce(zpo07InfantAssessmentVisit.getInfantMicroce());
                        zpo07.setInfantDefinition(zpo07InfantAssessmentVisit.getInfantDefinition());
                        zpo07.setInfantFurtherNeuro(zpo07InfantAssessmentVisit.getInfantFurtherNeuro());
                        zpo07.setInfantFeverSymptom(zpo07InfantAssessmentVisit.getInfantFeverSymptom());
                        zpo07.setInfantRashSymptom(zpo07InfantAssessmentVisit.getInfantRashSymptom());
                        zpo07.setInfantItch(zpo07InfantAssessmentVisit.getInfantItch());
                        zpo07.setInfantRashFirst(zpo07InfantAssessmentVisit.getInfantRashFirst());
                        zpo07.setInfantRashDy(zpo07InfantAssessmentVisit.getInfantRashDy());
                        zpo07.setInfantRashMn(zpo07InfantAssessmentVisit.getInfantRashMn());
                        zpo07.setInfantRashYr(zpo07InfantAssessmentVisit.getInfantRashYr());
                        zpo07.setInfantRashDur(zpo07InfantAssessmentVisit.getInfantRashDur());
                        zpo07.setInfantRashSpread(zpo07InfantAssessmentVisit.getInfantRashSpread());
                        zpo07.setInfantSpreadPart(zpo07InfantAssessmentVisit.getInfantSpreadPart());
                        zpo07.setInfantFeverExperience(zpo07InfantAssessmentVisit.getInfantFeverExperience());
                        zpo07.setInfantTempMeasure(zpo07InfantAssessmentVisit.getInfantTempMeasure());
                        zpo07.setInfantHighTemp(zpo07InfantAssessmentVisit.getInfantHighTemp());
                        zpo07.setInfantHightemUnit(zpo07InfantAssessmentVisit.getInfantHightemUnit());
                        zpo07.setInfantTempunknown(zpo07InfantAssessmentVisit.getInfantTempunknown());
                        zpo07.setInfantFeverDy(zpo07InfantAssessmentVisit.getInfantFeverDy());
                        zpo07.setInfantFeverMn(zpo07InfantAssessmentVisit.getInfantFeverMn());
                        zpo07.setInfantFeverYr(zpo07InfantAssessmentVisit.getInfantFeverYr());
                        zpo07.setInfantFeverDur(zpo07InfantAssessmentVisit.getInfantFeverDur());
                        zpo07.setInfantRedeyes(zpo07InfantAssessmentVisit.getInfantRedeyes());
                        zpo07.setInfantRedeyesDy(zpo07InfantAssessmentVisit.getInfantRedeyesDy());
                        zpo07.setInfantRedeyesMn(zpo07InfantAssessmentVisit.getInfantRedeyesMn());
                        zpo07.setInfantRedeyesYr(zpo07InfantAssessmentVisit.getInfantRedeyesYr());
                        zpo07.setInfantRedeyesDur(zpo07InfantAssessmentVisit.getInfantRedeyesDur());
                        zpo07.setInfantJoint(zpo07InfantAssessmentVisit.getInfantJoint());
                        zpo07.setInfantJointDy(zpo07InfantAssessmentVisit.getInfantJointDy());
                        zpo07.setInfantJointMn(zpo07InfantAssessmentVisit.getInfantJointMn());
                        zpo07.setInfantJointYr(zpo07InfantAssessmentVisit.getInfantJointYr());
                        zpo07.setInfantJointDur(zpo07InfantAssessmentVisit.getInfantJointDur());
                        zpo07.setInfantHeadache(zpo07InfantAssessmentVisit.getInfantHeadache());
                        zpo07.setInfantHeadacheDy(zpo07InfantAssessmentVisit.getInfantHeadacheDy());
                        zpo07.setInfantHeadacheMn(zpo07InfantAssessmentVisit.getInfantHeadacheMn());
                        zpo07.setInfantHeadacheYr(zpo07InfantAssessmentVisit.getInfantHeadacheYr());
                        zpo07.setInfantHeadaDur(zpo07InfantAssessmentVisit.getInfantHeadaDur());
                        zpo07.setInfantSymptomOther(zpo07InfantAssessmentVisit.getInfantSymptomOther());
                        zpo07.setInfantSpecifySymptom(zpo07InfantAssessmentVisit.getInfantSpecifySymptom());
                        zpo07.setInfantOtherSymptom(zpo07InfantAssessmentVisit.getInfantOtherSymptom());
                        zpo07.setInfantMedicare(zpo07InfantAssessmentVisit.getInfantMedicare());
                        zpo07.setInfantCareDy(zpo07InfantAssessmentVisit.getInfantCareDy());
                        zpo07.setInfantCareMn(zpo07InfantAssessmentVisit.getInfantCareMn());
                        zpo07.setInfantCareYr(zpo07InfantAssessmentVisit.getInfantCareYr());
                        zpo07.setInfantCareFacility(zpo07InfantAssessmentVisit.getInfantCareFacility());
                        zpo07.setInfantHospitalized(zpo07InfantAssessmentVisit.getInfantHospitalized());
                        zpo07.setInfantHospital(zpo07InfantAssessmentVisit.getInfantHospital());
                        zpo07.setInfantDiagRubella(zpo07InfantAssessmentVisit.getInfantDiagRubella());
                        zpo07.setInfantDiagDengue(zpo07InfantAssessmentVisit.getInfantDiagDengue());
                        zpo07.setInfantDiagChikung(zpo07InfantAssessmentVisit.getInfantDiagChikung());
                        zpo07.setInfantDiagZika(zpo07InfantAssessmentVisit.getInfantDiagZika());
                        zpo07.setInfantDiagCytome(zpo07InfantAssessmentVisit.getInfantDiagCytome());
                        zpo07.setInfantMedicine(zpo07InfantAssessmentVisit.getInfantMedicine());
                        zpo07.setInfantMedName(zpo07InfantAssessmentVisit.getInfantMedName());
                        // zpo07.setInfantSpDiary(zpo07InfantAssessmentVisit.getInfantSpDiary());
                        // zpo07.setInfantPreResults(zpo07InfantAssessmentVisit.getInfantPreResults());
                        // zpo07.setInfantReferr(zpo07InfantAssessmentVisit.getInfantReferr());
                        // zpo07.setInfantOtherLab(zpo07InfantAssessmentVisit.getInfantOtherLab());
                        zpo07.setInfantCommentsYn(zpo07InfantAssessmentVisit.getInfantCommentsYn());
                        zpo07.setInfantComments2(zpo07InfantAssessmentVisit.getInfantComments2());
                        zpo07.setInfantIdCompleting(zpo07InfantAssessmentVisit.getInfantIdCompleting());
                        zpo07.setInfantDtComp(zpo07InfantAssessmentVisit.getInfantDtComp());
                        zpo07.setInfantIdReviewer(zpo07InfantAssessmentVisit.getInfantIdReviewer());
                        zpo07.setInfantDtReview(zpo07InfantAssessmentVisit.getInfantDtReview());
                        zpo07.setInfantDtEnter(zpo07InfantAssessmentVisit.getInfantDtEnter());
                        zpo07.setInfantIdDataEntry(zpo07InfantAssessmentVisit.getInfantIdDataEntry());
                        zpo07.setPart1(1);
                        zpo07.setIdInstancia(zpo07InfantAssessmentVisit.getIdInstancia());
                        zpo07.setInfantDob(zpo07InfantAssessmentVisit.getInfantDob());
                        // zpo07.setInfantWeeks(zpo07InfantAssessmentVisit.getInfantWeeks());
                        // zpo07.setInfantDays(zpo07InfantAssessmentVisit.getInfantDays());
                         zpo07.setInfantExhibited(zpo07InfantAssessmentVisit.getInfantExhibited());
                    }

                }

                if (zpo07InfantAssessmentVisit.getPart2() != null) {
                    if ((zpo07InfantAssessmentVisit.getPart2() == 2) || (zpo07InfantAssessmentVisit.getPart2() == 1 && zpo07.getPart2() == null)) {
                        zpo07.setInfantVisitDate2(zpo07InfantAssessmentVisit.getInfantVisitDate2());
                        zpo07.setInfantStatus2(zpo07InfantAssessmentVisit.getInfantStatus2());
                        zpo07.setInfantDeathDt2(zpo07InfantAssessmentVisit.getInfantDeathDt2());
                        zpo07.setInfantVisit2(zpo07InfantAssessmentVisit.getInfantVisit2());
                        zpo07.setInfantOphth(zpo07InfantAssessmentVisit.getInfantOphth());
                        zpo07.setInfantOphthType(zpo07InfantAssessmentVisit.getInfantOphthType());
                        zpo07.setInfantOphthAbno(zpo07InfantAssessmentVisit.getInfantOphthAbno());
                        zpo07.setInfantCommentsYn2(zpo07InfantAssessmentVisit.getInfantCommentsYn2());
                        zpo07.setInfantComments2_2(zpo07InfantAssessmentVisit.getInfantComments2_2());
                        zpo07.setInfantIdCompleting2(zpo07InfantAssessmentVisit.getInfantIdCompleting2());
                        zpo07.setInfantDtComp2(zpo07InfantAssessmentVisit.getInfantDtComp2());
                        zpo07.setInfantIdReviewer2(zpo07InfantAssessmentVisit.getInfantIdReviewer2());
                        zpo07.setInfantDtReview2(zpo07InfantAssessmentVisit.getInfantDtReview2());
                        zpo07.setInfantIdDataEntry2(zpo07InfantAssessmentVisit.getInfantIdDataEntry2());
                        zpo07.setInfantDtEnter2(zpo07InfantAssessmentVisit.getInfantDtEnter2());
                        zpo07.setPart2(1);
                        zpo07.setIdInstancia2(zpo07InfantAssessmentVisit.getIdInstancia2());
                    }
                }

                if (zpo07InfantAssessmentVisit.getPart3() != null) {
                    if ((zpo07InfantAssessmentVisit.getPart3() == 2) || (zpo07InfantAssessmentVisit.getPart3() == 1 && zpo07.getPart3() == null)) {
                        zpo07.setInfantVisitDate3(zpo07InfantAssessmentVisit.getInfantVisitDate3());
                        zpo07.setInfantStatus3(zpo07InfantAssessmentVisit.getInfantStatus3());
                        zpo07.setInfantDeathDt3(zpo07InfantAssessmentVisit.getInfantDeathDt3());
                        zpo07.setInfantVisit3(zpo07InfantAssessmentVisit.getInfantVisit3());
                        zpo07.setInfantEvaluation(zpo07InfantAssessmentVisit.getInfantEvaluation());
                        zpo07.setInfantNeuroAsq(zpo07InfantAssessmentVisit.getInfantNeuroAsq());
                        zpo07.setInfantAsqCommuni(zpo07InfantAssessmentVisit.getInfantAsqCommuni());
                        zpo07.setInfantAsqGross(zpo07InfantAssessmentVisit.getInfantAsqGross());
                        zpo07.setInfantAsqFine(zpo07InfantAssessmentVisit.getInfantAsqFine());
                        zpo07.setInfantAsqProblem(zpo07InfantAssessmentVisit.getInfantAsqProblem());
                        zpo07.setInfantAsqPersonal(zpo07InfantAssessmentVisit.getInfantAsqPersonal());
                        zpo07.setInfantNeuroBisd(zpo07InfantAssessmentVisit.getInfantNeuroBisd());
                        zpo07.setInfantCgScore(zpo07InfantAssessmentVisit.getInfantCgScore());
                        zpo07.setInfantCgRisk(zpo07InfantAssessmentVisit.getInfantCgRisk());
                        zpo07.setInfantRpScore(zpo07InfantAssessmentVisit.getInfantRpScore());
                        zpo07.setInfantRpRisk(zpo07InfantAssessmentVisit.getInfantRpRisk());
                        zpo07.setInfantEpScore(zpo07InfantAssessmentVisit.getInfantEpScore());
                        zpo07.setInfantEpRisk(zpo07InfantAssessmentVisit.getInfantEpRisk());
                        zpo07.setInfantFmScore(zpo07InfantAssessmentVisit.getInfantFmScore());
                        zpo07.setInfantFmRisk(zpo07InfantAssessmentVisit.getInfantFmRisk());
                        zpo07.setInfantGmScore(zpo07InfantAssessmentVisit.getInfantGmScore());
                        zpo07.setInfantGmRisk(zpo07InfantAssessmentVisit.getInfantGmRisk());
                        zpo07.setInfantNeuroOther(zpo07InfantAssessmentVisit.getInfantNeuroOther());
                        zpo07.setInfantOtherName(zpo07InfantAssessmentVisit.getInfantOtherName());
                        zpo07.setInfantOtherScore(zpo07InfantAssessmentVisit.getInfantOtherScore());
                        zpo07.setInfantResultScreening(zpo07InfantAssessmentVisit.getInfantResultScreening());
                        zpo07.setInfantReferTesting(zpo07InfantAssessmentVisit.getInfantReferTesting());
                        zpo07.setInfantCommentsYn3(zpo07InfantAssessmentVisit.getInfantCommentsYn3());
                        zpo07.setInfantComments2_3(zpo07InfantAssessmentVisit.getInfantComments2_3());
                        zpo07.setInfantIdCompleting3(zpo07InfantAssessmentVisit.getInfantIdCompleting3());
                        zpo07.setInfantDtComp3(zpo07InfantAssessmentVisit.getInfantDtComp3());
                        zpo07.setInfantIdReviewer3(zpo07InfantAssessmentVisit.getInfantIdReviewer3());
                        zpo07.setInfantDtReview3(zpo07InfantAssessmentVisit.getInfantDtReview3());
                        zpo07.setInfantIdDataEntry3(zpo07InfantAssessmentVisit.getInfantIdDataEntry3());
                        zpo07.setInfantDtEnter3(zpo07InfantAssessmentVisit.getInfantDtEnter3());
                        zpo07.setPart3(1);
                        zpo07.setIdInstancia3(zpo07InfantAssessmentVisit.getIdInstancia3());
                    }
                }


                zpo07.setRecordDate(zpo07InfantAssessmentVisit.getRecordDate());
                zpo07.setRecordUser(zpo07InfantAssessmentVisit.getRecordUser());
                zpo07.setInstancePath(zpo07InfantAssessmentVisit.getInstancePath());
                zpo07.setEstado(zpo07InfantAssessmentVisit.getEstado());
                zpo07.setStart(zpo07InfantAssessmentVisit.getStart());
                zpo07.setEnd(zpo07InfantAssessmentVisit.getEnd());
                zpo07.setDeviceid(zpo07InfantAssessmentVisit.getDeviceid());
                zpo07.setSimserial(zpo07InfantAssessmentVisit.getSimserial());
                zpo07.setPhonenumber(zpo07InfantAssessmentVisit.getPhonenumber());
                zpo07.setToday(zpo07InfantAssessmentVisit.getToday());

                session.update(zpo07);
            } else {
                session.save(zpo07InfantAssessmentVisit);
            }
        }
    }


    /**
     * Retorna un formulario Zpo07InfantAssessmentVisit
     * @param recordId del Zpo07InfantAssessmentVisit a retornar
     * @return un Zpo07InfantAssessmentVisit
     */
    public Zpo07InfantAssessmentVisit getZpo07InfantAssessmentVisit(String recordId, String event){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07InfantAssessmentVisit where recordId = :recordId and eventName = :event");
        query.setParameter("recordId",recordId);
        query.setParameter("event",event);
        return (Zpo07InfantAssessmentVisit)query.uniqueResult();
    }
}
