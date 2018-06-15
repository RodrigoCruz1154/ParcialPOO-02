package abstractfactory.terrestres;

import java.util.Random;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class EscuadronReconocimiento implements Terrestre {

    private int salud, fuerza, defensa, ataqueT;

    private Random aleatorio = new Random(System.nanoTime());

    public int getAtaqueT() {
        return ataqueT;
    }

    public void setAtaqueT(int ataqueT) {
        this.ataqueT = ataqueT;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public int atacar() {
                   int random = aleatorio.nextInt(2);
        return fuerza * random; 
    }

    @Override
    public void daño(int salud) {
        this.salud -= salud;
    }

}
