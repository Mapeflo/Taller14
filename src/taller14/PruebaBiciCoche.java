/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

/**
 *
 * @author marya
 */
public class PruebaBiciCoche {
    
    public static void main(String[] args) {
        
        Vehiculo coche = new Coche("Deportivo");
        Vehiculo bicicleta = new Bicicleta("Mediana");
        Vehiculo coche2 = new Coche("Clasico");
        
        System.out.println("Vehiculos que se moveran:");
        coche.mover();
        bicicleta.mover();
        
        //error: no se puede invocar el método mostrarVelocidad()porque no está definido en Vehículo.
        coche2.mostrarVelocidad();
        
    }
}
