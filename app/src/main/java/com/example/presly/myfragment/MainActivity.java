package com.example.presly.myfragment;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /**
         * check device orientation and act accordingly
         */
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            /**
             * Landscape mode on device
             */
            L_Fragment l_fragment = new L_Fragment();
            fragmentTransaction.replace(android.R.id.content, l_fragment);

        }
        else {
            /**
             * Portrait mode on device
             */
            P_Fragment p_fragment = new P_Fragment();
            fragmentTransaction.replace(android.R.id.content, p_fragment);
        }
        fragmentTransaction.commit();
    }
}
