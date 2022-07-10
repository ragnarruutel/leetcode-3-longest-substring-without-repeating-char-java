package com.aweroc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void should_return_zero_when_input_is_null_or_empty() {
        assertEquals(0, solution.lengthOfLongestSubstring(null));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void should_return_one_for_single_character_input() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void should_return_input_length_for_all_unique_character_input() {
        assertEquals(2, solution.lengthOfLongestSubstring("ab"));
        assertEquals(3, solution.lengthOfLongestSubstring("abc"));
        assertEquals(4, solution.lengthOfLongestSubstring("abcd"));
    }

    @Test
    void should_return_one_for_all_same_character_input() {
        assertEquals(1, solution.lengthOfLongestSubstring("aa"));
        assertEquals(1, solution.lengthOfLongestSubstring("aaa"));
        assertEquals(1, solution.lengthOfLongestSubstring("aaaa"));
    }

    @Test
    void should_return_two_for_aab() {
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
    }

    @Test
    void should_return_three_for_aabc() {
        assertEquals(3, solution.lengthOfLongestSubstring("aabc"));
    }

    @Test
    void should_return_four_for_aaabcd() {
        assertEquals(4, solution.lengthOfLongestSubstring("aaabcd"));
    }

    @Test
    void should_return_longest_substring_length() {
        assertEquals(4, solution.lengthOfLongestSubstring("accccabcd"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

}
