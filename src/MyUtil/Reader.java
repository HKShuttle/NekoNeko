package MyUtil;

import java.io.BufferedReader;
import java.io.IOException;

public class Reader {
    public static String readScan(BufferedReader br) {
        try {
            return br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "0";
        }
    }
}
