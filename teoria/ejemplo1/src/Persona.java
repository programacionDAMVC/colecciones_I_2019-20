public class Persona {
    private  String nombreCompleto;
    private int edad; //lo correcto es poner fecha de nacimiento

    public Persona(String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String toString() {
        return nombreCompleto +", edad: " + edad;
    }
}
