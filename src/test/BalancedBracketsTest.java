package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // true [], [launchCode], launch[Code], []launchCode, "", [] [],

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void insideTheBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void doubleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] launchCode"));
    }

    @Test
    public void doubleBracketSets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }


    // false ][, [, ], , [LaunchCode, Launch]Code[, ]LaunchCode[,

    @Test
    public void invertedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void missingOneRight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void missingOneAgainLeft(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void invertedWithStringOutside(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchode["));
    }

    @Test
    public void invertedWithStringInside(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }


}
