package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cuboid extends AppCompatActivity implements View.OnClickListener {

    EditText lengthCuboid, widthCuboid, heightCuboid;
    Button solveCuboid;
    TextView answerCuboid;

    double cuboid;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_cuboid);

        lengthCuboid = findViewById(R.id.editTextLengthCuboid);
        widthCuboid = findViewById(R.id.editTextWidthCuboid);
        heightCuboid = findViewById(R.id.editTextHeightCuboid);
        solveCuboid = findViewById(R.id.btnSolveCuboid);
        answerCuboid = findViewById(R.id.answerCuboid);

        answerCuboid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerCuboid:
                gs.setLength(Double.parseDouble(lengthCuboid.getText().toString()));
                gs.setWidth(Double.parseDouble(widthCuboid.getText().toString()));
                gs.setHeight(Double.parseDouble(heightCuboid.getText().toString()));


                cuboid = ans.cuboidV(gs.getLength(), gs.getWidth(), gs.getHeight());

                answerCuboid.setText("" + cuboid);
        }
    }
}

