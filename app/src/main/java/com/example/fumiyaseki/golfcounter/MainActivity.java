package com.example.fumiyaseki.golfcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
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
        shotNumber = new ShotNumber();

        shotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shotNumber.shot();
                applyNumber();
            }
        });

        puttButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shotNumber.putt();
                applyNumber();
            }
        });
    }

    void applyNumber(){
        shotNumTextView.setText(shotNumber.getShotNum()+"ショット");
        puttNumTextView.setText(shotNumber.getPuttNum()+"パット");
    }
}
