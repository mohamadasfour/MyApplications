package com.example.android.myapplications;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{
    /** Context of the app */
    private Context mContext;
    /**
     * Crate a new {@link CategoryAdapter} object.
     * @param  context is the context of the app
     *                 @param fm is the fragment manager that will keep each fragment's state in the adapter
     *                           across swipes.
     *
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super (fm);
        mContext = context;

    }
    @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new HotelsFragment();
        }else if (position == 1){
            return new HospitalsFragment();
        }else if (position == 2){
            return new RestaurantsFragment();
        }else{
            return new ThreadsFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
        @Override
                public  CharSequence getPageTitle (int position) {
            if (position == 0){
                return mContext.getString( R.string.category_hotels );
            }else if (position ==1 ){
                return mContext.getString(R.string.category_hospitals);
            }else if (position == 2){
                return mContext.getString( R.string.category_restaurants );
            }else{
                return mContext.getString( R.string.category_threads );
            }

        }
    }


