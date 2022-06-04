package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Density extends AppCompatActivity implements View.OnClickListener {

    EditText massDen, volDen;
    Button solveDen;
    TextView answerDensity;

    double den;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_density);

        massDen = findViewById(R.id.editTextMassDensity);
        volDen = findViewById(R.id.editTextVolumeDensity);
        solveDen = findViewById(R.id.btnSolveDensity);
        answerDensity = findViewById(R.id.answerDensity);

        answerDensity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerDensity:
                gs.setMass1(Double.parseDouble(massDen.getText().toString()));
                gs.setVolume(Double.parseDouble(volDen.getText().toString()));

                den = ans.density(gs.getMass1(), gs.getVolume());

                answerDensity.setText("" + den);
        }
    }
}
