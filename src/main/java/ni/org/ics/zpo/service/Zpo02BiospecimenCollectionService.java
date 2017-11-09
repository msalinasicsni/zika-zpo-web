package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo02BiospecimenCollection;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo02BiospecimenCollection
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpo02BiospecimenCollectionService")
@Transactional
public class Zpo02BiospecimenCollectionService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo02BiospecimenCollection
     * @return una lista de Zpo02BiospecimenCollection
     */
    @SuppressWarnings("unchecked")
    public List<Zpo02BiospecimenCollection> getZpo02BiospecimenCollection(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo02BiospecimenCollection");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zpo02BiospecimenCollection
     * @return una lista de Zpo02BiospecimenCollection
     */
    @SuppressWarnings("unchecked")
    public List<Zpo02BiospecimenCollection> getZpo02BiospecimenCollectionByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo02BiospecimenCollection zpo02 where zpo02.pasive = '0' " +
                "and (zpo02.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0')" +
                "or zpo02.recordId in (select zpo00.recordId from ZpoInfantData zpo00 where zpo00.pasive = '0'))");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo02BiospecimenCollection
     * @param recordId del Zpo02BiospecimenCollection a retornar
     * @return un Zpo02BiospecimenCollection
     */
    public Zpo02BiospecimenCollection getZpo02BiospecimenCollection(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo02BiospecimenCollection where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo02BiospecimenCollection)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo02BiospecimenCollection
     * @param zpo02BiospecimenCollection a guardar
     */
    public void saveZpo02BiospecimenCollection(Zpo02BiospecimenCollection zpo02BiospecimenCollection){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo02BiospecimenCollection);
    }
}
