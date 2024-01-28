/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package asientos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Autobus {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] bus = new String[12][4];
        rellenarMatriz(bus);
        seleccionarAsiento(bus);
    }

    private static void rellenarMatriz(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = "*";
            }
        }
    }

    private static void mostrarMatriz(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 2) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println("\n");
    }

    private static void seleccionarAsiento(String[][] matrix) {
        String minusvalida = "";
        boolean repetir = true;
        int x = 0, y = 0;
        mostrarMatriz(matrix);
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
                    System.out.println("Introduce la columna en la que te quieres sentar: ");
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
                        matrix[x - 2][y - 2] = "X";
                        matrix[x - 2][y - 1] = "X";
                        matrix[x - 1][y - 2] = "X";
                        matrix[x - 1][y - 1] = "O";
                        matrix[x][y - 1] = "X";
                        matrix[x][y - 2] = "X";
                    }
                    case "No", "no" -> {
                        matrix[x - 1][y - 1] = "O";
                    }
                }
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Debes de introducir si o no");
                teclado.nextLine();
            }
        } while (repetir);
        mostrarMatriz(matrix);
    }
}
