package Tests;

import Algorithms.BubbleSorter;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSorterTest {

    @Test
    public void sortTest() {
        final int[] actual = {2, 7, 1, 4, 3, 32, 22};

        final int[] expected = {1, 2, 3, 4, 7, 22, 32};

        BubbleSorter.sort(actual);

        assertArrayEquals(actual, expected);
    }
}