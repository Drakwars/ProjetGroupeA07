package com.example.drakwars.projetgroupea07;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Login extends AppCompatActivity implements View.OnClickListener{

    private Button btn_login, btn_reset;
    private EditText et_username, et_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.bt_login_login);
        btn_login.setOnClickListener(this);

        btn_reset = (Button) findViewById(R.id.bt_log_reset);
        btn_reset.setOnClickListener(this);

        et_username = (EditText) findViewById(R.id.et_log_username);
        et_pwd = (EditText) findViewById(R.id.et_log_password);

    }

    @Override
    public void onClick(View v) {

        Log.w("test","mashallah");
        resetData();
        switch(v.getId()){
            case R.id.bt_login_login :
                afficherData();
                break;

            case R.id.bt_log_reset :
                resetData();
                break;
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        et_username.setText("test");
    }

    private void resetData(){
        et_username.setText("");
        et_pwd.setText("");
    }

    private void afficherData(){
        Log.w("Helha", String.format("%s PWD > %s",et_username.getText(),et_pwd.getText()));
    }
}
