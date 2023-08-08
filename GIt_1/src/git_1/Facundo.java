
package git_1;


public class Facundo {
    
    private String nombre, apellido ;
    private int edad;
    public Facundo(){
        this.nombre = "Facundo";
        this.apellido = "Agüero";
        this.edad = 20;
    }
    
    public void hola(){
        System.out.println("Hola! me llamo " + nombre + " " + apellido + " y tengo " + edad + "años" );
    }
}
