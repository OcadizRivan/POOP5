/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Ivan Ocadiz
 * Clase que crea círculos
 */
public class Circulo {
   
    //Atributos
    final float PI = 3.14f;//Declaramos que no es variable sino constante
    private float radio;
    
    /**
     * Constructor vacío
     */
    public Circulo(){
    }
    /**
     * Constructor lleno
     * @param radio El radio del círculo
     */
    public Circulo(float radio){
        this.radio = radio;
    }
    
    /**
     * Método que devuelve el radio
     * @return Radio del círculo
     */
    public float getRadio(){
        return radio;
    }
    /**
     * Metodo que establece el radio
     * @param radio Radio del círculo
     */
    public void setRadio(float radio){
        this.radio=radio;
    }
    /**
     * Método que calcula el perímetro del círculo
     */
    public void calcularPerimetro(){
        float perimetro = 2*PI*radio;
        System.out.println("Perimetro:"+perimetro); 
    }
    /**
     * Método que calcula el área del círculo
     */
    public void calcularArea(){
        float area = PI*radio*radio;
        System.out.println("Area es: "+area);    
    }     
    /**
     * Método que parsea un objeto a una cadena
     * @return Los atributos del círculo en una cadena
     */
    @Override
    public String toString() {
        return "Circulo{" + "PI=" + PI + ", radio=" + radio + '}';
    }
}
