
import Lisa.Banco;
import Lisa.MejorBanco;

/*
 *Clase banco para ejemplificar el uso de atributos
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
     Banco Acco = new Banco();
     Acco.Nombre = "Roberto Antonio Pedroza Fernández";
     Acco.saldo = 21000;
        System.out.println("Información de la cuenta");
        System.out.println("Titular: " + Acco.Nombre);
        System.out.println("Saldo: " + Acco.saldo);
    //Me volaron la lana, me cambio de banco

    MejorBanco BAcco = new MejorBanco();
    BAcco.setName("Roberto Antonio Pedroza Feernández");
    BAcco.setABal(21500);
        System.out.println("Mi nueva cuenta en un mejor banco");
        System.out.println("Titular: " + BAcco.getName());
        System.out.println("Saldo: " + BAcco.getABal());
        
    }
    
}
