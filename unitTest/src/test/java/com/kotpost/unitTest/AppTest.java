package com.kotpost.unitTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	String[] msg = App.fetchFriendsList();
    	// im not sure about these, Cant get the test to run, might not have eclipse set up right
    	Assertions.assertTrue(friendsList.contains("Jake Smith"));
        Assertions.assertTrue(friendsList.contains("Bob Jones"));
        Assertions.assertTrue(friendsList.contains("David Clinton"));
        Assertions.assertTrue(friendsList.contains("Anna Pepper"));
    }
    public void shouldAnswerWithFalse()
    {
    	String[] msg = App.fetchFriendsList();
        for (String i: msg) {
    		if(i == null) {
    			assertTrue(false);
    		}
    		else if (i.length()<1) {
    			assertTrue(false);
    		}
    		else {
    			assertTrue(true);
    		}
    		
    	}

    }
}
