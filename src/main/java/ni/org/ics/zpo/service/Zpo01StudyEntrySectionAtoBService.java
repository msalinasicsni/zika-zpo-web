package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo01StudyEntrySectionAtoB;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo01StudyEntrySectionAtoD
 * Contiene la informacion del formulario Zpo01StudyEntry desde la seccion A a la B
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpo01StudyEntrySectionAtoBService")
@Transactional
public class Zpo01StudyEntrySectionAtoBService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo01StudyEntrySectionAtoB
     * @return una lista de Zpo01StudyEntrySectionAtoB
     */
    @SuppressWarnings("unchecked")
    public List<Zpo01StudyEntrySectionAtoB> getZpo01StudyEntrySectionAtoB(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionAtoB");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zpo01StudyEntrySectionAtoB
     * @return una lista de Zpo01StudyEntrySectionAtoB
     */
    @SuppressWarnings("unchecked")
    public List<Zpo01StudyEntrySectionAtoB> getZpo01StudyEntrySectionAtoBByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionAtoB zpo01 where zpo01.pasive = '0' and zpo01.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' )");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }
    
    /**
     * Retorna un formulario Zpo01StudyEntrySectionAtoB
     * @param recordId del Zpo01StudyEntrySectionAtoB a retornar
     * @return un Zpo01StudyEntrySectionAtoB
     */
    public Zpo01StudyEntrySectionAtoB getZpo01StudyEntrySectionAtoB(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionA where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo01StudyEntrySectionAtoB)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo01StudyEntry desde la seccion A a la D
     * @param zpo01StudyEntrySectionAtoB a guardar
     */
    public void saveZpo01StudyEntrySectionAtoB(Zpo01StudyEntrySectionAtoB zpo01StudyEntrySectionAtoB){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo01StudyEntrySectionAtoB);
    }
}
