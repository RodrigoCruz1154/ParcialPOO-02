/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import java.util.ArrayList;
import java.util.Scanner;
import jugador.Jugador;
import static jugador.Jugar.AnsiCodeExample.ANSI_BLUE;
import static jugador.Jugar.AnsiCodeExample.ANSI_MAGENTA;
import static jugador.Jugar.AnsiCodeExample.ANSI_RED;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class BaseOperaciones implements Edificio {

    AbstractFactory enBatalla;
    ArrayList<Edificio> entrenamientos = new ArrayList<>();
    ArrayList<Edificio> talleres = new ArrayList<>();
    ArrayList<Edificio> torretas = new ArrayList<>();
    ArrayList<Edificio> canterias = new ArrayList<>();
    ArrayList<Edificio> carpinterias = new ArrayList<>();
    ArrayList<Edificio> bancos = new ArrayList<>();
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    Scanner input = new Scanner(System.in);

    private int vida, madera, oro, metal;
    int Nedificios = 0,Nvehiculos = 0,Nunidades = 0;
    int NedificiosJ2 = 0,NvehiculosJ2 = 0,NunidadesJ2 = 0;

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
                        base.setMadera(11000);
                        base.setOro(800);
                        base.setMetal(11000);
                        int oroReal = 0, maderaReal = 0, metalReal = 0;
                        boolean turno = true;
                        int accion = 0;
                        enBatalla = FactoryProducer.getFactory(1);
                        Edificio centroE = enBatalla.getEdificio(2);
                        Edificio taller = enBatalla.getEdificio(3);
                        Edificio torreta = enBatalla.getEdificio(1);
                        Edificio canteria = enBatalla.getEdificio(5);
                        Edificio carpinteria = enBatalla.getEdificio(6);
                        Edificio banco = enBatalla.getEdificio(7);
                        int size = 0;
                        
                        System.out.println(ANSI_MAGENTA + "Día " + contDias + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "- Crea tu arsenal - " + ANSI_RESET + jugador1.getNombre());
                        System.out.println("Oro: " + base.getOro() + "\nMadera: " + base.getMadera() + "\nMetal: " + base.getMetal() + "\n------------------");
                        while (turno) {
                            System.out.println("Escoge una acción.\n1.Crear un centro de entrenamiento.\n2.Crear un taller.\n3.Crear una torreta.\n4.Crear Canteria.\n5.Crear Carpinteria.\n6.Crear Banco.\n7.Ver estado.\n8.Terminar turno.\n9.Rendirse\n-------------------------");
                            int caso = input.nextInt();
                            if (caso == 1) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 100;
                                int maderaActual = base.getMadera() - 140;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 100 && maderaReal > 140) {
                                    centroE.buildEdificio();
                                    if (accion == 1) {
                                        centroE.usoEdificio(0);
                                        entrenamientos.add(centroE);
                                        Nedificios = Nedificios+1;
                                        size = entrenamientos.size();
                                        accion = 0;
                                        System.out.println("Si desea añadir una unidad terrestre, escriba 10 en el menú principal.");
                                        System.out.println("-------------------------------------------");
                                    }
                                    turno = true;
                                } else {
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 2) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        taller.usoEdificio(0);
                                        talleres.add(taller);
                                        Nedificios = Nedificios+1;
                                        size = talleres.size();
                                        accion = 0;
                                        System.out.println("Si desea añadir un vehículo, escriba 11 en el menú principal.");
                                        System.out.println("-------------------------------------------");
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 3) {
                                int oroActual = base.getOro() - 250;
                                int metalActual = base.getMetal() - 100;
                                int maderaActual = base.getMadera() - 100;

                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();

                                if (oroReal > 250 && metalReal > 100 && maderaReal > 100) {
                                    taller.buildEdificio();
                                    if (accion == 1) {
                                        torreta.usoEdificio(0);
                                        torretas.add(torreta);
                                        Nedificios = Nedificios + 1;
                                        size = torretas.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                } else {
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 7) {
                                System.out.println("------------------\n" + ANSI_MAGENTA + "-Recursos disponibles-\n" + ANSI_RESET + "Oro: " + oroReal + "\nMadera: " + maderaReal + "\nMetal: " + metalReal + "Número de edificios creados: " + Nedificios + "Número de reclutas: " + Nunidades + "Número de vehículos creados: " + Nvehiculos);
                            }

                            if (caso == 4) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        canteria.usoEdificio(0);
                                        canterias.add(taller);
                                        Nedificios = Nedificios+1;
                                        size = canterias.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 5) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        carpinteria.usoEdificio(0);
                                        carpinterias.add(taller);
                                        Nedificios = Nedificios+1;
                                        size = carpinterias.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 6) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        banco.usoEdificio(0);
                                        bancos.add(taller);
                                        Nedificios = Nedificios+1;
                                        size = bancos.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 8) {
                                System.out.println(ANSI_RED + "Fin del turno de " + player1 + ANSI_RESET);
                                System.out.println("----------------------------");
                                turno = false;
                                verdad = false;

                            }

                            if (caso == 9) {
                                System.out.println(ANSI_RED + "¿Realmente deseas rendirte? (S/N)" + ANSI_RESET);
                                String decision = input.next();
                                String finald = decision.toUpperCase();
                                if (finald.equals("S")) {
                                    System.out.println("-----------------------------------");
                                    System.out.println(ANSI_BLUE + "Gana: " + jugador2.getNombre() + " | " + jugador2.getBando() + ANSI_RESET);
                                    System.out.println(ANSI_RED + "Pierde: " + jugador1.getNombre1() + " | " + jugador1.getBando1() + ANSI_RESET);
                                    turno = false;
                                    isRunning = false;
                                    verdad = false;
                                }
                            }
                            
                            if(caso == 10){
                                if (size!=0) {
                                    centroE.usoEdificio(10);
                                    Nunidades = Nunidades + 1;
                                }
                                else{
                                    System.out.println(ANSI_RED +"No se pueden añadir unidades terrestres porque hace falta un edificio para entrenarlos."+ ANSI_RESET);
                                    System.out.println("----------------------------");
                                }
                            }
                            if (caso == 11) {
                                if (size != 0) {
                                    taller.usoEdificio(10);
                                    Nvehiculos = Nvehiculos + 1;
                                } else {
                                    System.out.println(ANSI_RED + "No se pueden añadir unidades terrestres porque hace falta un edificio para entrenarlos." + ANSI_RESET);
                                    System.out.println("----------------------------");
                                }
                            }

                            /*if (oroReal <= 0 && metalReal <= 0 && maderaReal <= 0) {
                                System.out.println(ANSI_RED + "Te has quedado sin recursos. Esperarás un turno para que se recupere tu economía." + ANSI_RESET);
                                System.out.println("----------------------------");
                                turno = false;
                                verdad = false;
                            }*/

                            if (turno == false) {
                                break;
                            }
                            accion=accion+1;
                        }
                    }
                    if (player1.equals("Comet")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (player1.equals("Orange")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (player1.equals("Yellow")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                    }
                    if (verdad == false) {
                        break;
                    }
                }
                if (isRunning == false) {
                    break;
                }
                contDias = contDias + 1;
                if (isRunning == false) {
                    break;
                }

 
//JUGADOR 2
                String player2 = jugador2.getBando();
                boolean cierto = true;
                while(cierto){
                    if (player2.equals("Earth")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5500);
                        base.setMadera(11000);
                        base.setOro(800);
                        base.setMetal(11000);
                        int oroReal = 0, maderaReal = 0, metalReal = 0;
                        boolean turno = true;
                        int accion = 0;
                        enBatalla = FactoryProducer.getFactory(1);
                        Edificio centroE = enBatalla.getEdificio(2);
                        Edificio taller = enBatalla.getEdificio(3);
                        Edificio torreta = enBatalla.getEdificio(1);
                        Edificio canteria = enBatalla.getEdificio(5);
                        Edificio carpinteria = enBatalla.getEdificio(6);
                        Edificio banco = enBatalla.getEdificio(7);
                        int size = 0;
                        
                        System.out.println(ANSI_MAGENTA + "Día " + contDias + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "- Crea tu arsenal - " + ANSI_RESET + jugador2.getNombre());
                        System.out.println("Oro: " + base.getOro() + "\nMadera: " + base.getMadera() + "\nMetal: " + base.getMetal() + "\n------------------");
                        while (turno) {
                            System.out.println("Escoge una acción.\n1.Crear un centro de entrenamiento.\n2.Crear un taller.\n3.Crear una torreta.\n4.Crear Canteria.\n5.Crear Carpinteria.\n6.Crear Banco.\n7.Ver estado.\n8.Terminar turno.\n9.Rendirse\n-------------------------");
                            int caso = input.nextInt();
                            if (caso == 1) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 100;
                                int maderaActual = base.getMadera() - 140;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 100 && maderaReal > 140) {
                                    centroE.buildEdificio();
                                    if (accion == 1) {
                                        centroE.usoEdificio(0);
                                        entrenamientos.add(centroE);
                                        NedificiosJ2 = NedificiosJ2+1;
                                        size = entrenamientos.size();
                                        accion = 0;
                                        System.out.println("Si desea añadir una unidad terrestre, escriba 10 en el menú principal.");
                                        System.out.println("-------------------------------------------");
                                    }
                                    turno = true;
                                } else {
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 2) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        taller.usoEdificio(0);
                                        talleres.add(taller);
                                        NedificiosJ2 = NedificiosJ2+1;
                                        size = talleres.size();
                                        accion = 0;
                                        System.out.println("Si desea añadir un vehículo, escriba 11 en el menú principal.");
                                        System.out.println("-------------------------------------------");
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 3) {
                                int oroActual = base.getOro() - 250;
                                int metalActual = base.getMetal() - 100;
                                int maderaActual = base.getMadera() - 100;

                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();

                                if (oroReal > 250 && metalReal > 100 && maderaReal > 100) {
                                    taller.buildEdificio();
                                    if (accion == 1) {
                                        torreta.usoEdificio(0);
                                        torretas.add(torreta);
                                        NedificiosJ2 = NedificiosJ2 + 1;
                                        size = torretas.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                } else {
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 7) {
                                System.out.println("------------------\n" + ANSI_MAGENTA + "-Recursos disponibles-\n" + ANSI_RESET + "Oro: " + oroReal + "\nMadera: " + maderaReal + "\nMetal: " + metalReal + "Número de edificios creados: " + Nedificios + "Número de reclutas: " + Nunidades + "Número de vehículos creados: " + Nvehiculos);
                            }

                            if (caso == 4) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        canteria.usoEdificio(0);
                                        canterias.add(taller);
                                        NedificiosJ2 = NedificiosJ2+1;
                                        size = canterias.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 5) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        carpinteria.usoEdificio(0);
                                        carpinterias.add(taller);
                                        NedificiosJ2 = NedificiosJ2+1;
                                        size = carpinterias.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 6) {
                                int oroActual = base.getOro() - 300;
                                int metalActual = base.getMetal() - 80;
                                int maderaActual = base.getMadera() - 100;
                                
                                base.setOro(oroActual);
                                oroReal = base.getOro();
                                base.setMetal(metalActual);
                                metalReal = base.getMetal();
                                base.setMadera(maderaActual);
                                maderaReal = base.getMadera();
                                
                                if (oroReal > 300 && metalReal > 80 && maderaReal > 100){
                                    taller.buildEdificio();
                                    if(accion==1){
                                        banco.usoEdificio(0);
                                        bancos.add(taller);
                                        NedificiosJ2 = NedificiosJ2+1;
                                        size = bancos.size();
                                        accion = 0;
                                    }
                                    turno = true;
                                }
                                else{
                                    System.out.println("No tiene suficientes recursos.");
                                }
                            }

                            if (caso == 8) {
                                System.out.println(ANSI_RED + "Fin del turno de " + player1 + ANSI_RESET);
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
                            
                            if(caso == 10){
                                if (size!=0) {
                                    centroE.usoEdificio(10);
                                    NunidadesJ2 = NunidadesJ2 + 1;
                                }
                                else{
                                    System.out.println(ANSI_RED +"No se pueden añadir unidades terrestres porque hace falta un edificio para entrenarlos."+ ANSI_RESET);
                                    System.out.println("----------------------------");
                                }
                            }
                            if (caso == 11) {
                                if (size != 0) {
                                    taller.usoEdificio(10);
                                    NvehiculosJ2 = NvehiculosJ2 + 1;
                                } else {
                                    System.out.println(ANSI_RED + "No se pueden añadir unidades terrestres porque hace falta un edificio para entrenarlos." + ANSI_RESET);
                                    System.out.println("----------------------------");
                                }
                            }

                            /*if (oroReal <= 0 && metalReal <= 0 && maderaReal <= 0) {
                                System.out.println(ANSI_RED + "Te has quedado sin recursos. Esperarás un turno para que se recupere tu economía." + ANSI_RESET);
                                System.out.println("----------------------------");
                                turno = false;
                                verdad = false;
                            }*/

                            if (turno == false) {
                                break;
                            }
                            accion=accion+1;
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
    public void buildEdificio() {
    }

    @Override
    public void usoEdificio(int unidad) {

    }
}
