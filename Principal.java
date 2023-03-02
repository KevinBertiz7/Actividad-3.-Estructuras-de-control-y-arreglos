/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import modelo.Rectangulo;

/**
 *
 * @author ESTUDIANTES
 */
public class Principal {

    public static void main(String[] args) {
      
        Rectangulo r = new Rectangulo();
        System.out.println("Area: "+ r.calcularArea());
        System.out.println("Perimetro: "+ r.calcularPerimetro());
        
        
        
        Rectangulo r2 = new Rectangulo();
        r2.setAltura(30);
        r2.setBase(15);
        System.out.println("Area: "+ r2.calcularArea());
        System.out.println("Perimetro: "+ r2.calcularPerimetro());
        
        
    }
}
