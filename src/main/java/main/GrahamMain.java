package main;

import com.romanov_v.computational_mathematics.Graham;

/**
 * Created by vlad on 22/03/16.
 */
public class GrahamMain {

    public static void main(String... args) {
        new ConvexHullFromFile(new Graham()).calc(args);
    }

}
