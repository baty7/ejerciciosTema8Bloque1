public class Main {
    public static void main(String[] args) {

        
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(20);
        persona1.setNumeroTelefono("123456789");
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNumeroTelefono());
    }
}