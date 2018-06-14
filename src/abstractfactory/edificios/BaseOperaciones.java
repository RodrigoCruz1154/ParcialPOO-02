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
import jugador.Jugador1;

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
    public void build(int fase, String nombre, String bando) {
        int vida = 5500, edificios = 0, terrestres = 0, vehiculos = 0;
        Jugador1 jugador = new Jugador1(nombre, bando);
        jugador.setNombre(nombre);
        if (fase == 0) {
            System.out.println("Su base de operaciones ha sido creada.");
            System.out.println("\nVida actual: " + vida + "\nEdificios creados actualmente: " + edificios + "\nUnidades terrestres creadas: " + terrestres + "\nVehiculos creados: " + vehiculos);
        }
        fase++;
        System.out.println("Fase: " + fase);
    }

}
