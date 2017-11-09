package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionF;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo04ExtendedSectionF
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpo04ExtendedSectionFService")
@Transactional
public class Zpo04ExtendedSectionFService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo04ExtendedSectionF
     * @return una lista de Zpo04ExtendedSectionF
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionF> getZpo04ExtendedSectionF(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionF");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zpo04ExtendedSectionF
     * @return una lista de Zpo04ExtendedSectionF
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionF> getZpo04ExtendedSectionFByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionF zpo04f where zpo04f.pasive = '0' and zpo04f.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0')");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo04ExtendedSectionF
     * @param recordId del Zpo04ExtendedSectionF a retornar
     * @return un Zpo04ExtendedSectionF
     */
    public Zpo04ExtendedSectionF getZpo04ExtendedSectionF(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionF where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo04ExtendedSectionF)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo04ExtendedSectionF
     * @param zpo04ExtendedSectionF a guardar
     */
    public void saveZpo04ExtendedSectionF(Zpo04ExtendedSectionF zpo04ExtendedSectionF){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo04ExtendedSectionF);
    }
}
