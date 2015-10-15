package tk.hadeslee;

import tk.hadeslee.examples.Car;

/**
 * Project: HappyProgramming
 * FileName: StringArrayTest
 * Date: 2015-10-15
 * Time: 오후 1:58
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringArrayTest {
    public static void main(String[] args) {
        //3개짜리 String을 참조하는 배열
        /*String[] stringArray = new String[3];
        stringArray[0] = "Hello";
        System.out.println(stringArray[0]);*/

        int[] array = new int[]{5, 10, 15};
        String[] array2 = new String[]{"hello", "world", "!!!"};
        Car[] array3 = new Car[]{new Car(), new Car(), new Car()};
        System.out.println(array.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

        System.out.println("---------------------------------------");
        for (int i = 0; i < array.length; i++) { //0,1,2
            System.out.println(array[i]);
        }
        System.out.println("---------------------------------------");
        for (int value : array) { //arry배열에서 값을 하나씩 꺼내서 value에게 저장.
            System.out.println(value);
        }

    }
}
