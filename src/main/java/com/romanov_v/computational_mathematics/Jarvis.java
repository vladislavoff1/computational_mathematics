package com.romanov_v.computational_mathematics;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by vlad on 16/03/16.
 */
public class Jarvis implements ConvexHull {
    public List<Point> calc(List<Point> points) {
        if (points.size() < 3) {
            return points.stream()
                    .sorted((a, b) -> a.getX() - b.getX())
                    .collect(Collectors.toList());
        }

        // Create new list
        points = points.stream().collect(Collectors.toList());

        Point min = points.stream()
                .min((a, b) -> a.getX() - b.getX())
                .get();

        points.remove(min);
        points.add(min);

        Stack<Point> result = new Stack<>();
        result.add(min);

        while (true) {
            int right = 0;
            for (int i = 1; i < points.size(); i++) {
                if (Points.ccw(result.peek(), points.get(right), points.get(i)) < 0) {
                    right = i;
                }
            }

            Point rightPoint = points.get(right);
            if (rightPoint.equals(min)) {
                break;
            }

            result.push(points.get(right));
            points.remove(right);
        }


        return result;
    }

}
