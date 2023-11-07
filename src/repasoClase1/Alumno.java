package repasoClase1;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Materia> materias;

    public Alumno(){}
    public Alumno(String nombre, ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

}
