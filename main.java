import java.util.Scanner;

/**
 * @param scanner  Instancia de la clase Scanner para poder leer datos desde la
 *                 consola.
 * @param name     Variable para guardar el nombre
 * @param lastname Variable para guardar el apellido
 * @param age      Variable para guardar el edad
 * @param carrer   Variable para guardar el carrera
 * @param semester Variable para guardar el semestre
 * @param code     Variable para guardar el codigo
 * @param journey  Variable para guardar la jornada
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //Peticiones de datos
            System.out.print("Nombre del estudiante: ");
            String name = scanner.nextLine();

            System.out.print("Apellido del estudiante: ");
            String lastname = scanner.nextLine();

            System.out.print("Edad del estudiante: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Carrera del estudiante: ");
            String carrer = scanner.nextLine();

            System.out.print("Semestre del estudiante: ");
            int semester = Integer.parseInt(scanner.nextLine());

            System.out.print("Codigo del estudiante: ");
            long code = Long.parseLong(scanner.nextLine());

            System.out.print("Jornada del estudiante: ");
            String journey = scanner.nextLine();

            // Creacion de un nuevo objeto student llamada 'student', se le pasan parametros requeridos.
            student student = new student(name, lastname, age, carrer, semester, code, journey);
           
            //Impresion
            System.out.println("--------------------------------------------------");
            student.showInfo();
            System.out.println("Total de estudiantes es: " + student.showAll());

        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
