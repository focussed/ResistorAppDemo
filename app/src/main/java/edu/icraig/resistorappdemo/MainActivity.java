package edu.icraig.resistorappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentBand = 0;
    int resistorValue = 0;

    Button band1, band2;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.tvDisplay);
        band1 = findViewById(R.id.buttonColour1);
        band2 = findViewById(R.id.buttonColour2);
    }

    public void doBand1 (View view) {
        currentBand = 1;

    }

    public void doBand2 (View view) {
        currentBand = 2;
    }

    public void doBand3 (View view) {
        currentBand = 3;
    }

    public void doRed (View view) {
        if (currentBand == 1) {
            resistorValue = 2;

            band1.setBackgroundColor(Color.RED);
            band1.setVisibility(view.VISIBLE);

            display.setBackgroundColor(Color.RED);

        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 2;
            band2.setBackgroundColor(Color.RED);
            band2.setVisibility(view.VISIBLE);


        } else if (currentBand == 3) {
            resistorValue = resistorValue * 100;
        }
    }
    public void doOrange(View view) {
        if (currentBand == 1) {
            resistorValue = 3;
            band1.setBackgroundColor(Color.rgb(255, 155, 0));
            band1.setVisibility(view.VISIBLE);

            display.setBackgroundColor(Color.rgb(255, 155, 0));     // orange
        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 3;
            band2.setBackgroundColor(Color.rgb(255, 155, 0));
            band2.setVisibility(view.VISIBLE);

        } else if (currentBand == 3) {
            resistorValue = resistorValue * 1000;
        }
    }

    public void doYellow (View view) {
        if (currentBand == 1) {

            resistorValue = 4;
            band1.setBackgroundColor(Color.YELLOW);
            band1.setVisibility(view.VISIBLE);

            display.setBackgroundColor(Color.YELLOW);

        } else if (currentBand == 2) {
            resistorValue = resistorValue * 10 + 4;
            band2.setBackgroundColor(Color.YELLOW);
            band2.setVisibility(view.VISIBLE);
        } else if (currentBand == 3) {
            resistorValue = resistorValue * 10000;
        }
    }

    public void doCalculate (View view) {
        display.setText(String.valueOf(resistorValue));
    }


}