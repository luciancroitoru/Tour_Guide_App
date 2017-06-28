package com.example.android.tour_guide_app;

/**
 * {@link Location} represents a locaton that the user might want to visit.
 * It contains the location name and the address of that location.
 */
public class Location {

    private final static int NO_IMAGE_PROVIDED = -1;
    /**
     * name of the location
     */
    private String mAttractionName;
    /**
     * address of the location
     */
    private String mAttractionAddress;
    /**
     * image resource ID for the word
     */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     * Create a new Location object.
     *
     * @param attractionName    is the name of the location
     * @param attractionAddress is the address of the location
     * @param imageResourceID   is the drawable image ID for the image asset
     */
    public Location(String attractionName, String attractionAddress, int imageResourceID) {
        mAttractionAddress = attractionAddress;
        mAttractionName = attractionName;
        mImageResourceID = imageResourceID;
    }

    /**
     * Get the location name.
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the location address.
     */
    public String getAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * return the image resource ID of the location
     */
    public int getImageResourceId() {
        return mImageResourceID;
    }

    /**
     * returns whether or not there is an image for the location
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
