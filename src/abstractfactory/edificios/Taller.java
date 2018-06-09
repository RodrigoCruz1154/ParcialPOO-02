/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

/**
 *
 * @author acer
 */
public class Taller implements Edificio{
    @Override
    public void build() {
        System.out.println("Su taller ha sido construida.");
        int vida=4000;
        System.out.println("Vida: "+vida);
    }
}
