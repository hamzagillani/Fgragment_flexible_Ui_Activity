package com.digicon_valley.fgragment_flexible_ui_activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

    ListView listView;
    Communicator comm;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
           listView = view.findViewById(R.id.listView_id);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.chapters,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


        return  view;
    }

    public void setCommunicator(Communicator communicator){
        this.comm=communicator;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        comm.respond(position);


    }
    public  interface Communicator{
    public void respond(int index);



    }
}
