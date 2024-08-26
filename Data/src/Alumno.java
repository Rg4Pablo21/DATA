public class Alumno {
    //PROPIEDADES
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private int grado;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.grado = grado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public int getGrado() {
        return this.grado;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
