package tk.hadeslee.test;

import tk.hadeslee.examples.CalBean;

/**
 * Project: HappyProgramming
 * FileName: CalBeanTest
 * Date: 2015-10-12
 * Time: 오후 2:45
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalBeanTest {
    public static void main(String[] args) {
        //할수 없다.
        //CalBean cal = new CalBean();
        //CalBean bean = CalBean.instance;
        //class 이름 다음에 메소드명이 나오면 무슨 메소드라고 할까요?
        //static 메소드
        System.out.println("----------------------------------");
        CalBean bean = CalBean.getInstance();
        CalBean bean2 = CalBean.getInstance();
        System.out.println("----------------------------------");
        // 같은 참조인가?
        if (bean == bean2) {
            System.out.println("Yes!!");
        }
        int value = bean.plus(5, 10);
        System.out.println(value);

    }
}
