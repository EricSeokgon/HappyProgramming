/**
 * Project: HappyProgramming
 * FileName: MathTest
 * Date: 2015-09-15
 * Time: 오전 12:18
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MathTest {
    public static void main(String[] args) {

        int a, b;
        a = 5;
        b = -6;
        double x, y;
        x = 23.4;
        y = 0.37;

        System.out.println("값의 절대치를 둘려줌");
        abs(a, b, x, y);

        System.out.println("인수에 가장 가까운 값을 돌려줌");
        round(x, y);

        System.out.println("인수의 값이상으로 계산상의 정수로 동일한, 최소의 값을 돌려줌");
        ceil(a, b, x, y);

        System.out.println("인수의 값이하로, 계산상의 정수로 동일한, 최대의 값을 돌려줌");
        floor(a, b, x, y);

        System.out.println("2개의 값중 작은 값을 돌려줌");
        min(a, b, x, y);

        System.out.println("2개의 값중 큰은 값을 돌려줌");
        max(a, b, x, y);

        System.out.println();
        System.out.println("math 랜덤함수");
        for (int i = 0; i < 4; i++) {
            int n = (int) (Math.random() * 10) + 1;
            System.out.println(n);
        }

        System.out.println();
        System.out.println("파이는 " + Math.PI);
        System.out.println("자연대수 e는 " + Math.E);

        System.out.println();
        double angle = 45.0 * 2.0 * Math.PI / 360.0;
        System.out.println("코사인(" + angle + ") 는 " + Math.cos(angle));
        System.out.println("사인(" + angle + ") 는 " + Math.sin(angle));


    }

    private static void max(int a, int b, double x, double y) {
        System.out.println(Math.max(a, b));
        System.out.println(Math.max(x, y));
        System.out.println(Math.max(a, x));
        System.out.println(Math.max(b, y));
    }

    private static void min(int a, int b, double x, double y) {
        System.out.println(Math.min(a, b));
        System.out.println(Math.min(x, y));
        System.out.println(Math.min(a, x));
        System.out.println(Math.min(b, y));
    }

    private static void floor(int a, int b, double x, double y) {
        System.out.println(Math.floor(a));
        System.out.println(Math.floor(b));
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
    }

    private static void ceil(int a, int b, double x, double y) {
        System.out.println(Math.ceil(a));
        System.out.println(Math.ceil(b));
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));
    }

    private static void round(double x, double y) {
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));
    }

    private static void abs(int a, int b, double x, double y) {
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));
    }
}
