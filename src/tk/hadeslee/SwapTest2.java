package tk.hadeslee;

/**
 * Project: HappyProgramming
 * FileName: SwapTest2
 * Date: 2015-10-15
 * Time: 오후 1:09
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SwapTest2 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 5;
        d.y = 10;
        swap(d);
        System.out.println(d.x + "," + d.y);
    }

    public static void swap(Data d) {
        int tmp = d.x;
        d.x = d.y;
        d.y = tmp;
    }
}

class Data {
    int x;
    int y;
}

