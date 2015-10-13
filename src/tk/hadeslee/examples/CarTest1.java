package tk.hadeslee.examples;

/**
 * Project: HappyProgramming
 * FileName: CarTest1
 * Date: 2015-10-13
 * Time: 오전 11:08
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CarTest1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.run();

        Bus b1 = new Bus();
        b1.run(); //부모가 가진 것을 그대로 물려 받아서 사용하낟.
        b1.bigppangppang(); // 확장한 메소드.
    }
}
