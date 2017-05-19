package com.sheepy.interfaces;

import com.sheepy.enums.DamageType;

/**
 * Created by Troels "Sheepyhead" Jessen on 17/05/18.
 * Email: kairyuka@live.dk
 */
public interface Attack {
    Dice getDamage();

    Dice getAttack();

    String getName();

    String getDescription();

    Crit getCrit();

    int getAmmo();

    int getRange();

    DamageType getDamageType();
}
