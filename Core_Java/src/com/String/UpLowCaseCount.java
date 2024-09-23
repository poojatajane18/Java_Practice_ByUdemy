package com.String;

public class UpLowCaseCount {
	public static void countCase(String str) {
        int lowercase = 0, uppercase = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercase++;
            } else if (Character.isUpperCase(ch)) {
                uppercase++;
            }
        }
        System.out.println("Lowercase count: " + lowercase);
        System.out.println("Uppercase count: " + uppercase);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        countCase(str);
    }
}
