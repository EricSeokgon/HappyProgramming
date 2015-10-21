package tk.hadeslee;

import tk.hadeslee.test.Dice;

/**
 * Project: HappyProgramming
 * FileName: ObjectTest2
 * Date: 2015-10-21
 * Time: 오후 3:53
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ObjectTest2 {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        //같은 인스턴스를 참조하느냐? 같은 것을 가리키느냐?
        if (dice1 == dice2) {
            System.out.println("dice1 == dice2");
        } else {
            System.out.println("dice != dice2");
        }
    }
}
