package com.geekbrains;

import geekbrains.Test_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MyTest_2 {
    private Test_2 test_2;

    @BeforeEach
    public void init() {
        test_2 = new Test_2();
    }


    @ParameterizedTest
    @MethodSource("arrayOperation")
    public void test1(boolean ok, int[] aray ) {
        Assertions.assertArrayEquals(new boolean[]{ok},test_2.test2(aray));
    }

    
    // для передачи разных параметров ссылочного тима как массив
    public static Stream<Arguments> arrayOperation() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments( false, new int[]{1, 1}));
        out.add(Arguments.arguments(true, new int[]{1, 1, 1, 4, 4, 4, 4}));
        out.add(Arguments.arguments(false,new int[]{4, 4, 4,}));
        out.add(Arguments.arguments(false, new int[]{4, 4, 4, 3}));
        return out.stream();
    }
}
