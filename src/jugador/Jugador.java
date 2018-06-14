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
public class Jugador {
    private String nombre,nombre1;
    private String bando,bando1;

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getBando1() {
        return bando1;
    }

    public void setBando1(String bando1) {
        this.bando1 = bando1;
    }

    public Jugador(String nombre, String bando) {
        this.nombre = nombre;
        this.bando = bando;
    }

    public Jugador() {}

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
