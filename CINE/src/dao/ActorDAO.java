package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bd.Conexion;
import dto.Actor;

public class ActorDAO {
	 private final static Conexion connector = new Conexion();
	 public static void create(Actor actor) {
		  try {

				String sql = "INSERT INTO actores VALUES (?, ?, ?, ?, ?)";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, 0);
				stmt.setString(2, actor.getNombre());
				stmt.setString(3, actor.getApellido());
				stmt.setDate(4, actor.getFechaNacimiento());
				stmt.setString(5, actor.getNacionalidad());

				stmt.execute();
				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }

	 }

	 public void update(Actor actor) {
		  try {

				String sql = "UPDATE actores SET nombre = ?, apellido = ?, anio_nacimiento = ?, nacionalidad = ? WHERE actor_id = ?";
				PreparedStatement stmt = connector.prepareStatement(sql);

				stmt.setString(1, actor.getNombre());
				stmt.setString(2, actor.getApellido());
				stmt.setDate(3, actor.getFechaNacimiento());
				stmt.setString(4, actor.getNacionalidad());
				stmt.setInt(5, actor.getIdActor());


				stmt.execute();
				connector.cerrarConexion();
		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }

	 public void delete(int idActor) {
		  try {

				String sql = "DELETE FROM actor WHERE (idActor = ?)";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, idActor);

				stmt.executeUpdate();
				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
	 }

	 public Actor findById(int idActor){
		  try {

				String sql = "SELECT * FROM actores WHERE actor_id = ?";

				PreparedStatement stmt = connector.prepareStatement(sql);
				stmt.setInt(1, idActor);

				ResultSet rs = stmt.executeQuery();

				Actor res = null;
				while (rs.next()){
					 res = new Actor(rs);
				}

				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
		  return null;
	 }

	 public List<Actor> findAll() {
		  try {

				String sql = "SELECT * FROM actores";

				PreparedStatement stmt = connector.prepareStatement(sql);

				ResultSet rs = stmt.executeQuery();

				List<Actor> res = null;
				while (rs.next()){
					 res.add(new Actor(rs));
				}

				connector.cerrarConexion();

		  } catch (SQLException e) {
				e.printStackTrace();
		  }
		  return null;

	 }

}
