package pe.gob.inei.encuestagen.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Vector;

import pe.gob.inei.encuestagen.R;
import pe.gob.inei.encuestagen.pojos.AlternativaRadio;
import pe.gob.inei.encuestagen.pojos.PreguntaRadio;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class RadioFragment extends Fragment {

    private PreguntaRadio preguntaRadio;
    private TextView txtPregunta;
    private RadioButton rbAlternativa;
    private RadioGroup rgAlternativas;
    private EditText edtEspecifique;
    private EditText visualizado;
    private int[] alternativas = {R.id.radio_alternativa1, R.id.radio_alternativa2, R.id.radio_alternativa3, R.id.radio_alternativa4,
            R.id.radio_alternativa5, R.id.radio_alternativa6, R.id.radio_alternativa7, R.id.radio_alternativa8, R.id.radio_alternativa9,
            R.id.radio_alternativa10, R.id.radio_alternativa11, R.id.radio_alternativa12};
    private static final int[] cajasDeTexto = {R.id.radio_especifique1, R.id.radio_especifique2, R.id.radio_especifique3, R.id.radio_especifique4,
            R.id.radio_especifique5, R.id.radio_especifique6, R.id.radio_especifique7, R.id.radio_especifique8, R.id.radio_especifique9,
            R.id.radio_especifique10, R.id.radio_especifique11, R.id.radio_especifique12};
    private static final int[] MY_ARRAY = {10, 20, 30, 40, 50};
    public RadioFragment(PreguntaRadio preguntaRadio) {
        // Required empty public constructor
        this.preguntaRadio = preguntaRadio;
        visualizado = null;
    }

    public RadioFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_radio, container, false);
        txtPregunta = (TextView) rootView.findViewById(R.id.txt_radio_pregunta);
        txtPregunta.setText(preguntaRadio.getPregunta());

        for (int i = 0; i < preguntaRadio.getAlternativasRadio().length; i++){
            rbAlternativa = (RadioButton) rootView.findViewById(alternativas[i]);
            rbAlternativa.setVisibility(View.VISIBLE);
            rbAlternativa.setText( preguntaRadio.getAlternativasRadio()[i].getPregunta());
        }
        return rootView;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rgAlternativas = (RadioGroup) view.findViewById(R.id.radio_group_alternativas);
        rgAlternativas.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(visualizado != null) visualizado.setVisibility(View.GONE);
                int indice = -1;
                boolean encontrado = false;
                while(indice < alternativas.length && !encontrado){
                    indice++;
                    if( alternativas[indice] == i) encontrado = true;
                }
                if(preguntaRadio.getAlternativasRadio()[indice].isEspecificar()){
                    edtEspecifique = (EditText) view.findViewById(cajasDeTexto[indice]);
                    edtEspecifique.setVisibility(View.VISIBLE);
                    visualizado = edtEspecifique;
                }
            }
        });

    }
}
