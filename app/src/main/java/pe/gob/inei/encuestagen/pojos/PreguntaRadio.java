package pe.gob.inei.encuestagen.pojos;

/**
 * Created by otin016 on 12/06/2017.
 */

public class PreguntaRadio {
    private String pregunta;
    private AlternativaRadio[] alternativasRadio;

    public PreguntaRadio(String pregunta, AlternativaRadio[] alternativasRadio) {
        this.pregunta = pregunta;
        this.alternativasRadio = alternativasRadio;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public AlternativaRadio[] getAlternativasRadio() {
        return alternativasRadio;
    }

    public void setAlternativasRadio(AlternativaRadio[] alternativasRadio) {
        this.alternativasRadio = alternativasRadio;
    }
}
