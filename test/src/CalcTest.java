package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {

    // 加算メソッド add のテスト
    @Test
    public void testAdd() {
        int result = Calc.add(2, 3);
        assertEquals(5, result);
    }
}