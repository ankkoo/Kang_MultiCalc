package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cylinder extends AppCompatActivity implements View.OnClickListener {

    EditText radiusCyl, heightCyl;
    Button solveCyl;
    TextView answerCyl;

    double cyl;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_cylinder);

        radiusCyl = findViewById(R.id.editTextLengthCuboid);
        heightCyl = findViewById(R.id.editTextWidthCuboid);
        solveCyl = findViewById(R.id.btnSolveCyl);
        answerCyl = findViewById(R.id.answerCyl);

        answerCyl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerCyl:
                gs.setRadius(Double.parseDouble(radiusCyl.getText().toString()));
                gs.setHeight(Double.parseDouble(heightCyl.getText().toString()));

                cyl = ans.cylinderV(gs.getRadius(), gs.getHeight());

                answerCyl.setText("" + cyl);
        }
    }
}

