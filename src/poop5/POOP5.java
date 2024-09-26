/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Ivan Ocadiz 
 */
public class POOP5{ 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                       
        
        //Definiendo e inicializando Circulo
        Circulo circulo = new Circulo();
        
        System.out.println(circulo.getRadio());
        //Imprime 0 ya que no se ha definido radio
        //Usa el constructor vacio para llenarlo
        
        //Si no hay constructor vacio -> manda un error muestra la traza de un programa,
        // es decir, donde esta el error.
        
        //Se borran los dos constructores -> Sì funciona
        // ---> ¿POR QUE NECESITAMOS UN CONSTRUCTOR VACIO <---
                
        circulo.setRadio(7.77f);
        
        circulo.calcularArea();
        
        circulo.calcularPerimetro();
        
        
        System.out.println("··········");
        
        
        //Creando un objeto de tipo Persona
        Persona rodrigo = new Persona();
        rodrigo.setEdad(19);
        rodrigo.setAltura(1.62f);
        rodrigo.setNombre("Ceron Noriega Eduardo Rodrigo");
        
        //Creando un objeto de tipo Fecha
        Fecha fechaDeNacimiento = new Fecha();
        fechaDeNacimiento.setDia(13);
        fechaDeNacimiento.setMes(11);
        fechaDeNacimiento.setAnio(2005);
        
        //Continuando con el objeto de tipo Persona ya que se creó Fecha
        rodrigo.setFechaDeNacimiento(fechaDeNacimiento);
        rodrigo.setOcupacion("Estudiante");
        
        rodrigo.jugar();
        rodrigo.comer();
        rodrigo.getFechaDeNacimiento();
        System.out.println(rodrigo);
        System.out.println(fechaDeNacimiento);
        
        //Metodo imprimir fecha
        System.out.println("Fecha de nacimiento de Rodrigo: ");
        rodrigo.getFechaDeNacimiento().imprimirFecha(); 
        
        // Crear un objeto Coche con los nombres de los ocupantes
        Coche coche = new Coche("Carlos", "Ana", "Luis", "María");

        // Mostrar los ocupantes y sus lugares
        coche.mostrarOcupantes();
       
    }
    
}