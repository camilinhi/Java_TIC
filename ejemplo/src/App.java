import java.util.List;
import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Que pasó pues mi amor?");
    

    // Este es un comentario de línea
    /*Este es un comentario de bloque Todo entre estos símbolos es ignorado*/

    /**
     * Este es un comentario de documentación.
     * Se usa para el Javadoc de nuestro proyecto
     **/


    /*Las sentencias acaban con punto y coma(;).
    Este carácter separa una sentencia de lasiguiente */
     
     int i=1;
     System.out.println("El primer programa");
     
     /*Todas las variables han de declararse antes de usarlas */

     int x=0;
     String nombre="Angel";
     double a=3.5;
     boolean bNuevo=true;
     int[]datos;


     var example="example";
     var aa=3.5;
     var list=List.of(1,2,3);

     // \t tabulador 
     System.out.println("Hola, \t mundo");

     // \b retroceso 
     System.out.println("Hola, \b mundo");

     // \n nueva liínea 
     System.out.println("Hola, \n mundo");

     // \r retorno
     System.out.println("Hola, \r mundo");

     // \' comilla simple 
     System.out.println("Hola, \' mundo");

     // \" comilla doble 
     System.out.println("Hola, \" mundo");

     // \\ Barra invertida 
     System.out.println("Hola, \\ mundo");



     Scanner sc= new Scanner(System.in);
     System.out.println("Por favor ingrese su nombre");
     String nombre1 = sc.nextLine();
     System.out.println("Por favor ingrese su cédula");
     String cedula = sc.nextLine();


    }
}
