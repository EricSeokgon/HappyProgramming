package tk.hadeslee;

/**
 * Project: HappyProgramming
 * FileName: recursive
 * Date: 2015-10-15
 * Time: 오후 2:49
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recursive {
    public static void main(String[] args) {
        int result = fib(10);
        System.out.println(result);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

