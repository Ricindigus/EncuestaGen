package pe.gob.inei.encuestagen.pojos;

/**
 * Created by otin016 on 12/06/2017.
 */

public class AlternativaRadio {
    private String pregunta;
    private boolean especificar;

    public AlternativaRadio(String pregunta, boolean especificar) {
        this.pregunta = pregunta;
        this.especificar = especificar;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isEspecificar() {
        return especificar;
    }

    public void setEspecificar(boolean especificar) {
        this.especificar = especificar;
    }
}
