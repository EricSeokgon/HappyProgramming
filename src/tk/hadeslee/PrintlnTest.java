package tk.hadeslee;

import tk.hadeslee.examples.Car;

/**
 * Project: HappyProgramming
 * FileName: PrintlnTest
 * Date: 2015-10-15
 * Time: 오전 11:18
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PrintlnTest {
    public static void main(String[] args) {
        boolean booleanValue = false;
        byte byteVale = 1;
        char charValue1 = 'a';
        char charValue2 = 65; // A
        short shortValue = -20;
        int intValue = 500;
        long longValue = 5000000L;
        float floatValue = 50.4f;
        double doubleValue = 50.4;
        char[] charArray = new char[]{'h', 'i'};
        String stringValue = "hi";
        Object obj1 = new Object();
        Car car = new Car();

        System.out.println(booleanValue);
        System.out.println(byteVale);
        System.out.println(charValue1);
        System.out.println(charValue2);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charArray);
        System.out.println(stringValue);
        System.out.println(car); //Object 의 toString() 반환하는 값을 출력
        System.out.println(obj1); //Object 의 toString()이 반환하는 값을 출력

    }
}
