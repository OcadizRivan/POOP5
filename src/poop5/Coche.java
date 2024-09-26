/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Ivan Ocadiz
 * Clase que construye coches
 */
public class Coche {
    private String chofer;
    private String copiloto;
    private String pasajero1;
    private String pasajero2;
    /**
     * Constructor vacío
     */
    public Coche(){
    }
    /**
     * Constructor lleno
     * @param chofer
     * @param copiloto
     * @param pasajero1
     * @param pasajero2 
     */
    public Coche(String chofer, String copiloto, String pasajero1, String pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    /**
     * Método para saber quién es el chofer
     */
    public void lugarChofer() {
        System.out.println(chofer + " es el chofer.");
    }
    /**
     * Método para saber quién es el copiloto
     */
    public void lugarCopiloto() {
        System.out.println(copiloto + " es el copiloto.");
    }
    /**
     * Método para saber quién es el pasajero 1
     */
    public void lugarPasajero1() {
        System.out.println(pasajero1 + " es el pasajero 1.");
    }
    /**
     * Método para saber quién es el pasajero 2
     */
    public void lugarPasajero2() {
        System.out.println(pasajero2 + " es el pasajero 2.");
    }
    /**
     * Mostrar todos los ocupantes del auto
     */
    public void mostrarOcupantes() {
        lugarChofer();
        lugarCopiloto();
        lugarPasajero1();
        lugarPasajero2();
    }   
}