package Solutions;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.equals(" ") || s.length() == 1) {
            return true;
        }

        int start = 0;
        int end = s.length()-1;
        Boolean isResult = true;
        while (start <= end) {
            char curStartSym = s.charAt(start);
            char curEndSym = s.charAt(end);
            if (!Character.isLetterOrDigit(curStartSym)) {
                start++;
            } else if (!Character.isLetterOrDigit(curEndSym)) {
                end--;
            } else {
                if (Character.toLowerCase(curStartSym) == Character.toLowerCase(curEndSym)) {
                    isResult = true;
                    start++;
                    end--;
                    continue;
                }
                isResult = false;
                break;
            }
        }

        return isResult;
    }
}
