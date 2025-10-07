/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

/**
 *
 * @author marya
 */
public class Coche extends Vehiculo {
    
    String tipo;

    public Coche(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void mover(){
        System.out.println("El coche" +tipo+ "se esta moviendo a la derecha.");
    }   
    public void mostrarVelocidad(){
        System.out.println("Velocidad del coche" +tipo+ "es la siguiente:");
    }
}
