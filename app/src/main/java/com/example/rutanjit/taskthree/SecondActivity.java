package com.example.rutanjit.taskthree;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Toast.makeText(this, "Task 3 Completed",
                Toast.LENGTH_LONG).show();
        Snackbar snackbar;
        snackbar = Snackbar.make(relativeLayout, "Second Activity", Snackbar.LENGTH_LONG);
        snackbar.show();



    }
}
