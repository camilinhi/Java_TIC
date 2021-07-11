import java.util.Scanner;


public class App1 {
    public static void main(String[] args) throws Exception {
    var sc=new Scanner(System.in);
    
    System.out.println("ingrese un numero entero: ");
    var numero=sc.nextInt();
    System.out.println("El doble de " + numero + " es: " + numDob(numero));
    System.out.println(numTri(numero));
    
  /*
    System.out.println("ingrese un numero de grados centigrados que tenga: ");
    var grados=sc.nextInt();
    System.out.print("Los grados Fahrenheit de " + grados + " son: " + (32+(9*grados/5)));
    */

  }
  //Si especifico que es un entero el return tambien lo sera
  public static int numDob(int numero){
    return numero*2;
  }

  public static String numTri(int numero){
    return "El triple de " + numero + " es: " + numero*3;
  }

}


