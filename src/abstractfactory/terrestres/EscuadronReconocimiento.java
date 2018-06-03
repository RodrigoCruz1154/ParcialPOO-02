package abstractfactory.terrestres;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */

public class EscuadronReconocimiento implements Terrestre{

    @Override
    public void reclutar() {
        System.out.println("¡A la orden mi comandante!");
        int salud = 800,ataque = 60,defensa = 30,ataqueTorres = 40;
        System.out.println("Salud: " + salud + "\n" + "Ataque: " + ataque + "\n" + "Defensa: " + defensa + "\n" + "Daño a torres: " + ataqueTorres);
    }
    
}
