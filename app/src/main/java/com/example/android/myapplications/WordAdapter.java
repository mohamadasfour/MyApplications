package com.example.android.myapplications;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


   /**
        *
        } {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
        * based on a data source, which is a list of {@link Word} objects.
        */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);
        TextView placeName = listItemView.findViewById( R.id.name );
        placeName.setText(currentWord.getPlaceName());

        TextView placeDescription = listItemView.findViewById( R.id.place );
        placeDescription.setText( currentWord.getPlaceDescription() );

        ImageView imageView = listItemView.findViewById( R.id.image );
        imageView.setImageResource( currentWord.getImageResourceId() );

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
