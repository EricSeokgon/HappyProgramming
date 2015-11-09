package tk.hadeslee;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Project: HappyProgramming
 * FileName: JavaIO06
 * Date: 2015-11-09
 * Time: 오후 2:31
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JavaIO06 {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(new FileInputStream("data.dat"));

            int i = in.readInt();
            double d = in.readDouble();
            boolean b = in.readBoolean();

            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception ex) {
            }
        }
    }
}
