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
import java.util.Scanner;

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
    Scanner input = new Scanner(System.in);

    @Override
    public void build() {
        System.out.println("Elija un bando por favor: ");        
        String bando = input.nextLine();
        System.out.println("Su base de operaciones ha sido creada.");
        int vida = 5500, edificios = 0, terrestres = 0, vehiculos = 0;
        System.out.println("Vida actual: " + vida + "\nEdificios creados actualmente: " + edificios + "\nUnidades terrestres creadas: " + terrestres + "\nVehiculos creados: " + vehiculos);

    }

}
