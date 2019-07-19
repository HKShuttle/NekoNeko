package HelloWorld;

import java.util.*;

public class Rapid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= 5; i++){
            System.out.print("漢字二文字の地名を入力してください：");
            String rapid = sc.next();
            System.out.println(rapid + "路快速");
        }
    }
}
