
package poopersona17;


public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private String colorOjos;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, double peso, double estatura, String colorOjos, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.colorOjos = colorOjos;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String Comer(){
        return "la persona está comiendo";
    }
    
    public String Correr(){
        return "la persona está corriendo";
    }
    
    public String Tomar(){
        return "la persona está tomando";
    }

    public String Despertar(){
        return "la persona está despertando";
    }
    
    public String Dormir(){
        return "la persona está durmiendo";
    }
    
    public String bailar(){
        return "la persona está bailando";
    }
}
