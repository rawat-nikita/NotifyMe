package com.example.admin.notifyme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void onSignupClick(View v)
    {

    }
    public void onLoginClick(View v)
    {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

}
