package bancodedados.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private String host;
	private String porta;
	private String dbname;
	private String dbuser;
	private String dbpass;
	
	public Conexao (String host, String porta, String dbname, String dbuser, String dbpass) {
		
		this.host = host;
		this.porta = porta;
		this.dbname = dbname;
		this.dbuser = dbuser;
		this.dbpass = dbpass;
	}
	
	public Connection getConnection() {
		String strConn = "jdbc:mysql://"+this.host+":"+this.porta+"/"+this.dbname;
		Connection connection;
		
		
		return null;
	}
}
