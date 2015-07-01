package com.igaworks.lucy.igawadbrixsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;

import com.igaworks.IgawCommon;
import com.igaworks.adbrix.IgawAdbrix;
import com.igaworks.adbrix.interfaces.ADBrixInterface;


public class MainActivity extends ActionBarActivity {

    // Igaworks Common
    public String tag = "Igaw";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Igaworks Common
        IgawCommon.startApplication(MainActivity.this);
        Log.d(tag, "startApplication ::: MainActivity");

        /*
         * Your Code
         */
    }


     /*
      * Your Code
      */

    // Your Code
    public void getUserInfo(View view){
        Log.d(tag, "getUserInfo ::: Button Click");

        Intent intent = new Intent(this, UserInfo.class);
        startActivity(intent);
    }

    // Your Code
    public void getNewUserFunnel(View view){
        Log.d(tag, "getNewUserFunnel ::: Button Click");

        // Igaworks Adbrix
        IgawAdbrix.firstTimeExperience("Login");
        Log.d(tag, "firstTimeExperience ::: Login");

    }

    // Your Code
    public void getNewUserFunnelSub(View view){
        Log.d(tag, "getNewUserFunnelSub ::: Button Click");

        // Igaworks Adbrix
        IgawAdbrix.firstTimeExperience("Stage", "5");
        Log.d(tag, "firstTimeExperience ::: Stage, 5");

    }

    // Your Code
    public void getInAppPurchasing(View view){
        Log.d(tag, "getInAppPurchasing ::: Button Click");

        // Igaworks Adbrix
        IgawAdbrix.buy("Purchase_1000krw");
        Log.d(tag, "buy ::: Purchase_1000krw");

    }

    // Your Code
    public void getInAppPurchasingSub(View view){
        Log.d(tag, "getInAppPurchasingSub ::: Button Click");

        // Igaworks Adbrix
        IgawAdbrix.buy("Diamond", "100");
        Log.d(tag, "buy ::: Diamond, 100");

    }

    // Your Code
    public  void getInAppActivity(View view){
        Log.d(tag, "getInAppActivity ::: Button Click");

        // Igaworks Adbrix
        IgawAdbrix.retention("OpenStore");
        Log.d(tag, "retention ::: OpenStore");

    }

    // Your Code
    public void getInAppActivitySub(View view){
        Log.d(tag, "getInAppActivitySub ::: Button Click");

        // Igaworks Adbrix
        IgawAdbrix.retention("StageClear", "3");
        Log.d(tag, "retention ::: StageClear, 3");

    }

    // Your Code
    public void setCustomCohort(View view){
        Log.d(tag, "setCustomCohort ::: Button Click");

        // Igaworks Adbrix
        IgawAdbrix.setCustomCohort(ADBrixInterface.CohortVariable.COHORT_1, "Stage1_User");
        Log.d(tag, "setCustomCohort ::: Stage1_User");
    }


    @Override
    protected void onResume() {
        super.onResume();

        // Igaworks Common
        IgawCommon.startSession(MainActivity.this);
        Log.d(tag, "startSession ::: MainActivity" );

        /*
         * Your Code
         */
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Igaworks Common
        IgawCommon.endSession();
        Log.d(tag, "endSession ::: MainActivity");

        /*
         * Your Code
         */
    }

}
