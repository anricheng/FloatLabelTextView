package com.example.aric.floatinglabeledittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.support.design.widget.TextInputLayout;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    android.support.design.widget.TextInputLayout lNameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lNameLayout = (TextInputLayout) findViewById(R.id
                .lNameLayout);
        lNameLayout.setErrorEnabled(true);
        lNameLayout.setError("Min 2 chars required");
        lNameLayout.setHint("我是周海峰");
        EditText fName = (EditText) findViewById(R.id.lName);
        final Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
        fName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean matches = pattern.matcher(s.toString()).matches();
                if (matches) {
                    lNameLayout.setErrorEnabled(false);

                } else {
                    lNameLayout.setErrorEnabled(true);
                    lNameLayout.setError("Min 2 chars required");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

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
