/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Ivan Ocadiz
 * Clase que crea a una Persona
 */
public class Persona {
    private int edad;
    private float altura;
    private String nombre;
    private Fecha fechaDeNacimiento;
    private String ocupacion;
    /**
     * Constructor vacío
     */
    public Persona(){
    }
    /**
     * Constructor lleno
     * @param edad La edad de la persona
     * @param altura La altura de una persona 
     * @param nombre El nombre de la persona 
     * @param fechaDeNacimiento Su fecha de nacimiento con el formato de la clase Fecha
     * @param ocupacion La ocupación de la persona
     */
    public Persona(int edad, float altura, String nombre, Fecha fechaDeNacimiento, String ocupacion){
        this.edad=edad;
        this.altura=altura;
        this.nombre=nombre;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.ocupacion=ocupacion;
    }
    /**
     * Metodo que devuelve la edad de la persona
     * @return La edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo que establece la edad de la persona
     * @param edad La edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo que devuelve la altura de la persona
     * @return La altura de la persona
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Metodo que establece la altura de la persona 
     * @param altura La altura de una persona
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Metodo que devuelve el nombre de la persona
     * @return El nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que establece el nombre de la persona
     * @param nombre El nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que devuelve la fecha de nacimiento con el formato dia/mes/año
     * @return Fecha de nacimiento
     */
    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    /**
     * Metodo que establece la fecha de nacimiento 
     * @param fechaDeNacimiento La fecha de nacimiento con el formato dia/mes/año
     */
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    /**
     * Metodo que devuelve la ocupación de una persona
     * @return La ocupación de la persona
     */
    public String getOcupacion() {
        return ocupacion;
    }
    /**
     * Metodo que establece la ocupación de la persona
     * @param ocupacion La ocupación de la persona
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    /**
     * Metodo que hace comer a una persona mediante un mensaje en pantalla
     * @return Un mensaje que indica que la persona está comiendo
     */
    public boolean comer(){
        System.out.println("Estoy comiendo ñam ñam");
        return true;
    }
    /**
     * Metodo que hace a una persona jugar mediante un mensaje en pantalla
     * @return Un mensaje que indica que la persona está jugando
     */
    public boolean jugar(){ 
        System.out.println("Qué divertido juego!");
        return true;
    }
    /**
     * Metodo que parsea un objeto a una cadena 
     * @return Los atributos de la persona en una cadena
     */
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ocupacion=" + ocupacion + '}';
    }
}
