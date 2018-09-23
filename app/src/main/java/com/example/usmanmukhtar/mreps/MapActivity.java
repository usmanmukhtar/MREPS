package com.example.usmanmukhtar.mreps;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Toast;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        public void click(View view){
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("this is alert box");
            builder.setTitle("alert");
            builder.setIcon(R.mipmap.ic_launcher);
            builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"neelum",Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActionMode((ActionMode.Callback) new Intent(MainActivity.this,MainActivity.class));
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.setCancelable(false);
            alertDialog.show();

        }
    }
}
