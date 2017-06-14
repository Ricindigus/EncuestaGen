package pe.gob.inei.encuestagen.pojos.preguntas;

import pe.gob.inei.encuestagen.pojos.subpreguntas.SubPreguntaCheckbox;

/**
 * Created by otin016 on 14/06/2017.
 */

public class PreguntaCheckbox {
    private SubPreguntaCheckbox[] subPreguntasCheckbox;

    public PreguntaCheckbox(SubPreguntaCheckbox[] subPreguntasCheckbox) {
        this.subPreguntasCheckbox = subPreguntasCheckbox;
    }

    public SubPreguntaCheckbox[] getSubPreguntasCheckbox() {
        return subPreguntasCheckbox;
    }

    public void setSubPreguntasCheckbox(SubPreguntaCheckbox[] subPreguntasCheckbox) {
        this.subPreguntasCheckbox = subPreguntasCheckbox;
    }
}
