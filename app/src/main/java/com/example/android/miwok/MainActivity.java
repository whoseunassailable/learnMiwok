/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
//
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**
    public class NumbersClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Opening the list of numbers", Toast.LENGTH_SHORT).show();
        }
    }
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Declaring all the variables for the fetched xml id's
        TextView numbersList = (TextView) findViewById(R.id.numbers);
        TextView phrasesList = (TextView) findViewById(R.id.phrases);
        TextView familyList = (TextView) findViewById(R.id.family);
        TextView colorsList = (TextView) findViewById(R.id.colors);

        // Creating an onClickListener event for the numbersList
        numbersList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening the list of numbers", Toast.LENGTH_SHORT).show();
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Creating an onClickListener event for the phrasesList
        phrasesList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening the list of phrases", Toast.LENGTH_SHORT).show();
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        // Creating an onClickListener event for the familyList
        familyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening the list of families", Toast.LENGTH_SHORT).show();
                Intent familyIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(familyIntent);
            }
        });

        // Creating an onClickListener event for the colors
        colorsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening the list of colors", Toast.LENGTH_SHORT).show();
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        /**
        // Storing the fetched id in a variable
        TextView numbersList = (TextView) findViewById(R.id.numbers);

        // Creating the object for clickListener
        NumbersClickListener clickListener = new NumbersClickListener();

        // Calling the clickListener on the TextView
        numbersList.setOnClickListener((clickListener));
        */



    }

    /**


     public void openNumbersList(View view) {
        // Defining intent for the Numbers Activity page
        Intent intent = new Intent(this, NumbersActivity.class);

        // Starting the new activity
        startActivity(intent);
    }

    public void openPhrasesList(View view) {
        // Defining intent for the Numbers Activity page
        Intent intent = new Intent(this, PhrasesActivity.class);

        // Starting the new activity
        startActivity(intent);
    }

    public void openFamilyList(View view) {
        // Defining intent for the Numbers Activity page
        Intent intent = new Intent(this, FamilyActivity.class);

        // Starting the new activity
        startActivity(intent);
    }

    public void openColorsList(View view) {
        // Defining intent for the Numbers Activity page
        Intent intent = new Intent(this, ColorsActivity.class);

        // Starting the new activity
        startActivity(intent);
    }
    */



}
