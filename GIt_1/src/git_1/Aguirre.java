package git_1;

public class Aguirre {

    private static String nombre, apellido;

    public Aguirre() {
        Aguirre.nombre = "Mauricio";
        Aguirre.apellido = "Aguirre";
    }

    public static void Saludar() {
        System.out.println("Hola soy " + nombre + " " + apellido);
    }

}
