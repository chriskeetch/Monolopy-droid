package com.lbi.workshop;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class MonolopyActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Monolopy pub crawl");
        setContentView(tv);

    }
}