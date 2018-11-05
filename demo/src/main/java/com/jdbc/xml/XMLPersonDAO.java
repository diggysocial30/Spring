package com.jdbc.xml;

public class XMLPersonDAO {
	
	private XMLJDBCConnection jdbcConnection;

	public XMLJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(XMLJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
