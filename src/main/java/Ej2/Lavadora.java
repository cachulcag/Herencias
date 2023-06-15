/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author crist
 */
public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            super.precio = +500;
        }
    }
}
