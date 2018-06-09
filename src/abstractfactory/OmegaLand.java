package abstractfactory;
import abstractfactory.edificios.Edificio;
import abstractfactory.militantes.Militante;
import abstractfactory.terrestres.Terrestre;
import abstractfactory.vehiculos.Vehiculo;
/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class OmegaLand {
    public static void main(String[] args) {
        AbstractFactory guerra;
        
        guerra = FactoryProducer.getFactory(1);
        Edificio torre = guerra.getEdificio(1);
        torre.build();
    }
    
}
