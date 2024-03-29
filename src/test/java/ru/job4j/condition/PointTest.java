package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenMinus2Minus1to13then5() {
        double expected = 5;
        Point a = new Point(-2, -1);
        Point b = new Point(1, 3);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when32to21then1dot41() {
        double expected = 1.41;
        Point a = new Point(3, 2);
        Point b = new Point(2, 1);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenMinus62minus2toMinus62then4() {
        double expected = 4;
        Point a = new Point(-6, -2);
        Point b = new Point(-6, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when111to333then3dot46() {
        double expected = 3.46;
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 3, 3);
        double dist3d = a.distance3d(b);
        Assert.assertEquals(expected, dist3d, 0.01);
    }

    @Test
    public void when123to321then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 2, 1);
        double dist3d = a.distance3d(b);
        Assert.assertEquals(expected, dist3d, 0.01);
    }
}
