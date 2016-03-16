package com.romanov_v.computational_mathematics;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vlad on 16/03/16.
 */
public class GrahamTest {

    @Test
    public void Empty() {
        List<Point> result = Graham.scan(new LinkedList<>());
        assertTrue(result.isEmpty());
    }

    @Test
    public void OnePoint() {
        List<Point> points = new LinkedList<>();
        points.add(new Point(0, 0));

        List<Point> result = Graham.scan(points);
        assertArrayEquals(points.toArray(), result.toArray());
    }

    @Test
    public void TwoPoint() {
        List<Point> points = new LinkedList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));

        List<Point> result = Graham.scan(points);
        assertArrayEquals(points.toArray(), result.toArray());
    }

    @Test
    public void TreePoint() {
        List<Point> points = new LinkedList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(1, 1));

        List<Point> result = Graham.scan(points);
        assertArrayEquals(points.toArray(), result.toArray());
    }

    @Test
    public void TreePointСollinear() {
        List<Point> points = new LinkedList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(2, 0));

        List<Point> result = Graham.scan(points);
        assertArrayEquals(points.toArray(), result.toArray());
    }


    @Test
    public void Test1() {
        List<Point> points = new LinkedList<>();
        points.add(new Point(2, 6));
        points.add(new Point(5, 5));
        points.add(new Point(0, 4));
        points.add(new Point(1, 1));
        points.add(new Point(4, 1));
        points.add(new Point(2, 0));

        points.add(new Point(1, 4));
        points.add(new Point(3, 2));
        points.add(new Point(4, 4));
        points.add(new Point(3, 5));


        List<Point> expect = new LinkedList<>();
        expect.add(new Point(0, 4));
        expect.add(new Point(1, 1));
        expect.add(new Point(2, 0));
        expect.add(new Point(4, 1));
        expect.add(new Point(5, 5));
        expect.add(new Point(2, 6));

        List<Point> actual = Graham.scan(points);
        assertArrayEquals(expect.toArray(), actual.toArray());
    }

}