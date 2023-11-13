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
        
        double base, area, altura;
        
        System.out.println("Ingrese la base de su triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura de su triangulo");
        altura = entrada.nextDouble();
        
        area = (base * altura)/2;
        
        System.out.printf("*****AREA DEL TRIGANGULO*****\nBase: %.2f\n"
                + "Altura: %.2f\nArea: %.2f", base, altura, area);
    }
    
}