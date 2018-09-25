/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Vanesa Carrillo
 */
public class Persona {
/*
Nombre, apellidos
Edad, geenero, rfc, dirección
Estado civil, nivel de estudio,
Salario    
*/
String nombre, apPa, apMa;
private int edad;
private String Gen, RFC, calle, colonia, ciudad;
private int NuCas;
private int estado;
private String EdoCiv;
private String nivEd;
private double salario;

public String getNombre() {
    return nombre;
}
public void setNombre(String Vnom) {
    nombre = Vnom;
} 

    public String getApPa() {
        return apPa;
    }

    public void setApPa(String apPa) {
        this.apPa = apPa;
    }

    public String getApMa() {
        return apMa;
    }

    public void setApMa(String apMa) {
        this.apMa = apMa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNuCas() {
        return NuCas;
    }

    public void setNuCas(int NuCas) {
        this.NuCas = NuCas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEdoCiv() {
        return EdoCiv;
    }

    public void setEdoCiv(String EdoCiv) {
        this.EdoCiv = EdoCiv;
    }

    public String getNivEd() {
        return nivEd;
    }

    public void setNivEd(String nivEd) {
        this.nivEd = nivEd;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getGen() {
        return Gen;
    }

    public void setGen(String Gen) {
        this.Gen = Gen;
    }
    
    
}
