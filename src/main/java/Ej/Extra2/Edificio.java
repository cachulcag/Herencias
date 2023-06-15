/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej.Extra2;

/**
 *
 * @author crist
 */
public abstract class Edificio {
    
    protected float ancho, largo, altura;
    
    protected abstract void calcularSuperficie();
    protected abstract void calcularVolumen();

    public Edificio(float ancho, float largo, float altura) {
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
    }


}
