package de.example.schultestprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tvTitle = findViewById(R.id.tvTitle);

        findViewById(R.id.btnEnd).setOnClickListener(this);
        findViewById(R.id.btnYellow).setOnClickListener(this);
        findViewById(R.id.btnRed).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Button clicked!", Toast.LENGTH_LONG).show();

        switch (v.getId()) {
            case R.id.btnRed:
                tvTitle.setBackgroundColor(Color.RED);
                break;
            case R.id.btnYellow:
                tvTitle.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.btnEnd:
                finish();
                break;
        }
    }
}