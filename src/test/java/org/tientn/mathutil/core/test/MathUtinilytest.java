/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.tientn.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.tientn.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class MathUtinilytest {
    
    @Test
    
    public void testFactorialGivenRightArgumentRunsWell(){
//        assertEquals(69, 69);
          assertEquals(1, MathUtility.getFactiorial(0));
          assertEquals(1, MathUtility.getFactiorial(1));
          assertEquals(2, MathUtility.getFactiorial(2));
          assertEquals(6, MathUtility.getFactiorial(3));
          assertEquals(120, MathUtility.getFactiorial(5));
    }
    
    //DDT                               DDT
    //+data driven Testing             + Viết code 
    //+Data                                  + viết test case cùng nhau => xanh đỏ
    //+Tách bộ Data test ra khỏi lệnh
    //test sau đó chia thành tham số
}
