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
public class Triangulo extends figuras {
    double base;
    double altura;
  public Triangulo(double base, double altura){
      this.base = base;
      this.altura = altura;
  }
    @Override
  public double getArea(){
      return base*altura/2;
  }   
}
