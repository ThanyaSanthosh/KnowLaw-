package com.example.rwpc.lawapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class DautActivity extends AppCompatActivity {
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daut);
        r1=(RadioButton)findViewById(R.id.radioButton2);
        r2=(RadioButton)findViewById(R.id.radioButton5);
    }
    void msg(View V){
        Intent i = new Intent(DautActivity.this,sendingmsg.class);
        startActivity(i);
    }
    void law(View V){
        if(r1.isChecked())
        {
            Intent i = new Intent(DautActivity.this, WebActivity.class);
            startActivity(i);
        }
        else if(r2.isChecked()) {
            Intent i = new Intent(DautActivity.this,EngActivity.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this,"please select",Toast.LENGTH_LONG).show();
        }

    }
    void list(View V){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://knowlaw.22web.org/list.php"));
        startActivity(intent);

    }
    void site(View V){
        Intent i = new Intent(DautActivity.this,WebsiteActivity.class);
        startActivity(i);
    }
}
