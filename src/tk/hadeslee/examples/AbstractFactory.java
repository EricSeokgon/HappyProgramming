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

    //구현되어 있는 메소드도 가질 수 있다.
    //final 메소드 - 오버라이딩을 금지.
    public void exec() {
        init();
        make();
        clear();

    }

    // 추상메소드 - 구현이 안되어 있다.
    protected abstract void init();

    protected abstract void make();

    protected abstract void clear();
}
