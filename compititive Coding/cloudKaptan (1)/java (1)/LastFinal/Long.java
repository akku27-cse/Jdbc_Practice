 // A Java solution for longest palindrome

import java.util.*;

class Long {

    // Function to print a subString str[low..high]
    static void printSubStr(String str, int low, int high)
    {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
    }

    // This function prints the
    // longest palindrome subString
    // It also returns the length
    // of the longest palindrome
    static int longestPalSubstr(String str)
    {
        // Get length of input String
        int n = str.length();

        // All subStrings of length 1
        // are palindromes
        int maxLength = 1, start = 0;

        // Nested loop to mark start and end index
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k)
                        != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        System.out.print(
            "Longest palindrome substring is: ");
        printSubStr(str, start, start + maxLength - 1);

        // Return length of LPS
        return maxLength;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "forgeeksskeegfor";
        System.out.print("\nLength is: "
                         + longestPalSubstr(str));
    }
}

//