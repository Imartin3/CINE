package dto;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Pelicula {
	 private String titulo;
	 private int duracion;
	 private int anio;
	 private int idPelicula;

	 public Pelicula(String titulo, int anio, int duracion, int idPelicula) {
		  this.titulo = titulo;
		  this.duracion = duracion;
		  this.anio = anio;
		  this.idPelicula = idPelicula;
	 }

	 public Pelicula(String titulo, int anio, int duracion) {
		  this.titulo = titulo;
		  this.duracion = duracion;
		  this.anio = anio;
	 }

	 public Pelicula(ResultSet rs){
		  try {
				this.idPelicula = rs.getInt("pelicula_id");
				this.titulo = rs.getString("titulo");
				this.duracion = rs.getInt("duracion");
				this.anio = rs.getInt("anio");

		  } catch (SQLException e){
				e.printStackTrace();
		  }
	 }

	 //Getters y Setters
	 public String getTitulo() {
		  return titulo;
	 }
	 public void setTitulo(String titulo) {
		  this.titulo = titulo;
	 }
	 public int getAnio() {
		  return anio;
	 }
	 public void setAnio(int anio) {
		  this.anio = anio;
	 }
	 public int getDuracion() {
		  return duracion;
	 }
	 public void setDuracion(int duracion) {
		  this.duracion = duracion;
	 }
	 public int getIdPelicula() {
		  return idPelicula;
	 }
public void setIdPelicula(int idPelicula) {
		  this.idPelicula = idPelicula;
	 }


	 //Metodo toString

	 @Override
	 public String toString() {
		  return "Pelicula{" +
					 "titulo='" + titulo + '\'' +
					 ", duracion=" + duracion+'\"' +
					 ", anio=" + anio +
					 '}';
	 }
}
