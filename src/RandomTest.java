import java.util.Random;

/**
 * Project: HappyProgramming
 * FileName: RandomTest
 * Date: 2015-09-15
 * Time: 오전 12:19
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextGaussian());
        System.out.println(random.nextLong());
        System.out.println(random.hashCode());
        System.out.println(random.nextInt(10));
    }
}
