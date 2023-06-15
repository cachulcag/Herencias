/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author crist
 */
public class Animales{

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animales(String nombre, String raza, int edad, String alimento) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void alimentarse() {
        System.out.println(this.nombre + " de raza: " + this.raza + ", se alimenta de: " + this.alimento);
    }
}
