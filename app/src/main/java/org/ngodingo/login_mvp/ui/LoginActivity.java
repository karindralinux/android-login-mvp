package org.ngodingo.login_mvp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import org.ngodingo.login_mvp.R;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class LoginActivity extends AppCompatActivity  {

    @InjectView(R.id.edt_login_email)
    EditText editTextLoginEmail;

    @InjectView(R.id.edt_login_password)
    EditText editTextLoginPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);


    }

}
