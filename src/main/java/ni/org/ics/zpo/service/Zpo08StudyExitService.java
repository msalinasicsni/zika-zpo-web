package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo08StudyExit;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo08StudyExit
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpo08StudyExitService")
@Transactional
public class Zpo08StudyExitService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo08StudyExit
     * @return una lista de Zpo08StudyExit
     */
    @SuppressWarnings("unchecked")
    public List<Zpo08StudyExit> getZpo08StudyExit(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo08StudyExit");
        return query.list();
    }
    
    
    /**
     * Retorna todos los formularios Zpo08StudyExit
     * @return una lista de Zpo08StudyExit
     */
    @SuppressWarnings("unchecked")
    public List<Zpo08StudyExit> getZpo08StudyExitByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo08StudyExit zpo08 where zpo08.pasive = '0' and zpo08.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0')");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo08StudyExit
     * @param recordId del Zpo08StudyExit a retornar
     * @return un Zpo08StudyExit
     */
    public Zpo08StudyExit getZpo08StudyExit(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo08StudyExit where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo08StudyExit)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo08StudyExit
     * @param zpo08StudyExit a guardar
     */
    public void saveZpo08StudyExit(Zpo08StudyExit zpo08StudyExit){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo08StudyExit);
    }
}
