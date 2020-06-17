package com.example.group2.instachow;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class OrderPage extends AppCompatActivity {

    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        ListView listView = (ListView) findViewById(R.id.order_page);
        mydb = new DatabaseHelper(this);

        ArrayList<OrderClass> list = new ArrayList<OrderClass>(); //use to store data from cursor
        Cursor data = mydb.Get_OrderDetails();  //contain all data

        if (data.getCount() == 0)
        {

        }
        else {
            while (data.moveToNext()) {

                list.add(new OrderClass(data.getString(0),data.getString(1),data.getString(2),data.getString(3)));
            }
        }
        OrderAdapter adapter = new OrderAdapter(getApplicationContext(),list);
        listView.setAdapter(adapter);
    }
}
