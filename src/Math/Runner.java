package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("a=?");
            double a = Double.parseDouble(readScan(br));
            System.out.print("b=?");
            double b = Double.parseDouble(readScan(br));
            System.out.print("c=?");
            double c = Double.parseDouble(readScan(br));
            printAnswer(new QuadraticEqn(a, b, c));
        }
    }

    static String readScan(BufferedReader br) {
        try {
            return br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "0";
        }
    }

    static void printAnswer(QuadraticEqn quadraticEqn) {
        System.out.println(quadraticEqn.getCoefficient('a') + "x^2 + " + quadraticEqn.getCoefficient('b') + "x + " + quadraticEqn.getCoefficient('c') + " = 0");

        if (quadraticEqn.getAnswerType() == -1) {
            System.out.println("No Solutions Available");
            return;
        }

        System.out.println("D = " + quadraticEqn.getDiscriminant());
        System.out.println("x = ( " + quadraticEqn.getAnswerValue()[0] + ", " + quadraticEqn.getAnswerValue()[1] + " )");
    }
}
