package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo07InfantOtoacousticEmissions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo07InfantOtoacousticEmissions
 */
@Service("zpo07InfantOtoacousticEmsService")
@Transactional
public class Zpo07InfantOtoacousticEmissionsService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo07InfantOtoacousticEmissions
     * @return una lista de Zpo07InfantOtoacousticEmissions
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07InfantOtoacousticEmissions> getZpo07InfantOtoacousticEms(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07InfantOtoacousticEmissions ");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zpo07InfantOtoacousticEmissions
     * @return una lista de Zpo07InfantOtoacousticEmissions
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07InfantOtoacousticEmissions> getZpo07InfantOtoacousticEmsByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07InfantOtoacousticEmissions zpo07 where zpo07.pasive = '0' and zpo07.recordId in (select dInf.recordId from ZpoInfantData dInf where dInf.pasive = '0' and dInf.pregnantId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0'))))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo07InfantOtoacousticEmissions
     * @param recordId del Zpo07InfantOtoacousticEmissions a retornar
     * @return un Zpo07InfantOtoacousticEmissions
     */
    public Zpo07InfantOtoacousticEmissions getZpo07InfantOtoacousticEm(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07InfantOtoacousticEmissions where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo07InfantOtoacousticEmissions) query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo07InfantOtoacousticEmissions
     * @param zpo07InfantOtoacousticEm a guardar
     */
    public void saveZpo07InfantOtoacousticEm(Zpo07InfantOtoacousticEmissions zpo07InfantOtoacousticEm){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo07InfantOtoacousticEm);
    }
}
