package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionAtoD;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo04ExtendedSectionAtoD
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpo04ExtendedSectionAtoDService")
@Transactional
public class Zpo04ExtendedSectionAtoDService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo04ExtendedSectionAtoD
     * @return una lista de Zpo04ExtendedSectionAtoD
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionAtoD> getZpo04ExtendedSectionAtoD(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionAtoD");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zpo04ExtendedSectionAtoD
     * @return una lista de Zpo04ExtendedSectionAtoD
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionAtoD> getZpo04ExtendedSectionAtoDByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionAtoD zpo04 where zpo04.pasive = '0' and zpo04.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo04ExtendedSectionAtoD
     * @param recordId del Zpo04ExtendedSectionAtoD a retornar
     * @return un Zpo04ExtendedSectionAtoD
     */
    public Zpo04ExtendedSectionAtoD getZpo04ExtendedSectionAtoD(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionAtoD where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo04ExtendedSectionAtoD)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo04ExtendedSectionAtoD
     * @param zpo04ExtendedSectionAtoD a guardar
     */
    public void saveZpo04ExtendedSectionAtoD(Zpo04ExtendedSectionAtoD zpo04ExtendedSectionAtoD){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo04ExtendedSectionAtoD);
    }
}
