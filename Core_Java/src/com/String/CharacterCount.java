package com.String;

import java.util.Scanner;
class Count
{
    String str;
    Count(String str)
    {
        this.str=str;
    }
    public void getCount()
    {
        char ch[]=str.toCharArray();
        int count[]=new int[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            count[i]=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j] && ch[i]!=' ')
                {
                    count[i]++;
                    ch[j]=' ';
                }
                
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
            {
                System.out.println("Repeatation of character "+ch[i]+" is "+count[i]);
            }
                
        }
    }
}

public class CharacterCount {
	
    // Main method to test the countLetterFrequency method
    public static void main(String[] args) {
    	System.out.println("enter any string");
        String str=new Scanner(System.in).nextLine();
        new Count(str).getCount();
    }

}
