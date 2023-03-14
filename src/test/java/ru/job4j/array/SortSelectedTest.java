package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort5Elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = new int[] {5, 3, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort6Elements() {
        int[] data = new int[] {1, 9, 3, 6, 5, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5, 6, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}
