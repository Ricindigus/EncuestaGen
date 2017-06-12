package pe.gob.inei.encuestagen.pojos;

/**
 * Created by otin016 on 12/06/2017.
 */

public class PreguntaRadio {
    private AlternativaRadio[] alternativasRadio;

    public PreguntaRadio(AlternativaRadio[] alternativasRadio) {
        this.alternativasRadio = alternativasRadio;
    }

    public AlternativaRadio[] getAlternativasRadio() {
        return alternativasRadio;
    }

    public void setAlternativasRadio(AlternativaRadio[] alternativasRadio) {
        this.alternativasRadio = alternativasRadio;
    }
}
