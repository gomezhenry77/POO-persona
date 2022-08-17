
package poopersona17;


public class Veterinario extends Persona {
    private String cedula;
    private String especialidad;

    public Veterinario() {
    }

    public Veterinario(String cedula, String especialidad, String nombre, int edad, double peso, double estatura, String colorOjos, String sexo) {
        super(nombre, edad, peso, estatura, colorOjos, sexo);
        this.cedula = cedula;
        this.especialidad = especialidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String enConsulta(){
        return "el veterinario está en consulta";
    }
    
    public String enCirugia(){
        return "el veterinario está en cirugía";
    }
    
    public boolean Inactivo(){
        return true;
    }
}
