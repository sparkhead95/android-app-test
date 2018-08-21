package com.example.chris.myfirstapp;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class otherACTIVITY extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button showLocationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_activity);

        showLocationBtn = (Button) findViewById(R.id.showLocationBtn);
        textView = (TextView) findViewById(R.id.showLocationText);

        showLocationBtn.setOnClickListener(this);

        Toast.makeText(this, "Switched to NASA page", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.showLocationBtn:
                // Instantiate the RequestQueue.
                RequestQueue queue = Volley.newRequestQueue(this);
                String url ="https://api.nasa.gov/planetary/apod?api_key=FmqsvLjKYhuEcXxTIdwrZwcYVFufNhGNFtL45m1N";
                JsonObjectRequest objectRequest = new JsonObjectRequest(
                        Request.Method.GET,
                        url,
                        null,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                textView.setText(response.toString());
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.e("Rest Response", error.toString());
                            }
                        }
                );

                queue.add(objectRequest);

                break;
        }
    }
}
