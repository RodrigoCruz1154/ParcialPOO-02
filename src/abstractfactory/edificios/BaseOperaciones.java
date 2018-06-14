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
import static jugador.Jugar.AnsiCodeExample.ANSI_CYAN;
import static jugador.Jugar.AnsiCodeExample.ANSI_MAGENTA;
import static jugador.Jugar.AnsiCodeExample.ANSI_RED;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;
import static jugador.Jugar.AnsiCodeExample.BLACK_FILL;

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

    private int vida, madera, oro, metal;

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void build(int identificador, String nombre, String bando, String nombre2, String bando2) {
        int inGame = 0;
        if (identificador == 0) {
            jugador1.setNombre1(nombre);
            jugador1.setBando1(bando);
            System.out.println(jugador1.getBando1() + ", tu base de operaciones ha sido creada.");
            inGame = 0;
        }
        if (identificador == 1) {
            jugador1.setNombre1(nombre);
            jugador1.setBando1(bando);
            jugador2.setNombre(nombre2);
            jugador2.setBando(bando2);
            System.out.println(jugador2.getBando() + ", tu base de operaciones ha sido creada.");
            inGame = 1;
        }
        System.out.println("\n---------------------");

        if (inGame == 1) {
            System.out.println("\n---------------------");
            System.out.println(ANSI_BLUE + "¡Comienza la batalla!" + ANSI_RESET);
            System.out.println("---------------------");
            System.out.println(jugador1.getBando1() + ANSI_RED + " VS " + ANSI_RESET + jugador2.getBando());
            System.out.println("----------------------------------------------");
            String player1 = jugador1.getBando1();
            int contDias = 1;
            boolean isRunning = true;
            while (isRunning) {
                boolean verdad = true;
                while (verdad) { // base de operaciones para jugador 1
                    if (player1.equals("Earth")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5500);
                        base.setMadera(1000);
                        base.setOro(800);
                        base.setMetal(1000);
                        System.out.println(ANSI_MAGENTA + "Día " + contDias + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "- Crea tu arsenal - " + ANSI_RESET + jugador1.getNombre1());
                        System.out.println("Oro: " + base.getOro() + "\nMadera: " + base.getMadera() + "\nMetal: " + base.getMetal() + "\n------------------");
                        System.out.println("Escoge una acción.\n1.Crear un centro de entrenamiento.\n2.Crear un taller.\n3.Crear una torreta.\n4.Ver estado.\n5.Terminar turno.\n6.Rendirse\n-------------------------");
                        int caso = input.nextInt();
                        if (caso == 1) {
                            enBatalla = FactoryProducer.getFactory(1);
                            Edificio central1 = enBatalla.getEdificio(2);
                            int oroActual = base.getOro() - 300;
                            int metalActual = base.getMetal() - 100;
                            int maderaActual = base.getMadera() - 140;
                            if (oroActual > 300 && metalActual > 100 && maderaActual > 140) {
                                central1.buildEdificio(300, 0);
                                edificios.add(central1);
                                int size = edificios.size();
                            } else {
                                System.out.println("No tiene suficientes recursos.");
                            }

                        }
                        if (caso == 5) {
                            System.out.println(ANSI_RED + "Fin del turno de " + player1 + ANSI_RESET);
                            System.out.println("----------------------------");
                            verdad = false;

                        }
                        if (caso == 6) {
                            System.out.println(ANSI_RED + "¿Realmente deseas rendirte? (S/N)" + ANSI_RESET);
                            String decision = input.next();
                            String finald = decision.toUpperCase();
                            if (finald.equals("S")) {
                                System.out.println("-----------------------------------");
                                System.out.println(ANSI_BLUE + "Gana: " + jugador2.getNombre() + " | " + jugador2.getBando() + ANSI_RESET);
                                System.out.println(ANSI_RED + "Pierde: " + jugador1.getNombre1() + " | " + jugador1.getBando1() + ANSI_RESET);
                                isRunning = false;
                                verdad = false;
                            }
                        }
                        if (verdad == false) {
                            break;
                        }
                    }
                    if (jugador1.getBando1().equals("Comet")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (jugador1.getBando1().equals("Orange")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (jugador1.getBando1().equals("Yellow")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                }
                if (isRunning == false) {
                    break;
                }

                String player2 = jugador2.getBando();
                boolean cierto = true;
                while (cierto) { // base de operaciones para jugador 2
                    if (player2.equals("Earth")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5500);
                        base.setMadera(1000);
                        base.setOro(800);
                        base.setMetal(1000);
                        int oroReal = 0, maderaReal = 0, metalReal = 0;
                        boolean turno = true;
                        int accion = 0;
                        System.out.println(ANSI_MAGENTA + "Día " + contDias + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "- Crea tu arsenal - " + ANSI_RESET + jugador2.getNombre());
                        System.out.println("Oro: " + base.getOro() + "\nMadera: " + base.getMadera() + "\nMetal: " + base.getMetal() + "\n------------------");
                        while (turno) {
                            System.out.println("Escoge una acción.\n1.Crear un centro de entrenamiento.\n2.Crear un taller.\n3.Crear una torreta.\n4.Ver estado.\n5.Crear Canteria.\n6.Crear Carpinteria.\n7.Crear Banco.\n8.Terminar turno.\n9.Rendirse\n-------------------------");
                            int caso = input.nextInt();
                            if (caso == 1) {
                                enBatalla = FactoryProducer.getFactory(1);
                                Edificio central1 = enBatalla.getEdificio(2);
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 100;
                                int maderaActual = base.getMadera() - 140;
                                oroReal = oroActual;
                                metalReal = metalActual;
                                maderaReal = maderaActual;
                                if (oroActual > 300 && metalActual > 100 && maderaActual > 140) {
                                    Edificio entrenamiento = central1.buildEdificio(300, accion);
                                    central1.usoEdificio(entrenamiento);
                                    edificios.add(central1);
                                    int size = edificios.size();
                                    System.out.println("----------------------------");
                                    turno = true;
                                } else {
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 2) {

                            }

                            if (caso == 3) {

                            }

                            if (caso == 4) {
                                System.out.println("------------------\n" + ANSI_MAGENTA + "-Recursos disponibles-\n" + ANSI_RESET + "Oro: " + oroReal + "\nMadera: " + maderaReal + "\nMetal: " + metalReal + "\n------------------");
                            }

                            if (caso == 5) {

                            }

                            if (caso == 6) {

                            }

                            if (caso == 7) {

                            }

                            if (caso == 8) {
                                System.out.println(ANSI_RED + "Fin del turno de " + player2 + ANSI_RESET);
                                System.out.println("----------------------------");
                                turno = false;
                                cierto = false;

                            }

                            if (caso == 9) {
                                System.out.println(ANSI_RED + "¿Realmente deseas rendirte? (S/N)" + ANSI_RESET);
                                String decision = input.next();
                                String finald = decision.toUpperCase();
                                if (finald.equals("S")) {
                                    System.out.println("-----------------------------------");
                                    System.out.println(ANSI_BLUE + "Gana: " + jugador1.getNombre1() + " | " + jugador1.getBando1() + ANSI_RESET);
                                    System.out.println(ANSI_RED + "Pierde: " + jugador2.getNombre() + " | " + jugador2.getBando() + ANSI_RESET);
                                    turno = false;
                                    isRunning = false;
                                    cierto = false;
                                }
                            }

                            if (oroReal <= 0 && metalReal <= 0 && maderaReal <= 0) {
                                System.out.println(ANSI_RED + "Te has quedado sin recursos. Esperarás un turno para que se recupere tu economía." + ANSI_RESET);
                                System.out.println("----------------------------");
                                turno = false;
                                cierto = false;
                            }

                            if (turno == false) {
                                break;
                            }
                        }
                    }
                    if (jugador2.getBando().equals("Comet")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (jugador2.getBando().equals("Orange")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (jugador2.getBando().equals("Yellow")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (cierto == false) {
                        break;
                    }
                }
                if (isRunning == false) {
                    break;
                }
                contDias = contDias + 1;
            }
        }

    }

    @Override
    public Edificio buildEdificio(int oro, int faseExt) {
        return null;
    }

    @Override
    public void usoEdificio(Edificio edificacion) {

    }
}
