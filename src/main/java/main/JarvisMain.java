package main;

import com.romanov_v.computational_mathematics.Jarvis;

/**
 * Created by vlad on 22/03/16.
 */
public class JarvisMain {

    public static void main(String... args) {
        new ConvexHullFromFile(new Jarvis()).calc(args);
    }

}
