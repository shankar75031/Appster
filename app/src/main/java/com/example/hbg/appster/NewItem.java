package com.example.hbg.appster;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by hbg on 2/9/2018.
 */

public class NewItem extends AppCompatActivity {
    TextView mItemName;
    TextView mQuantity;
    TextView mItemPrice;
    Button mSubmitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mItemName = (TextView) findViewById(R.id.owner_item_add_name);
    }
}
