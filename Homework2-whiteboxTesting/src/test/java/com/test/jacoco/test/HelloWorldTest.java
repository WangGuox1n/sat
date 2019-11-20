package com.test.jacoco.test;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

        import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
        int b = hw.Method3(6, 0, 1);
        int c = hw.Method3(5, 0, 0);
        int d = hw.Method3(4, 0, -3);
        int e = hw.Method3(4, 0, -1);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0,0,0,0,0); // T,
        int b = hw.Method4(1,1,0,0,0); // F, T
        int c = hw.Method4(5,0,0,0,0); // F, F, T, T
        assertEquals(a,0);
        assertEquals(b,0);
        assertEquals(c,0);
        int d = 0, f = 0;
        try{
            d = hw.Method4(5,0,0,1,0); // F, F, F
        }catch (Exception e){
            assertEquals(d, 0);
        }
        try{
            f = hw.Method4(4,0,0,0,0); // F, F, T, F
        }catch (Exception e){
            assertEquals(f, 0);
        }
    }

    @Test
    public void testIsTriangle(){
        HelloWorld hw = new HelloWorld();
        assertTrue(hw.isTriangle(3,4,5));  // T, T, T
        assertFalse(hw.isTriangle(3,4,7));  // F,
        assertFalse(hw.isTriangle(3,4,1));  // T, F
        assertFalse(hw.isTriangle(3,1,1));  // T, T, F
    }

    @Test
    public void testIsBirthday(){
        HelloWorld hw = new HelloWorld();
        assertTrue(hw.isBirthday(2018,9,1));
        assertFalse(hw.isBirthday(1989,1,1));
        assertFalse(hw.isBirthday(2020,1,1));
        assertFalse(hw.isBirthday(2019,0,1));
        assertFalse(hw.isBirthday(2019,13,1));
        assertFalse(hw.isBirthday(2019,1,0));
        assertFalse(hw.isBirthday(2019,1,32));
        assertFalse(hw.isBirthday(2016,1,32));
        assertFalse(hw.isBirthday(2000,2,30));
        assertFalse(hw.isBirthday(2019,11,1));
        assertFalse(hw.isBirthday(2019,10,2));
    }

    @Test
    public void testIsLeapYear() {
        HelloWorld hw = new HelloWorld();
        double delta = 0;
        assertEquals(2, hw.miniCalculator(1,1,'+'),delta);
        assertEquals(0, hw.miniCalculator(1,1,'-'),delta);
        assertEquals(1, hw.miniCalculator(1,1,'*'),delta);
        assertEquals(1, hw.miniCalculator(1,1,'/'),delta);
        assertEquals(0, hw.miniCalculator(1,1,'%'),delta);
    }
}
