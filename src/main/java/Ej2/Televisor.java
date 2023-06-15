/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author crist
 */
public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador, String color, char consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas > 40) {
            super.precio = +(super.precio * 0.30);
        }
        if (sintonizador) {
            super.precio = +500;
        }
    }
}
