package com.example.fumiyaseki.golfcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ShotNumber shotNumber;
    private TextView shotNumTextView;
    private TextView puttNumTextView;
    private Button shotButton;
    private Button puttButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shotNumTextView = (TextView)findViewById(R.id.shotNumTextView);
        shotButton = (Button)findViewById(R.id.shotButton);
        puttNumTextView = (TextView)findViewById(R.id.puttNumTextView);
        puttButton = (Button)findViewById(R.id.puttButton);
    }
}
