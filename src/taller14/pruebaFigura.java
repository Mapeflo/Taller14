/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

/**
 *
 * @author marya
 */
public class pruebaFigura {
    
     public static void main(String[] args) {
        
       Figura circulo = new Circulo(3);
       Figura rectangulo = new Rectangulo(7,5);
        
       System.out.println("Calcular area de las figuras:");
       circulo.calcularArea();
       rectangulo.calcularArea();
    
     }
}
