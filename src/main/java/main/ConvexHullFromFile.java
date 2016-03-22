package main;

import com.romanov_v.computational_mathematics.*;
import com.sun.org.apache.bcel.internal.util.ClassLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by vlad on 22/03/16.
 */
public class ConvexHullFromFile {

    private final static String RESOURCE_NAME = "input.txt";

    private ConvexHull convexHull;

    public ConvexHullFromFile(ConvexHull convexHull) {
        this.convexHull = convexHull;
    }

    public void calc(String... args) {
        List<Point> points;

        try (Stream<String> stream = readResource(RESOURCE_NAME)) {

            points = stream
                    .map(String::trim)
                    .filter((s) -> !s.isEmpty())
                    .map(Points::fromString)
                    .filter((p) -> p != null)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Can't read file '" + RESOURCE_NAME + "'");
            return;
        }

        List<Point> result = convexHull.calc(points);

        result.stream()
                .forEach(System.out::println);
    }

    private Stream<String> readResource(String resourceName) throws IOException {
        String fileName = ClassLoader.getSystemResource(resourceName).getFile();
        return readFile(fileName);
    }

    private Stream<String> readFile(String fileName) throws IOException {
        return Files.lines(Paths.get(fileName));
    }

}
