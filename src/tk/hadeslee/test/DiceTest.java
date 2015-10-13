package tk.hadeslee.test;

/**
 * Project: HappyProgramming
 * FileName: DiceTest
 * Date: 2015-10-13
 * Time: 오후 3:17
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DiceTest {
    public static void main(String[] args) {
        //인터페이스 참조type이 될 수 있다.
        Dice dice1 = new Dice6();
        Dice dice2 = new Dice6();

        //Dice type으로 변수를 선언하는 것은 무슨의미냐?
        //해당 인터페이스를 구현하고 있는 클래스가 무엇이든지 간에 이용가능.
        System.out.println(dice1.get());
        System.out.println(dice2.get());

    }


}
