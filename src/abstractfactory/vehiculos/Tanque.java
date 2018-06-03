package abstractfactory.vehiculos;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Tanque implements Vehiculo{

    @Override
    public void comprar() {
        System.out.println("¡Nueva unidad tanque adquirida!");
        int vida = 8000, ataque = 900, ataqueTorres=1000;
    }
    
}
