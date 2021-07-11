import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       

        //Condicional if
        Scanner sc= new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = sc.nextLine();


        if(nombre.equals("Camila")) {
            System.out.println("Verdadero");}
        else{
            System.out.println("Falso");}


        //Condicional switch

        Scanner sc1= new Scanner(System.in);
        System.out.println("Por favor ingrese un valor: ");
        /*
        Se puede ejecutar como un número o como un string
        pero en la funcion del switch tocaría especificar en case
        si es un numero o un string con comillas        
        */
        int valor_num = sc1.nextInt();
        String respuesta="";

        switch(valor_num) {
            case 1:
                //operacio
                respuesta="caso 1 correcto";
                break;
            case 2:
                //operacio
                respuesta="caso 2 correcto";
                break;
            default:
                respuesta="ninguna de las anteriores";

        }

        System.out.println(respuesta);






    
        
    
        






    }
}
