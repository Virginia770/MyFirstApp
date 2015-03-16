package com.mycompany.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {
    private static final String TAG = DisplayMessageActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This method is where the activity receives the intent with the message, then renders the message. Also,the onCreate() method must define the activity layout with the setContentView() method. This is where the
        // activity performs the initial setup of the activity components.
        Log.d(TAG, "onCreate(savedInstanceState);");
        //Every Activity is invoked by an Intent, regardless of how the user navigated there. You can get the Intent that started your activity by calling getIntent() and retrieve the data contained within the intent.Get the intent and assign it to a local variable.
        Intent intent = getIntent();
        //Extract the message delivered by MyActivity with the getStringExtra() method.
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        //create a TextView object.
        TextView textView = new TextView(this);
        //Set the text size and message with setText().
        textView.setTextSize(40);
        textView.setText(message);
        //Then add the TextView as the root view of the activity’s layout by passing it to setContentView().
        setContentView(textView);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
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
