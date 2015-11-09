package tk.hadeslee;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Project: HappyProgramming
 * FileName: javaIO05
 * Date: 2015-11-09
 * Time: 오후 2:26
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class javaIO05 {
    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            int i = 5; //4byte
            double d = 20.5; //8byte
            boolean b = true; //1byte

            FileOutputStream fos = new FileOutputStream("data.dat");
            out = new DataOutputStream(fos);

            out.writeInt(i);
            out.writeDouble(d);
            out.writeBoolean(b);
        } catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{
                out.close();
            }catch (Exception ex){}
        }
    }
}
