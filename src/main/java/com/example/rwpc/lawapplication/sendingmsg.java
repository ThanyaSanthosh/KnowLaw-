package com.example.rwpc.lawapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sendingmsg extends AppCompatActivity {
    Button buttonSend;
    EditText textPhoneNo;
    EditText textSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendingmsg);

        buttonSend = (Button) findViewById(R.id.send);
        textPhoneNo = (EditText) findViewById(R.id.phno);
        textSMS = (EditText) findViewById(R.id.msg);


        buttonSend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String phoneNo = textPhoneNo.getText().toString();
                String phno="9746039454";
                String sms = textSMS.getText().toString();
                try {SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(String.valueOf(R.string.ph_no), null, sms, null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!",Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"SMS faild, please try again later!",Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }});
    }
}
