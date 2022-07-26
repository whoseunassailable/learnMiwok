package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Creating a word class
        Word word;

        // Creating an arraylist for words.
        ArrayList<Word> words = new ArrayList<Word>();

        // Populating the word class
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));

        // Creating a default arrayAdapter
        WordAdapter itemsAdapter = new WordAdapter(this, words);

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
        while (i < words.size()) {
            TextView wordsView = new TextView(this);
            rootView.addView(wordsView);
            wordsView.setText(words.get(i));
            i++;
        }
        */

        /**
         ** Was supposedly told to remove the for loop
        for (i = 0; i < 10; i++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }
        */


    }
}