package com.sheepy.classes;

import com.sheepy.enums.Ability;
import com.sheepy.enums.Skill;
import com.sheepy.interfaces.*;
import com.sheepy.interfaces.Character;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by kairy on 17/05/19.
 */
public class BasicPlayerCharacter implements PlayerCharacter, Character{
    Map<Ability,Integer> baseAbilityScores;

    public BasicPlayerCharacter()
    {
        // Set base ability scores
        baseAbilityScores = new HashMap<>();
        baseAbilityScores.put(Ability.STR, 10);
        baseAbilityScores.put(Ability.DEX, 10);
        baseAbilityScores.put(Ability.CON, 10);
        baseAbilityScores.put(Ability.INT, 10);
        baseAbilityScores.put(Ability.WIS, 10);
        baseAbilityScores.put(Ability.CHA, 10);

    }

    @Override
    public int getAbilityScore(Ability type) {
        return baseAbilityScores.get(type);
    }

    @Override
    public void setBaseAbilityScore(Ability type, int value) {
        baseAbilityScores.put(type, value);
    }

    @Override
    public int getAbilityModifier(Ability type) {
        return 0;
    }

    @Override
    public int getMaxHP() {
        return 0;
    }

    @Override
    public void setHitDieHP(int value) {

    }

    @Override
    public int getSkillTotal(Skill type) {
        return 0;
    }

    @Override
    public void setSkillRanks(Skill type, int value) {

    }

    @Override
    public void addSkillRank(Skill type) {

    }

    @Override
    public DR getDR() {
        return null;
    }

    @Override
    public void addDR(DR dr) {

    }

    @Override
    public int getAC() {
        return 0;
    }

    @Override
    public int getTouchAC() {
        return 0;
    }

    @Override
    public int getFFAC() {
        return 0;
    }

    @Override
    public int getFort() {
        return 0;
    }

    @Override
    public int getWill() {
        return 0;
    }

    @Override
    public int getRef() {
        return 0;
    }

    @Override
    public Set<Attack> getAttacks() {
        return null;
    }

    @Override
    public void addAttack(Attack attack) {

    }

    @Override
    public void removeAttack(String attackName) {

    }

    @Override
    public int getBAB() {
        return 0;
    }

    @Override
    public int getCMB() {
        return 0;
    }

    @Override
    public int getCMD() {
        return 0;
    }

    @Override
    public int getFFCMD() {
        return 0;
    }

    @Override
    public int getSR() {
        return 0;
    }

    @Override
    public Set<Resistance> getResistances() {
        return null;
    }

    @Override
    public void addResistance(Resistance resistance) {

    }

    @Override
    public List<Feat> getFeats() {
        return null;
    }

    @Override
    public void addFeat(Feat feat) {

    }

    @Override
    public List<ClassAbility> getAbilities() {
        return null;
    }

    @Override
    public List<Trait> getTraits() {
        return null;
    }

    @Override
    public void addTrait(Trait trait) {

    }

    @Override
    public List<Item> getItems() {
        return null;
    }

    @Override
    public void addItem(Item item) {

    }

    @Override
    public ItemSlots getItemSlots() {
        return null;
    }

    @Override
    public Currency getCurrency() {
        return null;
    }

    @Override
    public void addCurrency(Currency currency) {

    }

    @Override
    public void removeCurrency(Currency currency) {

    }

    @Override
    public CarryingCapacity getCarryingCapacity() {
        return null;
    }

    @Override
    public int getXP() {
        return 0;
    }

    @Override
    public boolean addXP(int xp) {
        return false;
    }

    @Override
    public void setXPTrack(XPTrack xpTrack) {

    }
}
