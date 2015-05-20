package com.artikulpi.firsthelloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private Button button;
    private EditText editText;

    public final static String EXTRA_MESSAGES = "com.artikulpi.firsthelloworld.MESSAGES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                editText = (EditText) findViewById(R.id.edit_message);
                String messages = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGES, messages);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()){
            case R.id.action_search:
                openSearch();
                return true;

            case R.id.action_settings:
                openSetting();
                return true;

            default:
            return super.onOptionsItemSelected(item);
        }

    }

    private void openSetting() {

    }

    private void openSearch() {

    }
}
