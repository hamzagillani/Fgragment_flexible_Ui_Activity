package com.digicon_valley.fgragment_flexible_ui_activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator {

    FragmentA f1;
    FragmentB f2;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=getSupportFragmentManager();
        f1= (FragmentA) manager.findFragmentById(R.id.fragment_a);
        f1.setCommunicator(this);

    }

    @Override
    public void respond(int index) {

        f2= (FragmentB) manager.findFragmentById(R.id.fragment_b);
        if (f2 != null && f2.isVisible()){

            f2.changeData(index);
        }
        else{
            Intent intent=new Intent(this,Other_Main2Activity.class);
            intent.putExtra("index",index);
            startActivity(intent);
        }


    }
}
