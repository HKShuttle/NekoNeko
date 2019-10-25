package HelloWorld;

import java.util.*;

public class EarPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("任意の文字列を入力してください");
        String strInput = scanner.next();
        System.out.println(earPhone(strInput));
        scanner.close();
    }

    private static String earPhone(String s) {
        String[] earPhone = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            earPhone[i] = s.substring(i, i + 1);
        }

        if(s.length() >= 2) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length() - 2; i++) {
                builder.append(earPhone[i]);
            }
            builder.append(earPhone[s.length() - 1]);
            builder.append(earPhone[s.length() - 2]);
            builder.append(earPhone[s.length() - 2]);

            return builder.toString();
        } else {
            return earPhone[0];
        }
    }

}
