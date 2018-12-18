package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo04ExtendedSectionAtoF;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo04ExtendedSectionAtoF
 * Created by ics.
 * V1.0
 */
@Service("zpo04ExtendedSectionAtoFService")
@Transactional
public class Zpo04ExtendedSectionAtoFService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**Zpo04ExtendedSectionAtoF
     * Retorna todos los formularios
     * @return una lista de Zpo04ExtendedSectionAtoF
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionAtoF> getZpo04ExtendedSectionAtoF(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionAtoF");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zpo04ExtendedSectionAtoF
     * @return una lista de Zpo04ExtendedSectionAtoF
     */
    @SuppressWarnings("unchecked")
    public List<Zpo04ExtendedSectionAtoF> getZpo04ExtendedSectionAtoFByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionAtoF zp04 where zp04.pasive = '0' and zp04.recordId in (select dInf.recordId from ZpoInfantData dInf where dInf.pasive = '0' and dInf.pregnantId in (select zp00.recordId from Zpo00Screening zp00 where zp00.pasive = '0' ))");
        return query.list();
    }

    /**
     * Retorna un formulario Zpo04ExtendedSectionAtoF
     * @param recordId del Zpo04ExtendedSectionAtoF a retornar
     * @return un Zpo04ExtendedSectionAtoF
     */
    public Zpo04ExtendedSectionAtoF getZpo04ExtendedSectionAtoF(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo04ExtendedSectionAtoF where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo04ExtendedSectionAtoF)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo04ExtendedSectionAtoF
     * @param zpo04ExtendedSectionAtoF a guardar
     */
    public void saveZpo04ExtendedSectionAtoF(Zpo04ExtendedSectionAtoF zpo04ExtendedSectionAtoF){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo04ExtendedSectionAtoF);
    }
}
