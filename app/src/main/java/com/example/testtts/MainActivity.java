package com.example.testtts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Button btnurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btnurl=(Button) findViewById(R.id.buttonURL);
         btnurl.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(MainActivity.this,GetURL.class );
                 startActivity(intent);
             }
         });
    }
    //https://stackoverflow.com/questions/31433687/android-gradle-apache-httpclient-does-not-exist
//https://www.youtube.com/watch?v=Vcn4OuV4Ixg
    }
