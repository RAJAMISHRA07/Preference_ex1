package com.example.admin.preference_ex1;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
EditText ed1,ed2;
    Button b1,b2;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_one, container, false);
        ed1= (EditText) view.findViewById(R.id.et1);
        ed2= (EditText) view.findViewById(R.id.et2);
        b1= (Button) view.findViewById(R.id.button1);
        b2= (Button) view.findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getActivity().getSharedPreferences("credentials",0);
                SharedPreferences.Editor editor=sharedPreferences.edit();//open editor
                editor.putString("name",ed1.getText().toString());//write name
                editor.putString("password",ed2.getText().toString());//write pw
                editor.commit();//save into preference file
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.loadSecondfrag();
            }
        });
        return  view;
    }

}
