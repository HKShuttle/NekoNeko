package HelloWorld;
import java.util.*;

public class EarPhone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("任意の文字列を入力してください");
        String str = scanner.next();
        int strLength = str.length();
        String[] earPhone = new String[strLength];

        for(int i = 0; i < strLength; i++){
            earPhone[i] = str.substring(i, i + 1);
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < strLength - 2; i++){
            builder.append(earPhone[i]);
        }
        builder.append(earPhone[strLength - 1]);
        builder.append(earPhone[strLength - 2]);
        builder.append(earPhone[strLength - 2]);

        String result = builder.toString();
        System.out.println(result);
    }
}
