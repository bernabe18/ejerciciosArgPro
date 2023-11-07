package repasoClase1;

public class Materia {

    private String nombre;
    private boolean estado;

    public Materia(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public Materia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
