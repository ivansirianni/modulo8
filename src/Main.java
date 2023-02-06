public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Iván");
        persona.setEdad(33);
        persona.setCel(11524213);



        System.out.println("Nombre: "+ persona.getNombre() + ", Edad: " + persona.getEdad() +" años" + ", Contacto: "+ persona.getCel());

    }
}
class Persona {
    private String nombre;
    private int edad;
    private int cel;


    public void setNombre(String nombre){
        this.nombre = nombre;
    };
    public String getNombre(){
        return this.nombre;
    };

    public void setEdad(int edad){
        this.edad = edad;
    };
    public int getEdad(){
        return this.edad;
    };

    public void setCel(int cel){
        this.cel = cel;
    };
    public int getCel(){
        return this.cel;
    };



}