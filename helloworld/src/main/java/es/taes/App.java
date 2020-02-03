package es.taes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello mundo!" );   
        
        Persona persona = new Persona();
        persona.setEdad(43);
        persona.setNombre("guillermo");
        System.out.println(persona);
    }
}

