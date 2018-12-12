package com.example.drakwars.projetgroupea07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    private Button _menu_login, _menu_register, _menu_objects, _menu_users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        _menu_login = (Button) findViewById(R.id.menu_login);
        _menu_login.setOnClickListener(this);

        _menu_register = (Button) findViewById(R.id.menu_register);
        _menu_register.setOnClickListener(this);

        _menu_objects = (Button) findViewById(R.id.menu_objects);
        _menu_objects.setOnClickListener(this);

        _menu_users = (Button) findViewById(R.id.menu_users);
        _menu_users.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch(v.getId()){
            case R.id.menu_login :
                intent = new Intent(this, Login.class);
                startActivity(intent);
                break;

            case R.id.menu_register :
                intent = new Intent(this, Register.class);
                startActivity(intent);
                break;
        }
    }

}
