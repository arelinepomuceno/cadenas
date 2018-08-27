package cade;
import java.util.Scanner;
public class apellido {
public static void main(String [] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("INGRESA UN NOMBRE: ");
String cadena = scanner.nextLine();
cadena =  cadena.toUpperCase();
System.out.println("LOS CARACTERES QUE TIENE SON : "+cadena.length());
if(cadena.contains(" "));
cadena = cadena.substring(0,cadena.length());
System.out.println(cadena);
String [] arrayString = cadena.split(" ");
int pocisionName = 1;
int pocision = arrayString.length -2;
String nombre1 = arrayString[pocisionName];
String apellidoPaterno= arrayString[pocision];
System.out.print("EL PRIMER APELLIDO ES: " + apellidoPaterno +"\n");
System.out.print("EL SEGUNDO NOMBRE ES: " + nombre1);
}
}