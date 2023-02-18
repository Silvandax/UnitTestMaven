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
    	if ("Jake Smith".equals(msg[0])) {assertTrue(true)}
    	if ("Bob Jones".equals(msg[1])) {assertTrue(true)}
    	if ("David Clinton".equals(msg[2])) {assertTrue(true)}
    	if ("Anna Pepper".equals(msg[3])) {assertTrue(true)}
    	else {assertTrue(false)}
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

