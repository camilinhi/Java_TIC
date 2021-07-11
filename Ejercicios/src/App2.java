import java.util.Scanner;

class App2 {
    public static void main(String[] args) throws Exception {
    var sc=new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");

    var numero= sc.nextInt();
    var respuesta=valiNum(numero);
    System.out.println(respuesta);


  }

  public static String valiNum(int numero){
    // condicional ?=if, :=else
    return (numero%2 == 0 ? numero + " es par ": numero + " es impar");
    //return (numero%2 != 0 ? numero + " es impar ": numero + " es par");
  }



}