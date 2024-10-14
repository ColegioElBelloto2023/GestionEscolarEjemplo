import java.util.ArrayList;

public class Asignatura {

    private String nombreAsignatura;
    private String profesor;
    private ArrayList<Double> notas;


    public Asignatura(String nombreAsignatura, String profesor) {
        this.nombreAsignatura = nombreAsignatura;
        this.profesor = profesor;
        this.notas = new ArrayList<>();
    }

    public Asignatura(){
        this.notas = new ArrayList<>();
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public void agregarNota(double nota){
        notas.add(nota);
    }

    public void imprimirDatosAsignatura(){
        System.out.println("ASIGNATURA: "+ nombreAsignatura);
        System.out.println("PROFESOR: "+ profesor);
        System.out.println("NOTAS: " + notas);
        System.out.println("PROMEDIO: "+CalcularPromedio());
        System.out.println();
    }

    public double CalcularPromedio(){
        int suma = 0;
        for(Double nota: notas){
            suma += nota;
        }
        return suma/notas.size();
    }
}
