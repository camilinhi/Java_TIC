public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for(int i=0; i<100; i++){
            System.out.println(i);
        }

        int variable=0;
        while(variable<100){
            System.out.println("Valor de la vareiable: " + variable);
            variable++;

        }

        do{
            System.out.println("Valor de la vareiable: " + variable);
            variable++;
        }while(variable<200);


        int variable2=4;
        System.out.println(variable2++);
        System.out.println(variable2);

        /* i++ primero se utiliza la variable 
         y luego se incrementa su valor 
         */

        int a=4;
        int b=a++;
        System.out.println(a);
        System.out.println(b);


         /* ++i primero se incrementa su valor
         y luego se utiliza la variable 
         */


        int c=5;
        int d=++c;
        System.out.println(c);
        System.out.println(d);

        //a=a+b
        a+=b;
        System.out.println(a);


        if ((5==5)|| (5<4)){
            System.out.println("Correcto");
        }

        if ((5 == 5) && (5>4)) {
            System.out.println("correcto");
        }


        



    }
}
