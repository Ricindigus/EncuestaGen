package pe.gob.inei.encuestagen.pojos.subpreguntas;

/**
 * Created by otin016 on 14/06/2017.
 */

public class SubPreguntaRadio {
    private String subPregunta;
    private boolean habilitarCaja;

    public SubPreguntaRadio(String subPregunta, boolean habilitarCaja) {
        this.subPregunta = subPregunta;
        this.habilitarCaja = habilitarCaja;
    }

    public String getSubPregunta() {
        return subPregunta;
    }

    public void setSubPregunta(String subPregunta) {
        this.subPregunta = subPregunta;
    }

    public boolean isHabilitarCaja() {
        return habilitarCaja;
    }

    public void setHabilitarCaja(boolean habilitarCaja) {
        this.habilitarCaja = habilitarCaja;
    }
}
