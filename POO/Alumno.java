package POO;

class Alumno{

    //Zona de atributos de clase
    private static int totalAlumnos = 0;
    //Zona de atributos de objetos
    private int id;
    private String nombre;
    private String grupo;

    //Zona de métodos

    public Alumno(int identificador, String nombreAlumno){
        id = identificador;
        nombre = nombreAlumno;
        grupo = "No asignado";

        totalAlumnos++;
    }

    public Alumno(int identificador, String nombreAlumno, String grupoAlumno){
        id = identificador;
        nombre = nombreAlumno;
        grupo = grupoAlumno;

        totalAlumnos++;
    }

    public void preguntarDuda(){
        System.out.println(nombre + " levanta la mano " + id);
    }

    public static void imprimirInforme(){
        System.out.println("Total de alumnos: " + totalAlumnos);
    }

    public static void imprimirInformeAlumnos(Alumno[] alumnos){
        System.out.println("Nombre\t\t\tGrupo");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre + "\t\t\t" + alumno.grupo);
        }
    }

    public void saludar(Alumno a1){
        System.out.println(nombre + " dice hola.");
        System.out.println(a1.nombre + " dice hola.");
    }

    public static void saludar(Alumno a1, Alumno a2){
        System.out.println(a1.nombre + " dice hola.");
        System.out.println(a2.nombre + " dice hola.");
    }
    public static void main(String[] args) {
        Alumno a1, a2, a3, a4;

        a1 = new Alumno(1, "Pablo");
        a2 = new Alumno(2, "María", "1CFSJ");
        a3 = new Alumno(3, "Manuel", "1CFSK");
        a4 = new Alumno(4, "Francisco");

        a2.preguntarDuda();
        a1.preguntarDuda();

        Alumno [] lista = {a1,a2,a3,a4};

        Alumno.imprimirInforme();
        Alumno.imprimirInformeAlumnos(lista);
        Alumno.saludar(a1, a2);
        a3.saludar(a4);
    }
}
