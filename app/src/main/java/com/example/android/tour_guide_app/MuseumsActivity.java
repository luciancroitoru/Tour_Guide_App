package com.example.android.tour_guide_app;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create an array of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("George Enescu Museum", "Calea Victorei 141", R.drawable.m_george_enescu_museum));
        locations.add(new Location("Grigore Antipa Museum", "Sos. Kiseleff nr. 1", R.drawable.m_grigore_antipa));
        locations.add(new Location("National Military Museum", "Strada Mircea Vulcanescu 125-127", R.drawable.m_national_military_museum));
        locations.add(new Location("Peasant Museum", "Soseaua Kiseleff 3", R.drawable.m_peasant_museum));
        locations.add(new Location("Romanian Kitsch Museum", "Covaci 6", R.drawable.m_romanian_kitsch_museum));
        locations.add(new Location("Spring Palace", "Primaverii Blvd., No.50", R.drawable.m_spring_pallace));
        locations.add(new Location("The Art Collections Museum", "111, Calea Victoriei", R.drawable.m_the_art_collections_museum));
        locations.add(new Location("National History Museum", "Calea Victoriei 12", R.drawable.m_the_national_history_museum));
        locations.add(new Location("The National Museum of Art", "Calea Victoriei no. 49-53", R.drawable.m_the_national_museum_of_art));
        locations.add(new Location("Village Museum", "Kiseleff Road 28-30", R.drawable.m_village_museum));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        LocationAdapter adapter =
                new LocationAdapter(this, locations, R.color.category_museums);

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