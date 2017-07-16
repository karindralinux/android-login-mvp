package org.ngodingo.login_mvp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.ngodingo.login_mvp.BuildConfig;
import org.ngodingo.login_mvp.R;
import org.ngodingo.login_mvp.login.ILoginView;
import org.ngodingo.login_mvp.login.LoginPresenter;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class LoginActivity extends AppCompatActivity implements ILoginView {

    @InjectView(R.id.edt_login_email)
    EditText editTextLoginEmail;

    @InjectView(R.id.edt_login_password)
    EditText editTextLoginPassword;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        if (BuildConfig.DEBUG) {
            editTextLoginEmail.setText("akusukangoding@gmail.com");
            editTextLoginPassword.setText("$ecret");
        }

        loginPresenter = new LoginPresenter(this);

    }

    @OnClick(R.id.btn_login)
    public void onLogin(View view) {
        String email = editTextLoginEmail.getText().toString();
        String password = editTextLoginPassword.getText().toString();

        loginPresenter.attemptLogin(email,password);
    }

    @Override
    public void navigateToListActivity() {
        Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show();

    }
}
