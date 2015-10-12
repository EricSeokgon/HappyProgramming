package tk.hadeslee.test;

import tk.hadeslee.examples.MyBean;

/**
 * Project: HappyProgramming
 * FileName: MyBeanTest
 * Date: 2015-10-12
 * Time: 오후 2:14
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MyBeanTest {
    public static void main(String[] args) {
        MyBean bean = new MyBean();
        MyBean bean2 = new MyBean();
        MyBean bean3 = new MyBean();
        MyBean bean4 = new MyBean();
        // 위의 4줄의 코드가 실행되면 인스턴스가 4개 만들어진다.
        // 인스턴스를 4개 만드는 이유는?
        // 각각의 인스턴스가 구별되어야 하기 떄문.
        // 사람에 대한 class가 있다. class는 인스턴의 틀.
        bean.pulicInt = 100;
    }
}
