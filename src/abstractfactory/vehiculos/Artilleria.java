package abstractfactory.vehiculos;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Artilleria implements Vehiculo{

    @Override
    public void comprar() {
        System.out.println("¡Nueva unidad de artillería adquirida!");
        int vida=2000,ataque=800;
    }
    
}
