/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;
import static jugador.Jugar.AnsiCodeExample.ANSI_GREEN;
import static jugador.Jugar.AnsiCodeExample.ANSI_MAGENTA;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;

/**
 *
 * @author acer
 */
public class Taller implements Edificio{
    AbstractFactory vehiculos;
    private int vida;
    Scanner input = new Scanner(System.in);
    ArrayList<Vehiculo> taller1 = new ArrayList<>();

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public void build(int iteracion, String nombre, String bando, String nombre2, String bando2) {
        
    }

    @Override
    public boolean buildEdificio() {
        System.out.println(ANSI_GREEN + "Construyendo, por favor espere..." + ANSI_RESET);
        System.out.println("-------------------------------------------");
        return true;
    }

    @Override
    public void usoEdificio(int unidad) {
        Taller taller = new Taller();
        if (unidad == 0) {
            taller.setVida(5000);
            System.out.println("-------------------------------------------");
            System.out.println(ANSI_GREEN+"¡Se ha construido su base de entrenamiento!"+ANSI_RESET);
        }
        if (unidad == 10) {
            System.out.println(ANSI_MAGENTA + "\n-Crear unidades terrestres-\n" + ANSI_RESET);
            AbstractFactory unidades;
            unidades = FactoryProducer.getFactory(4); //vehiculos
            System.out.println("1.Crear unidad de infantería.\n2.Crear unidad de infantería mecanizada.\n3.Crear un escuadrón de reconocimiento.\n-------------------------");
            int value = input.nextInt();
            if (value == 1) {
                Vehiculo soldado = unidades.getVehiculo(1);
                System.out.println(ANSI_GREEN+"Su artillería se está armando...");
                System.out.println("-------------------------------------------");
                taller1.add(soldado);
                
            }
            if (value == 2) {
                Vehiculo soldado = unidades.getVehiculo(2);
                System.out.println(ANSI_GREEN+"Su vehiculo de reconocimiento se está armando...");
                System.out.println("-------------------------------------------");
                taller1.add(soldado);
            }
            if (value == 3) {
                Vehiculo soldado = unidades.getVehiculo(3);
                System.out.println(ANSI_GREEN+"Su tanque se está armando...");
                System.out.println("-------------------------------------------");
                taller1.add(soldado);
            }
        }
    }

    @Override
    public int getRecurso(int dia,int recurso){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
