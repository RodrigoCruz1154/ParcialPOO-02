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
import java.util.Scanner;
import static jugador.Jugar.AnsiCodeExample.ANSI_RED;
import static jugador.Jugar.AnsiCodeExample.ANSI_RESET;
import static jugador.Jugar.AnsiCodeExample.GREEN_FILL;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class Jugar {

    public class AnsiCodeExample{ //COLOREAR
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String GREEN_FILL = "\u001B[0;42m";
        public static final String BLACK_FILL = "\u001B[0;40m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_MAGENTA = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
    }
    
    public void Jugar() {
        Scanner input = new Scanner(System.in);
        boolean flag = true, bandera = true;
        int iteracion = 0, faseJ1 = 0, faseJ2 = 1;
        String name="",milicia="",name1="",milicia1="";
        AbstractFactory factory;

//Jugador 1        
        while (flag) {
            System.out.println(GREEN_FILL + "\n¡Bienvenido a Omega Land!"+ ANSI_RESET + "\n\nAquí desatarás el poder del bando que tú elijas para alzarte victorioso.\nCada bando tiene aptitudes distintas e ideales para tu estilo de combate,para saber un poco más acerca de ellas escribe" +ANSI_RED +" <info>"+ANSI_RESET+".\nPara comenzar a jugar pulsa"+ANSI_RED+ " <A>"+ANSI_RESET+ ", para salir" +ANSI_RED+ " <S>"+ANSI_RESET+":");
            System.out.println("");
            String select1 = input.next();
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
                System.out.println("\nElija un bando por favor: ");
                System.out.println("1.Blue Earth\n2.Green Comet\n3.Orange Moon\n4.Yellow Star");
                boolean validarBando = true;
                String bandoLocal = "";
                while (validarBando) {
                    int bando = input.nextInt();
                    if (bando == 1) {
                        bandoLocal = "Earth";
                        break;
                    }
                    if (bando == 2) {
                        bandoLocal = "Comet";
                        break;
                    }
                    if (bando == 3) {
                        bandoLocal = "Moon";
                        break;
                    }
                    if (bando == 4) {
                        bandoLocal = "Star";
                        break;
                    } 
                    else {
                        System.out.println(" ");
                        System.out.println(ANSI_RED + "No existe un quinto bando en discordia que corresponda a ese número. Escriba un dato válido.");
                        System.out.println("Elija un bando por favor: ");
                    }
                    if (validarBando == false) {
                        break;
                    }
                }
                System.out.println("-------------------------------------------------");
                System.out.println("Jugador 1: " + nombre);
                System.out.println("Comandará a: " + bandoLocal);
                name = nombre;
                milicia = bandoLocal;
                factory = FactoryProducer.getFactory(1);
                Edificio centralj1 = factory.getEdificio(4);
                centralj1.build(faseJ1, name, milicia,name1,milicia1);
                flag = false;
            }
            if (flag == false) {
                break;
            }
            if (!toLowerCase.equals("a") || !toLowerCase.equals("s") || !toLowerCase.equals("info")) {
                System.err.println("Ingrese un dato válido");
                System.out.println(" ");
            }
            
        }

//Jugador 2        
        while (bandera) {
            System.out.println(GREEN_FILL + "\n¡Bienvenido a Omega Land!"+ ANSI_RESET + "\n\nAquí desatarás el poder del bando que tú elijas para alzarte victorioso.\nCada bando tiene aptitudes distintas e ideales para tu estilo de combate,para saber un poco más acerca de ellas escribe" +ANSI_RED +" <info>"+ANSI_RESET+".\nPara comenzar a jugar pulsa"+ANSI_RED+ " <A>"+ANSI_RESET+ ", para salir" +ANSI_RED+ " <S>"+ANSI_RESET+":");
            System.out.println("");
            String select2 = input.next();
            System.out.println("");
            String toLowerCase2 = select2.toLowerCase();
            if (toLowerCase2.equals("info")) {
                new GUI().setVisible(true);
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
            }
            if (toLowerCase2.equals("s")) {
                System.out.println("¡Gracias por jugar! Vuelve pronto.");
                bandera = false;
            }
            if (toLowerCase2.equals("a")) {
                System.out.println("Cargando...");
                System.out.println("¡Saludos guerrero!\nAntes de comenzar a jugar necesito saber tu nombre: ");
                String nombre1 = input.next();
                System.out.println("\nElija un bando por favor: ");
                System.out.println("1.Blue Earth\n2.Green Comet\n3.Orange Moon\n4.Yellow Star");
                boolean validarBando = true;
                String bandoLocal2 = "";
                while (validarBando) {
                    int bando = input.nextInt();
                    if (bando == 1) {
                        bandoLocal2 = "Earth";
                        break;
                    }
                    if (bando == 2) {
                        bandoLocal2 = "Comet";
                        break;
                    }
                    if (bando == 3) {
                        bandoLocal2 = "Moon";
                        break;
                    }
                    if (bando == 4) {
                        bandoLocal2 = "Star";
                        break;
                    } 
                    if (bando != 1 || bando != 2 || bando != 3 || bando != 4) {
                        System.out.println(" ");
                        System.out.println(ANSI_RED + "No existe un quinto bando en discordia que corresponda a ese número. Escriba un dato válido.");
                        System.out.println("Elija un bando por favor: ");
                    }
                }
                System.out.println("-------------------------------------------------");
                System.out.println("Jugador 2: " + nombre1);
                System.out.println("Comandará a: " + bandoLocal2);
                name1 = nombre1;
                milicia1 = bandoLocal2;
                factory = FactoryProducer.getFactory(1);
                Edificio centralj2 = factory.getEdificio(4);
                centralj2.build(faseJ2, name, milicia,name1,milicia1);
                bandera = false;
                
            }
            if (bandera == false) {
                break;
            }
            if (!toLowerCase2.equals("a") || !toLowerCase2.equals("s") || !toLowerCase2.equals("info")) {
                System.err.println("Ingrese un dato válido");
                System.out.println(" ");
            }
        }
    }
}
