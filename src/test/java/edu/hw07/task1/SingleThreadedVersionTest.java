package edu.hw07.task1;

import edu.hw07.task1.single.Counter;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SingleThreadedVersionTest {
    @Test
    void increment() {
        // Arrange
        var count = new Counter(0);
        int expected = 1;

        // Act
        count.increment();

        // Assert
        assertThat(count.getValue()).isEqualTo(expected);
    }
}
