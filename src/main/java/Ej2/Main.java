/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        int op;
        System.out.println("Bienvenido que desea realizar");
        
        do {
            System.out.println("Ingresar nueva lavadora (1)");
            System.out.println("Ingresar nuevo televisor (2)");
            System.out.println("Conocer los precios (3)");
            System.out.println("Salir (4)");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese la carga en kg, el color, el consumo energético (A-F) y el peso ");
                    electrodomesticos.add(new Lavadora(leer.nextDouble(), leer.next(), leer.next().toUpperCase().charAt(0), leer.nextDouble()));
                    break;
                case 2:
                    System.out.println("El televisor tiene sintonizador?");
                    boolean var = true;
                    if ("si".equalsIgnoreCase(leer.next())) {
                        var = false;
                    }
                    
                    System.out.println("Ingrese las pulgadas, el color, el consumo energético (A-F) y el peso ");
                    electrodomesticos.add(new Televisor(leer.nextInt(), var, leer.next(), leer.next().toUpperCase().charAt(0), leer.nextDouble()));
                    
                    break;
                case 3:
                    electrodomesticos.forEach(aparato -> System.out.println(aparato.toString()));
                    break;
                default:
                    System.out.println("Has ingresado incorrectamente");
                   
            }
            
        } while (op != 4);
        
    }
    
}
