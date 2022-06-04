package mcm.edu.ph.kang_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class PhyAct extends AppCompatActivity implements View.OnClickListener{

    Button btnSpeed, btnAccel, btnDM, btnDen;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_physics);

        btnSpeed = findViewById(R.id.btnSpeed);
        btnAccel = findViewById(R.id.btnAccel);
        btnDM = findViewById(R.id.btnDM);
        btnDen = findViewById(R.id.btnDen);

        btnSpeed.setOnClickListener(this);
        btnAccel.setOnClickListener(this);
        btnDM.setOnClickListener(this);
        btnDen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnSpeed:
                Intent intent1 = new Intent(PhyAct.this, Speed.class);
                startActivity(intent1);

            case R.id.btnAccel:
                Intent intent2 = new Intent(PhyAct.this, Acceleration.class);
                startActivity(intent2);

            case R.id.btnDM:
                Intent intent3 = new Intent(PhyAct.this, DistanceMotion.class);
                startActivity(intent3);

            case R.id.btnDen:
                Intent intent4 = new Intent(PhyAct.this, Density.class);
                startActivity(intent4);

        }

    }

}
