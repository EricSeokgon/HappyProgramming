package tk.hadeslee;

import java.io.*;

/**
 * Project: HappyProgramming
 * FileName: JavaIO02
 * Date: 2015-11-03
 * Time: 오후 1:52
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JavaIO02 {
    public static void main(String[] args) throws Exception {
        //InputStream, OutputStream은 추상 class.
        InputStream in = null;
        ByteArrayOutputStream out = null;
        final long start = System.currentTimeMillis();

        try {

            //파일로부터 byte배열을 읽어들인 후 배열에 저장.
            in = new FileInputStream("./src/tk/hadeslee/JavaIO02.java");
            //in = new FileInputStream("bytearray.dat");
            out = new ByteArrayOutputStream();

            int readBuffer = -1;
            while ((readBuffer = in.read()) != -1) {

                out.write(readBuffer);
            }
            byte[] buf = out.toByteArray();
            for (int i = 0; i < buf.length; i++) {
                System.out.println(buf[i]);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            out.close();
            in.close();

        }
        System.out.println("총걸린 시간: "+(System.currentTimeMillis() - start));
    }
}


