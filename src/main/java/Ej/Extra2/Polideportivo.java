/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej.Extra2;

/**
 *
 * @author crist
 */
public class Polideportivo extends Edificio {

    protected static int techado;
    protected static int abierto;
    protected String nombre;

    public Polideportivo(boolean techado, String nombre, float ancho, float largo, float altura) {
        super(ancho, largo, altura);
        if (techado) {
            Polideportivo.techado++;
        }else{
            Polideportivo.abierto++;
        }

        this.nombre = nombre;
    }

    @Override
    protected void calcularSuperficie() {
        System.out.println("La superficie del Polideportivo " + this.nombre + " es: " + (super.largo * super.ancho));
    }
    @Override
    protected void calcularVolumen() {
        System.out.println("El volumen del Polideportivo " + this.nombre + " es: " + (super.largo * super.ancho * super.ancho));
    }

}
