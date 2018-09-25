/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa;

/**
 *
 * @author invitado
 */
public class MejorBanco {
    //Atributos de la clase
    //Siempre deben ser privados
private String Name;
private double ABal;

//Siempre debe existir un intermediario con los datos
//Intermediarios son métodos: 
//get (lectura) y set (escritura) 
//Métodos: 
//Nivel de acceso - Valor de retorno - Nombre(Variables de entrada)
//Leer datos de nueva clase
//Comportamiento de la clase
//Todo método público de la clase es la interfaz de
//Comunicación con la clase
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getABal() {
        return ABal;
    }

    public void setABal(double ABal) {
        this.ABal = ABal;
    }









}
