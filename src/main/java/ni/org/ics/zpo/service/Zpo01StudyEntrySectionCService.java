package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo01StudyEntrySectionC;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo01StudyEntrySectionC
 * Contiene la informacion de la seccion C del formulario Zpo01StudyEntry
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpo01StudyEntrySectionCService")
@Transactional
public class Zpo01StudyEntrySectionCService {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo01StudyEntry Secci�n C
     * @return una lista de Zpo01StudyEntrySectionC
     */
    @SuppressWarnings("unchecked")
    public List<Zpo01StudyEntrySectionC> getZpo01StudyEntrySectionC(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionC");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zpo01StudyEntry Secci�n E
     * @return una lista de Zpo01StudyEntrySectionC
     */
    @SuppressWarnings("unchecked")
    public List<Zpo01StudyEntrySectionC> getZpo01StudyEntrySectionCByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionC zpo01e where zpo01e.pasive = '0' and zpo01e.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo01StudyEntry Secci�n C
     * @param recordId del Zpo01StudyEntrySectionC a retornar
     * @return un Zpo01StudyEntrySectionC
     */
    public Zpo01StudyEntrySectionC getZpo01StudyEntrySectionC(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionC where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo01StudyEntrySectionC)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo01StudyEntry Secci�n C
     * @param zpo01StudyEntrySectionC a guardar
     */
    public void saveZpo01StudyEntrySectionC(Zpo01StudyEntrySectionC zpo01StudyEntrySectionC){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo01StudyEntrySectionC);
    }
}
