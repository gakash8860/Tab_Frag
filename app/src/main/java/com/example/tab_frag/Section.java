package com.example.tab_frag;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Section extends FragmentPagerAdapter {
    static final int ar[]= new int[]{R.string.tab1,R.string.tab2};
    final Context context;

    public Section(@NonNull FragmentManager fm, int behavior, Context context) {
        super(fm,behavior);
        this.context = context;

    }

    @NonNull
    @Override
    public BlankFragment getItem(int position) {
        switch (position){
            case  0: return BlankFragment.newInstance("https://www.youtube.com/"," ");
            case  1: return BlankFragment.newInstance("https://www.facebook.com/"," ");
            default: return  null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(ar[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
