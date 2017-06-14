package pe.gob.inei.encuestagen.pojos.preguntas;

/**
 * Created by otin016 on 12/06/2017.
 */

public class PreguntaEdit extends Pregunta{
    private String[] subPreguntasEdit;
    private boolean noSabe;

    public PreguntaEdit(int numCapitulo, int numPregunta, String pregunta, String[] subPreguntasEdit, boolean noSabe) {
        super(numCapitulo, numPregunta, pregunta);
        this.subPreguntasEdit = subPreguntasEdit;
        this.noSabe = noSabe;
    }

    public String[] getSubPreguntasEdit() {
        return subPreguntasEdit;
    }

    public void setSubPreguntasEdit(String[] subPreguntasEdit) {
        this.subPreguntasEdit = subPreguntasEdit;
    }

    public boolean isNoSabe() {
        return noSabe;
    }

    public void setNoSabe(boolean noSabe) {
        this.noSabe = noSabe;
    }
}
