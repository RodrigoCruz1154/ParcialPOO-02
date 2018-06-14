/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Canteria implements Edificio{

    @Override
    public void build(int iteracion, String nombre, String bando, String nombre2, String bando2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificio buildEdificio(int oro, int faseExt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void usoEdificio(Edificio edificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
