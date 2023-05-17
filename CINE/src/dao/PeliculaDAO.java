package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import bd.Conexion;
import dto.Actor;
import dto.Pelicula;

public class PeliculaDAO {
	 private final static Conexion connector = new Conexion();
	 public static void create(Pelicula pelicula) {
		  try {

				String sql = "INSERT INTO peliculas VALUES (?, ?, ?, ?)";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, 0);
				stmt.setString(2, pelicula.getTitulo());
				stmt.setInt(3, pelicula.getAnio());
				stmt.setInt(4, pelicula.getDuracion());

				stmt.execute();
				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }

	 public void update(Pelicula pelicula) {
		  try {

				String sql = "UPDATE peliculas SET titulo = ?, anio = ?, duracion = ?  WHERE pelicula_id = ?";
				PreparedStatement stmt = connector.prepareStatement(sql);

				stmt.setString(1, pelicula.getTitulo());
				stmt.setInt(2, pelicula.getAnio());
				stmt.setInt(3, pelicula.getDuracion());
				stmt.setInt(4, pelicula.getIdPelicula());


				stmt.execute();
				connector.cerrarConexion();
		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }

	 public void delete(int idPelicula) {
		  try {

				String sql = "DELETE FROM actor WHERE (idActor = ?)";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, idPelicula);

				stmt.executeUpdate();
				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }

	 public Pelicula findById(int idPelicula) {
		  try {

				String sql = "SELECT * FROM peliculas WHERE pelicula_id = ?";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, idPelicula);

				ResultSet rs = stmt.executeQuery();

				Pelicula res = null;
				while (rs.next()){
					 res = new Pelicula(rs);
				}

				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
		  return null;
	 }
}
