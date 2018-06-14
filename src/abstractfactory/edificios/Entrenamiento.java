/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificios;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.terrestres.Terrestre;

/**
 *
 * @author acer
 */
public class Entrenamiento implements Edificio {

    AbstractFactory guerreros;

    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void build(int iteracion, String nombre, String bando, String nombre2, String bando2) {
    }

    @Override
    public Edificio buildEdificio(int oro, int faseExt) {
        Entrenamiento construccion = new Entrenamiento();
        construccion.setVida(2500);
        int faseinterna = 0;
        if (faseExt == 0) {
            System.out.println("Construyendo, por favor espere...");
        }
        return construccion;
    }

    @Override
    public void usoEdificio(Edificio edificacion) {
        System.out.println("¡Se ha construido su base de entrenamiento!");
    }
}
