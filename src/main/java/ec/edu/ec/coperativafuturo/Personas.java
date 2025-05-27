
package ec.edu.ec.coperativafuturo;


public class Personas {
    private String nombre;
    private String identificacion;
    private String correo;

    public Personas(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    public Personas(String nombre) {
        this(nombre, null, null);
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo: " + correo);
    }
}

