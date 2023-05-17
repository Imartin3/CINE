package interf;
import java.util.Scanner;

public class Mainmenu {
	 private static final Scanner sc = new Scanner(System.in);

	 public static void mostrarMenuPrincipal() {
		  System.out.println("----- Menú Principal -----");
		  System.out.println("1. Actor");
		  System.out.println("2. Película");
		  System.out.println("3. Participación");
		  System.out.println("0. Salir");
		  System.out.print("Seleccione una opción: ");
	 }
	 public static void mostrarMenuActores() {
		  System.out.println("----- Menú Actores -----");
		  System.out.println("1. Agregar Actor");
		  System.out.println("2. Modificar Actor");
		  System.out.println("3. Eliminar Actor");
		  System.out.println("0. Volver al Menú Principal");
		  System.out.print("Seleccione una opción: ");
	 }

	 public static void mostrarMenuPeliculas() {
		  System.out.println("----- Menú Películas -----");
		  System.out.println("1. Agregar Película");
		  System.out.println("2. Modificar Película");
		  System.out.println("3. Eliminar Película");
		  System.out.println("0. Volver al Menú Principal");
		  System.out.print("Seleccione una opción: ");
	 }

	 public static void mostrarMenuParticipaciones() {
		  System.out.println("----- Menú Participaciones -----");
		  System.out.println("1. Agregar Participación");
		  System.out.println("2. Modificar Participación");
		  System.out.println("3. Eliminar Participación");
		  System.out.println("0. Volver al Menú Principal");
		  System.out.print("Seleccione una opción: ");
	 }

	 public static int obtenerOpcion() {
		  return sc.nextInt();
	 }
}