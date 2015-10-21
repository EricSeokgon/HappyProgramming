package tk.hadeslee;

import tk.hadeslee.examples.Bus;
import tk.hadeslee.test.Dice;

/**
 * Project: HappyProgramming
 * FileName: ObjectTest1
 * Date: 2015-10-21
 * Time: 오후 2:47
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ObjectTest1 {
    public static void main(String[] args) {

        final Object obj1 = new Object();
        System.out.println(obj1);
        final Object obj2 = new Bus();
        System.out.println(obj2);
        final Object obj3 = new Dice();
        System.out.println(obj3);

    }
}
