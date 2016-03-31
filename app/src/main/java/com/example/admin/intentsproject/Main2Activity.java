package com.example.admin.intentsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String extra = intent.getStringExtra("put_test");

        mTextView = (TextView) findViewById(R.id.am2_text_1);
        mTextView.setText(extra);
    }


}
