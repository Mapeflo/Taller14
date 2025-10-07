/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

/**
 *
 * @author marya
 */
public class Profesor extends Persona {

    public Profesor(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void presentarse(){
        System.out.println("Hola, soy profesor y mi nombre es: " +nombre+ "y tengo" +edad+ "años.");
    }   
}
