/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.militantes.Militante;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class BaseOperaciones implements Edificio {

    AbstractFactory enBatalla;
    ArrayList<Edificio> edificios = new ArrayList<>();
    ArrayList<Militante> militantes = new ArrayList<>();
    ArrayList<Terrestre> terrestres = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    @Override
    public void build() {
        System.out.println("Su base de operaciones ha sido creada.\n¡Defiéndala como si su vida dependiera de eso!");
        int vida = 5500;
        System.out.println("Vida actual: " + vida);

        System.out.println("Ahora deberías elegir una opción: ");
    }

}
