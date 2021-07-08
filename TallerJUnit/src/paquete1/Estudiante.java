package paquete1;

public class Estudiante {

    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;


    public String obtenerNombresEstudiante() {
        return nombresEstudiante;
    }

    public void establecerNombresEstudiante(String n) {
        this.nombresEstudiante = n;
    }

    public String obtenerApellidosEstudiante() {
        return apellidosEstudiante;
    }

    public void establecerApellidosEstudiante(String a) {
        this.apellidosEstudiante = a;
    }

    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public void establecerIdentificacionEstudiante(String i) {
        this.identificacionEstudiante = i;
    }

    public int obtenerEdadEstudiante() {
        return edadEstudiante;
    }

    public void establecerEdadEstudiante(int e) {
        this.edadEstudiante = e;
    }

}
