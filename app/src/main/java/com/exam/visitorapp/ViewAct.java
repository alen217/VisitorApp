package com.exam.visitorapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewAct extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view);
        t1=(TextView) findViewById(R.id.vt1);

        callApi();
    }

    private void callApi() {

        String url="https://log-app-demo-api.onrender.com/getvistors";
        JsonArrayRequest request=new JsonArrayRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        StringBuilder result =new StringBuilder();
                        for(int i=0;i<response.length();i++){

                            try {
                                JSONObject ob=response.getJSONObject(i);
                                String getFN=ob.getString("firstname");
                                String getln=ob.getString("lastname");
                                String getp=ob.getString("purpose");
                                String getw=ob.getString("whomToMeet");


                                result.append("First Name :").append(getFN).append("\n");
                                result.append("Last Name :").append(getln).append("\n");
                                result.append("Purpose :").append(getp).append("\n");
                                result.append("Meet :").append(getw).append("\n");
                                result.append("---------------------------------------");
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        t1.setText(result.toString());


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "Error Occured", Toast.LENGTH_SHORT).show();
                    }
                }


        );
        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);
    }
}