package com.example.logactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    private Button myButtton;
    static final String LIFT_TAG="LogActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.LIFT_TAG, "FirstAcvity ---> onCreate");
        Button myButton = (Button)findViewById(R.id.button);
        myButton.setText("MainActivity");
        myButton.setOnClickListener(new ButtonOnClickListener());

    }

    class ButtonOnClickListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Activity2.class);
            MainActivity.this.startActivity(intent);
        }
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstAcvity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstAcvity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstAcvity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstAcvity --->onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstAcvity --->onStop");
        super.onStop();
    }
}
