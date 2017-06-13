package pe.gob.inei.encuestagen.activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pe.gob.inei.encuestagen.R;
import pe.gob.inei.encuestagen.fragments.ComboFragment;
import pe.gob.inei.encuestagen.fragments.EditFragment;
import pe.gob.inei.encuestagen.fragments.RadioFragment;
import pe.gob.inei.encuestagen.pojos.AlternativaCombo;
import pe.gob.inei.encuestagen.pojos.AlternativaRadio;
import pe.gob.inei.encuestagen.pojos.PreguntaCombo;
import pe.gob.inei.encuestagen.pojos.PreguntaEdit;
import pe.gob.inei.encuestagen.pojos.PreguntaRadio;

public class EncuestaActivity extends AppCompatActivity {

    EditFragment editFragment;
    ComboFragment comboFragment;
    RadioFragment radioFragment;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

//        String[] opciones = {"1 - opcion1", "2 - opcion2", "3 - opcion3", "4 - opcion4", "5 - opcion5"};
//        AlternativaCombo alternativaCombo1 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
//        AlternativaCombo alternativaCombo2 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
//        AlternativaCombo alternativaCombo3 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
//        AlternativaCombo alternativaCombo4 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
//        AlternativaCombo alternativaCombo5 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
//        AlternativaCombo alternativaCombo6 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
//
//        AlternativaCombo[] alternativaCombos = {alternativaCombo1,alternativaCombo2,alternativaCombo3,
//                alternativaCombo4,alternativaCombo5,alternativaCombo6};
//        String pregunta = "*) Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum consectetur tellus vestibulum " +
//                "fringilla suscipit. Nullam quis massa et enim ultricies.";
//        PreguntaCombo preguntaCombo = new PreguntaCombo(pregunta,alternativaCombos);

//        AlternativaRadio alternativaRadio1 = new AlternativaRadio("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",false);
//        AlternativaRadio alternativaRadio2 = new AlternativaRadio("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",false);
//        AlternativaRadio alternativaRadio3 = new AlternativaRadio("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",true);
//        AlternativaRadio alternativaRadio4 = new AlternativaRadio("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",false);
//        AlternativaRadio alternativaRadio5 = new AlternativaRadio("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",true);
//        AlternativaRadio alternativaRadio6 = new AlternativaRadio("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",false);
//        AlternativaRadio alternativaRadio7 = new AlternativaRadio("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",false);
//
//        AlternativaRadio[] alternativasRadio = {alternativaRadio1,alternativaRadio2,alternativaRadio3,alternativaRadio4,
//                alternativaRadio5,alternativaRadio6,alternativaRadio7};
//        String pregunta = "*) Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum consectetur tellus vestibulum " +
//                "fringilla suscipit. Nullam quis massa et enim ultricies.";
//        PreguntaRadio preguntaRadio = new PreguntaRadio(pregunta,alternativasRadio);

        String pregunta = "*) Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum consectetur tellus vestibulum " +
                "fringilla suscipit. Nullam quis massa et enim ultricies.";
        String[] alternativasEdit = {"Lorem ipsum dolor sit amet.", "Lorem ipsum dolor sit amet.", "Lorem ipsum dolor sit amet.",
                "Lorem ipsum dolor sit amet.", "Lorem ipsum dolor sit amet.", "Lorem ipsum dolor sit amet.", "Lorem ipsum dolor sit amet.",
                "Lorem ipsum dolor sit amet.","Lorem ipsum dolor sit amet.","Lorem ipsum dolor sit amet.","Lorem ipsum dolor sit amet.",
                "Lorem ipsum dolor sit amet."};
        PreguntaEdit preguntaEdit = new PreguntaEdit(pregunta,alternativasEdit,true);

        fragmentManager = getSupportFragmentManager();
//        comboFragment = new ComboFragment(preguntaCombo);
//        radioFragment = new RadioFragment(preguntaRadio);
        editFragment = new EditFragment(preguntaEdit);
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,editFragment);
        fragmentTransaction.commit();
    }
}
