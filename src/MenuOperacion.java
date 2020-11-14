import java.util.*;

public class MenuOperacion {

    private static void menu() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Opcion 1: Sumar 2 numeros");
        System.out.println("Opcion 2: Restar 2 numeros");
        System.out.println("Opcion 3: Multiplicar 2 numeros");
        System.out.println("Opcion 4: Dividir 2 numeros");
        System.out.println("Opcion 5: Fin del programa");
        System.out.print("Introduce una opcion del 1 al 5: ");
        int opcion = consola.nextInt();

        switch (opcion){
            case 1:
                //suma();
                System.out.println("Funcion suma");
                break;
            case 2:
                //resta();
                System.out.println("Funcion resta");
                break;
            case 3:
                //multiplicar();
                System.out.println("Funcion Multiplicar");
                break;
            case 4:
                //dividir();
                System.out.println("Funcion Dividir");
            case 5:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Selecciona un numero entre 1 y 5.");
                menu();
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
