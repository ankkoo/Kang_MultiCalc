package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Acceleration extends AppCompatActivity implements View.OnClickListener {

    EditText editTextVf, editTextVi, editTextTime;
    Button solveAcc;
    TextView answerAcc;

    double acc;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_accel);

        editTextVf = findViewById(R.id.editTextVfAcc);
        editTextVi = findViewById(R.id.editTextViAcc);
        editTextTime = findViewById(R.id.editTextTimeAcc);
        solveAcc = findViewById(R.id.btnSolveAccel);
        answerAcc = findViewById(R.id.answerAcc);

        answerAcc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerAcc:
                gs.setVf(Double.parseDouble(editTextVf.getText().toString()));
                gs.setVi(Double.parseDouble(editTextVi.getText().toString()));
                gs.setTime(Double.parseDouble(editTextTime.getText().toString()));
                ;

                acc = ans.acceleration(gs.getVf(), gs.getVi(), gs.getTime());

                answerAcc.setText("" + acc);
        }
    }
}
