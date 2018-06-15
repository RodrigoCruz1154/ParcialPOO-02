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
    public Edificio getEdificio(int type);
    public Militante getMilitante(int type);
    public Terrestre getTerrestre(int type);
    public Vehiculo getVehiculo(int type);
}
