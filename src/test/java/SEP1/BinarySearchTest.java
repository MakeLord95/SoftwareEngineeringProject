package SEP1;

import SEP1.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinarySearchTest {

    @Test
    void searchFindsElementInArray() {
        int[] array = {1, 2, 3, 4, 5};
        int x = 3;
        int expected = 2;
        assertEquals(expected, BinarySearch.search(array, x));
    }

    @Test
    void searchReturnsMinusOneWhenElementNotInArray() {
        int[] array = {1, 2, 3, 4, 5};
        int x = 6;
        int expected = -1;
        assertEquals(expected, BinarySearch.search(array, x));
    }

    @Test
    void searchHandlesEmptyArray() {
        int[] array = {};
        int x = 1;
        int expected = -1;
        assertEquals(expected, BinarySearch.search(array, x));
    }

    @Test
    void checkedSearchFindsElementInArray() {
        int[] array = {1, 2, 3, 4, 5};
        int x = 3;
        int expected = 2;
        assertEquals(expected, BinarySearch.checkedSearch(array, x));
    }

    @Test
    void checkedSearchThrowsExceptionWhenElementNotInArray() {
        int[] array = {1, 2, 3, 4, 5};
        int x = 6;
        assertThrows(IllegalArgumentException.class, () -> BinarySearch.checkedSearch(array, x));
    }

    @Test
    void checkedSearchThrowsExceptionWhenArrayIsEmpty() {
        int[] array = {};
        int x = 1;
        assertThrows(IllegalArgumentException.class, () -> BinarySearch.checkedSearch(array, x));
    }
}
