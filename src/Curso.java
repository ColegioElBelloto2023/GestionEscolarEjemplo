public class Curso {

    private String nombreCurso;
    private Asignatura[] asignturas;

    //private ArrayList<Asignatura> asignaturas;

    public Curso(String nombreCurso, Asignatura[] asignturas) {
        this.nombreCurso = nombreCurso;
        this.asignturas = asignturas;
    }

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.asignturas = new Asignatura[4];
    }

    public Curso() {
        this.asignturas = new Asignatura[4];
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Asignatura[] getAsignturas() {
        return asignturas;
    }

    public void setAsignturas(Asignatura[] asigntura) {
        this.asignturas = asigntura;
    }


    public void imprimirCurso(){
        System.out.println("CURSO: "+ nombreCurso);
        System.out.println("ASIGNATURAS: ");
        for(Asignatura asignatura: asignturas){
            asignatura.imprimirDatosAsignatura();
        }
    }


}
