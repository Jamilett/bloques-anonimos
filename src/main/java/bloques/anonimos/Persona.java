package bloques.anonimos;

/**
 * Esta clase contiene un bloque anonimo estatico, NO estatico, Constructor
 * vacio y metodo get para poner a prueba el orden de ejecucion de bloques de
 * codigo
 *
 * @author jamsr
 */
public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    /**
     * Bloque anonimo estatico de inicializacion
     */
    static {
        contadorPersonas = 10;
        // No se pueden usar variables No estaticas dentro del bloque static
        System.out.println("Ejecución de bloque estatico");
    }

    /**
     * Bloque anonimo NO estatico, se copia antes de cada constructor para que
     * se ejecute
     */
    {
        System.out.println("Ejecución bloque NO estatico");
        this.idPersona = ++contadorPersonas;
    }

    /**
     * Constructor vacío
     */
    public Persona() {
        System.out.println("Ejecución del Constructor");
    }

    /**
     * Metodo para obtener el idPersona
     *
     * @return int idPersona
     */
    public int getIdPersona() {
        return this.idPersona;
    }

}
