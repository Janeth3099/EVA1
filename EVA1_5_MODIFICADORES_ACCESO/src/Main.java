//Continuación de la descripción de clases y objetos
//Modificadores de acceso para atributos, métodos y clases
//Abstracción y Encapsulamiento (simplificar y limitar el acceso)

/**
 *
 * @author Vanessa Carrillo
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Instanciar un objeto (una instancia de la clase)
    Bank Bk = new Bank();
    Bk.Cus = "Vanessa Carrillo";
    Bk.Bal = 10000;
        System.out.println("Cliente: " + Bk.Cus);
        System.out.println("Saldo de cuenta: " + Bk.Bal);
    //Otro Cliente     
    Bank Bk2 = new Bank();    
    
    }
    
}
//ABSTRACCIÓN DEL PROBLEMA DE REPRESENTAR UN BANCO
class Bank {
    //En general, los atributos de una clase son privados
    private String Cus;
    private double Bal;
}