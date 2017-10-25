package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo07aInfantOphtResults;
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
@Service("zpo07aInfantOphtResultsService")
@Transactional
public class Zpo07aInfantOphtResultsService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo07aInfantOphtResults
     * @return una lista de Zpo07aInfantOphtResults
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07aInfantOphtResults> getZpo07aInfantOphtResults(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07aInfantOphtResults");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zp07aInfantOphtResult
     * @return una lista de Zp07aInfantOphtResult
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07aInfantOphtResults> getZpo07aInfantOphtResultstByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07aInfantOphtResults zpo07 where zpo07.pasive = '0' and zpo07.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zpo07aInfantOphtResults
     * @param zpo07aInfantOphtResults a guardar
     */
    public void saveZpo07aInfantOphtResults(Zpo07aInfantOphtResults zpo07aInfantOphtResults){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo07aInfantOphtResults);
    }
}
