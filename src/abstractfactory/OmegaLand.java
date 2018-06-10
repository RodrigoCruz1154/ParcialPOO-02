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
        Scanner input = new Scanner(System.in);
        
        System.out.println("¡Bienvenido a Omega Land!\nAquí desatarás el poder del bando que tú elijas para alzarte victorioso.\nCada bando tiene aptitudes distintas e ideales para tu estilo de combate, para saber un poco más acerca de ellas escribe <info> y te aparecerá una ventana emergente con la información necesaria para que juegues de una mejor manera.\nPara comenzar a jugar pulsa <F> ¡A la carga!\n");
        String select1 = input.nextLine();
        if(select1.equals("info")){
            new GUI().setVisible(true);
        }
        
        /*AbstractFactory guerra;
        
        guerra = FactoryProducer.getFactory(1);
        Edificio torre = guerra.getEdificio(1);
        torre.build();*/
    }
    
}
