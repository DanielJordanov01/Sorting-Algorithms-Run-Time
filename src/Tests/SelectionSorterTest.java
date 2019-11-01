package Tests;

import Algorithms.SelectionSorter;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSorterTest {

    @Test
    public void sortTest() {
        final int[] actual = {2, 7, 1, 4, 3, 32, 22};

        final int[] expected = {1, 2, 3, 4, 7, 22, 32};

        SelectionSorter.sort(actual);

        assertArrayEquals(actual, expected);
    }
}