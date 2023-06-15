/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej.Extra2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    private Collection<Edificio> edificios = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private boolean techo = true;

    public void llenarEdificios() {
        do {
            System.out.println("Que desea ingresar");
            System.out.println("Oficinas (1)");
            System.out.println("Polideportivo (2)");
            switch (leer.nextInt()) {
                case 1:
                    System.out.println("ingrese el n° de oficinas, n° de personas y n° pisos");
                    edificios.add(new Oficinas(leer.nextInt(), leer.nextInt(), leer.nextInt(), (float) (Math.random() * 20), (float) (Math.random() * 20), (float) (Math.random() * 50)));
                    break;
                case 2:
                    System.out.println("Su edificio tiene techo?");
                    if ("no".equalsIgnoreCase(leer.next())) {
                        techo = false;
                    }
                    System.out.println("ingrese el nombre del Polideportivo");
                    edificios.add(new Polideportivo(techo, leer.next(), (float) (Math.random() * 20), (float) (Math.random() * 20), (float) (Math.random() * 50)));
                    break;
                default:
                    System.out.println("Intentelo nuevamente");
                    ;
            }
            System.out.println("Desea ingresar un nuevo edificio");
        } while ("si".equalsIgnoreCase(leer.next()));
    }

    public void mostrarDatos() {
        for (Edificio edificio : edificios) {
            System.out.println("Los datos del Edificio " + edificio.toString() + " son:");

            edificio.calcularSuperficie();
            edificio.calcularVolumen();

            if (edificio instanceof Oficinas) {
                System.out.println("El número de personas que entrarían en un piso son: "
                        + (((Oficinas) edificio).numerosPersonas) * ((Oficinas) edificio).numeroOficinas);
                System.out.println("El número de personas que entrarían en un edificio son: "
                        + ((Oficinas) edificio).numerosPersonas * ((Oficinas) edificio).numeroOficinas * ((Oficinas) edificio).numeroPisos);

//                Oficinas ofi = (Oficinas) edificio; //otra forma de castear
//                System.out.println("El número de personas que entrarían en un piso son: " + ofi.numerosPersonas * ofi.numeroOficinas);
//                System.out.println("El número de personas que entrarían en un edificio son: " + ofi.numerosPersonas * ofi.numeroOficinas * ofi.numeroPisos);
            }

            System.out.println("----------------------------");
        }

        System.out.println("La cantidad de edificios Polideportivos con techo son: " + Polideportivo.techado);
        System.out.println("La cantidad de edificios Polideportivos abiertos son: " + Polideportivo.abierto);
    }
}
