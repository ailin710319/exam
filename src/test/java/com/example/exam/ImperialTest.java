package com.example.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImperialTest {
    ImperialCalculator exp=new ImperialCalculator();
    void centimeterTest10(){
        double a=10;
        double expectedResult=25.4;
        double result=exp.centimeter(a);
        assertEquals (expectedResult,result);}
}
