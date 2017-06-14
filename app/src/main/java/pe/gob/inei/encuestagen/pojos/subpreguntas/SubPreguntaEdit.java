package pe.gob.inei.encuestagen.pojos.subpreguntas;

/**
 * Created by otin016 on 14/06/2017.
 */

public class SubPreguntaEdit {
    private String subPregunta;
    private int tipoInput;
    private int tamanio;

    public SubPreguntaEdit(String subPregunta, int tipoInput, int tamanio) {
        this.subPregunta = subPregunta;
        this.tipoInput = tipoInput;
        this.tamanio = tamanio;
    }

    public String getSubPregunta() {
        return subPregunta;
    }

    public void setSubPregunta(String subPregunta) {
        this.subPregunta = subPregunta;
    }

    public int getTipoInput() {
        return tipoInput;
    }

    public void setTipoInput(int tipoInput) {
        this.tipoInput = tipoInput;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
