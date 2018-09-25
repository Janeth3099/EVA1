
import MisClases.Persona;
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
    Scanner inpt = new Scanner(System.in);
    Persona info = new Persona();
        System.out.println("Introduce tu nombre: ");
        info.setNombre(inpt.nextLine());
        System.out.println("Introduce tu apellido paterno: ");
        info.setApPa(inpt.nextLine());
        System.out.println("Introduce tu apellido materno: ");
        info.setApMa(inpt.nextLine());
        System.out.println("Introduce tu género: ");
        info.setGen(inpt.nextLine());
        System.out.println("Introduce tu RFC: ");
        info.setRFC(inpt.nextLine());
        System.out.println("Introduce tu calle: ");
        info.setCalle(inpt.nextLine());
        System.out.println("Introduce tu colonia: ");
        info.setColonia(inpt.nextLine());
        System.out.println("Introduce tu ciudad: ");
        info.setCiudad(inpt.nextLine());
        System.out.println("Introduce tu estado civil: ");
        info.setEdoCiv(inpt.nextLine());
        System.out.println("Cuál es tu último nivel de estudios?: ");
        info.setNivEd(inpt.nextLine());
        System.out.println("Introduce tu edad: ");
        info.setEdad(inpt.nextInt());
        System.out.println("Introduce el número de tu casa: ");
        info.setNuCas(inpt.nextInt());
        System.out.println("Introduce el número de tu estado: ");
        info.setEstado(inpt.nextInt());
        System.out.println("Introduce tu salario: ");
        info.setSalario(inpt.nextDouble());
        
        System.out.println("Los datos son: ");
        System.out.println(info.getNombre());
        System.out.println(info.getApPa() +" " + info.getApMa());
        System.out.println(info.getGen());
        System.out.println(info.getEdad());
        System.out.println(info.getEdoCiv());
        System.out.println(info.getNuCas() + " " + info.getCalle() + " " + info.getColonia() + " " + info.getCiudad());
        System.out.println(info.getEstado());
        System.out.println(info.getRFC());
        System.out.println(info.getSalario());
        System.out.println(info.getNivEd());
       
    
    }
    
}
