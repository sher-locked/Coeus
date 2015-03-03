package com.sherlocked.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MESSAGE", "onCreate was called");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MESSAGE", "onStart was called");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MESSAGE", "onPause was called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MESSAGE", "onResume was called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MESSAGE", "onStop was called");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MESSAGE", "onRestart was called");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MESSAGE", "onDestroy was called");
    }
}
