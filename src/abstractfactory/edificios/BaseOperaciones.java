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
import static jugador.Jugar.AnsiCodeExample.ANSI_GREEN;
import static jugador.Jugar.AnsiCodeExample.ANSI_MAGENTA;
import static jugador.Jugar.AnsiCodeExample.ANSI_RED;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;
import static jugador.Jugar.AnsiCodeExample.ANSI_YELLOW;
import jugador.startGame;

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

    private int vida, madera, oro, metal, oroRealJ2, maderaRealJ2, metalRealJ2, oroReal, maderaReal, metalReal;
    int Nedificios = 0, Nvehiculos = 0, Nunidades = 0;
    int NedificiosJ2 = 0, NvehiculosJ2 = 0, NunidadesJ2 = 0;

    public int getOroRealJ2() {
        return oroRealJ2;
    }

    public void setOroRealJ2(int oroRealJ2) {
        this.oroRealJ2 = oroRealJ2;
    }

    public int getMaderaRealJ2() {
        return maderaRealJ2;
    }

    public void setMaderaRealJ2(int maderaRealJ2) {
        this.maderaRealJ2 = maderaRealJ2;
    }

    public int getMetalRealJ2() {
        return metalRealJ2;
    }

    public void setMetalRealJ2(int metalRealJ2) {
        this.metalRealJ2 = metalRealJ2;
    }

    public int getOroReal() {
        return oroReal;
    }

    public void setOroReal(int oroReal) {
        this.oroReal = oroReal;
    }

    public int getMaderaReal() {
        return maderaReal;
    }

    public void setMaderaReal(int maderaReal) {
        this.maderaReal = maderaReal;
    }

    public int getMetalReal() {
        return metalReal;
    }

    public void setMetalReal(int metalReal) {
        this.metalReal = metalReal;
    }

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
                        base.setMadera(300);
                        base.setOro(800);
                        base.setMetal(300);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning,1);
                    }
                    if (player1.equals("Comet")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                        base.setMadera(300);
                        base.setOro(800);
                        base.setMetal(300);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning,1);
                    }
                    if (player1.equals("Moon")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                        base.setMadera(300);
                        base.setOro(800);
                        base.setMetal(300);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning,1);
                    }
                    if (player1.equals("Star")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                        base.setMadera(200);
                        base.setOro(800);
                        base.setMetal(200);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning,1);
                    }
                    if (verdad == false) {
                        break;
                    }
                }
                if (isRunning == false) {
                    break;
                }
                contDias = contDias + 1;

//JUGADOR 2
                int contDiasJ2 = 1;
                String player2 = jugador2.getBando();
                boolean cierto = true;
                while (cierto) { // base de operaciones para jugador 2
                    if (player2.equals("Earth")) {
                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5500);
                        base.setMadera(200);
                        base.setOro(800);
                        base.setMetal(200);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning, 2);
                    }
                    if (player2.equals("Comet")) {

                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                        base.setMadera(200);
                        base.setOro(800);
                        base.setMetal(200);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning, 2);
                    }
                    if (player2.equals("Moon")) {

                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                        base.setMadera(200);
                        base.setOro(800);
                        base.setMetal(200);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning, 2);
                    }
                    if (player2.equals("Star")) {

                        BaseOperaciones base = new BaseOperaciones();
                        base.setVida(5000);
                        base.setMadera(200);
                        base.setOro(800);
                        base.setMetal(200);
                        new startGame().startGame(contDias, jugador1, jugador2, base, entrenamientos, Nedificios, talleres, torretas, canterias, carpinterias, bancos, oroReal, maderaReal, metalReal, Nunidades, Nvehiculos, player1, verdad, isRunning, 2);
                    }
                    if (cierto == false) {
                        break;
                    }
                    contDiasJ2 = contDiasJ2 + 1;
                }
                if (isRunning == false) {
                    break;
                }
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