/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobus;

/**
 *
 * @author eduar
 */
public class Asientos {

    private int[][] matriz;
    private Estado estadoAsientos;
    private final int FILA = 12;
    private final int ASIENTO = 4;

    public Asientos() {
        this.matriz = new int[FILA][ASIENTO];
        this.estadoAsientos = Estado.LIBRE;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public Estado getEstadoAsiento() {
        return estadoAsientos;
    }

    public void setEstadoAsiento(Estado estadoAsiento) {
        this.estadoAsientos = estadoAsiento;
    }
}
