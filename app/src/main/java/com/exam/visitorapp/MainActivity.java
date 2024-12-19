package com.exam.visitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button bm1,bm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

      bm1=(Button) findViewById(R.id.mb1);
      bm2=(Button) findViewById(R.id.mb2);


      bm2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent o1=new Intent(getApplicationContext(), ViewAct.class);
              startActivity(o1);
          }
      });
      bm1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent o=new Intent(getApplicationContext(),AddVisitorAct.class);
              startActivity(o);
          }
      });
    }
}