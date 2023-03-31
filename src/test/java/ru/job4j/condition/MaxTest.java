package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7And9And5Then9() {
        int first = 7;
        int second = 9;
        int three = 5;
        int result = Max.max(first, second, three);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3And7And5And1Then7() {
        int first = 3;
        int second = 7;
        int three = 5;
        int fourth = 1;
        int result = Max.max(first, second, three, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4And3And2And1Then4() {
        int first = 4;
        int second = 3;
        int three = 2;
        int fourth = 1;
        int result = Max.max(first, second, three, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

}
