package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante {

    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;

    public void establecerNotas(ArrayList<Nota> ns) {
        notas = ns;
    }

    public ArrayList<Nota> obtenerNotas() {
        return notas;
    }

    public void establecerMejorNota() {
        double aux = 0;
        for (int i = 0; i < obtenerNotas().size(); i++) {
            if (obtenerNotas().get(i).obtenerValor() > aux) {
                aux = obtenerNotas().get(i).obtenerValor();
            }
        }
        mejorNota = aux;
    }

    public double obtenerMejorNota() {
        return mejorNota;
    }

    public void establecerPeorNota() {
        double aux = obtenerNotas().get(0).obtenerValor();
        for (int i = 0; i < obtenerNotas().size(); i++) {
            if (obtenerNotas().get(i).obtenerValor() < aux) {
                aux = obtenerNotas().get(i).obtenerValor();
            }
        }
        peorNota = aux;
    }

    public double obtenerPeorNota() {
        return peorNota;
    }

    public void establecerPromedio() {
        double suma = 0;
        for (int i = 0; i < obtenerNotas().size(); i++) {
            suma = suma + obtenerNotas().get(i).obtenerValor();
        }
        promedio = suma / obtenerNotas().size();
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre Estudiante: %s %s\n"
                + "Cédula: %s\n"
                + "Notas: \n",
                obtenerNombresEstudiante(),
                obtenerApellidosEstudiante(),
                obtenerIdentificacionEstudiante());
        for (int i = 0; i < obtenerNotas().size(); i++) {
            cadena = String.format("%s%.1f\n", cadena,
                    notas.get(i).obtenerValor());
        }
        cadena = String.format("%sPromedio: %.1f\n"
                + "Mejor Nota: %.1f\n"
                + "Peor Nota: %.1f\n",
                cadena,
                obtenerPromedio(),
                obtenerMejorNota(),
                obtenerPeorNota());
        return cadena;
    }

}
