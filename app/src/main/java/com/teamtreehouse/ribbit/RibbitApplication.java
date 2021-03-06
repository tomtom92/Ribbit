package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * 			  This class supports the MainActivity.java class by initializing
 * 			  the app's parse relation.
 *
 * 			  This project was created while following the teamtreehouse.com
 * 			  Build a Self-Destructing Message Android App project
 *
 * @version   Completed Feb 18, 2014
 * @author    Thomas Hervey <thomasahervey@gmail.com>
 */
public class RibbitApplication extends Application {

    /**
     * Initialize parse with encryption
     *
     * @param
     * @return none
     */
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "dbrOyEHgX2GR3EPTIblrNNAd4ITXarc82shcXdlu", "6iyrGf1I8pXKRGlxMuL4NQQ4doZLrR5btJ2ZlvII");
	}
}
