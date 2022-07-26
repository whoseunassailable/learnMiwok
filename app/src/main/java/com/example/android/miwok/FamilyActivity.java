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
        relations.add(new Family("one", "lutti"));
        relations.add(new Family("two", "otiiko"));
        relations.add(new Family("three", "tolookosu"));
        relations.add(new Family("four", "oyyisa"));
        relations.add(new Family("five", "massokka"));
        relations.add(new Family("six", "temmokka"));
        relations.add(new Family("seven", "kenekaku"));
        relations.add(new Family("eight", "kawinta"));
        relations.add(new Family("nine", "wo’e"));
        relations.add(new Family("ten", "na’aacha"));

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