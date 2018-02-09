package com.example.hbg.appster;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by hbg on 2/9/2018.
 */

public class ItemsAdapter extends ArrayAdapter<Item> {
    public ItemsAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_customer, parent, false);
        }
        Item currentItem = getItem(position);
        TextView itemName = (TextView) listItemView.findViewById(R.id.list_customer_item_name);
        itemName.setText(currentItem.getName());
        TextView itemPrice = (TextView) listItemView.findViewById(R.id.list_customer_item_price);
        itemName.setText(currentItem.getPrice());
        final TextView itemCount = (TextView) listItemView.findViewById(R.id.list_customer_item_quantity);
        itemCount.setText("0");
        Button incr = (Button) listItemView.findViewById(R.id.button_customer_quantity_increase);
        Button decr = (Button) listItemView.findViewById(R.id.button_customer_quantity_decrease;
        incr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(itemCount.getText().toString());
                count++;
                itemCount.setText(Integer.toString(count));
            }
        });
        decr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(itemCount.getText().toString());
                if(count > 0)
                    count--;
                else
                    Toast.makeText(getContext(),"Item count cannot be less than 0",Toast.LENGTH_SHORT);
                itemCount.setText(Integer.toString(count));
            }
        });
        return listItemView;

    }
}
