/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

/**
 *
 * @author marya
 */
public class pruebaPerEstProf {
    
    public static void main(String[] args) {
        
        Persona persona2 = new Persona("Hugo",30);
        Persona estudiante2 = new Estudiante("Sandra",23);
        Persona profesor2 = new Profesor("Juan",45);
        
        System.out.println("Presentaciones:");
        persona2.presentarse();
        estudiante2.presentarse();
        profesor2.presentarse();
    }
}

