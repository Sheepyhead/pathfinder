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

    void setBaseAbilityScore(Ability type, int value);

    int getAbilityModifier(Ability type);

    int getMaxHP();

    void setHitDieHP(int value);

    int getSkillTotal(Skill type);

    void setSkillRanks(Skill type, int value);

    void addSkillRank(Skill type);

    DR getDR();

    void addDR(DR dr);

    int getAC();

    int getTouchAC();

    int getFFAC();

    int getFort();

    int getWill();

    int getRef();

    Set<Attack> getAttacks();

    void addAttack(Attack attack);

    void removeAttack(String attackName);

    int getBAB();

    int getCMB();

    int getCMD();

    int getFFCMD();

    int getSR();

    Set<Resistance> getResistances();

    void addResistance(Resistance resistance);

    List<Feat> getFeats();

    void addFeat(Feat feat);

    List<ClassAbility> getAbilities();

    List<Trait> getTraits();

    void addTrait(Trait trait);

    List<Item> getItems();

    void addItem(Item item);

    ItemSlots getItemSlots();

    Currency getCurrency();

    void addCurrency(Currency currency);

    void removeCurrency(Currency currency);

    CarryingCapacity getCarryingCapacity();

    int getXP();

    boolean addXP(int xp);

    void setXPTrack(XPTrack xpTrack);

}
