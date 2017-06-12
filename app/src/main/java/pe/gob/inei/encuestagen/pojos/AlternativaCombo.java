package pe.gob.inei.encuestagen.pojos;

/**
 * Created by otin016 on 12/06/2017.
 */

public class AlternativaCombo {
    private String pregunta;
    private String[] opciones;

    public AlternativaCombo(String pregunta, String[] opciones) {
        this.pregunta = pregunta;
        this.opciones = opciones;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }
}
