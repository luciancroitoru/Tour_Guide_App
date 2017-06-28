package com.example.android.tour_guide_app;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class TopAttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create an array of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Palace of Parliament", "Izvor Street, 2-4", R.drawable.ta_palace_of_parliament));
        locations.add(new Location("Cismigiu Gardens", "Intersection of Piata Revolutiei and B-dul Kogalniceanu", R.drawable.ta_cismigiu_gardens));
        locations.add(new Location("Grigore Antipa Museum", "Sos. Kiseleff nr. 1", R.drawable.ta_grigore_antipa));
        locations.add(new Location("Herastrau Park", "Bulevardul Aviatorilor", R.drawable.ta_herastrau_park));
        locations.add(new Location("Old Town", "City Center", R.drawable.ta_old_town));
        locations.add(new Location("Revolution Square", "Calea Victoriei Boulevard", R.drawable.ta_revolution_square));
        locations.add(new Location("Spring Palace", "Primaverii Blvd., No.50", R.drawable.ta_spring_pallace));
        locations.add(new Location("Stavropoleos Church", "Str. Stavropoleos nr.4", R.drawable.ta_stavropoleos_church));
        locations.add(new Location("Victoriei Street", "Victoriei Street", R.drawable.ta_victoriei_street));
        locations.add(new Location("Village Museum", "Kiseleff Road 28-30", R.drawable.ta_village_museum));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        LocationAdapter adapter =
                new LocationAdapter(this, locations, R.color.category_top_attractions);

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