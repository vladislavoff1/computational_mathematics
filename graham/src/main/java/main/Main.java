package main;

import com.romanov_v.computational_mathematics.Graham;
import com.romanov_v.computational_mathematics.Point;
import com.romanov_v.computational_mathematics.Points;
import com.sun.org.apache.bcel.internal.util.ClassLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by vlad on 16/03/16.
 */
public class Main {

    public static void main(String... args) {
        List<Point> points;

        try (Stream<String> stream = readResource("input.txt")) {

            points = stream
                    .map(String::trim)
                    .filter((s) -> !s.isEmpty())
                    .map(Points::fromString)
                    .filter((p) -> p != null)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Can't read file 'input.txt'");
            return;
        }

        List<Point> result = Graham.scan(points);

        result.stream()
                .forEach(System.out::println);
    }

    private static Stream<String> readResource(String resourceName) throws IOException {
        String fileName = ClassLoader.getSystemResource(resourceName).getFile();
        return readFile(fileName);
    }

    private static Stream<String> readFile(String fileName) throws IOException {
        return Files.lines(Paths.get(fileName));
    }

}
