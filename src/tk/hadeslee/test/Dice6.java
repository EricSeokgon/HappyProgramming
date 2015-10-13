package tk.hadeslee.test;

/**
 * Project: HappyProgramming
 * FileName: Dice6
 * Date: 2015-10-13
 * Time: 오후 2:52
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

// Dice인터페이스를 구현하는 글래스를 선언한다.
public class Dice6 implements Dice {
    //get메소드를 구현하였다.
    public int get() {
        //1~6
        int value = (int) (Math.random() * 6) + 1;
        return value;
    }
}
