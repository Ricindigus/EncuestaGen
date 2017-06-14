package pe.gob.inei.encuestagen.pojos.preguntas;

import pe.gob.inei.encuestagen.pojos.subpreguntas.SubPreguntaCombo;

/**
 * Created by otin016 on 12/06/2017.
 */

public class PreguntaCombo extends Pregunta{
    private SubPreguntaCombo[] subPreguntasCombo;

    public PreguntaCombo(int numCapitulo, int numPregunta, String pregunta, SubPreguntaCombo[] subPreguntasCombo) {
        super(numCapitulo, numPregunta, pregunta);
        this.subPreguntasCombo = subPreguntasCombo;
    }

    public SubPreguntaCombo[] getSubPreguntasCombo() {
        return subPreguntasCombo;
    }

    public void setSubPreguntasCombo(SubPreguntaCombo[] subPreguntasCombo) {
        this.subPreguntasCombo = subPreguntasCombo;
    }
}
