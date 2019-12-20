package ex.trysql;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import static org.junit.Assert.*;
import structure.controller1.MyController;

@SpringBootTest
public class TrysqlApplicationTests {

    MyController checkvalue = new MyController();

    @Test public void testSum() {
        int sum = checkvalue.sum(2, 5);
        int testSum = 7;

        System.out.println("@Test result(): " + sum + " = " + testSum);
        assertEquals(sum, testSum);
    }

    @Test public void testconcat(){
        String user = checkvalue.concat("Bill","Gates");
        String testuser = "Bill Gates";

        System.out.println("@Test result(): " + user + " = " + testuser);
        assertEquals(user, testuser);
    }

    @Test public void Generaltest() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int[] arithmetic1 = { 1, 2, 3 };
        int[] arithmetic2 = { 1, 2, 3 };

        assertEquals(obj1, obj2);
        assertSame(obj3, obj4);
        assertNotSame(obj2, obj4);
        assertNotNull(obj1);
        assertNull(obj5);
        assertArrayEquals(arithmetic1, arithmetic2);
    }

    @Test public void evenNumberTest1(){
        MyController numbertest = new MyController();
        assertTrue(numbertest.isEvenNumber(4));
    }

    @Test public void evenNumberTest2(){
        assertFalse(checkvalue.isEvenNumber(3));
    }

    @Test public void temp(){
        double temperature = 80.0d;
        String unit = "";
        double result = checkvalue.temperature(temperature, unit);
        System.out.println("@Test result(): " + "176.0d" + " = " + result);
        assertEquals(176.0d, result, 0.0);
    }

    @Test public void contextLoads() {
    }
}