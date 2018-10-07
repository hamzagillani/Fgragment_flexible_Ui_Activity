package com.digicon_valley.fgragment_flexible_ui_activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {
TextView text;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_b, container, false);

        text=view.findViewById(R.id.textview_id);
        return  view;
    }

    public void changeData(int index){

        String [] description=getActivity().getResources().getStringArray(R.array.description);

        text.setText(description[index]);
    }

}
