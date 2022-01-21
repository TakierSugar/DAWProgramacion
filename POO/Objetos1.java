class alumno{

    private static int numAlumnos = 0;
    private int ID;
    private String nombre;
    private String Grupo = "1CFSA";
    int[] alumnos = new int [numAlumnos];

    static void nuevoAlumno() {
        numAlumnos++;
    };

    public alumno() {
        ID = 10614638;
        nombre = "Pablo";
        nuevoAlumno();
    }

    public alumno(int I, String N, String G) {
        ID = I;
        nombre = N;
        Grupo = G;
        nuevoAlumno();
    }

    public void preguntarDuda(){

        System.out.println(nombre + " levanta la mano");
    }

    static void ImprimirInforme(){
        System.out.println(numAlumnos);
    }

    public void ImprimirInformeAlumno(){
        System.out.println(alumnos);
    }

    public static void main(String[] args) {
        alumno a1, a2;
        a1 = new alumno();
        a2 = new alumno(13578642, "Paco", "1CFSD");
        a1.preguntarDuda();
        a2.preguntarDuda();
        ImprimirInforme();
        ImprimirInformeAlumno();
    }

}

// Clase alumno cuyos objetos tendran un ID, un nombre, y un grupo ej: 1CFSJ 
// se pueden crear alumnos solo con el nombre y el ID, o con los tres atributos.
// Tiene que tener un metodo llamado PreguntarDuda que tiene que imprimir (el nombre del alumno) levanta la mano.
// Nuestra clase tiene que tener un contador del total de alumnos creados.
// metodo de clase llamado ImprimirInforme que muestra el total de alumnos
// otro metodo de clase que se llama ImprimirInformeAlumnnos al que se le pasa como parametro un array de alumno y imprime el nombre y grupo de cada alumno