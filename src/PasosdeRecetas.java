/**
 *
 * @author Viruz
 */
public class PasosdeRecetas {

    private String informacion;
    private PasosdeRecetas pasos;

    public PasosdeRecetas (String infor) {
        this.informacion = infor;
    }

    /**
     * @return the informacion
     */
    public String getInformacion() {
        return informacion;
    }

    /**
     * @param informacion the informacion to set
     */
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    /**
     * @return the pasos
     */
    public PasosdeRecetas getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(PasosdeRecetas pasos) {
        this.pasos = pasos;
    }
}