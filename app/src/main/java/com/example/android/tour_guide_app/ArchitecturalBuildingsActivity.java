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

        // Create an array of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("BNR Palace", "Str. Lipscani 25", R.drawable.ab_bnr_palace));
        locations.add(new Location("CEC Palace", "Calea Victoriei 13", R.drawable.ab_cec_palace));
        locations.add(new Location("Central University Library", "Strada Boteanu 1", R.drawable.ab_central_university_library));
        locations.add(new Location("Cercul Militar", "1, Constantin Mille St", R.drawable.ab_cercul_militar));
        locations.add(new Location("Coltea Hospital", "Blvd I.C.Bratianu nr. 1", R.drawable.ab_coltea_hospital));
        locations.add(new Location("Coral Temple", "Str. Sf. Vineri, Nr. 9", R.drawable.ab_coral_temple));
        locations.add(new Location("Palace of Parliament", "Izvor Street, 2-4", R.drawable.ab_palace_of_parliament));
        locations.add(new Location("Romanian Atheneum", "Str. Franklin 1", R.drawable.ab_romanian_atheneum));
        locations.add(new Location("Royal Palace", "Calea Victoriei 49-53", R.drawable.ab_royal_palace));
        locations.add(new Location("Stavropoleos Church", "Str. Stavropoleos nr.4", R.drawable.ab_stavropoleos_church));

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