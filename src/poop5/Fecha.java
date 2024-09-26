/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Ivan Ocadiz
 * Clase que establece la Fecha de nacimiento bajo el formato dia/mes/año
 */
public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    /**
     * Constructor vacío
     */
    public Fecha(){
    }
    /**
     * Constructor lleno
     * @param dia Día en que nació una persona
     * @param mes Mes en que nació una persona
     * @param anio Año en que nació una persona
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Clase que devuelve el día de nacimiento de una persona
     * @return Día de nacimiento
     */
    public int getDia(){
        return dia;
    }
    /**
     * Clase que establece el día de nacimento de una persona
     * @param dia Día de nacmiento
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Clase que devuelve el mes de nacimiento de una persona
     * @return Mes de nacimiento
     */
    public int getMes() {
        return mes;
    }
    /**
     * Clase que establece el mes de nacimiento de una persona
     * @param mes Mes de nacimiento
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * Clase que devuelve el año de nacmimiento de una persona
     * @return 
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Clase que establece el año de nacimiento de una persona
     * @param anio Año de nacimiento
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Clase que imprime la fecha con el formato: dia/mes/año
     * @return Una cadena con el formato dia/mes/año
     */
    public String imprimirFecha() {
        System.out.println(dia+"/"+mes+"/"+anio);
        return (dia+"/"+mes+"/"+anio);
    }
    /**
     * Metodo que parsea un objeto a una cadena
     * @return Los atributos de Fecha en una cadena
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

    
}
