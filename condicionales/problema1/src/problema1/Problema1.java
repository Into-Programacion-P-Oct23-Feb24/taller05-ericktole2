/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author toled
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int edad;
        double kvati, costo, plantillaluz;
        
        System.out.println("Ingrese su nombre porfavor ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        System.out.println("Ingrese los kilovatios que consumio este mes");
        kvati = entrada.nextDouble();

        System.out.println("Ingrese el costo por hora que tienen los kilovatios");
        costo = entrada.nextDouble();

        plantillaluz = (kvati * costo);

        if (edad > 65) {
            plantillaluz = (plantillaluz - (plantillaluz * 0.10));
        }
        System.out.printf("Etimado %s su total a pagar es. \n Planilla de luz: %.2f",nombre, plantillaluz);

    }
}
