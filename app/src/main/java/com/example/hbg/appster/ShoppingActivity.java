package com.example.hbg.appster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);
        listView = (ListView) findViewById(R.id.list_customer_home);

        ArrayList<Item> itemArrayList= new ArrayList<Item>();
        itemArrayList.add(new Item("Hello", "200"));
        ItemsAdapter itemsAdapter = new ItemsAdapter(this, itemArrayList);
        listView.setAdapter(itemsAdapter);
    }
}
