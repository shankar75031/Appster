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

public class ItemOwnerAdapter  extends ArrayAdapter<Item> {
    public ItemOwnerAdapter(Activity context, ArrayList<Item> items) {
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
        itemPrice.setText(currentItem.getPrice());
        TextView itemQty = (TextView) listItemView.findViewById(R.id.list_customer_item_quantity);
        itemQty.setText(currentItem.getQuantity());
        return listItemView;

    }
}
