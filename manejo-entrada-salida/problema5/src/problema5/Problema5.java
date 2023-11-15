/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author toled
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double netflix, spotify, youtube, dropbox, valorM;

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el monto a pagar de  netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el monto a pagar de spotify");
        spotify = entrada.nextDouble();
        System.out.println("Ingrese el monto a pagar de youtube premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el monto a pagar de dropbox");
        dropbox = entrada.nextDouble();
        valorM = (netflix + spotify + youtube + dropbox);

        if (edad < 30) {
            valorM = valorM - (valorM * 0.20);
        }
        System.out.printf("El valor a pagar de todas sus plataformas "
                + "mensualmente es: %.2f$", valorM);
    }
}
