package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Conexion {
	 Connection con = null;
	 public Conexion() {
		  try {
				String url1 = "jdbc:mysql://localhost:3306/cine";
				String user = "root";
				String password = "";
				con = DriverManager.getConnection(url1, user, password);
				/*Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cine", "root", "");*/
		  } catch (Exception e) {
				System.err.println("Error: " + e);
		  }
	 }

	 public void cerrarConexion(){
		  try{
		  	con.close();
		  } catch (SQLException ex){
				System.out.println("ERROR al cerrar la conexión");
				ex.printStackTrace();
		  }
	 }

	 public PreparedStatement prepareStatement(String sql) {
		  PreparedStatement stmt = null;
		  try {
				stmt = con.prepareStatement(sql);
		  } catch (SQLException e) {
				e.printStackTrace();
		  }
		  return stmt;
	 }
}
