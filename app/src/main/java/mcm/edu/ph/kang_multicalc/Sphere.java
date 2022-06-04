package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sphere extends AppCompatActivity implements View.OnClickListener {

    EditText radiusSph;
    Button solveSphere;
    TextView answerSphere;

    double sphere;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_sphere);

        radiusSph = findViewById(R.id.editTextRadiusSph);
        solveSphere = findViewById(R.id.btnSolveSph);
        answerSphere = findViewById(R.id.answerSph);

        answerSphere.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerSph:
                gs.setRadius(Double.parseDouble(radiusSph.getText().toString()));

                sphere = ans.sphereV(gs.getRadius());

                answerSphere.setText("" + sphere);
        }
    }
}
