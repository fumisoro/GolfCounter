package com.example.fumiyaseki.golfcounter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ShotNumber shotNumber;
    private TextView shotNumTextView;
    private TextView puttNumTextView;
    private Button shotButton;
    private Button puttButton;

    private Button nextButton;
    private Button beforeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shotNumTextView = (TextView)findViewById(R.id.shotNumTextView);
        shotButton = (Button)findViewById(R.id.shotButton);
        puttNumTextView = (TextView)findViewById(R.id.puttNumTextView);
        puttButton = (Button)findViewById(R.id.puttButton);
        shotNumber = new ShotNumber();

        nextButton = (Button)findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        beforeButton = (Button)findViewById(R.id.beforeButton);
        beforeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


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
