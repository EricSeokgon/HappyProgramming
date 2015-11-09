package tk.hadeslee;

import java.io.*;

/**
 * Project: HappyProgramming
 * FileName: JavaIO04
 * Date: 2015-11-09
 * Time: 오후 1:25
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class JavaIO04 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            // br, pw을 초기화하는 코드
            // 한줄씩 입력받아서 한줄씩 쓴다.
            // 키보드로부터 입력받도록 br을 초기화
            // 파일에 쓰도록 pw를 초기화.
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("keyboard.txt");
            pw = new PrintWriter(fw);

            String line = null;
            int num = 1;
            while ((line = br.readLine()) != null) {
                pw.println(num + " : " + line);
                num++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
            } catch (Exception ex) {
            }
            try {
                br.close();
            } catch (Exception ex) {
            }
        }
    }
}