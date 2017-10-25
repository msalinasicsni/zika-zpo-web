package ni.org.ics.zpo.domain.audit;

public interface Auditable {
	
	public boolean isFieldAuditable(String fieldname);

}
