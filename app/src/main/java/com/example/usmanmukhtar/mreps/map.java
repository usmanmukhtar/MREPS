package com.example.usmanmukhtar.mreps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class map extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    textView = (TextView) findViewById(R.id.textView1);

        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("q1");
                textView.setText(newString);
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("q1");
            textView.setText(newString);
        }

    }
}
