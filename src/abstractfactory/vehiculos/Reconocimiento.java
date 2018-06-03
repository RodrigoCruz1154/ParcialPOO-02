package abstractfactory.vehiculos;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Reconocimiento implements Vehiculo{

    @Override
    public void comprar() {
        System.out.println("¡Nueva unidad de reconocimiento adquirida!");
        int vida = 1500, ataque = 700;
    }
    
}
