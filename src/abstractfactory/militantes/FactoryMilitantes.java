/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.militantes;

import abstractfactory.AbstractFactory;
import abstractfactory.edificios.Edificio;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class FactoryMilitantes implements AbstractFactory{

    @Override
    public Edificio getEdificio(int type) {
        return null;
    }

    @Override
    public Militante getMilitante(int type) {
                System.out.println("Elija su bando: \n1.Blue Earth.\n2.Green Comet.\n3.Orange Moon.\n4.Yellow Star.");
        switch(type){
            case 1:
                return new BlueEarth();
            case 2:
                return new GreenComet();
            case 3:
                return new OrangeMoon();
            case 4:
                return new YellowStar();
            default:
                System.err.println("Ingrese un dato válido.");
        }
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
