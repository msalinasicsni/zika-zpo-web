package ni.org.ics.zpo.service;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;


import ni.org.ics.zpo.users.model.UserSistema;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("dashboardService")
@Transactional
public class DashboardService {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Object> tamizajesDia(UserSistema usuario, long date1, long date2){
		// Retrieve session from Hibernate
		Session session = sessionFactory.getCurrentSession();
		date2 = date2 + (24*60*60*1000-1000);
		Timestamp timeStampInicio = new Timestamp(date1);
		Timestamp timeStampFinal = new Timestamp(date2);
		// Create a Hibernate query (HQL)
        Query query = session.createQuery("select zpo00.scrVisitDate as fecha, "+
        		"count(zpPre.cs) as total, " +
        		"sum(case zpPre.cs when 'Socrates Flores' then 1 else 0 end) as CSSFV, " +
        		"sum(case zpPre.cs when 'Villa Libertad' then 1 else 0 end) as CSVL, " +
        		"sum(case zpPre.cs when 'Francisco Buitrago' then 1 else 0 end) as CSFB, " +
        		"sum(case zpPre.cs when 'Edgard Lang' then 1 else 0 end) as CSEL " +
        		"FROM Zpo00Screening zpo00 , ZpoPreScreening zpPre " +
        		"where zpo00.preScreenId = zpPre.recId and zpo00.pasive = '0' and zpo00.preScreenId in (select recId from ZpoPreScreening zpPre where zpPre.pasive = '0' and zpPre.cs in " +
        		"(Select uc.centro.cs from UserCenter uc where uc.user.username =:usuarioactual and uc.pasive = '0')) "+
        		"and zpo00.scrVisitDate between :fechaInicio and :fechaFinal group by zpo00.scrVisitDate order by zpo00.scrVisitDate");
		query.setTimestamp("fechaInicio", timeStampInicio);
		query.setTimestamp("fechaFinal", timeStampFinal);	
		query.setParameter("usuarioactual",usuario.getUsername());
        // Retrieve all
		return  query.list();
	}
	
}
