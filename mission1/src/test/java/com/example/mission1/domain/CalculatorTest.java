package com.example.mission1.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void 더하기_테스트 () {

        // given
        Calculator calculator = new Calculator();

        // when
        int x =3 ;
        int y=5 ;
        int result =8;
        int expect = calculator.plusMethod(x,y);

        // then
        Assertions.assertEquals(result,expect);

    }

    @Test
    void 빼기_테스트 () {

        // given
        Calculator calculator = new Calculator();

        // when
        int x =5 ;
        int y=3 ;
        int result =2;
        int expect = calculator.minusMethod(x,y);

        // then
        Assertions.assertEquals(result,expect);

    }

}