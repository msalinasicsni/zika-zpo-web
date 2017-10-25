package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo01StudyEntrySectionDtoF;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo01StudyEntrySectionDtoF
 * Contiene la informacion del formulario Zpo01StudyEntry desde la seccion D a la F
 * Created by FIRSTICT on 10/11/2016.
 * V1.0
 */
@Service("zpo01StudyEntrySectionDtoFService")
@Transactional
public class Zpo01StudyEntrySectionDtoFService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo01StudyEntrySectionDtoF
     * @return una lista de Zpo01StudyEntrySectionDtoF
     */
    @SuppressWarnings("unchecked")
    public List<Zpo01StudyEntrySectionDtoF> getZpo01StudyEntrySectionDtoF(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionDtoF");
        return query.list();
    }
    
    
    /**
     * Retorna todos los formularios Zpo01StudyEntrySectionDtoF
     * @return una lista de Zpo01StudyEntrySectionDtoF
     */
    @SuppressWarnings("unchecked")
    public List<Zpo01StudyEntrySectionDtoF> getZpo01StudyEntrySectionDtoFByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionDtoF zpo01f where zpo01f.pasive = '0' and zpo01f.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo01StudyEntrySectionDtoF
     * @param recordId del Zpo01StudyEntrySectionDtoF a retornar
     * @return un Zpo01StudyEntrySectionDtoF
     */
    public Zpo01StudyEntrySectionDtoF getZpo01StudyEntrySectionDtoF(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo01StudyEntrySectionDtoF where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo01StudyEntrySectionDtoF)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo01StudyEntrySectionDtoF
     * @param zpo01StudyEntrySectionDtoF a guardar
     */
    public void saveZpo01StudyEntrySectionDtoF(Zpo01StudyEntrySectionDtoF zpo01StudyEntrySectionDtoF){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo01StudyEntrySectionDtoF);
    }
}
