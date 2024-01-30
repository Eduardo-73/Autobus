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

    private int id;
    private Estado estadoAsientos;
    private static int contador;

    public Asientos() {
        this.id = contador++;
        this.estadoAsientos = Estado.LIBRE;
    }

    public static Estado cambiarEstadoLibre() {
        return Estado.LIBRE;
    }

    public static Estado cambiarEstadoOcupado() {
        return Estado.OCUPADO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estado getEstadoAsiento() {
        return estadoAsientos;
    }

    public void setEstadoAsiento(Estado estadoAsiento) {
        this.estadoAsientos = estadoAsiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(estadoAsientos);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
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
        final Asientos other = (Asientos) obj;
        return this.id == other.id;
    }

}
