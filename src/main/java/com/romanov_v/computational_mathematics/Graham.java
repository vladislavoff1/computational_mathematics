package com.romanov_v.computational_mathematics;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by vlad on 16/03/16.
 */
public class Graham implements ConvexHull {

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

        points.sort((a, b) -> Points.ccw(a, min, b));

        Stack<Point> result = new Stack<>();
        result.add(min);
        result.add(points.get(0));

        points.remove(0);

        for (Point point : points) {
            while (Points.ccw(
                    result.get(result.size() - 2),
                    result.get(result.size() - 1),
                    point
            ) < 0) {
                result.pop();
            }
            result.push(point);
        }

        return result;
    }

}
