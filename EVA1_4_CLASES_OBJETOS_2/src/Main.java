
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar la clase persona -->
        //1.- los objetos son identidicadores (variables)
        int Val;     //Declara
        Persona Per1;//Declaración
        //Instanciar = Asignar valor (memoria) -> new
        Val = 10;
        Per1 = new Persona();//El objeto existe
        //Capturar nombre
        System.out.println("Introduce tu nombre: ");
        Scanner Inpt = new Scanner(System.in);
        Per1.Name = Inpt.nextLine();
        System.out.println("Introduce tu apellido: ");
        Per1.LNam = Inpt.nextLine();
        Per1.printCompleteName();
        //Persona#2----------------------------------------------------------
        Persona Per2 = new Persona();
        System.out.println("Introduce tu nombre: ");
        Per2.Name = Inpt.nextLine();
        System.out.println(Per2.Name);
    }
    
}

class Persona{
    //Atributos de la clase
    //Determinan el estado del objeto
    String Name;
    String LNam;
    int Age;
    String RFC;
    String Gen;
    int BSta;
    String City;
    String StatC; 
    //Comportamiento de la clase
    //Métodos y/o funciones
    //Nivel de acceso - Valor de retorno - Nombre (Argumentos)
    public void printCompleteName () {
        System.out.println(Name + " " + LNam);
    }
            
}