/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

/**
 *
 * @author crist
 */
public class Rectangulo implements calculoInterface {

    private double base ;
    private double altura ;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calculoPerimetro() {
        System.out.println((this.base*this.altura)*2);
    }

    public void calculoArea() {
        System.out.println(this.base*this.altura);
    }
}
