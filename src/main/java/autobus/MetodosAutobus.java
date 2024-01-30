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

    public static void rellenarMatriz(Asientos matrix) {
        int contador = 0;
        for (int i = 0; i < matrix.getMatriz().length; i++) {
            for (int j = 0; j < matrix.getMatriz()[i].length; j++) {
                contador++;
                matrix.getMatriz()[i][j] = contador;
                matrix.getEstadoAsiento()[i][j] = Estado.LIBRE;
            }
        }
    }

    public static void mostrarMatriz(Autobus matrix) {
        for (int i = 0; i < matrix.getPosicion().getMatriz().length; i++) {
            if (i >= 0 && i < 9) {
                System.out.print("\nFila: 0" + (i + 1) + " -> ");
            } else {
                System.out.print("\nFila: " + (i + 1) + " -> ");
            }
            for (int j = 0; j < matrix.getPosicion().getMatriz()[i].length; j++) {
                if (j == 2) {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }
                if (matrix.getPosicion().getMatriz()[i][j] > 0
                        && matrix.getPosicion().getMatriz()[i][j] < 10) {
                    System.out.print("Asiento:[0" + matrix.getPosicion().getMatriz()[i][j]
                            + "]");
                    System.out.print("[" + matrix.getPosicion().getEstadoAsiento()[i][j] + "]");
                } else {
                    System.out.print("Asiento:[" + matrix.getPosicion().getMatriz()[i][j]
                            + "]");
                    System.out.print("[" + matrix.getPosicion().getEstadoAsiento()[i][j] + "]");
                }
            }
        }
        System.out.println();
    }

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
                        matrix.getPosicion().getEstadoAsiento()[x - 2][y - 1] = Estado.OCUPADO;
                        matrix.getPosicion().getEstadoAsiento()[x - 2][y - 2] = Estado.OCUPADO;
                        matrix.getPosicion().getEstadoAsiento()[x - 1][y - 2] = Estado.OCUPADO;
                        matrix.getPosicion().getEstadoAsiento()[x - 1][y - 1] = Estado.OCUPADO;
                    }
                    case "No", "no" -> {
                        matrix.getPosicion().getEstadoAsiento()[x - 1][y - 1] = Estado.OCUPADO;
                    }
                }
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Debes de introducir si o no");
                teclado.nextLine();
            }
        } while (repetir);
    }
}
