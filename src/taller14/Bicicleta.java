/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

/**
 *
 * @author marya
 */
public class Bicicleta extends Vehiculo {
    
    String tamaño;

    public Bicicleta(String tamaño) {
        this.tamaño = tamaño;
    }
    
    @Override
    public void mover(){
        System.out.println("La bicicleta" +tamaño+ "esta subiendo la pendiente.");
    }
}
