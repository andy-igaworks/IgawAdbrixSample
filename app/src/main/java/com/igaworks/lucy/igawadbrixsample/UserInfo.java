package com.igaworks.lucy.igawadbrixsample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.igaworks.IgawCommon;


public class UserInfo extends ActionBarActivity{

    // Igaworks Common
    public String tag = "Igaw";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

         /*
          * Your Code
          */

    }

     /*
      * Your Code
      */

    // Your Code
    public void sendAge(View view){
        Log.d(tag, "sendAge ::: Button Click");

        EditText editText = (EditText)findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        int age = Integer.parseInt(message);


        // Igaworks Adbrix
        IgawCommon.setAge(age);
        Log.d(tag, "setAge ::: " + age);
    }

    // Your Code
    public  void sendGender(View view){
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.radioButton0:
                if(checked)

                    // Igaworks Adbrix
                    IgawCommon.setGender(IgawCommon.Gender.MALE);
                    Log.d(tag, "sendGender ::: Male" );

                    break;
            case R.id.radioButton1:
                if(checked)

                    // Igaworks Adbrix
                    IgawCommon.setGender(IgawCommon.Gender.FEMALE);
                    Log.d(tag, "sendGender ::: FEMALE");

                    break;
        }
    }


    protected void onResume(){
        super.onResume();
        IgawCommon.startSession(getApplicationContext());
        Log.d(tag, "startSession ::: SubActivity");
    }

    protected void onPause(){
        super.onPause();
        IgawCommon.endSession();
        Log.d(tag, "endSession ::: SubActivity");
    }

}
