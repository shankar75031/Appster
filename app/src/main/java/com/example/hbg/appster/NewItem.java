package com.example.hbg.appster;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by hbg on 2/9/2018.
 */

public class NewItem extends AppCompatActivity {
    EditText mItemName;
    EditText mQuantity;
    EditText mItemPrice;
    Button mSubmitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.owner_item_add);
        mItemName = (EditText) findViewById(R.id.owner_item_add_name);
        mQuantity = (EditText) findViewById(R.id.owner_item_add_qty);
        mItemPrice = (EditText) findViewById(R.id.owner_item_add_price);
        mSubmitButton = (Button) findViewById(R.id.button_owner_item_new);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("/" );
                Item item = new Item(mItemName.getText().toString(),mItemPrice.getText().toString(),mQuantity.getText().toString());
                myRef.child("items").push().setValue(item);
            }
        });
    }
}
