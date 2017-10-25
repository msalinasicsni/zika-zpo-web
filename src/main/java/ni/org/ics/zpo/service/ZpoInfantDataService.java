package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.ZpoInfantData;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Service("zpoInfantService")
@Transactional
public class ZpoInfantDataService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios ZpoInfantData
     * @return una lista de ZpoInfantData
     */
    @SuppressWarnings("unchecked")
    public List<ZpoInfantData> getZpoInfantData(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpoInfantData");
        return query.list();
    }

    /**
     * Retorna todos los formularios ZpEstadoInfante
     * @return una lista de ZpEstadoInfante
     */
    @SuppressWarnings("unchecked")
    public List<ZpoInfantData> getZpoInfantsDataByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpoInfantData zpEstInfa where zpEstInfa.pregnantId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
                "(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')))");
        query.setParameter("usuarioactual",username);


        return query.list();
    }
    /**
     * Retorna un formulario ZpoInfantData
     * @param recordId del ZpoInfantData a retornar
     * @return un ZpoInfantData
     */
    public ZpoInfantData getZpoInfantData(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM ZpoInfantData where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (ZpoInfantData)query.uniqueResult();
    }

    /**
     * Guardar un formulario ZpoInfantData
     * @param zpoInfantData a guardar
     */
    public void saveZpoInfantData(ZpoInfantData zpoInfantData){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpoInfantData);
    }
}
