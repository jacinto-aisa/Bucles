import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner escaner = new Scanner(System.in);
        /*
        System.out.print("Introducir la linea a repetir: ");
        String lineaARepetir = escaner.nextLine();
        System.out.println();
        System.out.print("NumeroRepeticiones: ");
        int cantidadDeRepeticiones = escaner.nextShort();
        while (cantidadDeRepeticiones > 0)
        {
            System.out.println(lineaARepetir);
            cantidadDeRepeticiones--;
        }
*/

        byte opcion = 9;
        do {
            System.out.println("Menu");
            System.out.println("1- Hola");
            System.out.println("2- Adios");
            System.out.println("Introduzca opcion");
            opcion = escaner.nextByte();
        } while (opcion != 1 && opcion!=2);
        if (opcion == 1)
            System.out.println("Hola");
        else
            System.out.println("Adios");
    }
}