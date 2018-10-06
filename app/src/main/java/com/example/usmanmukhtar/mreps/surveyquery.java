package com.example.usmanmukhtar.mreps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class surveyquery extends AppCompatActivity {
    private RadioGroup radioGroup,radioGroup2,radioGroup3,radioGroup4;
    private RadioButton radioButton,radioButton2,radioButton3,radioButton4;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surveyquery);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addListenerOnButton();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    public void addListenerOnButton() {

        radioGroup = (RadioGroup) findViewById(R.id.toggle1);
        radioGroup2 = (RadioGroup) findViewById(R.id.toggle2);
        radioGroup3 = (RadioGroup) findViewById(R.id.toggle3);
        radioGroup4 = (RadioGroup) findViewById(R.id.toggle4);

        btnDisplay = (Button) findViewById(R.id.button);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioGroup.getCheckedRadioButtonId();
                int selectedId2 = radioGroup2.getCheckedRadioButtonId();
                int selectedId3 = radioGroup3.getCheckedRadioButtonId();
                int selectedId4 = radioGroup4.getCheckedRadioButtonId();

                if((selectedId == R.id.yes1 || selectedId == R.id.NO1) &&
                        (selectedId2 == R.id.yes2 || selectedId2 == R.id.NO2) &&
                        (selectedId3 == R.id.yes3 || selectedId3 == R.id.NO3) &&
                        (selectedId4 == R.id.yes4 || selectedId4 == R.id.NO4)) {

                    // find the radiobutton by returned id
                    radioButton = (RadioButton) findViewById(selectedId);
                    radioButton2 = (RadioButton) findViewById(selectedId2);
                    radioButton3 = (RadioButton) findViewById(selectedId3);
                    radioButton4 = (RadioButton) findViewById(selectedId4);

                    Intent i = new Intent(surveyquery.this, map.class);
                    i.putExtra("q1", radioButton.getText());
                    i.putExtra("q2", radioButton2.getText());
                    i.putExtra("q3", radioButton3.getText());
                    i.putExtra("q4", radioButton4.getText());
                    startActivity(i);
                }
                else{
                    Toast.makeText(surveyquery.this, "Select All options!", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
