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

public class ColorAdapter extends ArrayAdapter<Color> {

    public ColorAdapter(Activity context, ArrayList<Color> colors) {
        super(context, 0, colors);
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
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Color currentColor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwol_text
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        assert currentColor != null;

        // Get the miwok Color from the current Color object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentColor.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text);
        defaultTextView.setText(currentColor.getDefaultTranslation());
        return listItemView;

    }
}
