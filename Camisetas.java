package Metodos;

/**
 *
 * @author Ingeniero
 */
public abstract class Camisetas implements Cloneable {
       private String nombre;
       private Integer talla;
       private String color;
       private String manga;
       private String estampado;
       private Object material;
        
       public Camisetas(){
           this.nombre="ninguno";
           this.talla=0;
           this.color="ninguno";
           this.manga ="ninguno";
           this.estampado="ninguno";
           this.material = null;
           
       }
       public Camisetas clone() throws CloneNotSupportedException {
            return (Camisetas) super.clone();
       }
       
       public abstract String verCamiseta();
        
        //metodos set
        void setNombre(String nombre){this.nombre = nombre;}
        void setTalla(Integer talla){this.talla = talla;}
        void setColor(String color){this.color = color;}
        void setManga(String manga){this.manga = manga;}
        void setEstampado(String estampado){this.estampado = estampado;}
        void SetMateria(Object material){this.material = material;}
        
        // metodos get 
        String getNombre(){return nombre;}
        Integer getTalla(){return talla;}
        String getColor(){return color;}
        String getManga(){return manga;}
        String getEstampado(){return estampado;}
        Object getMaterial(){return material;}
        
}
