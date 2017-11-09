package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo07dInfantBayleyScales;
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
@Service("zpo07dInfantBayleyScalesService")
@Transactional
public class Zpo07dInfantBayleyScalesService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo07dInfantBayleyScales
     * @return una lista de Zpo07dInfantBayleyScales
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07dInfantBayleyScales> getZpo07dInfantBayleyScales(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07dInfantBayleyScales");
        return query.list();
    }

    /**
     * Retorna todos los formularios Zpo07dInfantBayleyScales
     * @return una lista de Zpo07dInfantBayleyScales
     */
    @SuppressWarnings("unchecked")
    public List<Zpo07dInfantBayleyScales> getZpo07dInfantBayleyScalesByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo07dInfantBayleyScales zpo07 where zpo07.pasive = '0' and zpo07.recordId in (select zpo00.recordId from ZpoInfantData zpo00 where zpo00.pasive = '0')");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Guardar un formulario Zpo07dInfantBayleyScales
     * @param zpo07dInfantBayleyScales a guardar
     */
    public void saveZpo07dInfantBayleyScales(Zpo07dInfantBayleyScales zpo07dInfantBayleyScales){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo07dInfantBayleyScales);
    }
}
