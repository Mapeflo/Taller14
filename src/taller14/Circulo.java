/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

/**
 *
 * @author marya
 */
public class Circulo extends Figura {
    
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
        double area = Math.PI*(radio*radio);
        System.out.println("El area del circulo es: " + area);    
    }  
}
