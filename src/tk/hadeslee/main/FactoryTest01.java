package tk.hadeslee.main;

import tk.hadeslee.examples.AbstractFactory;
import tk.hadeslee.test.BusFactory;

/**
 * Project: HappyProgramming
 * FileName: FactoryTest01
 * Date: 2015-10-13
 * Time: 오전 11:34
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FactoryTest01 {
    public static void main(String[] args) {
        final AbstractFactory factory = new BusFactory();
        factory.init();
    }
}
