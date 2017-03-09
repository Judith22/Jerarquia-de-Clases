/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author lenovo
 */
public class Trapecio extends figuras{
    //B=base mayor
    //b=base menor
    double B;
    double b;
    double altura;
    
    public Trapecio (double B, double b, double altura){
        
        this.B=B;
        this.b=b;
        this.altura=altura;
        
    }
 @Override
 public double getArea() {
     return (B+b*altura)/2;
 }
         
}
