package pe.gob.inei.encuestagen.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import pe.gob.inei.encuestagen.R;
import pe.gob.inei.encuestagen.pojos.PreguntaCombo;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class ComboFragment extends Fragment {
    private PreguntaCombo preguntaCombo;
    private TextView txtPregunta;
    private TextView txtSubPregunta;
    private Spinner spOpciones;
    private LinearLayout layoutPregunta;

    private int[] supPreguntas = {R.id.combo_subpregunta1, R.id.combo_subpregunta2, R.id.combo_subpregunta3, R.id.combo_subpregunta4,
            R.id.combo_subpregunta5, R.id.combo_subpregunta6, R.id.combo_subpregunta7, R.id.combo_subpregunta8, R.id.combo_subpregunta9,
            R.id.combo_subpregunta10, R.id.combo_subpregunta11, R.id.combo_subpregunta12};
    private int[] opciones = {R.id.combo_opciones1, R.id.combo_opciones2, R.id.combo_opciones3, R.id.combo_opciones4,
            R.id.combo_opciones5, R.id.combo_opciones6, R.id.combo_opciones7, R.id.combo_opciones8,
            R.id.combo_opciones9, R.id.combo_opciones10, R.id.combo_opciones11, R.id.combo_opciones12};
    private int[] alternativas = {R.id.combo_alternativa1, R.id.combo_alternativa2, R.id.combo_alternativa3, R.id.combo_alternativa4,
            R.id.combo_alternativa5, R.id.combo_alternativa6, R.id.combo_alternativa7, R.id.combo_alternativa8, R.id.combo_alternativa9,
            R.id.combo_alternativa10, R.id.combo_alternativa11, R.id.combo_alternativa12};

    public ComboFragment(PreguntaCombo preguntaCombo) {
        // Required empty public constructor
        this.preguntaCombo = preguntaCombo;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_combo, container, false);
        txtPregunta = (TextView) rootView.findViewById(R.id.txt_combo_pregunta);
        txtPregunta.setText(preguntaCombo.getPregunta());

        for (int i = 0; i < preguntaCombo.getAlternativasCombo().length; i++){
            layoutPregunta = (LinearLayout) rootView.findViewById(alternativas[i]);
            txtSubPregunta = (TextView) rootView.findViewById(supPreguntas[i]);
            spOpciones = (Spinner)rootView.findViewById(opciones[i]);

            layoutPregunta.setVisibility(View.VISIBLE);
            txtSubPregunta.setText( preguntaCombo.getAlternativasCombo()[i].getPregunta());
            ArrayAdapter adapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.custom_spinner,preguntaCombo.getAlternativasCombo()[i].getOpciones());
            spOpciones.setAdapter(adapter);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
