/**
 *
 * @author Viruz
 */
public class Recetas {
    private String nombre;
    private PasosdeRecetas[] elementos;
    
    public Recetas(String nombre, PasosdeRecetas[] elementos) {
        this.nombre = nombre;
        this.elementos = elementos;
    }

    /**
     * @return the elementos
     */
    public PasosdeRecetas[] getElementos() {
        return elementos;
    }

    /**
     * @param elementos the elementos to set
     */
    public void setElementos(PasosdeRecetas[] elementos) {
        this.elementos = elementos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}