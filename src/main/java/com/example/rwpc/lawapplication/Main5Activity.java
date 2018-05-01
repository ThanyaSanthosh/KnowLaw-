package com.example.rwpc.lawapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        r1=(RadioButton)findViewById(R.id.radioButton8);
        r2=(RadioButton)findViewById(R.id.radioButton7);
    }

    void ok(View V) {
        if(r1.isChecked())
        {
            Intent i = new Intent(Main5Activity.this, DautActivity.class);
            startActivity(i);
        }
        else if(r2.isChecked()) {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://knowlaw.22web.org"));
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"not selected",Toast.LENGTH_LONG).show();
        }
    }
    }

