package HelloWorld;

import MyUtil.QuadraticEqn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class equationTest {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("a=?");
            double a = Double.parseDouble(MyUtil.Reader.readScan(br));
            System.out.print("b=?");
            double b = Double.parseDouble(MyUtil.Reader.readScan(br));
            System.out.print("c=?");
            double c = Double.parseDouble(MyUtil.Reader.readScan(br));
            printAnswer(new QuadraticEqn(a, b, c));
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
