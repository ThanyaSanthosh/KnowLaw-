package com.example.rwpc.lawapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class WebsiteActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        listView=(ListView)findViewById(R.id.list);
        String[] values = new String[]{
                "Kerala Women's Commision",
                "Best Law Firm Websites",
                "Welcome to Women's Commission",
                "Welcome to Vanitha Case Status",
                "Kerala Women Helping",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position==0) {
                    Intent myintent = new Intent( Intent.ACTION_VIEW, Uri.parse("https://keralawomenscommision.gov.in/vanithaweb/en/index.php?option=com_content&view=article&id=98&Itemid=91"));

                  //  Intent myintent = new Intent(view.getContext(), Scrolling1Activity.class);
                  //  myintent.putExtra("id","");
                  //  Intent myintent = new Intent(Intent.ACTION_PICK);
                 //   startActivityForResult( myintent,0);
                    startActivity(myintent);


                }
                if (position==1) {
                    Intent myintent = new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.keralawomen.gov.in/"));
                    startActivity(myintent);


                }
                if (position==2) {
                    Intent myintent = new Intent( Intent.ACTION_VIEW, Uri.parse("http://keralawomenscommission.gov.in/vanithaweb/en/index.php?option=com_content&view=article&id=61&Itemid=70"));
                    startActivity(myintent);


                }
                if (position==3) {
                    Intent myintent = new Intent( Intent.ACTION_VIEW, Uri.parse("https://blog.ipleaders.in/crimes-against-women-can-you-register-complaint-over-email-and-post/"));
                    startActivity(myintent);


                }
                if (position==4) {
                    Intent myintent = new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.keralawomen.gov.in/index.php/helpline"));
                    startActivity(myintent);


                }

                int itemPosition     = position;


                String  itemValue    = (String) listView.getItemAtPosition(position);


                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }
        });

    }
}

