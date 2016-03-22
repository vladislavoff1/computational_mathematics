package com.romanov_v.computational_mathematics;

import static org.junit.Assert.*;

/**
 * Created by vlad on 22/03/16.
 */
public class JarvisTest extends ConvexHullTest {

    @Override
    public ConvexHull getNewExemplar() {
        return new Jarvis();
    }

}