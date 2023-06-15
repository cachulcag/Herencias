/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author crist
 */
public class Electrodomestico {

    protected double precio = 1000;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected Electrodomestico() {
    }

    protected Electrodomestico(String color, char consumoEnergetico, double peso) {
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        precioFinal();
    }

    protected double getPrecio() {
        return precio;
    }

    protected void setPrecio(double precio) {
        this.precio = precio;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    protected void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    protected double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico(char letra) {

        if (!(letra <= 'A' && letra >= 'F')) {
            this.consumoEnergetico = 'F';
        }
        this.consumoEnergetico = letra;
    }

    protected void comprobarColor(String color) {
        String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        for (int i = 0; i < colores.length; i++) {
            if (!color.equalsIgnoreCase(colores[i])) {
                this.color = "Blanco";
            }
        }
        this.color = color; 
    }

    protected void precioFinal() {
        if (this.peso <= 19) {
            this.precio = +100;
        }
        if (this.peso >= 20 || this.peso <= 49) {
            this.precio = +500;
        }
        if (this.peso >= 50 || this.peso <= 79) {
            this.precio = +800;
        }
        if (this.peso >= 80) {
            this.precio = +1000;
        }

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
    }

    @Override
    public String toString() {
        return "precio = " + precio + ", color = " + color + ", consumoEnergetico = " + consumoEnergetico + ", peso = " + peso;
    }
}
