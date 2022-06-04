package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Speed extends AppCompatActivity implements View.OnClickListener {

    EditText distanceSp, timeSp;
    Button solveSpeed;
    TextView answerSpeed;

    double speed;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_speed);

        distanceSp = findViewById(R.id.editTextDisSpeed);
        timeSp = findViewById(R.id.editTextTimeSpeed);
        solveSpeed = findViewById(R.id.btnSolveSpeed);
        answerSpeed = findViewById(R.id.answerSpeed);

        answerSpeed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerSpeed:
                gs.setDistance(Double.parseDouble(distanceSp.getText().toString()));
                gs.setTime(Double.parseDouble(timeSp.getText().toString()));

                speed = ans.speed(gs.getDistance(), gs.getTime());

                answerSpeed.setText("" + speed);
        }
    }
}
