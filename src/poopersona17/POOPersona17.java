
package poopersona17;


public class POOPersona17 {


    public static void main(String[] args) {
        /*instanciar persona
        Persona persona1 = new Persona ();
        persona1.setNombre("Petronio Murillo");
        persona1.setEdad(35);
        persona1.setEstatura(1.7);
        persona1.setPeso(70.3);
        persona1.setColorOjos("Negro");
        persona1.setSexo("M");
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println(persona1.Correr());
        
         String titulo, String cursos, String nombre, int edad, double peso, double estatura, String colorOjos, String sexo
        */
    
    
    Abogado abogado1 = new Abogado("penalista","Laboral","Juan Jaramillo",45,70.8,1.80,"azul","M");
    abogado1.setTitulo("Familia");
        System.out.printf("el titulo es %s y el nombre es %s y edad %d ",abogado1.getTitulo(),abogado1.getNombre(),abogado1.getEdad());
        System.out.println(abogado1.litigar(abogado1.getCursos()));
    }
   
}
