package edu.hw01.task5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class IsSpecialPalindromeTest {
    @Test
    @DisplayName("Valid special palindrome")
    void validSpecialPalindrome() {
        // Arrange
        int validSpecialPalindrome = 11211230;

        // Act
        boolean result = SpecialPalindromeValidator.isSpecialPalindrome(validSpecialPalindrome);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Valid palindrome")
    void validPalindrome() {
        // Arrange
        int validPalindrome = 121;

        // Act
        boolean result = SpecialPalindromeValidator.isSpecialPalindrome(validPalindrome);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Non-special palindrome")
    void nonSpecialPalindrome() {
        // Arrange
        int nonSpecialPalindrome = 45;

        // Act
        boolean result = SpecialPalindromeValidator.isSpecialPalindrome(nonSpecialPalindrome);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("Number with odd digits")
    void numberWithOddDigits() {
        // Arrange
        int numberWithOddDigits = 14725;

        // Act
        boolean result = SpecialPalindromeValidator.isSpecialPalindrome(numberWithOddDigits);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Number with only one digit")
    void numberWithOneDigit() {
        // Arrange
        int numberWithOneDigit = 5;

        // Act
        boolean result = SpecialPalindromeValidator.isSpecialPalindrome(numberWithOneDigit);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Negative number is a non-palindrome")
    void negativeNumber() {
        // Arrange
        int numberWithOneDigit = -1;

        // Act
        boolean result = SpecialPalindromeValidator.isSpecialPalindrome(numberWithOneDigit);

        // Assert
        assertThat(result).isFalse();
    }
}
