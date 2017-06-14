package pe.gob.inei.encuestagen.pojos.preguntas;

import pe.gob.inei.encuestagen.pojos.subpreguntas.SubPreguntaRadio;

/**
 * Created by otin016 on 12/06/2017.
 */

public class PreguntaRadio extends Pregunta{
    private SubPreguntaRadio[] subPreguntasRadio;

    public PreguntaRadio(int numCapitulo, int numPregunta, String pregunta, SubPreguntaRadio[] subPreguntasRadio) {
        super(numCapitulo, numPregunta, pregunta);
        this.subPreguntasRadio = subPreguntasRadio;
    }

    public SubPreguntaRadio[] getSubPreguntasRadio() {
        return subPreguntasRadio;
    }

    public void setSubPreguntasRadio(SubPreguntaRadio[] subPreguntasRadio) {
        this.subPreguntasRadio = subPreguntasRadio;
    }
}
