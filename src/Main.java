import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Curso curso = new Curso("3 Medio A");
        Alumno alumno = new Alumno("Francisco", "Gonzalez", curso);
        Asignatura matematicas = new Asignatura("Matemáticas", "Ferdinan");
        Asignatura lenguaje = new Asignatura("Lenguaje", "Juan");
        Asignatura ciencias = new Asignatura("Ciencias", "Verónica");
        Asignatura historia = new Asignatura("Historia", "Karina");

        Asignatura[] asignaturas = {matematicas, lenguaje, ciencias, historia};
        curso.setAsignturas(asignaturas);


        for (Asignatura asignatura: asignaturas){
            System.out.println(asignatura.getNombreAsignatura().toUpperCase());
            System.out.println("¿Cuántas notas vas a ingresar?");
            int cantidadNotas = scanner.nextInt();
            for(int i = 0; i < cantidadNotas; i++){
                System.out.println("NOTA "+ (i+1) + ": ");
                double nota = scanner.nextDouble();
                asignatura.agregarNota(nota);
            }
        }

        alumno.imprmirDatosAlumno();

    }
}