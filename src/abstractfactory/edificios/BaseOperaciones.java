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
public class BaseOperaciones implements Edificio{
    @Override
    public void build() {
        System.out.println("Su base de operaciones ha sido creada.\n¡Defiéndala como si su vida dependiera de eso!");
        int vida=5500;
        System.out.println("Vida: "+vida);
    }
    
}
