package tk.hadeslee;

/**
 * Project: HappyProgramming
 * FileName: SwapTest1
 * Date: 2015-10-15
 * Time: 오후 1:02
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SwapTest1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        swap(x, y);
        System.out.println(x + "," + y);
    }

    // 값이 복사.
    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println(x + "," + y);
    }


}
