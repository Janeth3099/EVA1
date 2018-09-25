
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanessa Carrillo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Inpt = new Scanner(System.in);
        System.out.println("Programa para calcular el área de un triángulo");
        System.out.println("Introduce la base: ");
        double Base = Inpt.nextDouble();
        System.out.println("Introduce la altura: ");
        double He = Inpt.nextDouble();
        //Llamada a función
        double Are = CalAre(Base, He);
        System.out.println("El área es: " + Are);
        //Lamada a función
        double Are2 = CalAre(100, 200);
        System.out.println("El área es: " + Are2);
        }
    //FUNCIÓN CALCULA ÁREA DE TRIÁNGULO
    //modificador de acceso - Tipo de retorno - Nombre (valores de entrada)
    //Declaración o cabecera de la función
    public static double CalAre(double Base, double He) {
    // Implementación de la función
    double Are = (Base * He)/2;
    return Are;    
    }
}
