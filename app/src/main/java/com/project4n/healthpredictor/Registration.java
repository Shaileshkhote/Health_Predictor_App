package com.project4n.healthpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Registration extends AppCompatActivity {

    private static final String TAG ="100" ;
    private Button signup;
    private TextInputLayout fullname;
    private TextInputLayout phoneno;
    private TextInputLayout email;
    private TextInputLayout password;

    private String name;
    private String phone;
    private String emailid;
    private String pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        signup=findViewById(R.id.signup_next_button);
        fullname=findViewById(R.id.signup_fullname);
        phoneno=findViewById(R.id.signup_phone);
        email=findViewById(R.id.signup_email);
        password=findViewById(R.id.signup_password);



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name= fullname.getEditText().getText().toString();
                phone=phoneno.getEditText().getText().toString();
                emailid=email.getEditText().getText().toString();
                pass= password.getEditText().getText().toString();

                Log.d(TAG, name);

                Intent intent=new Intent(Registration.this,otp_View.class);
                intent.putExtra("mobile",phone);
                startActivity(intent);
            }
        });
    }
}