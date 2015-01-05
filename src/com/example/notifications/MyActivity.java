package com.example.notifications;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.notifications.examples.MainActivity;

public class MyActivity extends ListActivity {

    public static final String[] options = { "BasicNotification","Examples" ,"AndroidL"};

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent;

        switch (position) {
            default:
            case 0:
                intent = new Intent(this, BasicNotification.class);
                break;
            case 1:
                intent = new Intent(this, MainActivity.class);
                break;
            case 2:
                intent = new Intent(this, AndroidL.class);
                break;

        }

        startActivity(intent);

    }

}
