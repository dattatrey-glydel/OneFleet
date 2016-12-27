package com.glydel.onefleet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.glydel.onefleet.consants.Constants;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Constants.mainPackageName=getApplicationContext().getPackageName();

    }
}
