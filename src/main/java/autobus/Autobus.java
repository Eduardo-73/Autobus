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
    private Asientos posicion;
    private static int contador;

    public Autobus(Asientos posicion) {
        this.id = contador++;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Asientos getPosicion() {
        return posicion;
    }

    public void setPosicion(Asientos posicion) {
        this.posicion = posicion;
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
