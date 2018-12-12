package com.example.drakwars.projetgroupea07;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Login extends AppCompatActivity implements View.OnClickListener{

    private Button _btn_login, _btn_reset;
    private EditText _et_username, _et_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _btn_login = (Button) findViewById(R.id.bt_login_login);
        _btn_login.setOnClickListener(this);

        _btn_reset = (Button) findViewById(R.id.bt_log_reset);
        _btn_reset.setOnClickListener(this);

        _et_username = (EditText) findViewById(R.id.et_log_username);
        _et_pwd = (EditText) findViewById(R.id.et_log_password);


        // Toolbar
        Toolbar toolBar = (Toolbar) findViewById(R.id.login_tool_bar);
        toolBar.setTitle(getResources().getText(R.string.txt_login));
        toolBar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


    @Override
    public void onClick(View v) {

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
        //et_username.setText("test");
    }

    private void resetData(){
        _et_username.setText("");
        _et_pwd.setText("");
    }

    private void afficherData(){
        Log.w("Helha", String.format("%s PWD > %s",_et_username.getText(),_et_pwd.getText()));
    }
}
