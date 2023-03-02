/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Rectangulo {
    
    //Creamos atributos de instancia
    
    private double base;
    private double altura;
    
    
    //metodo constructor
    public Rectangulo() {
        
        this.altura=0;
        this.base=0;

}
    
    //metodo getter and setter
    
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura (double altura){
         this.altura = altura;
    }
    public void setBase (double base){
         this.base = base;
    }
    
    //metodos miembros
    public double calcularArea(){
        return this.base * this.altura;
    }
    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
}
