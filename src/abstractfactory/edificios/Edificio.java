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
public interface Edificio {
    void build(int iteracion, String nombre, String bando,String nombre2,String bando2);
    void buildEdificio();
    void usoEdificio(int unidad);
}
