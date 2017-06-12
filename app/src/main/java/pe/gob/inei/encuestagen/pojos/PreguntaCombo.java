package pe.gob.inei.encuestagen.pojos;

/**
 * Created by otin016 on 12/06/2017.
 */

public class PreguntaCombo {
    private String pregunta;
    private AlternativaCombo[] alternativasCombo;

    public PreguntaCombo(String pregunta, AlternativaCombo[] alternativasCombo) {
        this.pregunta = pregunta;
        this.alternativasCombo = alternativasCombo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public AlternativaCombo[] getAlternativasCombo() {
        return alternativasCombo;
    }

    public void setAlternativasCombo(AlternativaCombo[] alternativasCombo) {
        this.alternativasCombo = alternativasCombo;
    }
}
