/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.edificios.Edificio;
import gui.GUI;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Jugar {

    public void Jugar() {
        Scanner input = new Scanner(System.in);
        boolean flag = true, bandera = true;
        int iteracion = 0, faseJ1 = 0, faseJ2 = 0;
        AbstractFactory factory;
        ArrayList<String> jugadores = new ArrayList<>();
        Jugador1 jugador1 = new Jugador1();
        Jugador2 jugador2 = new Jugador2();

        while (flag) {
            System.out.println("\n¡Bienvenido a Omega Land!\n\nAquí desatarás el poder del bando que tú elijas para alzarte victorioso.\nCada bando tiene aptitudes distintas e ideales para tu estilo de combate,para saber un poco más acerca de ellas escribe <info>.\nPara comenzar a jugar pulsa <A>, para salir <S>:");
            System.out.println("");
            String select1 = input.nextLine();
            System.out.println("");
            String toLowerCase = select1.toLowerCase();
            if (toLowerCase.equals("info")) {
                new GUI().setVisible(true);
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
            }
            if (toLowerCase.equals("s")) {
                System.out.println("¡Gracias por jugar! Vuelve pronto.");
                flag = false;
                bandera = false;
            }
            if (toLowerCase.equals("a")) {
                System.out.println("Cargando...");
                System.out.println("¡Saludos guerrero!\nAntes de comenzar a jugar necesito saber tu nombre: ");
                String nombre = input.next();
                jugador1.setNombre(nombre);
                System.out.println("Elija un bando por favor: ");
                String bando = input.next();
                jugador1.setBando(bando);
                System.err.println("-------------------------------------------------");
                System.out.println("Jugador 1: " + nombre);
                System.out.println("Comandará a: " + bando);
                jugadores.add(nombre);
                factory = FactoryProducer.getFactory(1);
                Edificio centralj1 = factory.getEdificio(4);
                centralj1.build(faseJ1, nombre, bando);
                flag = false;
            }
            if (flag == false) {
                break;
            }
            if (!toLowerCase.equals("a") || !toLowerCase.equals("s") || !toLowerCase.equals("info")) {
                System.err.println("Ingrese un dato válido");
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
            }
        }

        while (bandera) {
            System.out.println("\n¡Bienvenido a Omega Land!\n\nAquí desatarás el poder del bando que tú elijas para alzarte victorioso.\nCada bando tiene aptitudes distintas e ideales para tu estilo de combate,para saber un poco más acerca de ellas escribe <info>.\nPara comenzar a jugar pulsa <A>, para salir <S>:");
            System.out.println("");
            String select1 = input.nextLine();
            System.out.println("");
            String toLowerCase = select1.toLowerCase();
            if (toLowerCase.equals("info")) {
                new GUI().setVisible(true);
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
            }
            if (toLowerCase.equals("s")) {
                System.out.println("¡Gracias por jugar! Vuelve pronto.");
                bandera = false;
            }
            if (toLowerCase.equals("a")) {
                System.out.println("Cargando...");
                System.out.println("¡Saludos guerrero!\nAntes de comenzar a jugar necesito saber tu nombre: ");
                String nombre = input.next();
                jugador2.setNombre(nombre);
                System.out.println("Elija un bando por favor: ");
                String bando = input.next();
                jugador2.setBando(bando);
                System.err.println("-------------------------------------------------");
                System.out.println("Jugador 2: " + nombre);
                System.out.println("Comandará a: " + bando);
                jugadores.add(nombre);
                factory = FactoryProducer.getFactory(1);
                Edificio centralj2 = factory.getEdificio(4);
                centralj2.build(faseJ2, nombre, bando);
                bandera = false;
            }
            if (bandera == false) {
                break;
            }
            if (!toLowerCase.equals("a") || !toLowerCase.equals("s") || !toLowerCase.equals("info")) {
                System.err.println("Ingrese un dato válido");
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
            }
        }

    }
}
