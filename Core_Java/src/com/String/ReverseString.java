package com.String;

public class ReverseString {

	public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        // Swap characters from both ends of the array
        while (left < right) {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "hello world";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

}
