
package git_1;

public class Jonathan {
    private String nombre,apellido;

    public Jonathan(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void presentacion(){
        System.out.println("mi nombre completo es" +nombre+apellido);
}
}
