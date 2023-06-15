/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.tientn.mathutil.core.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import static org.tientn.mathutil.core.MathUtility.*;
import org.junit.jupiter.params.provider.MethodSource;
import org.tientn.mathutil.core.MathUtility;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ACER
 */
public class MathUtilityAdvancedTest {
    
    //hàm chuẩn bị bộ data test để sau đó fill vào hàm AssertE() ở dưới
    public static Object[][] initTestData(){
        Object testData[][] = { {0,1}, {1,1}, {2,2}, {4,24}, {6,720} };
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(1, getFactiorial(n));
    }
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
//        Executable gF = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtility.getFactiorial(-5);
//            }
//        };
        
        Executable gF = () -> MathUtility.getFactiorial(5);
        
        assertThrows(IllegalArgumentException.class, () -> {});// hàm thuộc interface executable
    }
    
}
