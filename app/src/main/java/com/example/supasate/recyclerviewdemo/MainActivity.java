package com.example.supasate.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * 1. Add RecyclerView support library to the gradle build file
 * 2. Define a model class to use as the data source
 * 3. Add a RecyclerView to your activity to display the items
 * 4. Create a custom row layout XML file to visualize the item
 * 5. Create a RecyclerView.Adapter and ViewHolder to render the item
 * 6. Bind the adapter to the data source to populate the RecyclerView
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvContacts);
        rv.setAdapter(new ContactsAdapter());
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}
