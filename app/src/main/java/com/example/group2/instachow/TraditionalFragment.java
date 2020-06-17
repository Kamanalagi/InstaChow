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
public class TraditionalFragment extends Fragment {


    public TraditionalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_traditional, container, false);

        ArrayList<TraditionalfoodClass> trad_food = new ArrayList<TraditionalfoodClass>();
        trad_food.add(new TraditionalfoodClass("Karahi", " $4.00", R.drawable.karahi,"0"));
        trad_food.add(new TraditionalfoodClass("Biryani", " $6.00", R.drawable.biryani,"0"));
        trad_food.add(new TraditionalfoodClass("Malai Boti", " $4.00", R.drawable.malaiboti,"0"));
        trad_food.add(new TraditionalfoodClass("Seekh Kabab", " $4.00", R.drawable.kabab,"0"));
        trad_food.add(new TraditionalfoodClass("Tikka", " $5.00", R.drawable.tikka,"0"));
        trad_food.add(new TraditionalfoodClass("Sajji", " $10.00", R.drawable.sajjione,"0"));

        TraditionalFoodAdapter tradfoodadapter = new TraditionalFoodAdapter(getActivity(),trad_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_traditional);
        listView.setAdapter(tradfoodadapter);

        return view;
    }

}
