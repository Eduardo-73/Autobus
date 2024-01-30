/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package autobus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Autobus {

    private int id;
    private Asientos[][] matrix;
    private static int contador;
    private final int FILA = 12;
    private final int COLUMNA = 4;

    public Autobus() {
        this.matrix = new Asientos[FILA][COLUMNA];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Asientos();
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Asientos[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Asientos[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            if (i >= 0 && i < 9) {
                System.out.print("\nFila: 0" + (i + 1) + " -> ");
            } else {
                System.out.print("\nFila: " + (i + 1) + " -> ");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 2) {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }
                if (j > -1 && j < 10) {
                    System.out.print("Asiento:[0" + (j + 1) + "]");
                    System.out.print("[" + matrix[i][j] + "]");
                } else {
                    System.out.print("Asiento:[" + (j + 1) + "]");
                    System.out.print("[" + matrix[i][j] + "]");
                }
            }
        }
        System.out.println();
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autobus other = (Autobus) obj;
        return this.id == other.id;
    }

}
