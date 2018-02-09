package com.example.hbg.appster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText uname, pass;
    Button login;
    String namestr,passwordstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText)findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namestr = uname.getText().toString();
                passwordstr = pass.getText().toString();
                if(namestr.equals("admin")){
                    startActivity(new Intent(MainActivity.this, OwnerActivity.class));
                }
                else{
                    startActivity(new Intent(MainActivity.this, ShoppingActivity.class));
                }
            }
        });
    }
}
