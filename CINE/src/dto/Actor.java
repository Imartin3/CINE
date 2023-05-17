package dto;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Actor {
	 private  String nombre;
	 private  String apellido;
	 private  Date fechaNacimiento;
	 private  String nacionalidad;
	 private  int  idActor;

	 public Actor(String nombre, String apellido, String nacimiento, String nacionalidad){
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.fechaNacimiento = Date.valueOf(nacimiento);
		  this.nacionalidad = nacionalidad;
		  this.idActor = 0;
	 }

	 public Actor(String nombre, String apellido, String nacionalidad, String nacimiento, int idActor){
		  this.nombre = nombre;
		  this.apellido = apellido;
		  this.fechaNacimiento = Date.valueOf(nacimiento);
		  this.nacionalidad = nacionalidad;
		  this.idActor = idActor;
	 }

	 public Actor(ResultSet rs){
		  try {
				this.idActor = rs.getInt("actor_id");
				this.nombre = rs.getString("nombre");
				this.apellido = rs.getString("apellido");
				this.fechaNacimiento = rs.getDate("anio_nacimiento");
				this.nacionalidad = rs.getString("nacionalidad");

		  } catch (SQLException e){
				e.printStackTrace();
		  }
	 }

	 //Getters y Setters

	 public  String getNombre() {
		  return nombre;
	 }
	 public void setNombre(String nombre) {
		  this.nombre = nombre;
	 }
	 public  String getApellido() {
		  return apellido;
	 }
	 public void setApellido(String apellido) {
		  this.apellido = apellido;
	 }
	 public  Date getFechaNacimiento() {
		  return fechaNacimiento;
	 }
	 public void setFechaNacimiento(String fechaNacimiento) {
		  this.fechaNacimiento = Date.valueOf(fechaNacimiento);
	 }
	 public  String getNacionalidad() {
		  return nacionalidad;
	 }
	 public void setNacionalidad(String nacionalidad) {
		  this.nacionalidad = nacionalidad;
	 }
	 public  int getIdActor() {
		  return idActor;
	 }
	 public void setIdActor(int idActor) {
		  this.idActor = idActor;
	 }

	 //Metodo toString
	 @Override
	 public String toString() {
		  return "Actor{" +
					 "nombre='" + nombre + '\'' +
					 ", fechaNacimiento='" + fechaNacimiento + '\'' +
					 ", nacionalidad='" + nacionalidad + '\'' +
					 ", idActor='" + idActor + '\'' +
					 '}';
	 }
}
