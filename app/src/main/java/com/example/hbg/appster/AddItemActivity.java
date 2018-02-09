package com.example.hbg.appster;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

/**
 * Created by hbg on 2/9/2018.
 */

public class AddItemActivity extends AppCompatActivity{
    ListView itemsList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_home);
        itemsList = (ListView) findViewById(R.id.list_owner_home);


    }
}
