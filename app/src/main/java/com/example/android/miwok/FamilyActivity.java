package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


        // Creating a Family class
        Family relation;

        // Creating an arraylist for Familys.
        ArrayList<Family> relations = new ArrayList<Family>();

        // Populating the Family class
        relations.add(new Family("father", "әpә"));
        relations.add(new Family("mother", "әta"));
        relations.add(new Family("son", "angsi"));
        relations.add(new Family("daughter", "tune"));
        relations.add(new Family("older brother", "taachi"));
        relations.add(new Family("younger brother", "chalitti"));
        relations.add(new Family("older sister", "tete"));
        relations.add(new Family("younger sister" , "kollitti"));
        relations.add(new Family("grandmother", "ama"));
        relations.add(new Family("grandfather", "paapa"));

        // Creating a default arrayAdapter
        RelationAdapter itemsAdapter = new RelationAdapter(this, relations);

        // Creating a listView
        ListView listView = (ListView) findViewById(R.id.list);

        // Creating a GridView
        // GridView gridView = (GridView) findViewById(R.id.grid);

        // Populating the listView with values
        listView.setAdapter(itemsAdapter);

        // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // int i = 0;

        /**
         // Using while loop
         while (i < relations.size()) {
         TextView relationsView = new TextView(this);
         rootView.addView(relationsView);
         relationsView.setText(relations.get(i));
         i++;
         }
         */

        /**
         ** Was supposedly told to remove the for loop
         for (i = 0; i < 10; i++) {
         TextView wordView = new TextView(this);
         wordView.setText(relations.get(i));
         rootView.addView(wordView);
         }
         */

    }
}