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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String origen, marca;
        double costo, precioV;
        double impuesto = 0;

        System.out.println("Ingrese el origen del auto");
        origen = entrada.nextLine();
        System.out.println("Ingrese la marca del auto");
        marca = entrada.nextLine();
        System.out.println("Ingrese el costo del auto");
        costo = entrada.nextDouble();

        if (origen.equals("Italia")) {
            impuesto = (costo * 0.15);
        } else {
            if (origen.equals("Alemania")) {
                impuesto = (costo * 0.20);
            } else {
                if (origen.equals("Japon")) {
                    impuesto = (costo * 0.30);
                } else {
                    if (origen.equals("USA")) {
                        impuesto = (costo * 0.08);
                    } else {
                        System.out.println("Origen No Valido");
                    }
                }
            }
        }

        precioV = costo + impuesto;
        System.out.printf("*****FACTURA*****\nImpuesto: %.2f\nPrecio de venta: %.2f",
                 impuesto, precioV);
    }

}
