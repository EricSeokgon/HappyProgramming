package tk.hadeslee.examples;

/**
 * Project: HappyProgramming
 * FileName: CarFactory
 * Date: 2015-10-13
 * Time: 오전 11:26
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CarFactory extends AbstractFactory {

    @Override
    public void init() {
        System.out.println("자동차 공정 초기화");
    }

    @Override
    public void make() {
        System.out.println("자동차를 만듭니다.");
    }

    @Override
    public void clear() {
        System.out.println("자동차 공장 청소");
    }
}
