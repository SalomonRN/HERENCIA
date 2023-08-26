/**
 * @param career   Atributo de la clase, hace referencia a la carrera
 * @param semester Atributo de la clase, hace referencia al semestre
 * @param code     Atributo de la clase, hace referencia al codigo
 * @param journey  Atributo de la clase, hace referencia a la jornada
 * @param career   Atributo de la clase, hace referencia a la carreta
 * @param career   Atributo de la clase, hace referencia a la carreta
 *                 Clase que hereda a la clase 'person' e implemente la interfaz
 *                 'total'
 */
public class student extends person implements total {
    // Declaracion de los Atributos de la clase
    private String career;
    private int semester;
    private long code;
    private String journey;
    private int nEstudiantes;

    // Constrcutor de la clase
    public student(String name, String lastname, int age, String career, int semester, long code, String journey) {
        // Llamada al constructor de la clase padre
        super(name, lastname, age);
        this.career = career;
        this.semester = semester;
        this.code = code;
        this.journey = journey;
        nEstudiantes += 1;
    }

    // Funcion para imprimir los datos (Sobrecarga de metodos)
    @Override
    public void showInfo() {
        System.out.println("Nombre del estudiante es: " + getName());
        System.out.println("Apellido del estudiante es: " + getLastname());
        System.out.println("Edad del estudiante es: " + getAge());
        System.out.println("Carrera del estudiante es: " + getCareer());
        System.out.println("Semestre del estudiante es: " + getSemester());
        System.out.println("Codigo del estudiante es: " + getCode());
        System.out.println("Jornada del estudiante es: " + getJourney());

    }

    // Funcion que retorna el total de estudiantes? (Funcion implementada de la
    // interfaz 'total')
    public int showAll() {

        return getnEstudiantes();
    }

    // Metodos Geters and Seters
    private String getCareer() {
        return career;
    }

    private void setCareer(String career) {
        this.career = career;
    }

    private int getSemester() {
        return semester;
    }

    private void setSemester(int semester) {
        this.semester = semester;
    }

    private long getCode() {
        return code;
    }

    private void setCode(long code) {
        this.code = code;
    }

    private String getJourney() {
        return journey;
    }

    private void setJourney(String journey) {
        this.journey = journey;
    }

    private int getnEstudiantes() {
        return nEstudiantes;
    }

    private void setnEstudiantes(int nEstudiantes) {
        this.nEstudiantes = nEstudiantes;
    }

}
