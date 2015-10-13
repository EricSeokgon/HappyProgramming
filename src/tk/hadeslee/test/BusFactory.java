package tk.hadeslee.test;

import tk.hadeslee.examples.AbstractFactory;

/**
 * Project: HappyProgramming
 * FileName: BusFactory
 * Date: 2015-10-13
 * Time: 오전 11:39
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class BusFactory extends AbstractFactory {
    @Override
    public void init() {
        System.out.println("버스공장 초기화");
    }

    @Override
    public void make() {
        System.out.println("버스를 만듭니다.");
    }

    @Override
    public void clear() {
        System.out.println("버스공장 청소");
    }
}
