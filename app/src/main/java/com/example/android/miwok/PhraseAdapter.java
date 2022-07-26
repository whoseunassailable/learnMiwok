package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases) {
        super(context, 0, phrases);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /**
         * position - This represents the list of data.
         * convertView - The recycled view that needs to be populated
         *
         */


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Phrase currentPhrase = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwol_text
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        assert currentPhrase != null;

        // Get the miwok Phrase from the current Phrase object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentPhrase.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text);
        defaultTextView.setText(currentPhrase.getDefaultTranslation());
        return listItemView;

    }
}