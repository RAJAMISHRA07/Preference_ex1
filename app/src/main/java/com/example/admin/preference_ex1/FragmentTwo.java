package com.example.admin.preference_ex1;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
TextView tv1,tv2;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_fragment_two, container, false);
        tv1= (TextView) view.findViewById(R.id.textview1);
        tv2= (TextView) view.findViewById(R.id.textview2);
        //WE HAVE TO READ DATA FROM PREFERENCE FILE HERE
        SharedPreferences sharedPreferences=getActivity().getSharedPreferences("credentials",0);
        String value1=sharedPreferences.getString("name",null);
        String value2=sharedPreferences.getString("password",null);
        tv1.setText("Name:"+value1);
        tv2.setText("Password: "+value2);
        return  view;
    }

}
