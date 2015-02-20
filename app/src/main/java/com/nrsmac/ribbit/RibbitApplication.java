package com.nrsmac.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by nrsmac on 2/19/15.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "UljXpQxLpSq539H75KU4dbDi83PZYqDr4uQKY5ry", "eTnG5s96iDI94qqDBSRcK1QyNDojdC9NSGKcgWbZ");


    }
}
