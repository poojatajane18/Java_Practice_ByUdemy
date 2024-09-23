package com.String;


import java.util.Scanner;
class Remove
{
    String str;
    Remove(String str)
    {
       this.str=str;
    }
    public void getSingleletter()
    {
        char ch[]=str.toCharArray();
        int m=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j] && ch[i]!='0' && ch[i]!=' ')
                    
                {
                    ch[j]=' ' ;
                    m++;
                }
            }
        }
      // String str1=new String(ch);
       // System.out.println(str1);
       
        int k=0,n=ch.length-m;
        char[] ch1=new char[n];
       
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ')
            {
                ch1[k]=ch[i];
                k++;
            }
        }
       String str1=new String(ch1);
         System.out.println("String after removing duplicate element is "+str1);
    }
}

public class DuplicateRemove {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any string ");
        String str=sc.nextLine();
        new Remove(str).getSingleletter();
    }
}
