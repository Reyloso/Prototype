/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Ingeniero
 */
public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
  Camisetas nueva = new CamisaLarga();
  nueva.setNombre("rey");
  nueva.setTalla(6);
  nueva.setColor("azul");
  nueva.setEstampado("3D");
  System.out.println(nueva.verCamiseta());
  
  Camisetas nueva2 = nueva.clone();
  nueva2.setNombre("fabian");
  nueva2.setColor("Negro");
  System.out.println(nueva2.verCamiseta());
  
  Camisetas nueva3 = new CamisaCorta();
  nueva3.setNombre("rey");
  nueva3.setTalla(6);
  nueva3.setColor("verde");
  nueva3.setEstampado("2D");
  System.out.println(nueva3.verCamiseta());
  
  Camisetas nueva4 = nueva3.clone();
  nueva4.setNombre("fabian");
  nueva4.setColor("dorado");
  System.out.println(nueva4.verCamiseta());
  
 }
    
}
