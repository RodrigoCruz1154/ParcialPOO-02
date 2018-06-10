package abstractfactory;

import abstractfactory.edificios.Edificio;
import abstractfactory.militantes.Militante;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;
import gui.GUI;
import java.util.ArrayList;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class OmegaLand {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        boolean bandera = true;
        int waitANDsee = 0;
        AbstractFactory factory;

        
//jugador 1        
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
            }
            if (toLowerCase.equals("a")) {
                System.out.println("Cargando...");
                System.out.println("¡Saludos guerrero!\nAntes de comenzar a jugar necesito saber tu nombre: ");
                String nombreJ1 = input.nextLine();
                System.err.println("-------------------------------------------------");
                System.out.println("Jugador 1: " + nombreJ1);
                waitANDsee = 1;
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
        factory = FactoryProducer.getFactory(1);
        Edificio centralj1 = factory.getEdificio(4);
        centralj1.build();

        
//jugador 2        
        if (waitANDsee == 1) {
            while (bandera) {
                System.out.println("\n¡Bienvenido a Omega Land!\n\nAquí desatarás el poder del bando que tú elijas para alzarte victorioso.\nCada bando tiene aptitudes distintas e ideales para tu estilo de combate,para saber un poco más acerca de ellas escribe <info>.\nPara comenzar a jugar pulsa <A>, para salir <S>:");
                System.out.println("");
                String select2 = input.nextLine();
                System.out.println("");
                String toLowerCase = select2.toLowerCase();
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
                    String nombreJ2 = input.nextLine();
                    System.err.println("-------------------------------------------------");
                    System.out.println("Jugador 2: " + nombreJ2);
                    bandera = false;
                }
                if (bandera == false) {
                    break;
                }
                if (!toLowerCase.equals("a") || !toLowerCase.equals("s") || !toLowerCase.equals("info")) {
                    System.err.println("Ingrese un dato válido");
                    System.out.println("-------------------------------------------------");
                }
            }
            factory = FactoryProducer.getFactory(1);
            Edificio centralj2 = factory.getEdificio(4);
            centralj2.build();
        }
    }
}
