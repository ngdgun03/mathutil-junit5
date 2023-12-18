/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core;

import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ngdugn
 */
public class MathUtilTest {
    //import static la danh rieng cho nhung ham static
    // goi ham ma bo qua ten class
    
    // chuan bi bo data
    public static Object[][] initData(){
        return new Integer[][]{
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
                {6,720}
        };
    }
    @ParameterizedTest
    @MethodSource(value = "initData") // ten ham cung cap data, ngam dinh thu tu 
    // cua cac phan tu mang, map vao tham so ham 
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected,getFactorial(input));
    }
      @Test
    public void testGetFactorialGivenWrongArgumentThrowsException(){
      //  Assert.assertThrows(ngoai le muon so sanh, doan code muon ghi chu)
           assertThrows(IllegalArgumentException.class, 
                 () -> {
                 MathUtil.getFactorial(-5);
                 });
      //MathUtil.getFactorial(-5);// ham @Test nem ngoai le Number format
    
    }
    
}
