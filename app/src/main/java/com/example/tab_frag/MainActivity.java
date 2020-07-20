package com.example.tab_frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;
    TabLayout tbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=findViewById(R.id.vwp);
        tbl=findViewById(R.id.tab);
        Section sc = new Section(getSupportFragmentManager(),1,this);
        vp.setAdapter(sc);
        tbl.setupWithViewPager(vp);
    }
    public void On_Fragment_Listner(Uri uri){

    }
}