package com.sheepy.classes;

import com.sheepy.enums.Ability;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kairy on 17/05/19.
 */
public class BasicPlayerCharacterTest {
    private BasicPlayerCharacter character;
    @Before
    public void setUp() throws Exception {
        character = new BasicPlayerCharacter();
    }

    @Test
    public void shouldCalculateCorrectAbilityModifier()
    {
        assertEquals(0, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 11);

        assertEquals(0, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 12);

        assertEquals(1, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 13);

        assertEquals(1, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 14);

        assertEquals(2, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 9);

        assertEquals(-1, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 8);

        assertEquals(-1, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 7);

        assertEquals(-2, character.getAbilityModifier(Ability.STR));

        character.setBaseAbilityScore(Ability.STR, 6);

        assertEquals(-2, character.getAbilityModifier(Ability.STR));
    }

}