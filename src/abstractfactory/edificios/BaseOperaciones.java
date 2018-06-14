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
import jugador.Jugador;
import static jugador.Jugar.AnsiCodeExample.ANSI_BLUE;

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
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    Scanner input = new Scanner(System.in);

    private int vida, NumeroEdificios, NumeroUnidadesTerrestres, NumeroVehiculos;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNumeroEdificios() {
        return NumeroEdificios;
    }

    public void setNumeroEdificios(int NumeroEdificios) {
        this.NumeroEdificios = NumeroEdificios;
    }

    public int getNumeroUnidadesTerrestres() {
        return NumeroUnidadesTerrestres;
    }

    public void setNumeroUnidadesTerrestres(int NumeroUnidadesTerrestres) {
        this.NumeroUnidadesTerrestres = NumeroUnidadesTerrestres;
    }

    public int getNumeroVehiculos() {
        return NumeroVehiculos;
    }

    public void setNumeroVehiculos(int NumeroVehiculos) {
        this.NumeroVehiculos = NumeroVehiculos;
    }

    @Override
    public void buildJ1(int identificador, String nombre, String bando) {
        jugador1.setNombre(nombre);
        jugador1.setBando(bando);
        System.out.println(jugador1.getBando() + ", tu base de operaciones ha sido creada.");
        if(jugador1.getBando().equals("Earth")){
            BaseOperaciones base = new BaseOperaciones();
            base.setVida(5500);
        }
        if(jugador1.getBando().equals("Comet")){
            BaseOperaciones base = new BaseOperaciones();
            base.setVida(5000);
        }
        if(jugador1.getBando().equals("Orange")){
            BaseOperaciones base = new BaseOperaciones();
            base.setVida(5000);
        }
        if(jugador1.getBando().equals("Yellow")){
            BaseOperaciones base = new BaseOperaciones();
            base.setVida(5000);
        }
    }

    @Override
    public void buildJ2(int identificador, String nombre, String bando) {
        jugador2.setNombre(nombre);
        jugador2.setBando(bando);
        System.out.println(jugador2.getBando() + ", tu base de operaciones ha sido creada.");
    }
    
    @Override
    public void inGame(){
//Fase de inicio del juego
            System.out.println("\n---------------------");
            System.out.println(ANSI_BLUE+"¡Comienza la batalla!");
            System.out.println("---------------------\n");
            System.out.println(jugador1.getBando()+ " VS " + jugador2.getBando());
            System.out.println("----------------------------------------------");
            boolean verdad = true;
    }

}
