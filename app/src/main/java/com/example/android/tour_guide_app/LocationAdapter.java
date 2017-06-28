package com.example.android.tour_guide_app;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    //resource ID for the background color.
    private int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView attractionName = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the location name from the current Location object and
        // set this text on the name TextView
        attractionName.setText(currentLocation.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView attractionAddress = (TextView) listItemView.findViewById(R.id.attraction_address);
        // Get the address from the current Location object and
        // set this text on the number TextView
        attractionAddress.setText(currentLocation.getAttractionAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.attraction_image);

        if (currentLocation.hasImage()) {
            // Get the image resource ID from the current Location object and
            // set the image to iconView
            iconView.setImageResource(currentLocation.getImageResourceId());
            // make sure that the image is visible
            iconView.setVisibility(View.VISIBLE);
        }
        // otherwise hide the ImageView
        else iconView.setVisibility(View.GONE);


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
