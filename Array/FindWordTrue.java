package com.Array;

public class FindWordTrue {
	static boolean isWordPresent(String sentence, String word)
	{
	    // To break the sentence in words
	    String []s = sentence.split(" ");
	 
	    // To temporarily store each individual word 
	    for ( String temp :s)
	    {
	 
	        // Comparing the current word
	        // with the word to be searched
	        if (temp.compareTo(word) == 0)
	        {
	            return true;
	        }
	    }
	    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Geeks for Geeks";
	    String word = "Geeks";
	    boolean ans= isWordPresent(s, word);
	    System.out.println(ans);

	}

}
