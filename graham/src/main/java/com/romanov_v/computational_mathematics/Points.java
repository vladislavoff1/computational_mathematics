package com.romanov_v.computational_mathematics;

/**
 * Created by vlad on 16/03/16.
 */
public class Points {

    /**
     * Three points are a counter-clockwise turn if ccw > 0, clockwise if
     * ccw < 0, and collinear if ccw = 0 because ccw is a determinant that
     * gives twice the signed  area of the triangle formed by p1, p2 and p3.
     */
    public static int ccw(Point p1, Point p2, Point p3) {
        return (p2.getX() - p1.getX()) * (p3.getY() - p1.getY()) - (p2.getY() - p1.getY()) * (p3.getX() - p1.getX());
    }

    public static Point fromString(String s) {
        String[] arr = s.split(" ");

        if (arr.length != 2) {
            throw new Error("Point parse error: '" + s + "'.");
        }

        int x;
        int y;

        try {
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
        } catch (NumberFormatException e) {
            throw new Error("Point parse error: '" + s + "'.");
        }

        return new Point(x, y);
    }

}
