package studios.class05.test;
import org.junit.Before;


import org.junit.Test;
import studios.class05.main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Empty brackets should return true
    @Test
    public void emptyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Two of the same bracket should return false
    @Test
    public void pairOfSameBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    //Brackets that could balance, but put in the wrong order, should return false
    @Test
    public void balancedButInWrongOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //Empty string is still considered balanced brackets
    @Test
    public void emptyStringIsBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //String with single bracket should be false
    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //String with correct brackets in wrong order should be false
    @Test
    public void textWithBracketsIncorrectOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    //Correct brackets before any text should be true
    @Test
    public void bracketsBeforeText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //Correct brackets after any text should be true
    @Test
    public void bracketsAfterText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    //Correct brackets with spaces should be true
    @Test
    public void bracketsAndSpaces() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("       []"));
    }

    //Correctly nested brackets should return true
    @Test
    public void correctlyNestedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hello [[sir [these [brackets]] [are]] [nested] correctly]"));
    }

    //Correct bracket count with incorrect nesting should fail
    @Test
    public void incorrectlyNestedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("hello [[sir these]]] [[brackets [are] [nested] correctly]"));
    }

    //Test with symbols
    @Test
    public void symbolsDontAffectOutcome() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("he(llo) [[s)i)r [th$ese [br&..//ackets]] [are]] [ne)))s?ted] correctly]"));
    }







}
