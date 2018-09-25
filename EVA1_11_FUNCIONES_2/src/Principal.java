
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
    //Llamada a función
    SalUsu();
    //Ejemplo 2
    String name2 = CapName();
    ImpName(name2);
    //simplificado
    ImpName(CapName());
    Recursividad();
    }
    //Necesitamos una función que salude al usuario
    public static void SalUsu(){
    Scanner Inpt = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String Name = Inpt.nextLine();
        System.out.println("Hola " + Name);
    }
    //Saludo separado
    //Función para capturar el nombre del usuario y regresar un String
    public static String CapName(){
    Scanner Inpt = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String Name = Inpt.nextLine();
    return Name;    
    }
    //Función para imprimir un saludo
    public static void ImpName(String Name) {
        System.out.println("Hola " + Name);
    }
    public static void Recursividad(){
        System.out.println("Hola");
        Recursividad();
    }
}
