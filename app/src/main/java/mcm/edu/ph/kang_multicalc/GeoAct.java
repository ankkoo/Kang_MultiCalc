package mcm.edu.ph.kang_multicalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GeoAct extends AppCompatActivity implements View.OnClickListener {

    Button btnCuboid, btnCyl, btnSph, btnCone, btnPyr;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_geometry);

        btnCuboid = findViewById(R.id.btnCuboid);
        btnCyl = findViewById(R.id.btnCyl);
        btnSph = findViewById(R.id.btnSph);
        btnCone = findViewById(R.id.btnCone);
        btnPyr = findViewById(R.id.btnPyr);

        btnCuboid.setOnClickListener(this);
        btnCyl.setOnClickListener(this);
        btnSph.setOnClickListener(this);
        btnCone.setOnClickListener(this);
        btnPyr.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnCuboid:
                Intent intent1 = new Intent(GeoAct.this, Cuboid.class);
                startActivity(intent1);

            case R.id.btnCyl:
                Intent intent2 = new Intent(GeoAct.this, Cylinder.class);
                startActivity(intent2);

            case R.id.btnSph:
                Intent intent3 = new Intent(GeoAct.this, Sphere.class);
                startActivity(intent3);

            case R.id.btnCone:
                Intent intent4 = new Intent(GeoAct.this, Cone.class);
                startActivity(intent4);

            case R.id.btnPyr:
                Intent intent5 = new Intent(GeoAct.this, Pyramid.class);
                startActivity(intent5);

        }

}

}
