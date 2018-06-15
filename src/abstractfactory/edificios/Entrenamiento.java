/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.terrestres.Terrestre;
import java.util.ArrayList;
import java.util.Scanner;
import static jugador.Jugar.AnsiCodeExample.ANSI_GREEN;
import static jugador.Jugar.AnsiCodeExample.ANSI_MAGENTA;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;

/**
 *
 * @author acer
 */
public class Entrenamiento implements Edificio {

    AbstractFactory guerreros;
    Scanner input = new Scanner(System.in);
    ArrayList<Terrestre> reclutas = new ArrayList<>();

    private int vida;

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
        System.out.println(ANSI_GREEN+"Construyendo, por favor espere..."+ANSI_RESET);
        System.out.println("-------------------------------------------");
        return true;
    }

    @Override
    public void usoEdificio(int unidad) {
        Entrenamiento entrenamiento = new Entrenamiento();
        if (unidad == 0) {
            entrenamiento.setVida(5000);
            System.out.println("-------------------------------------------");
            System.out.println(ANSI_GREEN+"¡Se ha construido su base de entrenamiento!"+ANSI_RESET);
        }
        if (unidad == 10) {
            System.out.println(ANSI_MAGENTA + "\n-Crear unidades terrestres-\n" + ANSI_RESET);
            AbstractFactory unidades;
            unidades = FactoryProducer.getFactory(3); //terrestres
            System.out.println("1.Crear unidad de infantería.\n2.Crear unidad de infantería mecanizada.\n3.Crear un escuadrón de reconocimiento.\n-------------------------");
            int value = input.nextInt();
            if (value == 1) {
                Terrestre soldado = unidades.getTerrestre(1);
                System.out.println(ANSI_GREEN+"Sus tropas de infantería están entrenando...");
                System.out.println("-------------------------------------------");
                reclutas.add(soldado);
                
            }
            if (value == 2) {
                Terrestre soldado = unidades.getTerrestre(3);
                System.out.println(ANSI_GREEN+"Sus tropas de infantería mecanizada están entrenando...");
                System.out.println("-------------------------------------------");
                reclutas.add(soldado);
            }
            if (value == 3) {
                Terrestre soldado = unidades.getTerrestre(2);
                System.out.println(ANSI_GREEN+"Sus escuadrón de reconocimiento está entrenando...");
                System.out.println("-------------------------------------------");
                reclutas.add(soldado);
            }

        }

    }

    @Override
    public int getRecurso(int dia,int recurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
