public class Alumno {
    
    private static int numAlumnos = 0;
    private int codigo_alumno;
    private String nombre;
    private String grupo;

    static void nuevoAlumno(){
        numAlumnos++;
    };
    public Alumno(){
        codigo_alumno = 0;
        nombre = "";
        grupo = "";
        nuevoAlumno();
    }

    public Alumno(int a, String b, String c){
        codigo_alumno = a;
        nombre = b;
        grupo = c;
        nuevoAlumno();
    }

    static void contarAlumnos() {

        System.out.println(numAlumnos);
      
       };
       public static void main(String[] args) {
        Alumno a1,a2,a3;
        a1 = new Alumno();
        a2 = new Alumno(1,"Jose","1CFSC");
        a1.contarAlumnos();
    }

} 
