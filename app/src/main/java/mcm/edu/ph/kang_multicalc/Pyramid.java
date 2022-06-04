package mcm.edu.ph.kang_multicalc;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pyramid extends AppCompatActivity implements View.OnClickListener {

    EditText lengthPyr, widthPyr, heightPyr;
    Button solvePyr;
    TextView answerPyr;

    double pyr;

    Formulas ans= new Formulas();
    getSet gs = new getSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_pyramid);

        lengthPyr = findViewById(R.id.editTextLengthPyr);
        widthPyr = findViewById(R.id.editTextWidthPyr);
        heightPyr = findViewById(R.id.editTextHeightPyr);
        solvePyr = findViewById(R.id.btnSolvePyr);
        answerPyr = findViewById(R.id.answerPyr);

        answerPyr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerPyr:
                gs.setLength(Double.parseDouble(lengthPyr.getText().toString()));
                gs.setWidth(Double.parseDouble(widthPyr.getText().toString()));
                gs.setHeight(Double.parseDouble(heightPyr.getText().toString()));


                pyr = ans.pyramidV(gs.getLength(), gs.getWidth(), gs.getHeight());

                answerPyr.setText("" + pyr);
        }
    }
}
