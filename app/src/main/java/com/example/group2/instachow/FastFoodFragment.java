package com.example.group2.instachow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FastFoodFragment extends Fragment {


    public FastFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food, container, false);

        ArrayList<FastfoodClass> fastfood = new ArrayList<FastfoodClass>();
        fastfood.add(new FastfoodClass("Beef Burger", " $5.70", R.drawable.beef,"0"));
        fastfood.add(new FastfoodClass("Chicken Burger", " $6.00", R.drawable.chicken,"0"));
        fastfood.add(new FastfoodClass("Zinger Burger", " $5.00", R.drawable.zinger,"0"));
        fastfood.add(new FastfoodClass("Fries", " $1.00", R.drawable.fries,"0"));
        fastfood.add(new FastfoodClass("Zinger Roll", " $4.00", R.drawable.roll,"0"));
        fastfood.add(new FastfoodClass("Club Sandwich", " $1.00", R.drawable.club,"0"));
        fastfood.add(new FastfoodClass("Chicken Wings", " $4.00", R.drawable.wings,"0"));
        fastfood.add(new FastfoodClass("Chicken Broast", " $4.00", R.drawable.broast,"0"));
        fastfood.add(new FastfoodClass("Chicken Nuggets", " $3.00", R.drawable.nuggets,"0"));

        FastFoodAdapter fastfoodadapter = new FastFoodAdapter(getActivity(),fastfood);

        ListView listView = (ListView) view.findViewById(R.id.listview_fastfood);
        listView.setAdapter(fastfoodadapter);
        return view;

    }

}
