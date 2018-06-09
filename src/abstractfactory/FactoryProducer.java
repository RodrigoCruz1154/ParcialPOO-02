/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;
import abstractfactory.edificios.FactoryEdificios;
import abstractfactory.militantes.FactoryMilitantes;
import abstractfactory.terrestres.FactoryTerrestres;
import abstractfactory.vehiculos.FactoryVehiculos;

/**
 *
 * @author acer
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int type){
        switch(type){
            case 1:
                return new FactoryEdificios();
            case 2:
                return new FactoryMilitantes();
            case 3:
                return new FactoryTerrestres();
            case 4:
                return new FactoryVehiculos();
            default:
                System.err.println("Ingrese un dato válido.");
        }
        return null;
    }
}
