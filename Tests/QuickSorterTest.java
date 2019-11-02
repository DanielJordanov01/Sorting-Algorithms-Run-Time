package Tests;

import Algorithms.QuickSorter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSorterTest {

    @Test
    void sortTestWithPositiveValues() {
        final int[] actual = {2, 7, 1, 4, 3, 32, 22};

        final int[] expected = {1, 2, 3, 4, 7, 22, 32};

        QuickSorter.sort(actual);

        assertArrayEquals(actual, expected);
    }

    @Test
    public void sortTestWithNegativeValues() {
        final int[] actual = {-2, -7, -1, -4, -3, -32, -22};

        final int[] expected = {-32, -22, -7, -4, -3, -2, -1};

        QuickSorter.sort(actual);

        assertArrayEquals(actual, expected);
    }

    @Test
    public void sortTestWithSortedArray() {
        final int[] actual = {1, 2, 3, 4, 7, 22, 32};

        final int[] expected = {1, 2, 3, 4, 7, 22, 32};

        QuickSorter.sort(actual);

        assertArrayEquals(actual, expected);
    }

    @Test
    public void sortTestWithPositiveAndNegativeValues() {
        final int[] actual = {-2, 7, -1, 4, -3, 32, -22};

        final int[] expected = {-22, -3, -2, -1, 4, 7, 32};

        QuickSorter.sort(actual);

        assertArrayEquals(actual, expected);
    }
}