/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

import static jugador.Jugar.AnsiCodeExample.ANSI_GREEN;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Torretas implements Edificio {

    @Override
    public void build(int iteracion, String nombre, String bando, String nombre2, String bando2) {
        System.out.println(ANSI_GREEN + "Construyendo, por favor espere..." + ANSI_RESET);
        System.out.println("-------------------------------------------");
    }

    @Override
    public boolean buildEdificio() {
        System.out.println(ANSI_GREEN + "Construyendo, por favor espere..." + ANSI_RESET);
        System.out.println("-------------------------------------------");
        return true;
    }

    @Override
    public void usoEdificio(int unidad) {
        System.out.println("-------------------------------------------");
        System.out.println(ANSI_GREEN + "¡Se ha creado una torreta!" + ANSI_RESET);
    }

    @Override
    public int getRecurso(int dia,int recurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
