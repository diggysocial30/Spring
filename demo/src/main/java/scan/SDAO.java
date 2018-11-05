package scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SDAO {
	
	@Autowired
	private SConnection jdbcConnection;

	public SConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(SConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
