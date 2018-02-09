package com.example.hbg.appster;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

/**
 * Created by hbg on 2/9/2018.
 */

public class AddItemActivity extends AppCompatActivity{

    ListView itemsList;
    Button mAddItemButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_home);
        itemsList = (ListView) findViewById(R.id.list_owner_home);

        mAddItemButton = (Button) findViewById(R.id.button_owner_add_item);
        mAddItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddItemActivity.this, NewItem.class));
            }
        });
    }
}
