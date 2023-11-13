/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author toled
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoM, mins, totalM;

        System.out.println("Ingrese el costo por minuto telefonico");
        costoM = entrada.nextDouble();

        System.out.println("Ingrese la cantidad de minutos que consumio este mes");
        mins = entrada.nextDouble();

        totalM = costoM * mins;

        System.out.printf("El valor a pagar de su planilla telefonica es."
                + "\nTotal a pagar: %.2f", totalM);
    }

}
