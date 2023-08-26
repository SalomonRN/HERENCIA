/**
 * AMBITO: UNIVERSIDAD
 * 3 Clases
 * Métodos constructores
 * Sobrecarga de métodos
 * get y set
 * super() (Herencia)
 * implements
 * 
 * Compilacion y ejecucion desde cmd
 * Solo un main
 */
/**
 * @param name Atributo de la clase, hace referencia al nombre 
 * @param lastname Atributo de la clase, hace referencia al apellido 
 * @param age Atributo de la clase, hace referencia a la edad  
 */
public class person {
    
    // Declaracion de los Atributos de la clase
    private String name;
    private String lastname;
    private int age;

    //Constrcutor de la clase
    public person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }


    //Metodos Geters and Seters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Impresin de datos
    public void showInfo() {
        System.out.println("Nombre: " + getName());
        System.out.println("Apellido: " + getLastname());
        System.out.println("Edad: " + getAge());
    }
}