package com.example.rwpc.lawapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView te;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        te=(TextView)findViewById(R.id.textView4);
        //   scrollable = (TextView)findViewById(R.id.textView35);
        Bundle b1=getIntent().getExtras();
        String s1=b1.getString("id");
        //EditText t2=(EditText)findViewById(R.id.editText2);
        te.setText(s1);
    }
}
