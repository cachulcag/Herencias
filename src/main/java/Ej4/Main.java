/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;


/**
 *
 * @author crist
 */
public class Main {

    public static void main(String[] args) {
        
        
        Circulo cir = new Circulo(4.5,5);
        cir.calculoArea();
        cir.calculoPerimetro();
        
        Rectangulo rec = new Rectangulo(4,6.8);
        rec.calculoArea();
        rec.calculoPerimetro();
    }

}
