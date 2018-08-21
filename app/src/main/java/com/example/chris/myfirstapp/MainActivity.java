package com.example.chris.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button push_me, switch_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        push_me = (Button) findViewById(R.id.pushMeButton);
        switch_activity = (Button) findViewById(R.id.switchActivityBtn);
        textView = (TextView) findViewById(R.id.textViewBtnPrompt);

        push_me.setOnClickListener(this);
        switch_activity.setOnClickListener(this);

//        push_me.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Log.d("tag", "Someone pushed the damn button goddamnit");
//                textView.setText("Oi! You pushed my button!");
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "In onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "In onDestroy");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pushMeButton:
                Log.d("tag", "Someone pushed the damn button goddamnit");
                textView.setText("Oi! You pushed my button!");
                break;
            case R.id.switchActivityBtn:
                Intent intent = new Intent(MainActivity.this, otherACTIVITY.class);
                startActivity(intent);
        }
    }
}
