package com.sheepy.interfaces;


/**
 * Created by Troels "Sheepyhead" Jessen on 17/05/18.
 * Email: kairyuka@live.dk
 */
public interface Item {

    String getName();

    String getDescription();

    float getWeight();

    Currency getValue();

    Bonus getBonus();
}