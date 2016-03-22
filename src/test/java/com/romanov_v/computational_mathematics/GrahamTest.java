package com.romanov_v.computational_mathematics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vlad on 16/03/16.
 */
public class GrahamTest extends ConvexHullTest {

    @Override
    public ConvexHull getNewExemplar() {
        return new Graham();
    }

}