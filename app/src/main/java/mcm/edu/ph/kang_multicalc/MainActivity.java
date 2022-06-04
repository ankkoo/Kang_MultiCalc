package mcm.edu.ph.kang_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPhy, btnGeo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        btnPhy = findViewById(R.id.btnPhy);
        btnGeo = findViewById(R.id.btnGeo);

        btnPhy.setOnClickListener(this);
        btnGeo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPhy:
                Intent intent1 = new Intent(this, PhyAct.class);
                startActivity(intent1);
                break;
            case R.id.btnGeo:
                Intent intent2 = new Intent(this, GeoAct.class);
                startActivity(intent2);
        }

    }
}