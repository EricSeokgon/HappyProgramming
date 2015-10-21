package tk.hadeslee.test;

/**
 * Project: HappyProgramming
 * FileName: Dice
 * Date: 2015-10-13
 * Time: 오후 2:51
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */


//Dice, 주사위인데, 어떤기능?
public class Dice {
    // 속성의 면의 수를 가지고 싶다.
    private int faceCount;

    public Dice() {//기본 생성자
        this.faceCount = 6;
    }

    public Dice(int faceCount) throws IllegalArgumentException {
        if (faceCount <= 1) {
            throw new IllegalArgumentException("면의 수는 2이상이어야 합니다.");
        }
        this.faceCount = faceCount;
    }

    public int getFaceCount() {
        return this.faceCount;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "faceCount=" + faceCount +
                '}';
    }
}
