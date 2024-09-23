package com.String;

class Word{
    public int count(char[] s)
    {
        int c=1;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]==' '&& i!=0 && s.length-1!=i )
                c++;
        }
        return c;
    }
}

public class NumOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word w=new Word();
        String s=" Yash dilip hikare";
        char[] ch=s.toCharArray();
       System.out.println( w.count(ch));

	}

}
