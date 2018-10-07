package com.digicon_valley.fgragment_flexible_ui_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Other_Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other__main2);

        Intent intent= getIntent();
        int index=intent.getIntExtra("index",0);

       FragmentB f2 = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment_b);
       if(f2!=null)
       f2.changeData(index);

    }
}
