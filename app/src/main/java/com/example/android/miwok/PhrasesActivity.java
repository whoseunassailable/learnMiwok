package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Creating a word class
        Phrase phrase;

        // Creating an arraylist for phrases.
        ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        // Populating the Phrase class
        phrases.add(new Phrase("where are you going", "minto wuksus"));
        phrases.add(new Phrase("what is your name", "tinnә oyaase'nә"));
        phrases.add(new Phrase("my name is...", "oyaaset..."));
        phrases.add(new Phrase("how are you feeling?", "michәksәs?"));
        phrases.add(new Phrase("i'm feeling good", "kuchi achit"));
        phrases.add(new Phrase("Are you coming?", "әәnәs'aa?"));
        phrases.add(new Phrase("Yes, I'm coming", "hәә’ әәnәm"));
        phrases.add(new Phrase("I'm coming", "әәnәm"));
        phrases.add(new Phrase("Let's go", "yoowutis"));
        phrases.add(new Phrase("Come here", "әnni'nem"));

        // Creating a default arrayAdapter
        PhraseAdapter itemsAdapter = new PhraseAdapter(this, phrases);

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
         while (i < Phrases.size()) {
         TextView PhrasesView = new TextView(this);
         rootView.addView(PhrasesView);
         PhrasesView.setText(Phrases.get(i));
         i++;
         }
         */

        /**
         ** Was supposedly told to remove the for loop
         for (i = 0; i < 10; i++) {
         TextView PhraseView = new TextView(this);
         PhraseView.setText(Phrases.get(i));
         rootView.addView(PhraseView);
         }
         */

    }
}