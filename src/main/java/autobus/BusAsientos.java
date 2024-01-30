/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class BusAsientos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Asientos asiento = new Asientos();
        Autobus bus = new Autobus();
        String txt = """
                     *********************
                     1.- Mostrar asientos
                     2.- Seleccionar asiento
                     3.- Salir
                     ********************
                     """;
        int seleccionMenu = 0;
        boolean repetir = true;
        do {
            do {
                try {
                    System.out.print("\n" + txt + "\nSeleccione: ");
                    seleccionMenu = teclado.nextInt();
                    repetir = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Introduce uno de los campos"
                            + " prueba con 1, 2 o 3");
                    teclado.nextLine();
                }
            } while (repetir);
            switch (seleccionMenu) {
                case 1 -> {
                    System.out.println(bus);
                }
                case 2 -> {
                    MetodosAutobus.seleccionarAsiento(bus);
                }
            }
        } while ((seleccionMenu < 1
                && seleccionMenu > 2) || (seleccionMenu != 3));
    }
}
