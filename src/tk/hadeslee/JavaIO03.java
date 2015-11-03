package tk.hadeslee;

import java.io.*;

/**
 * Project: HappyProgramming
 * FileName: JavaIO03
 * Date: 2015-11-03
 * Time: 오후 2:04
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JavaIO03 {
    public static void main(String[] args) throws Exception {
        //InputStream, OutputStream은 추상 class.
        InputStream in = null;
        OutputStream out = null;


        try {
            final long start = System.currentTimeMillis();
            //byte[]로 읽어들여서 파일에 저장하고 싳다.
            in = new FileInputStream("./src/tk/hadeslee/JavaIO03.java");
            out = new FileOutputStream("file.txt");

            int readCount = 0; //읽어들인 수
            byte[] buffer = new byte[1024];
            while ((readCount = in.read(buffer)) != -1) {

                out.write(buffer, 0, readCount);//buffer의 0번째부터 읽어 들인 수 만큼만 써라.
                System.out.println(System.currentTimeMillis() - start);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            out.close();
            in.close();
        }

    }
}
