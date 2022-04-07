package com.geekbrains;

import geekbrains.Test_1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyTest {
    private Test_1 test_1;

    // что бы для каждого теста не создавать новый обект
    @BeforeEach
    public void init() {
        test_1 = new Test_1();
    }


    // запускаем параметризованный тест (тестируем с разным набором параметров
    @ParameterizedTest
    @MethodSource("arrayOperation")
    public void test1(int[] array, int[] result) {
        Assertions.assertArrayEquals(result, test_1.test(array));
    }

    // для передачи разных параметров ссылочного тима как массив
    public static Stream<Arguments> arrayOperation() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 2, 3, 4, 1, 6}, new int[]{1, 6}));
        out.add(Arguments.arguments(new int[]{1, 2, 3, 4, 1, 6, 5}, new int[]{1, 6, 5}));
        out.add(Arguments.arguments(new int[]{1, 2, 3, 4, 6}, new int[]{6}));
        return out.stream();
    }

    // тест на выброс исключения. когда в работе метода должно упасть исключение
    @Test
    public void testexeption() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            test_1.test(new int[]{1, 2, 3});
        });
    }


    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[0], test_1.test(new int[]{1,3,4}), "\"Последний элемент содержит 4\"");

    }
}

