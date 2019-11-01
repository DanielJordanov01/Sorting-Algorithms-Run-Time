package Tests;

import Algorithms.MergeSorter;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSorterTest {

    @Test
    public void sortTest() {
        final int[] actual = {2, 7, 1, 4, 3, 32, 22};

        final int[] expected = {1, 2, 3, 4, 7, 22, 32};

        MergeSorter.sort(actual);

        assertArrayEquals(actual, expected);
    }
}