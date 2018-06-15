/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.edificios.BaseOperaciones;
import abstractfactory.edificios.Edificio;
import java.util.ArrayList;
import java.util.Scanner;
import static jugador.Jugar.AnsiCodeExample.ANSI_BLUE;
import static jugador.Jugar.AnsiCodeExample.ANSI_GREEN;
import static jugador.Jugar.AnsiCodeExample.ANSI_MAGENTA;
import static jugador.Jugar.AnsiCodeExample.ANSI_RED;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;
import static jugador.Jugar.AnsiCodeExample.ANSI_YELLOW;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class startGame {

    public startGame() {
    }

    public void startGame(int contDias, int contDiasJ2, Jugador jugador1, Jugador jugador2, BaseOperaciones base, ArrayList<Edificio> entrenamientos, int Nedificios, ArrayList<Edificio> talleres, ArrayList<Edificio> torretas, ArrayList<Edificio> canterias, ArrayList<Edificio> carpinterias, ArrayList<Edificio> bancos, int oroReal, int maderaReal, int metalReal, int Nunidades, int Nvehiculos, String player, boolean verdad, boolean isRunning, int number) {

        int NedificiosJ2 = 0, NvehiculosJ2 = 0, NunidadesJ2 = 0;
        int oroRealJ2 = 0, metalRealJ2 = 0, maderaRealJ2 = 0;

        AbstractFactory enBatalla;
        Scanner input = new Scanner(System.in);
        boolean turno = true;
        int accion = 0;
        int validacion = 0;
        enBatalla = FactoryProducer.getFactory(1);
        Edificio centroE = enBatalla.getEdificio(2);
        Edificio taller = enBatalla.getEdificio(3);
        Edificio torreta = enBatalla.getEdificio(1);
        Edificio canteria = enBatalla.getEdificio(5);
        Edificio carpinteria = enBatalla.getEdificio(6);
        Edificio banco = enBatalla.getEdificio(7);
        int size = 0;
        int valorOro = 0, valorMetal = 0, valorMadera = 0;

        if (number == 1) {
            System.out.println(ANSI_MAGENTA + "Día " + contDias + ANSI_RESET);
        }
        if (number == 2) {
            System.out.println(ANSI_MAGENTA + "Día " + contDiasJ2 + ANSI_RESET);
        }

        if (number == 1 && player.equals("Earth")) {
            System.out.println(ANSI_BLUE + "- Crea tu arsenal - " + ANSI_RESET + jugador1.getNombre1());
        }
        if (number == 1 && player.equals("Comet")) {
            System.out.println(ANSI_GREEN + "- Crea tu arsenal - " + ANSI_RESET + jugador1.getNombre1());
        }
        if (number == 1 && player.equals("Moon")) {
            System.out.println(ANSI_RED + "- Crea tu arsenal - " + ANSI_RESET + jugador1.getNombre1());
        }
        if (number == 1 && player.equals("Star")) {
            System.out.println(ANSI_YELLOW + "- Crea tu arsenal - " + ANSI_RESET + jugador1.getNombre1());
        }

        if (number == 2 && player.equals("Earth")) {
            System.out.println(ANSI_BLUE + "- Crea tu arsenal - " + ANSI_RESET + jugador2.getNombre());
        }
        if (number == 2 && player.equals("Comet")) {
            System.out.println(ANSI_GREEN + "- Crea tu arsenal - " + ANSI_RESET + jugador2.getNombre());
        }
        if (number == 2 && player.equals("Moon")) {
            System.out.println(ANSI_RED + "- Crea tu arsenal - " + ANSI_RESET + jugador2.getNombre());
        }
        if (number == 2 && player.equals("Star")) {
            System.out.println(ANSI_YELLOW + "- Crea tu arsenal - " + ANSI_RESET + jugador2.getNombre());
        }

        System.out.println("Oro: " + base.getOro() + "\nMadera: " + base.getMadera() + "\nMetal: " + base.getMetal() + "\n------------------");
        if (number == 2) {
            oroRealJ2 = oroReal;
            maderaRealJ2 = maderaReal;
            metalRealJ2 = metalReal;
            NunidadesJ2 = Nunidades;
            NvehiculosJ2 = Nvehiculos;
            NedificiosJ2 = Nedificios;
        }
        while (turno) {
            System.out.println("Escoge una acción.\n1.Crear un centro de entrenamiento.\n2.Crear un taller.\n3.Crear una torreta.\n4.Crear Canteria.\n5.Crear Carpinteria.\n6.Crear Banco.\n7.Ver estado.\n8.Terminar turno.\n9.Rendirse\n-------------------------");
            int caso = input.nextInt();
            if (caso == 1) {
                int accionar = 0;
                if (validacion == 0 && accionar == 0) { //valida la primera ejecución de éste método
                    accionar = 1;
                    base.setMadera(200);
                    base.setOro(800);
                    base.setMetal(200);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    valorOro = base.getOroReal();
                    valorMetal = base.getMetalReal();
                    valorMadera = base.getMetalReal();

                    if (800 > 300 && 200 > 100 && 200 > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {
                            centroE.usoEdificio(0);
                            entrenamientos.add(centroE);
                            Nedificios = Nedificios + 1;
                            size = entrenamientos.size();
                            accion = 0;
                            System.out.println("Si desea añadir una unidad terrestre, escriba 10 en el menú principal.");
                            System.out.println("-------------------------------------------");
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                    validacion = 0;
                }
                if (validacion == 1) { //valida en una ejecución seguida
                    validacion = 0;
                    base.setMadera(valorMadera);
                    base.setOro(valorOro);
                    base.setMetal(valorMetal);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    if (valorOro > 300 && valorMetal > 100 && valorMadera > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {
                            centroE.usoEdificio(0);
                            entrenamientos.add(centroE);
                            Nedificios = Nedificios + 1;
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
                validacion = 1;
            }

            if (caso == 2) {
                int accionar = 0;
                if (validacion == 0 && accionar == 0) { //valida la primera ejecución de éste método
                    accionar = 1;
                    base.setMadera(200);
                    base.setOro(800);
                    base.setMetal(200);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    valorOro = base.getOroReal();
                    valorMetal = base.getMetalReal();
                    valorMadera = base.getMetalReal();

                    if (800 > 300 && 200 > 100 && 200 > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {
                            taller.usoEdificio(0);
                            talleres.add(taller);
                            Nedificios = Nedificios + 1;
                            size = talleres.size();
                            accion = 0;
                            System.out.println("Si desea añadir una unidad terrestre, escriba 10 en el menú principal.");
                            System.out.println("-------------------------------------------");
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                    validacion = 0;
                }
                if (validacion == 1) { //valida en una ejecución seguida
                    validacion = 0;
                    base.setMadera(valorMadera);
                    base.setOro(valorOro);
                    base.setMetal(valorMetal);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    if (valorOro > 300 && valorMetal > 100 && valorMadera > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {
                            taller.usoEdificio(0);
                            talleres.add(taller);
                            Nedificios = Nedificios + 1;
                            size = talleres.size();
                            accion = 0;
                            System.out.println("Si desea añadir una unidad terrestre, escriba 10 en el menú principal.");
                            System.out.println("-------------------------------------------");
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                }
                validacion = 1;
            }

            if (caso == 3) {
                int accionar = 0;
                if (validacion == 0 && accionar == 0) { //valida la primera ejecución de éste método
                    accionar = 1;
                    base.setMadera(200);
                    base.setOro(800);
                    base.setMetal(200);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    valorOro = base.getOroReal();
                    valorMetal = base.getMetalReal();
                    valorMadera = base.getMetalReal();

                    if (800 > 300 && 200 > 100 && 200 > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {
                            torreta.usoEdificio(0);
                            torretas.add(torreta);
                            Nedificios = Nedificios + 1;
                            size = torretas.size();
                            accion = 0;
                            System.out.println("Si desea añadir un vehículo, escriba 11 en el menú principal.");
                            System.out.println("-------------------------------------------");
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                    validacion = 0;
                }
                if (validacion == 1) { //valida en una ejecución seguida
                    validacion = 0;
                    base.setMadera(valorMadera);
                    base.setOro(valorOro);
                    base.setMetal(valorMetal);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    if (valorOro > 300 && valorMetal > 100 && valorMadera > 140) {
                        centroE.buildEdificio();
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
                validacion = 1;
            }

            if (caso == 7) {
                if (accion == 0) {
                    System.out.println("------------------\n" + ANSI_MAGENTA + "-Recursos disponibles-\n" + ANSI_RESET + "Oro: " + base.getOro() + "\nMadera: " + base.getMadera() + "\nMetal: " + base.getMetal() + "\nNúmero de edificios creados: " + Nedificios + "\nNúmero de reclutas: " + Nunidades + "\nNúmero de vehículos creados: " + Nvehiculos + "\n------------------\n");
                }
                if (accion == 1) {
                    System.out.println("------------------\n" + ANSI_MAGENTA + "-Recursos disponibles-\n" + ANSI_RESET + "Oro: " + oroReal + "\nMadera: " + maderaReal + "\nMetal: " + metalReal + "\nNúmero de edificios creados: " + Nedificios + "\nNúmero de reclutas: " + Nunidades + "\nNúmero de vehículos creados: " + Nvehiculos + "\n------------------\n");
                    accion = 0;
                }

            }

            if (caso == 4) {
                int accionar = 0;
                if (validacion == 0 && accionar == 0) { //valida la primera ejecución de éste método
                    accionar = 1;
                    base.setMadera(200);
                    base.setOro(800);
                    base.setMetal(200);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    valorOro = base.getOroReal();
                    valorMetal = base.getMetalReal();
                    valorMadera = base.getMetalReal();

                    if (800 > 300 && 200 > 100 && 200 > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {

                            canteria.usoEdificio(0);
                            canterias.add(taller);
                            Nedificios = Nedificios + 1;
                            size = canterias.size();
                            accion = 0;
                            System.out.println("Si desea añadir un vehículo, escriba 11 en el menú principal.");
                            System.out.println("-------------------------------------------");
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                    validacion = 0;
                }
                if (validacion == 1) { //valida en una ejecución seguida
                    validacion = 0;
                    base.setMadera(valorMadera);
                    base.setOro(valorOro);
                    base.setMetal(valorMetal);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    if (valorOro > 300 && valorMetal > 100 && valorMadera > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {

                            canteria.usoEdificio(0);
                            canterias.add(taller);
                            Nedificios = Nedificios + 1;
                            size = canterias.size();
                            accion = 0;
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                }
                validacion = 1;
            }

            if (caso == 5) {

                int accionar = 0;
                if (validacion == 0 && accionar == 0) { //valida la primera ejecución de éste método
                    accionar = 1;
                    base.setMadera(200);
                    base.setOro(800);
                    base.setMetal(200);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    valorOro = base.getOroReal();
                    valorMetal = base.getMetalReal();
                    valorMadera = base.getMetalReal();

                    if (800 > 300 && 200 > 100 && 200 > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {

                            carpinteria.usoEdificio(0);
                            carpinterias.add(taller);
                            Nedificios = Nedificios + 1;
                            size = carpinterias.size();
                            accion = 0;
                            System.out.println("Si desea añadir un vehículo, escriba 11 en el menú principal.");
                            System.out.println("-------------------------------------------");
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                    validacion = 0;
                }
                if (validacion == 1) { //valida en una ejecución seguida
                    validacion = 0;
                    base.setMadera(valorMadera);
                    base.setOro(valorOro);
                    base.setMetal(valorMetal);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    if (valorOro > 300 && valorMetal > 100 && valorMadera > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {

                            carpinteria.usoEdificio(0);
                            carpinterias.add(taller);
                            Nedificios = Nedificios + 1;
                            size = carpinterias.size();
                            accion = 0;
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                }
                validacion = 1;
            }

            if (caso == 6) {

                int accionar = 0;
                if (validacion == 0 && accionar == 0) { //valida la primera ejecución de éste método
                    accionar = 1;
                    base.setMadera(200);
                    base.setOro(800);
                    base.setMetal(200);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    valorOro = base.getOroReal();
                    valorMetal = base.getMetalReal();
                    valorMadera = base.getMetalReal();

                    if (800 > 300 && 200 > 100 && 200 > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {

                            banco.usoEdificio(0);
                            bancos.add(taller);
                            Nedificios = Nedificios + 1;
                            size = bancos.size();
                            accion = 0;
                            System.out.println("Si desea añadir un vehículo, escriba 11 en el menú principal.");
                            System.out.println("-------------------------------------------");
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                    validacion = 0;
                }
                if (validacion == 1) { //valida en una ejecución seguida
                    validacion = 0;
                    base.setMadera(valorMadera);
                    base.setOro(valorOro);
                    base.setMetal(valorMetal);
                    int oroActual = base.getOro() - 300;
                    int metalActual = base.getMetal() - 100;
                    int maderaActual = base.getMadera() - 140;

                    base.setOro(oroActual);
                    base.setOroReal(base.getOro());
                    base.setMetal(metalActual);
                    base.setMetalReal(base.getMetal());
                    base.setMadera(maderaActual);
                    base.setMaderaReal(base.getMadera());

                    if (valorOro > 300 && valorMetal > 100 && valorMadera > 140) {
                        centroE.buildEdificio();
                        if (accion == 1) {

                            banco.usoEdificio(0);
                            bancos.add(taller);
                            Nedificios = Nedificios + 1;
                            size = bancos.size();
                            accion = 0;
                        }
                        turno = true;
                    } else {
                        System.out.println("No tiene suficientes recursos.");
                    }
                }
                validacion = 1;
            }

            if (caso == 8) {
                if (number == 1) {
                    System.out.println(ANSI_RED + "Fin del turno de " + jugador1.getBando1() + ANSI_RESET);
                    System.out.println("----------------------------");
                    turno = false;
                    verdad = false;
                }
                if (number == 2) {
                    System.out.println(ANSI_RED + "Fin del turno de " + jugador2.getBando() + ANSI_RESET);
                    System.out.println("----------------------------");
                    turno = false;
                    verdad = false;
                }

            }

            if (caso == 9) {
                System.out.println(ANSI_RED + "¿Realmente deseas rendirte? (S/N)" + ANSI_RESET);
                String decision = input.next();
                String finald = decision.toUpperCase();
                if (finald.equals("S")) {
                    if (number == 1) {
                        System.out.println("-----------------------------------");
                        System.out.println(ANSI_BLUE + "Gana: " + jugador2.getNombre() + " | " + jugador2.getBando() + ANSI_RESET);
                        System.out.println(ANSI_RED + "Pierde: " + jugador1.getNombre1() + " | " + jugador1.getBando1() + ANSI_RESET);
                        System.exit(0);
                    }
                    if (number == 2) {
                        System.out.println("-----------------------------------");
                        System.out.println(ANSI_BLUE + "Gana: " + jugador1.getNombre1() + " | " + jugador1.getBando1() + ANSI_RESET);
                        System.out.println(ANSI_RED + "Pierde: " + jugador2.getNombre() + " | " + jugador2.getBando() + ANSI_RESET);
                        System.exit(0);
                    }
                }
            }

            if (caso == 10) {
                if (size != 0) {
                    centroE.usoEdificio(10);
                    Nunidades = Nunidades + 1;
                } else {
                    System.out.println(ANSI_RED + "No se pueden añadir unidades terrestres porque hace falta un edificio para entrenarlos." + ANSI_RESET);
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
            accion = accion + 1;
        }
    }
}
