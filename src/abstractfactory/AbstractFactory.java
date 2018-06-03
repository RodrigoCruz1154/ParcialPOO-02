package abstractfactory;

import abstractfactory.edificios.Edificio;
import abstractfactory.militantes.Militante;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */

public interface AbstractFactory {
    Edificio getEdificio();
    Militante getMilitante();
    Terrestre getTerrestre();
    Vehiculo getVehiculo();
}
