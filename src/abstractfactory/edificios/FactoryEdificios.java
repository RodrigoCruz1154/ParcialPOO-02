/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

import abstractfactory.AbstractFactory;
import abstractfactory.militantes.Militante;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class FactoryEdificios implements AbstractFactory{

    @Override
    public Edificio getEdificio(int type) {
        System.out.println("Escriba el tipo de edificación que desea: \nEscribe (1) si deseas crear una torreta.\nEscribe (2) si deseas añadir un centro de entrenamiento para tus tropas terrestres.\nEscribe (3) si deseas crear un taller para tus vehículos.\n");
        switch(type){
            case 1:
                return new Torretas();
            case 2:
                return new Entrenamiento();
            case 3:
                return new Taller();
            default:
                break;
        }
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
        return null;
    }
    
}
