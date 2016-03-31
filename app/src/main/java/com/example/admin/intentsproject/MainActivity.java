package com.example.admin.intentsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMagic(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("put_test", "Hello");
        startActivity(intent);
    }

    public void doMagic2(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("put_test", "Good Bye");
        startActivity(intent);
    }
}
