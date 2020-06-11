package bloques.anonimos.test;

/**
 * Se importa la clase Persona del paquete bloques.anonimos
 */
import bloques.anonimos.Persona;

/**
 * Esta clase contiene el metodo main para crear objetos de tipo Persona y poner
 * a prueba la ejecucion de bloques de codigo anonimos
 *
 * @author jamsr
 */
public class PersonaMain {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        int idPersona = p1.getIdPersona();
        System.out.println("idPersona = " + idPersona);
    }
    // Primero se ejecutará el bloque estatico
    // Después el bloque anonimo NO estatico
    // Después el constructor vacío
    // Al final al crear la variable idPersona, accede al metodo get y regresará 11
}
