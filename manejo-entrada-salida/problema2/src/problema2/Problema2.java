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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double hijo1, hijo2, hijo3, totalG;

        System.out.println("Ingrese los gastos de su primer hijo");
        hijo1 = entrada.nextDouble();
        System.out.println("Ingrese los gastos de su segundo hijo");
        hijo2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos de su tercer hijo");
        hijo3 = entrada.nextDouble();

        totalG = hijo1 + hijo2 + hijo3;

        System.out.printf("*****GASTOS*****\nEl total de gastos de sus "
                + "tres hijos son. \nTotal:%.2f", totalG);
    }

}
