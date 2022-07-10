package com.aweroc;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        } else if (s.length() == 1) {
            return s.length();
        }

        int length = 1;
        int startPostition = 0;
        while (startPostition < s.length()) {
            String subString = s.substring(startPostition);
            int subLength = findSubstringLength(subString);
            if (subLength > length) {
                length = subLength;
            }
            startPostition += 1;
        }
        return length;
    }

    private int findSubstringLength(String s) {
        int length = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            String charToCompare = s.substring(i + 1, i + 2);
            String subString = s.substring(0, i + 1);
            if (subString.contains(charToCompare)) {
                length = subString.length();
                break;
            } else {
                length = subString.length() + 1;
            }
        }
        return length;
    }

}
