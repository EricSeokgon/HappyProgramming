package tk.hadeslee.examples;

/**
 * Project: HappyProgramming
 * FileName: Car
 * Date: 2015-10-13
 * Time: 오전 11:09
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private String name;

    public void run() {
        System.out.println("전륜구동");
    }

    public Car(String name) {
        this.name = name;
        System.out.println("Car 생성자");
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "자동차 입니다.";
    }
}
