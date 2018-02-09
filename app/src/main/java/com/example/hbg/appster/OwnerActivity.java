package com.example.hbg.appster;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by hbg on 2/9/2018.
 */

public class OwnerActivity extends AppCompatActivity{

    ListView itemsList;
    Button mAddItemButton;
    ArrayList<Item> itemArrayList;
    ItemOwnerAdapter itemsAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_home);
        itemsList = (ListView) findViewById(R.id.list_owner_home);
        itemArrayList = new ArrayList<Item>();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/items");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                itemArrayList.clear();
                if(itemsAdapter != null)
                    itemsAdapter.clear();
                Log.e("Count " ,""+snapshot.getChildrenCount());
                for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                    Item item = postSnapshot.getValue(Item.class);
                    itemArrayList.add(item);
                }
                itemsAdapter = new ItemOwnerAdapter(OwnerActivity.this,itemArrayList);
                itemsList.setAdapter(itemsAdapter);
            }
            @Override
            public void onCancelled(DatabaseError firebaseError) {
                Log.e("The read failed: " ,firebaseError.getMessage());
            }
        });



        mAddItemButton = (Button) findViewById(R.id.button_owner_add_item);
        mAddItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnerActivity.this, NewItem.class));
            }
        });
    }
}
