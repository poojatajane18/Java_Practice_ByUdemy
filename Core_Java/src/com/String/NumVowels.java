package com.String;

import java.util.Scanner;
class CompleteString{
    String str;
    CompleteString(String str)
    {
        this.str=str;
    }
    public void getvowels()
    {
        char ch[]=str.toCharArray();
        char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
        int count=0,count1=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<vowel.length;j++)
            {
                if(ch[i]==vowel[j])
                    count++;
            }
            // this is done so that count1 will count character which are not an alphabets
            if(ch[i]==' ' || ch[i]<65 || (ch[i]>90 && ch[i]<97) || ch[i]>122)
                count1++;
        }
       
        System.out.printf("Total vowels  in the given string ("+str+") are\n"+count);
    }
}

public class NumVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
       String str=sc.nextLine();
       //CREATING AN OBJECT AND CALLING METHOD SIMULTANEOUSLY
      //  CompleteString ob=new CompleteString(str); 
        new CompleteString(str).getvowels();

	}

}
