package abstractfactory;
import abstractfactory.edificios.Edificio;
import abstractfactory.militantes.Militante;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;
import gui.GUI;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class OmegaLand {
    public static void main(String[] args) {
        
        ArrayList<Edificio> edificios = new ArrayList<>();
        ArrayList<Militante> militantes = new ArrayList<>();
        ArrayList<Terrestre> terrestres = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<String> contrincantes = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int flag = 0;
        
        while (flag == 0) {
            System.out.println("\n¡Bienvenido a Omega Land!\n\nAquí desatarás el poder del bando que tú elijas para alzarte victorioso.\nCada bando tiene aptitudes distintas e ideales para tu estilo de combate,\npara saber un poco más acerca de ellas escribe <info> y te aparecerá una ventana emergente con la información necesaria para que juegues de una mejor manera.\n\nPara comenzar a jugar pulsa <F>, para salir <S> ¡A la carga!\n");
            String select1 = input.nextLine();
            if (select1.equals("info") || select1.equals("Info") || select1.equals("INFO") || select1.equals("iNfo") || select1.equals("inFo") || select1.equals("infO") || select1.equals("INfo") || select1.equals("iNFo") || select1.equals("inFO") || select1.equals("InFo") || select1.equals("iNfO") || select1.equals("INFo") || select1.equals("iNFO")) {
                new GUI().setVisible(true);
                System.out.println("-------------------------------------------------");
            }
            if (select1.equals("S") || select1.equals("s")) {
                System.out.println("\n¡Gracias por jugar! Vuelve pronto.\n");
                flag = 1;
            }
            else if (select1.equals("F") || select1.equals("f") || select1.equals("efe")) {
                System.out.println("\nIniciando el juego...\n");
                System.out.println("¡Saludos guerrero!\nAntes de comenzar a jugar necesito saber tu nombre: ");
                String nombreJ1 = input.next();
                contrincantes.add(nombreJ1);
            } else {
                System.err.println("Ingrese un dato válido.");
                System.out.println("-------------------------------------------------");
            }
        }
        
        /*AbstractFactory guerra;
        
        guerra = FactoryProducer.getFactory(1);
        Edificio torre = guerra.getEdificio(1);
        torre.build();*/
    }
    
}
