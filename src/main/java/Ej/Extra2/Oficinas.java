/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej.Extra2;

/**
 *
 * @author crist
 */
public class Oficinas extends Edificio {

    protected Integer numeroOficinas, numerosPersonas, numeroPisos;

    public Oficinas(Integer numeroOficinas, Integer numerosPersonas, Integer numeroPisos, float ancho, float largo, float altura) {
        super(ancho, largo, altura);
        this.numeroOficinas = numeroOficinas;
        this.numerosPersonas = numerosPersonas;
        this.numeroPisos = numeroPisos;
    }

    @Override
    protected void calcularSuperficie() {
        System.out.println("La superficie de la Oficina es: " + (super.largo * super.ancho));
    }

    @Override
    protected void calcularVolumen() {
        System.out.println("El volumen de la Oficina es: " + (super.largo * super.ancho * super.ancho));
    }

}
