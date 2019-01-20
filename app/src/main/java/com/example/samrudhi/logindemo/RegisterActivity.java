package com.example.samrudhi.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sign_up;
    private TextView login;
    private EditText email_edit,password_edit,password_conf_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        sign_up=findViewById(R.id.sign_up);
        login=findViewById(R.id.login);
        email_edit=findViewById(R.id.email_edit);
        password_edit=findViewById(R.id.password_edit);
        password_conf_edit=findViewById(R.id.password_conf_edit);
        sign_up.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.login)
        {
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.sign_up)
        {
            String emailstr = email_edit.getText().toString();
            String password = password_edit.getText().toString();
            String passwordconf = password_conf_edit.getText().toString();
            if(emailstr.isEmpty())
            {
                email_edit.setError("Please enter email");
                return;
            }
            if (password.isEmpty())
            {
                password_edit.setError("Please enter password");
                return;
            }
            if(!passwordconf.equals(password))
            {
               password_conf_edit.setError("Password doesn't match");
               return;
            }
        }
    }
}
