//16 bit เป็นได้ 65536ค่า คือ 0-65535
//port 0-1024 จะไม่ใช้ สำหรับ user เพราะถูกจองไว้แล้ว
package scanlocalport;

import java.io.IOException;
import java.net.*;

public class ScanLocalPort {

    private ServerSocket ss;

    public ScanLocalPort() {
        //for (int i = 0; i < 65535; i++) { //อันนี้คือ check ทุกค่า แต่ไม่จำเป็นต้องหาทั้งหมด
            for (int i = 0; i < 1023; i++) {
            try {

                ss = new ServerSocket(i);
            } catch (IOException ioe) {
                System.out.println("Localhost open port : " + i);
            }

        }

    }

    public static void main(String[] args) {
        new ScanLocalPort();

    }

}
