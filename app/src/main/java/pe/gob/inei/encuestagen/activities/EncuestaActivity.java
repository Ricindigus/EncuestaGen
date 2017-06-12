package pe.gob.inei.encuestagen.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pe.gob.inei.encuestagen.R;
import pe.gob.inei.encuestagen.fragments.ComboFragment;
import pe.gob.inei.encuestagen.pojos.AlternativaCombo;
import pe.gob.inei.encuestagen.pojos.PreguntaCombo;

public class EncuestaActivity extends AppCompatActivity {

    ComboFragment comboFragment;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        String[] opciones = {"1 - opcion1", "2 - opcion2", "3 - opcion3", "4 - opcion4", "5 - opcion5"};
        AlternativaCombo alternativaCombo1 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
        AlternativaCombo alternativaCombo2 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
        AlternativaCombo alternativaCombo3 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
        AlternativaCombo alternativaCombo4 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
        AlternativaCombo alternativaCombo5 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);
        AlternativaCombo alternativaCombo6 = new AlternativaCombo("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",opciones);

        AlternativaCombo[] alternativaCombos = {alternativaCombo1,alternativaCombo2,alternativaCombo3,
                alternativaCombo4,alternativaCombo5,alternativaCombo6};
        String pregunta = "*) Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum consectetur tellus vestibulum " +
                "fringilla suscipit. Nullam quis massa et enim ultricies.";
        PreguntaCombo preguntaCombo = new PreguntaCombo(pregunta,alternativaCombos);

        fragmentManager = getSupportFragmentManager();
        comboFragment = new ComboFragment(preguntaCombo);
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,comboFragment);
        fragmentTransaction.commit();
    }
}
