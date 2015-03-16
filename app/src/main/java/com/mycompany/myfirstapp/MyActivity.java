package com.mycompany.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
//Log 1-3
import android.util.Log;



public class MyActivity extends ActionBarActivity {
    //Log 2-3
    private static final String TAG = MyActivity.class.getSimpleName();


    public static final String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {

        //create an Intent to start an activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        //Assign the text to a local message variable.
        String message = editText.getText().toString();
        //use the putExtra() method to add its text value to the intent.
        // The putExtra() method takes the key name in the first parameter
        // and the value in the second parameter.
        intent.putExtra(EXTRA_MESSAGE, message);
        //The system receives this call and starts an instance of the
        // Activity specified by the Intent.
        //Log 3-3
        Log.d(TAG, "sendMessage()  intent.putExtra(EXTRA_MESSAGE, message);");
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
