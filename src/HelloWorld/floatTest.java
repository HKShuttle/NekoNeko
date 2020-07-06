package HelloWorld;

import MyUtil.Reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class floatTest {

    public static void main(String[] args) {
        double sum = 0;
        System.out.println("整数を入力してください");
        int var = Integer.parseInt(Reader.readScan(new BufferedReader(new InputStreamReader(System.in))));
        for (int i = 0; i < var; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println(sum);

        double sum2 = 1;
        for (double i = 1; i <= 69; i++) {
            sum2 *= i;
        }
        System.out.println(sum2);
        float m = 2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2;
        float n = 1 / m;
        System.out.println(m);
        System.out.printf("%.18f", n);
    }
}