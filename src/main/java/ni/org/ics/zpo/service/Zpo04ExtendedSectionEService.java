package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionE;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo04ExtendedSectionE
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Service("zpo04ExtendedSectionEService")
@Transactional
public class Zpo04ExtendedSectionEService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo04ExtendedSectionE
     * @return una lista de Zpo04ExtendedSectionE
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionE> getZpo04ExtendedSectionE(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionE");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zpo04ExtendedSectionE
     * @return una lista de Zpo04ExtendedSectionE
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionE> getZpo04ExtendedSectionEByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionE zpo04e where zpo04e.pasive = '0' and zpo04e.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo04ExtendedSectionE
     * @param recordId del Zpo04ExtendedSectionE a retornar
     * @return un Zpo04ExtendedSectionE
     */
    public Zpo04ExtendedSectionE getZpo04ExtendedSectionE(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionE where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo04ExtendedSectionE)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo04ExtendedSectionE
     * @param zpo04ExtendedSectionE a guardar
     */
    public void saveZpo04ExtendedSectionE(Zpo04ExtendedSectionE zpo04ExtendedSectionE){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo04ExtendedSectionE);
    }
}
