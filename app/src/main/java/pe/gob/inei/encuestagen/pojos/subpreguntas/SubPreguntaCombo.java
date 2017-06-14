package pe.gob.inei.encuestagen.pojos.subpreguntas;

/**
 * Created by otin016 on 14/06/2017.
 */

public class SubPreguntaCombo {
    private String subPregunta;
    private String[] opciones;
    private boolean habilitarCaja;
    private int numOpcion;

    public SubPreguntaCombo(String subPregunta, String[] opciones, boolean habilitarCaja, int numOpcion) {
        this.subPregunta = subPregunta;
        this.opciones = opciones;
        this.habilitarCaja = habilitarCaja;
        this.numOpcion = numOpcion;
    }

    public String getSubPregunta() {
        return subPregunta;
    }

    public void setSubPregunta(String subPregunta) {
        this.subPregunta = subPregunta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public boolean isHabilitarCaja() {
        return habilitarCaja;
    }

    public void setHabilitarCaja(boolean habilitarCaja) {
        this.habilitarCaja = habilitarCaja;
    }

    public int getNumOpcion() {
        return numOpcion;
    }

    public void setNumOpcion(int numOpcion) {
        this.numOpcion = numOpcion;
    }
}
