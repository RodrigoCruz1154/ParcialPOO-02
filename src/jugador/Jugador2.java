/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Jugador2 {
    private String nombre;
    private String bando;

    public Jugador2(String nombre, String bando) {
        this.nombre = nombre;
        this.bando = bando;
    }

    public Jugador2() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBando() {
        return bando;
    }

    public void setBando(String bando) {
        this.bando = bando;
    }
}
