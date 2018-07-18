package com.example.android.myapplications;

public class Word {
    /**
     * The name of the place
     */
    private String mPlaceName;

    /**
     * The description of the place
     */
    private  String mPlaceDescription;

    /**
     * Image Resource ID for the place
     */
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param placeName is the name of the place
     *@param placeDescription is the description of the place
     *@param imageResourceId is the drawable resource ID for the iamge
     */
    public Word(String placeName, String placeDescription, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;

    }
    /**
     * Get the name of thr place.
     */
    public String getPlaceName() {
        return mPlaceName;
    }
    /**
     * Get the description of the place.
     */
    public String getPlaceDescription() {
        return mPlaceDescription;
    }
    /**
     * Get the image resource ID of the place.
     */
    public  int getImageResourceId() {
        return mImageResourceId;
    }
}
