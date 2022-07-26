package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        // Creating a Color class
        Color color;

        // Creating an arraylist for words.
        ArrayList<Color> colors = new ArrayList<Color>();
        /**
         *
         */
        // Populating the Color class
        colors.add(new Color("red", "weṭeṭṭi"));
        colors.add(new Color("green", "chokokki"));
        colors.add(new Color("brown", "ṭakaakki"));
        colors.add(new Color("gray", "ṭopoppi"));
        colors.add(new Color("black", "kululli"));
        colors.add(new Color("white", "kelelli"));
        colors.add(new Color("dusty yellow", "ṭopiisә"));
        colors.add(new Color("mustard yellow", "chiwiiṭә"));

        // Creating a default arrayAdapter
        ColorAdapter itemsAdapter = new ColorAdapter(this, colors);

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
         while (i < colors.size()) {
         TextView colorsView = new TextView(this);
         rootView.addView(colorsView);
         colorsView.setText(colors.get(i));
         i++;
         }
         */

        /**
         ** Was supposedly told to remove the for loop
         for (i = 0; i < 10; i++) {
         TextView ColorView = new TextView(this);
         ColorView.setText(colors.get(i));
         rootView.addView(ColorView);
         }
         */
    }
}