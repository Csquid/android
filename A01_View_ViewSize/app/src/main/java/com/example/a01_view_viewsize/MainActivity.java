package com.example.a01_view_viewsize;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =  (Button)findViewById(R.id.login_button);
    }

    public void clickedLoginButton(View v) {
        Intent intent = new Intent(getApplicationContext(), Login.class);
        startActivity(intent);
    }
}
