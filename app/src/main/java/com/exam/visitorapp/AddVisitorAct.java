package com.exam.visitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class AddVisitorAct extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button bbac,bm;
    String s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_visitor);


        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        e3=(EditText) findViewById(R.id.et3);
        e4=(EditText) findViewById(R.id.et4);

        bbac=(Button) findViewById(R.id.bb);
        bm=(Button) findViewById(R.id.bs);

        bbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o);
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();

                if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"All fields are mandatory",Toast.LENGTH_LONG).show();
                }
                else
                {
                    callApi();
                }
            }

            private void callApi() {
                String Apiurl="https://log-app-demo-api.onrender.com/addvisitor";
                JSONObject data=new JSONObject();
                try {
                    data.put("firstname",s1);
                    data.put("lastname",s2);
                    data.put("purpose",s3);
                    data.put("whomToMeet",s4);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                JsonObjectRequest request=new JsonObjectRequest(
                        Request.Method.POST,
                        Apiurl,
                        data,
                        response -> Toast.makeText(getApplicationContext(),"Succesfully Added",Toast.LENGTH_LONG).show(),
                        error -> Toast.makeText(getApplicationContext(),"Something Wrong",Toast.LENGTH_LONG).show()
                );

                RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
                queue.add(request);



            }
        });
 

    
    
    }

}
