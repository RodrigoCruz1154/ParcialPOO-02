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
        
        switch(type){
            case 1:
                return new Torretas();
            case 2:
                return new Entrenamiento();
            case 3:
                return new Taller();
            case 4:
                return new BaseOperaciones();
            case 5:
                return new Canteria();
            case 6:
                return new Carpinteria();
            case 7:
                return new Banco();
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
