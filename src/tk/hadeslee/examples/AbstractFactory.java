package tk.hadeslee.examples;

/**
 * Project: HappyProgramming
 * FileName: AbstractFactory
 * Date: 2015-10-13
 * Time: 오전 11:23
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

//추상클래스.
//공장은 이런 기능을 가질꺼야....
public abstract class AbstractFactory {
    public abstract void init();
    public abstract void make();
    public abstract void clear();
}
