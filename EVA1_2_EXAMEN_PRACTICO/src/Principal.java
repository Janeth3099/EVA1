
import java.util.Scanner;

/*
 *Práctica del examen de diagnóstico
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
    Scanner sCaptu = new Scanner(System.in); //Variable para captura del teclado
    //Scanner es una clase para facilitar la lectura del teclado
    //System.in es la entrada de periféricos de Java
    System.out.println("Ingresa un número del 1 al 12: ");
    int eScMen = sCaptu.nextInt(); //Lo que el ususario teclee, lo convertimos a
                                   //entero
    switch(eScMen) { //Esta sección del código da un mes dependiendo del número ingresado
                     //Si ingresas un número mayor o menor que los número del rango
                     //1 al 12 te dirá que ingresaste un número inválido   
        case 1:
            System.out.println("Enero");
            break;
        case 2:
            System.out.println("Febrero");
            break;
        case 3:
            System.out.println("Marzo");
            break;
        case 4:
            System.out.println("Abril");
            break;
        case 5:
            System.out.println("Mayo");
            break;
        case 6:
            System.out.println("Junio");
            break;
        case 7:
            System.out.println("Julio");
            break;
        case 8:
            System.out.println("Agosto");
            break;
        case 9:
            System.out.println("Septiembre");
            break;
        case 10:
            System.out.println("Octubre");
            break;
        case 11:
            System.out.println("Noviembre");
            break;
        case 12:
            System.out.println("Diciembre");
            break;
        default:
            System.out.println("No existe el mes"); //Código que da un mensaje cuando 
                                                    //Se ingresa un número inválido
    }                               
    }
    
}
