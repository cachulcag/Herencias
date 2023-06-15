/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ej1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class Main {

    public static void main(String[] args) {
        List<Animales> animales = new ArrayList();
        animales.add(new Perro("Fito", "Beagle", 1,"Croquetas"));
        animales.add(new Gato("Honey", "Siamés",2, "Procat"));
        animales.add(new Caballo("Cometa", "Mustang",5, "Pasto"));
        
        animales.forEach(animal -> animal.alimentarse());
    }
}
