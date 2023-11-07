package repasoClase1;

public class Inscripcion {

    private Materia materiasCorrelativas;

    public Inscripcion() {
    }

    public Materia getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(Materia materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public boolean aprobada() {

        if(this.materiasCorrelativas.isEstado()){
            System.out.println("esta aprobada la materia");
        }else {
            System.out.println("no esta aprobada la materia");
        }

        return this.materiasCorrelativas.isEstado();
    }
}
