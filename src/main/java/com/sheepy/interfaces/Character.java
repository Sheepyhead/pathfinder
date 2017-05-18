package com.sheepy.interfaces;

import com.sheepy.enums.Ability;
import com.sheepy.enums.Skill;

import java.util.List;
import java.util.Set;

/**
 * Created by kairy on 17/05/18.
 */
public interface Character {

    int getAbilityScore(Ability type);

    int getAbilityModifier(Ability type);

    int getMaxHP();

    int getSkillTotal(Skill type);

    DR getDR();

    int getAC();

    int getTouchAC();

    int getFFAC();

    int getFort();

    int getWill();

    int getRef();

    Set<Attack> getAttacks();

    int getBAB();

    int getCMB();

    int getCMD();

    int getFFCMD();

    int getSR();

    Set<Resistance> getResistances();

    List<Feat> getFeats();

    List<ClassAbility> getAbilities();

    List<Trait> getTraits();

    List<Item> getItems();

    ItemSlots getItemSlots();

    Currency getCurrency();

    CarryingCapacity getCarryingCapacity();

    int getXP();

}
