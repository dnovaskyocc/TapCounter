package edu.orangecoastcollege.cs273.dnovasky.tapcounter;

/**
 * Created by dnova_000 on 9/5/2016.
 * This class represents a counter that keeps track of the number
 * of times the user taps the 'TAP' button
 * @author Donald Novasky
 */
public class Counter {


    private int mTapCount;

    /**
     * This accessor returns the current tap count
     * @return the current tap count
     */
    public int getTapCount() {
        return mTapCount;
    }

    /**
     *  This method increments the current tap
     */
    public void addTapCount() {
        mTapCount++;
    }
}
