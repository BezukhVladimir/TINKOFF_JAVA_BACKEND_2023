package edu.hw01.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinutesToSecondsTest {
    @Test
    @DisplayName("Correct conversion of a valid string")
    void validTimeConversion() {
        // Arrange
        String validTime = "02:30";

        // Act
        int result = TimeStampUtils.minutesToSeconds(validTime);

        // Assert
        assertThat(result).isEqualTo(150);
    }

    @Test
    @DisplayName("Invalid string format (more than 2 segments)")
    void invalidFormat() {
        // Arrange
        String invalidTime = "01:02:03";

        // Act
        int result = TimeStampUtils.minutesToSeconds(invalidTime);

        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Negative values for minutes (minutes < 0)")
    void negativeMinutes() {
        // Arrange
        String negativeMinutes = "-1:30";

        // Act
        int result = TimeStampUtils.minutesToSeconds(negativeMinutes);

        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Negative values for seconds (seconds < 0)")
    void negativeSeconds() {
        // Arrange
        String negativeSeconds = "02:-30";

        // Act
        int result = TimeStampUtils.minutesToSeconds(negativeSeconds);

        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Invalid values for seconds (seconds >= 60)")
    void invalidSeconds() {
        // Arrange
        String invalidSeconds = "02:60";

        // Act
        int result = TimeStampUtils.minutesToSeconds(invalidSeconds);

        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Empty string")
    void emptyString() {
        // Arrange
        String emptyString = "";

        // Act
        int result = TimeStampUtils.minutesToSeconds(emptyString);

        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Null value")
    void nullValue() {
        // Arrange
        String nullValue = null;

        // Act
        int result = TimeStampUtils.minutesToSeconds(nullValue);

        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("String with symbols")
    void stringWithSymbols() {
        // Arrange
        String stringWithLetters = "a!@:xy";

        // Act
        int result = TimeStampUtils.minutesToSeconds(stringWithLetters);

        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("Zero minutes and seconds")
    void zeroMinutesAndSeconds() {
        // Arrange
        String zeroTime1 = "0:0";
        String zeroTime2 = "00:00";

        // Act
        int result1 = TimeStampUtils.minutesToSeconds(zeroTime1);
        int result2 = TimeStampUtils.minutesToSeconds(zeroTime2);

        // Assert
        assertThat(result1).isEqualTo(0);
        assertThat(result2).isEqualTo(0);
    }

    @Test
    @DisplayName("Maximum values for seconds")
    void maximumSeconds() {
        // Arrange
        String maxValues = "999:59";

        // Act
        int result = TimeStampUtils.minutesToSeconds(maxValues);

        // Assert
        assertThat(result).isEqualTo(59_999);
    }

    @Test
    @DisplayName("Strings with spaces before or after the delimiter")
    void spacesAroundDelimiter() {
        // Arrange
        String withSpacesBefore = "01 : 30";
        String withSpacesAfter = "01: 30 ";
        String withSpacesBoth = " 01 : 30 ";

        // Act & Assert
        assertThat(TimeStampUtils.minutesToSeconds(withSpacesBefore)).isEqualTo(-1);
        assertThat(TimeStampUtils.minutesToSeconds(withSpacesAfter)).isEqualTo(-1);
        assertThat(TimeStampUtils.minutesToSeconds(withSpacesBoth)).isEqualTo(-1);
    }

    @Test
    @DisplayName("String without delimiter")
    void stringWithoutDelimiter() {
        // Arrange
        String noDelimiter = "0130";

        // Act
        int result = TimeStampUtils.minutesToSeconds(noDelimiter);

        // Assert
        assertThat(result).isEqualTo(-1);
    }
}
