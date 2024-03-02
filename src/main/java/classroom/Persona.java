package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    static int cedulasCreadas;
    
    static {
        totalPersonas = 0;
        cedulasCreadas = 0;
    }

    public Persona() {
        totalPersonas++;
        this.cedula = cedulasCreadas++;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = cedulasCreadas++;
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
