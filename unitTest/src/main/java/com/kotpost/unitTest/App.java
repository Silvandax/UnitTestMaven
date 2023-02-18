package com.kotpost.unitTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] msg = fetchFriendsList();
        System.out.println( "Output friendslist:" );
        for (String i: msg) {
            System.out.println(i);
        }
    }
    public static final String[] fetchFriendsList(){
    	String[] friendslist = new String[] {"Jake Smith", "Bob Jones", "David Clinton", "Anna Pepper"};
    	return friendslist;
    }

}
