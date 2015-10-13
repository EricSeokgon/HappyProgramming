package tk.hadeslee.examples;

/**
 * Project: HappyProgramming
 * FileName: Test01
 * Date: 2015-10-13
 * Time: 오후 1:48
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test01 {
    public static void main(String[] args) {
        final TestBean01 bean = new TestBean01();
        bean.exec();

    }

}

class TestBean01 {
    public void exec() {
        System.out.println("exec");

        init("1", "2", "3");
        service("a", "b", "c");
        destory("가", "나", "다");
    }

    private void destory(final String 가, final String 나, final String 다) {
        System.out.println(가);
        System.out.println(나);
        System.out.println(다);
    }

    private void service(final String a, final String b, final String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private void init(final String x, final String x2, final String x3) {
        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);
    }

}
