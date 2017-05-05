package com.example.fred.myapplication;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by fredc on 4/23/2017.
 */

public class DataBook {
    //Fields (Member Variables) - Properties about the object
    private String[] mPerson ={"Rimple", "Antoine", "Monika", "Unnati","Ankit"};


    //Methods - Actions the object can take
    public String getfact(){

        //selects random person
        Random randomNumber1 = new Random();
        int randomNumber = randomNumber1.nextInt(mPerson.length);

        String randomperson = mPerson[randomNumber];

        return randomperson;

    }


}
