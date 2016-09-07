package edu.orangecoastcollege.cs273.dnovasky.tapcounter;

/**
 * Created by dnova_000 on 9/5/2016.
 * This class keeps track of he number of taps
 * @author Donald Novasky
 */
public class Counter {

    private int mTapCount;

    public int getTapCount() {
        return mTapCount;
    }

    public void addTapCount() {
        mTapCount++;
    }
}
