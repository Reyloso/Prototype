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
public class CamisaLarga extends Camisetas{

    @Override
    public String verCamiseta() {
        this.setManga("Larga");
         String camiseta = "nombre "+ this.getNombre() + "\n"
                + "talla " + this.getTalla() +  "\n"
                + "color " + this.getColor() +  "\n"
                + "manga " + this.getManga() +  "\n"
                + "estampado " + this.getEstampado() +  "\n"
                + "material " + this.getMaterial() +  "\n";
                
        return  camiseta;
              
    }  
}
