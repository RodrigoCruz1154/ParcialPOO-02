/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.vehiculos;

import abstractfactory.AbstractFactory;
import abstractfactory.edificios.Edificio;
import abstractfactory.militantes.Militante;
import abstractfactory.terrestres.Terrestre;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class FactoryVehiculos implements AbstractFactory{

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
        return null;
    }

    @Override
    public Vehiculo getVehiculo(int type) {
        System.out.println("Escriba el vehículo que desea crear: \n1.Crear una unidad de Artillería.\n2.Crear una unidad de Reconocimiento.\n3.Crear un Tanque.");
        switch(type){
            case 1:
                return new Artilleria();
            case 2:
                return new Reconocimiento();
            case 3:
                return new Tanque();
            default:
                System.err.println("Ingrese un dato válido.");
        }
        return null;
    }
    
}
