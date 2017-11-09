package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo07cInfantImageStudies;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ics on 20/6/2017.
 * V1.0
 */
@Service("zpo07cInfantImageStudiesService")
@Transactional
public class Zpo07cInfantImageStudiesService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo07cInfantImageStudies
     * @return una lista de Zpo07cInfantImageStudies
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07cInfantImageStudies> getZpo07cInfantImageStudies(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07cInfantImageStudies");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zpo07cInfantImageStudies
     * @return una lista de Zp07cInfantImageSt
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07cInfantImageStudies> getZpo07cInfantImageStudiesByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07cInfantImageStudies zpo07 where zpo07.pasive = '0' and zpo07.recordId in (select zpo00.recordId from ZpoInfantData zpo00 where zpo00.pasive = '0')");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zpo07cInfantImageStudies
     * @param zpo07cInfantImageStudies a guardar
     */
    public void saveZpo07cInfantImageStudies(Zpo07cInfantImageStudies zpo07cInfantImageStudies){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo07cInfantImageStudies);
    }
}
