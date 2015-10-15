package tk.hadeslee;

/**
 * Project: HappyProgramming
 * FileName: StringArrayTest
 * Date: 2015-10-15
 * Time: 오후 1:58
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringArrayTest {
    public static void main(String[] args) {
        //3개짜리 String을 참조하는 배열
        /*String[] stringArray = new String[3];
        stringArray[0] = "Hello";
        System.out.println(stringArray[0]);*/

        /*int[] array = new int[]{5, 10, 15};
        String[] array2 = new String[]{"hello", "world", "!!!"};
        Car[] array3 = new Car[]{new Car(), new Car(), new Car()};
        System.out.println(array.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

        System.out.println("---------------------------------------");
        for (int i = 0; i < array.length; i++) { //0,1,2
            System.out.println(array[i]);
        }
        System.out.println("---------------------------------------");
        for (int value : array) { //arry배열에서 값을 하나씩 꺼내서 value에게 저장.
            System.out.println(value);
        }*/

        int[][] array = new int[3][2];
        //array변수가 참조하는 배열의 길이
        System.out.println(array.length);
        //array[0]변수가 참조하는 배열의 길이
        System.out.println(array[0].length);
        System.out.println("---------------------------------------");
        int[][] array2 = new int[3][];
        array2[0] = new int[2];
        array2[1] = new int[3];
        array2[2] = new int[4];
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        System.out.println(array2[1].length);
        System.out.println(array2[2].length);
        System.out.println("---------------------------------------");
        int[][] array3 = new int[][]{{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < array3.length; i++) {//3번반복 :0,1,2
            for (int k = 0; k < array3[i].length; k++) {
                System.out.print(array3[i][k] + "\t");
            }
            System.out.println();

        }


    }
}
