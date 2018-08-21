package com.example.chris.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class otherACTIVITY extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button showLocationBtn;

    // Instantiate the RequestQueue.
    RequestQueue queue = Volley.newRequestQueue(this);
    String url ="http://www.google.com";


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
                Log.d("tag", "Someone pushed the damn location button goddamnit");



                textView.setText("Oi! You pushed my button!");
                break;
        }
    }
}
