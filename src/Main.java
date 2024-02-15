import java.util.Scanner;

public class Main {
    public static Scanner inicio;
    public static double a;
    public static double  b;
    public static double c;


    public static void main(String[] args) {

        System.out.println("Bienvenido a tu calculadora");
        System.out.println("Selecciona la operación a realizar");
        int i = 0;
        do {
            System.out.println();

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");


            try {
                inicio = new Scanner(System.in);
                i = inicio.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
            }

            switch (i) {
                case 1:
                    suma();
                    break;

                case 2:
                    resta();
                    break;

                case 3:
                    multiplicacion();
                    break;

                case 4:
                    division();
                    break;
            }
        } while (i != 4);
    }
        public static void suma(){
            Scanner numero = new Scanner(System.in);
            System.out.println("Por favor ingrese un numero");
            a = numero.nextDouble();
            System.out.println("Por favor ingrese un numero");
            b = numero.nextDouble();
            c=a+b;
            System.out.println("El resultado es: " + c );

        }
        public static void resta(){
            Scanner numero = new Scanner(System.in);
            System.out.println("Por favor ingrese un numero");
            a = numero.nextDouble();
            System.out.println("Por favor ingrese un numero");
            b = numero.nextDouble();
            c=a-b;
            System.out.println("El resultado es: " + c );


        }
        public static void multiplicacion(){
            Scanner numero = new Scanner(System.in);
            System.out.println("Por favor ingrese un numero");
            a = numero.nextDouble();
            System.out.println("Por favor ingrese un numero");
            b = numero.nextDouble();
            c=a*b;
            System.out.println("El resultado es: " + c );

        }

        public static void division(){

        try {
            Scanner numero = new Scanner(System.in);
            System.out.println("Por favor ingrese numerador");
            a = numero.nextDouble();
            System.out.println("Por favor ingrese denominador");
            b = numero.nextDouble();
            c = a / b;
            System.out.println("El resultado es: " + c);
        }catch (ArithmeticException ae){
            System.out.println("Error, digite un denominador diferente de 0 ");
            System.out.println();
            division();
        }



    }
}

