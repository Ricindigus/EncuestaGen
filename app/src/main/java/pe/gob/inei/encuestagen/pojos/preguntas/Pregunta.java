package pe.gob.inei.encuestagen.pojos.preguntas;

/**
 * Created by otin016 on 14/06/2017.
 */

public class Pregunta {
    int numCapitulo;
    int numPregunta;
    String pregunta;

    public Pregunta(int numCapitulo, int numPregunta, String pregunta) {
        this.numCapitulo = numCapitulo;
        this.numPregunta = numPregunta;
        this.pregunta = pregunta;
    }

    public int getNumCapitulo() {
        return numCapitulo;
    }

    public void setNumCapitulo(int numCapitulo) {
        this.numCapitulo = numCapitulo;
    }

    public int getNumPregunta() {
        return numPregunta;
    }

    public void setNumPregunta(int numPregunta) {
        this.numPregunta = numPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
