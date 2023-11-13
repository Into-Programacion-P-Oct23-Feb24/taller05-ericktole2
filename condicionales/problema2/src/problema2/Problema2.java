/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author toled
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String descripcion = "Este producto dispone de joyas de un bajo valor";
        int cantidad;
        double precioU = 12.5;

        System.out.println("Ingrese la cantidad del producto");
        cantidad = entrada.nextInt();

        double costoP = (cantidad * precioU);

        if (cantidad > 50) {
            costoP = (costoP - (costoP * 0.15));

        }

        System.out.printf("*******PEDIDO*******\nDescripcion: %s\nCantidad: %d\n"
                + "Precio Unitario: %.2f\nCosto: %.2f", descripcion, 
                cantidad, precioU, costoP);
    }
}
