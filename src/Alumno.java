public class Alumno {

    private static int utlimoid = 0;
    private int id;
    private String nombre;
    private String apellido;
    private Curso curso;

    public Alumno(String nombre, String apellido, Curso curso) {
        this.id = ++utlimoid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }
    public Alumno(String nombre, String apellido) {
        this.id = ++utlimoid;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno() {
        this.id = ++utlimoid;
    }

    public static int getUtlimoid() {
        return utlimoid;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void imprmirDatosAlumno(){
        System.out.println("Datos del alumno");
        System.out.println("NOMBRE: "+ nombre + " " + apellido);
        System.out.println();
        curso.imprimirCurso();
    }


}
