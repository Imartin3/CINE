package dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Participacion {
	 private int idParticipacion;
	 private Pelicula idPelicula;
	 private Actor idActor;

	 public Participacion(Actor idActor, Pelicula idPelicula, int idParticipacion) {
		  this.idPelicula = idPelicula;
		  this.idActor = idActor;
		  this.idParticipacion = idParticipacion;
	 }

	 public Participacion(Actor idActor, Pelicula idPelicula) {
		  this.idPelicula = idPelicula;
		  this.idActor = idActor;
	 }

	 //Getters y Setters
	 public int getIdParticipacion() {
		  return idParticipacion;
	 }
	 public void setIdParticipacion(int idParticipacion) {
		  this.idParticipacion = idParticipacion;
	 }
	 public Pelicula getPelicula() {
		  return idPelicula;
	 }
	 public void setIdPelicula(Pelicula idPelicula) {
		  this.idPelicula = idPelicula;
	 }
	 public Actor getActor() {
		  return idActor;
	 }
	 public void setIdActor(Actor idActor) {
		  this.idActor = idActor;
	 }

	 //Metodo toString

	 @Override
	 public String toString() {
		  return "Participacion{" +
					 "idPelicula=" + idPelicula +
					 ", idActor=" + idActor +
					 '}';
	 }
}
