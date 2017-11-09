package ni.org.ics.zpo.service;

import ni.org.ics.zpo.domain.Zpo05Delivery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Servicio para el objeto Zpo05Delivery
 * Created by FIRSTICT on 24/10/2017.
 * V1.0
 */
@Service("zpo05DeliveryService")
@Transactional
public class Zpo05DeliveryService {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Retorna todos los formularios Zpo05Delivery
     * @return una lista de Zpo05Delivery
     */
    @SuppressWarnings("unchecked")
    public List<Zpo05Delivery> getZpo05Delivery(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo05Delivery");
        return query.list();
    }
    
    /**
     * Retorna todos los formularios Zpo05Delivery
     * @return una lista de Zpo05Delivery
     */
    @SuppressWarnings("unchecked")
    public List<Zpo05Delivery> getZpo05DeliveryByUser(String username){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo05Delivery zpo06 where zpo06.pasive = '0' and zpo06.recordId in (select zpo00.recordId from Zpo00Screening zpo00 where zpo00.pasive = '0')");
        //query.setParameter("usuarioactual",username);
        return query.list();
    }

    /**
     * Retorna un formulario Zpo05Delivery
     * @param recordId del Zpo05Delivery a retornar
     * @return un Zpo05Delivery
     */
    public Zpo05Delivery getZpo05Delivery(String recordId){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Zpo05Delivery where recordId = :recordId");
        query.setParameter("recordId",recordId);
        return (Zpo05Delivery)query.uniqueResult();
    }

    /**
     * Guardar un formulario Zpo05Delivery
     * @param zpo05Delivery a guardar
     */
    public void saveZpo05Delivery(Zpo05Delivery zpo05Delivery){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(zpo05Delivery);
    }
}
