/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

/**
 *
 * @author crist
 */
public class Circulo implements calculoInterface {

    double diametro;
    double radio;

    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    @Override
    public void calculoPerimetro() {
        System.out.println(PI * diametro);

    }

    @Override
    public void calculoArea() {
        System.out.println(PI * (radio * radio));
    }
}
