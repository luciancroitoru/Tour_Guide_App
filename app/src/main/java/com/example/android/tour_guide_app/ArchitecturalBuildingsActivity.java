package com.example.android.tour_guide_app;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ArchitecturalBuildingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create an array of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.ab_attraction_one_name), getString(R.string.ab_attraction_one_address), R.drawable.ab_bnr_palace));
        locations.add(new Location(getString(R.string.ab_attraction_two_name), getString(R.string.ab_attraction_two_address), R.drawable.ab_cec_palace));
        locations.add(new Location(getString(R.string.ab_attraction_three_name), getString(R.string.ab_attraction_three_address), R.drawable.ab_central_university_library));
        locations.add(new Location(getString(R.string.ab_attraction_four_name), getString(R.string.ab_attraction_four_address), R.drawable.ab_cercul_militar));
        locations.add(new Location(getString(R.string.ab_attraction_five_name), getString(R.string.ab_attraction_five_address), R.drawable.ab_coltea_hospital));
        locations.add(new Location(getString(R.string.ab_attraction_six_name), getString(R.string.ab_attraction_six_address), R.drawable.ab_coral_temple));
        locations.add(new Location(getString(R.string.ab_attraction_seven_name), getString(R.string.ab_attraction_seven_address), R.drawable.ab_palace_of_parliament));
        locations.add(new Location(getString(R.string.ab_attraction_eight_name), getString(R.string.ab_attraction_eight_address), R.drawable.ab_romanian_atheneum));
        locations.add(new Location(getString(R.string.ab_attraction_nine_name), getString(R.string.ab_attraction_nine_address), R.drawable.ab_royal_palace));
        locations.add(new Location(getString(R.string.ab_attraction_ten_name), getString(R.string.ab_attraction_ten_address), R.drawable.ab_stavropoleos_church));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        LocationAdapter adapter =
                new LocationAdapter(this, locations, R.color.category_architectural_buildings);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}