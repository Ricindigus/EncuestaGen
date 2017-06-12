package pe.gob.inei.encuestagen.pojos;

/**
 * Created by otin016 on 12/06/2017.
 */

public class PreguntaEdit {
    private String pregunta;
    private String[] alternativasEdit;
    private boolean noSabe;

    public PreguntaEdit(String pregunta, String[] alternativasEdit, boolean noSabe) {
        this.pregunta = pregunta;
        this.alternativasEdit = alternativasEdit;
        this.noSabe = noSabe;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getAlternativasEdit() {
        return alternativasEdit;
    }

    public void setAlternativasEdit(String[] alternativasEdit) {
        this.alternativasEdit = alternativasEdit;
    }

    public boolean isNoSabe() {
        return noSabe;
    }

    public void setNoSabe(boolean noSabe) {
        this.noSabe = noSabe;
    }
}
