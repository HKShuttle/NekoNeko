package EndOfTheEarth;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(ConstOfGen.CONSOLE_1);
        String inputA = scan.next();
        System.out.println(ConstOfGen.CONSOLE_2);
        int inputN = scan.nextInt();
        System.out.println(ConstOfGen.CONSOLE_02);
        String inputB = scan.next();
        System.out.println(ConstOfGen.CONSOLE_3);
        String inputC = scan.next();
        System.out.println(ConstOfGen.CONSOLE_4);
        String inputD = scan.next();
        System.out.println();
        scan.close();

        Generate.generate(inputA, inputB, inputC, inputD, inputN);
        for(int i = 0; i < 3; i++){
            System.out.println(Generate.l[i]);
        }
        System.out.println();
        for(int i = 3; i < 5; i++){
            System.out.println(Generate.l[i]);
        }
        System.out.println();
        for (int i = 5; i < 10; i++){
            System.out.println(Generate.l[i]);
        }

    }
}
