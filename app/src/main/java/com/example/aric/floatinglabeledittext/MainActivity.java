package com.example.aric.floatinglabeledittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.support.design.widget.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.design.widget.TextInputLayout lNameLayout = (TextInputLayout) findViewById(R.id
                .lNameLayout);
        lNameLayout.setErrorEnabled(true);
        lNameLayout.setError("Min 2 chars required");
        lNameLayout.setHint("我是周海峰");

        EditText age = (EditText) findViewById(R.id.age);
        age.setError("Required");

        TextInputLayout phoneLayout = (TextInputLayout) findViewById(R.id
                .phoneLayout);
        phoneLayout.setErrorEnabled(true);
        phoneLayout.setError("Please enter a phone number");
        EditText phone = (EditText) findViewById(R.id.phone);
        phone.setError("Required");
    }
}
