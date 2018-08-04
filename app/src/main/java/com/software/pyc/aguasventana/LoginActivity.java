package com.software.pyc.aguasventana;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Class.SessionManager;
import OpenHelper.User_OpenHelper;

public class LoginActivity extends AppCompatActivity {

    EditText nombre, password;
    Button ingresar;


    User_OpenHelper helper = new User_OpenHelper(this,"BD1",null,1);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final SessionManager sessionManager = new SessionManager(getApplicationContext());

        sessionManager.checkLogin();

        //helper.mockData();


        nombre = (EditText)findViewById(R.id.etName);
        password = (EditText)findViewById(R.id.etPassword);
        ingresar = (Button)findViewById(R.id.btnIngresarLogin);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Cursor cursor = helper.ConsultarUsuPass(String.valueOf(nombre.getText()),String.valueOf(password.getText()));
                    if (cursor.getCount() > 0){

                       sessionManager.createLoginSession(String.valueOf(nombre.getText()));


                        Intent i = new Intent(getApplicationContext(),ListaActivity.class);
                        startActivity(i);
                    }else {
                        Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectas",Toast.LENGTH_SHORT ).show();
                    }
                } catch (SQLException e){
                    e.printStackTrace();
                }


            }
        });

    }
}
