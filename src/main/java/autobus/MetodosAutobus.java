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
public class MetodosAutobus {

    public static Scanner teclado = new Scanner(System.in);

    public static void seleccionarAsiento(Autobus matrix) {
        String minusvalida = "";
        boolean repetir = true;
        int x = 0, y = 0;
        do {
            try {
                do {
                    System.out.println("Introduce la fila en la que te quieres sentar: ");
                    x = teclado.nextInt();
                    if (x < 1 || x > 12) {
                        System.out.println("Debes de introducir un número "
                                + "mayor o igual a 1 y menor o igual a 12");
                    }
                    repetir = false;
                } while (x < 1 || x > 12);
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un número entero");
                teclado.nextLine();
            }
        } while (repetir);
        do {
            try {
                do {
                    System.out.println("Introduce el nº de asiento en el "
                            + "que te quieres sentar: ");
                    y = teclado.nextInt();
                    if (y < 1 || y > 4) {
                        System.out.println("Debes de introducir un número "
                                + "mayor o igual a 1 y menor o igual a 4");
                    }
                    repetir = false;
                } while (y < 1 || y > 4);
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un número entero");
                teclado.nextLine();
            }
        } while (repetir);
        teclado.nextLine();
        do {
            try {
                System.out.println("¿La persona es minusvalida:? ");
                minusvalida = teclado.nextLine();
                switch (minusvalida) {
                    case "Si", "si" -> {
                        matrix.getMatrix()[x - 2][y - 1].setEstadoAsiento(Estado.OCUPADO);
                        matrix.getMatrix()[x - 2][y - 2].setEstadoAsiento(Estado.OCUPADO);
                        matrix.getMatrix()[x - 1][y - 2].setEstadoAsiento(Estado.OCUPADO);
                        matrix.getMatrix()[x - 1][y - 1].setEstadoAsiento(Estado.OCUPADO);
                    }
                    case "No", "no" -> {
                        matrix.getMatrix()[x - 1][y - 1].setEstadoAsiento(Estado.OCUPADO);
                    }
                }
                if (!(minusvalida.equalsIgnoreCase("si")
                        || minusvalida.equalsIgnoreCase("no"))) {
                    System.out.println("Debes introducir si o no");
                    repetir = true;
                } else {
                    repetir = false;
                }

            } catch (InputMismatchException ime) {
                System.out.println("Debes de introducir si o no");
                teclado.nextLine();
            }
        } while (repetir);
    }

}
