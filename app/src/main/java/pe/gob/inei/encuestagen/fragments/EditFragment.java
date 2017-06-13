package pe.gob.inei.encuestagen.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import pe.gob.inei.encuestagen.R;
import pe.gob.inei.encuestagen.pojos.PreguntaEdit;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class EditFragment extends Fragment {

    private PreguntaEdit preguntaEdit;
    private TextView txtPregunta;
    private TextView txtSubPregunta;
    private EditText edtCaja;
    private RadioButton rbNoSabe;
    private LinearLayout layoutPregunta;
    private LinearLayout layoutNoSabe;
    private int[] alternativas = {R.id.edit_alternativa1, R.id.edit_alternativa2, R.id.edit_alternativa3, R.id.edit_alternativa4,
            R.id.edit_alternativa5, R.id.edit_alternativa6, R.id.edit_alternativa7, R.id.edit_alternativa8, R.id.edit_alternativa9,
            R.id.edit_alternativa10, R.id.edit_alternativa11, R.id.edit_alternativa12};
    private int[] subPreguntas = {R.id.edit_subpregunta1, R.id.edit_subpregunta2, R.id.edit_subpregunta3, R.id.edit_subpregunta4,
            R.id.edit_subpregunta5, R.id.edit_subpregunta6, R.id.edit_subpregunta7, R.id.edit_subpregunta8, R.id.edit_subpregunta9,
            R.id.edit_subpregunta10, R.id.edit_subpregunta11, R.id.edit_subpregunta12};
    private int[] cajasDeTexto = {R.id.edit_caja1, R.id.edit_caja2, R.id.edit_caja3, R.id.edit_caja4, R.id.edit_caja5, R.id.edit_caja6,
            R.id.edit_caja7, R.id.edit_caja8, R.id.edit_caja9, R.id.edit_caja10, R.id.edit_caja11, R.id.edit_caja12};

    public EditFragment(PreguntaEdit preguntaEdit) {
        // Required empty public constructor
        this.preguntaEdit = preguntaEdit;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_edit, container, false);
        txtPregunta = (TextView) rootView.findViewById(R.id.txt_edit_pregunta);
        txtPregunta.setText(preguntaEdit.getPregunta());

        for (int i = 0; i < preguntaEdit.getAlternativasEdit().length; i++){
            layoutPregunta = (LinearLayout) rootView.findViewById(alternativas[i]);
            txtSubPregunta = (TextView) rootView.findViewById(subPreguntas[i]);
            layoutPregunta.setVisibility(View.VISIBLE);
            txtSubPregunta.setText(preguntaEdit.getAlternativasEdit()[i]);
        }
        if(preguntaEdit.isNoSabe()){
            layoutNoSabe = (LinearLayout) rootView.findViewById(R.id.edit_alternativa_noSabe);
            layoutNoSabe.setVisibility(View.VISIBLE);
        }
        return rootView;
    }

}
