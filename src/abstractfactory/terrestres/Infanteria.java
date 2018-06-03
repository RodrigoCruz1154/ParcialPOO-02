/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.terrestres;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Infanteria implements Terrestre{

    @Override
    public void reclutar() {
        System.out.println("¡A la orden mi comandante!");
        int salud = 400, ataque = 40, defensa = 10, ataqueTorres = 20;
        System.out.println("Salud: " + salud + "\n" + "Ataque: " + ataque + "\n" + "Defensa: " + defensa + "\n" + "Daño a torres: " + ataqueTorres);
    }
    
}
