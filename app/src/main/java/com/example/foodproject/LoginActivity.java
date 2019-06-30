package com.example.foodproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // To register Screen

        TextView toRegister = findViewById(R.id.registerTxt);
        toRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });



        // To login

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                login();
            }
        });
    }


    private void login()
    {

        EditText userBox = findViewById(R.id.usernameBox);
        EditText pwordBox = findViewById(R.id.passwdBox);

        String username = userBox.getText().toString();
        String password = pwordBox.getText().toString();

        if (userBox.getText().toString().equals("") || pwordBox.toString().equals(""))
        {
            Toast.makeText(this, "Username and password must not be empty", Toast.LENGTH_SHORT).show();
        }
        else
        {
            ParseUser parseUser = new ParseUser();

            parseUser.setUsername(userBox.getText().toString());
            parseUser.setPassword(pwordBox.getText().toString());

            parseUser.logInInBackground(username, password, new LogInCallback() {
                @Override
                public void done(ParseUser user, ParseException e)
                {

                    if (user != null)
                    {
                        Log.i("Login", "Successful");
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}

