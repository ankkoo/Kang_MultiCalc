package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DistanceMotion extends AppCompatActivity implements View.OnClickListener {

    EditText vi, timeDm, accelDm;
    Button solveDm;
    TextView answerDm;

    double dm;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_dm);

        vi = findViewById(R.id.editTextViDm);
        timeDm = findViewById(R.id.editTextTimeDm);
        accelDm = findViewById(R.id.editTextAccelDm);
        solveDm = findViewById(R.id.btnSolveDm);
        answerDm = findViewById(R.id.answerDm);

        answerDm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerDm:
                gs.setVi(Double.parseDouble(vi.getText().toString()));
                gs.setTime(Double.parseDouble(timeDm.getText().toString()));
                gs.setAccel(Double.parseDouble(accelDm.getText().toString()));


                dm = ans.distanceM(gs.getVi(), gs.getTime(), gs.getAccel());

                answerDm.setText("" + dm);
        }
    }
}
