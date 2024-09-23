package com.String;

public class RemoveLowercase {
    public static String removeLowercase(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!Character.isLowerCase(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String result = removeLowercase(str);
        System.out.println("String after removing lowercase characters: " + result);
    }
}
