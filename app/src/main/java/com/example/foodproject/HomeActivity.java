package com.example.foodproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        // To register Screen

        ImageButton toBrowse = findViewById(R.id.homeBrowseButton);
        toBrowse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(HomeActivity.this, BrowseActivity.class);
                startActivity(intent);
            }
        });

    }
}
