/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.terrestres;

import abstractfactory.AbstractFactory;
import abstractfactory.edificios.Edificio;
import abstractfactory.militantes.Militante;
import abstractfactory.vehiculos.Vehiculo;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class FactoryTerrestres implements AbstractFactory{

    @Override
    public Edificio getEdificio(int type) {
        return null;
    }

    @Override
    public Militante getMilitante(int type) {
        return null;
    }

    @Override
    public Terrestre getTerrestre(int type) {    
        switch(type){
            case 1:
                return new Infanteria();
            case 2:
                return new EscuadronReconocimiento();
            case 3:
                return new InfanteriaMecanizada();
            default:
                System.err.println("Ingrese un dato válido.");
        }
        return null;
    }

    @Override
    public Vehiculo getVehiculo(int type) {
        return null;
    }
    
}
