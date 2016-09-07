package edu.orangecoastcollege.cs273.dnovasky.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mTapButton;
    private TextView mTapCount;
    private Counter mCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCounter = new Counter();

        mTapCount = (TextView) findViewById(R.id.countTextView);
        mTapCount.setText(Integer.toString(mCounter.getTapCount()));

        mTapButton = (Button) findViewById(R.id.tapButton);
        mTapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter.addTapCount();
                mTapCount.setText(Integer.toString(mCounter.getTapCount()));
            }
        });
    }
}
