package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bd.Conexion;
import dto.Participacion;


public class ParticipacionDAO {
	 private final static Conexion connector = new Conexion();
	 public static void create(Participacion participacion) {
		  try {

				String sql = "INSERT INTO actor VALUES (?, ?)";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, participacion.getActor().getIdActor());
				stmt.setInt(2, participacion.getPelicula().getIdPelicula());


				stmt.execute();
				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }

	 public void update(Participacion participacion) {
		  try {

					 String sql = "UPDATE participaciones SET actor_id = ?, pelicula_id = ? WHERE (actor_id, pelicula_id) = ?";
				PreparedStatement stmt = connector.prepareStatement(sql);

				stmt.setInt(1, participacion.getActor().getIdActor());
				stmt.setInt(2, participacion.getPelicula().getIdPelicula());

				stmt.execute();
				connector.cerrarConexion();
		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }

	 public void delete(int idActor, int idPelicula) {
		  try {

				String sql = "DELETE FROM participaciones WHERE (actor_id, pelicula_id) = ?";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, idActor);
				stmt.setInt(2, idPelicula);

				stmt.executeUpdate();
				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }


}

