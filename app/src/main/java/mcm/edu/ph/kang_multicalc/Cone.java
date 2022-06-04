package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cone extends AppCompatActivity implements View.OnClickListener {

    EditText radiusCone, heightCone;
    Button solveCone;
    TextView answerCone;
    double cone;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_cone);

        radiusCone = findViewById(R.id.editTextRadiusCone);
        heightCone = findViewById(R.id.editTextHeightCone);
        solveCone = findViewById(R.id.btnSolveCone);
        answerCone = findViewById(R.id.answerCone);

        answerCone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerCone:
                gs.setRadius(Double.parseDouble(radiusCone.getText().toString()));
                gs.setHeight(Double.parseDouble(heightCone.getText().toString()));

                cone = ans.coneV(gs.getRadius(), gs.getHeight());

                answerCone.setText("" + cone);


        }
    }
}

