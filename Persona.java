
public class Persona{
    private String nombre;
    private String username;
    private int edad;
    private double altura;
    //private Date fechaNacimiento;
    //private boolean mayorDeEdad;

    public Persona(String nombre, String username, int edad, double altura){
        this.nombre = nombre;
        this.username = username;
        this.edad = edad;
        this.altura = altura;
        
        //this.fechaNacimiento = fechaNacimiento;
    }
    public String toString(){
        return "Nombre = " + this.nombre + "Username = " + this.username + "Edad = " + this.edad + "Altura = " + this.altura;
    }
    
 
}       