package Mathematics;

import org.apache.commons.math3.complex.*;

public class QuadraticEqn {
    private final double a;
    private final double b;
    private final double c;
    private final double discriminant;
    private final int answerType;
    private final Complex[] answerValue;

    QuadraticEqn(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = b * b - 4 * a * c;
        answerValue = new Complex[2];
        answerValue[0] = new Complex(0, 0);
        answerValue[1] = new Complex(0, 0);
        if (a == 0) {
            answerType = -1;
        } else if (discriminant > 0) {
            answerType = 0;
            if (b < 0) {
                answerValue[0] = new Complex((-b + Math.sqrt(discriminant)) / (2 * a), 0);
            } else {
                answerValue[0] = new Complex((-b - Math.sqrt(discriminant)) / (2 * a), 0);
            }
            answerValue[1] = new Complex((c / a) / answerValue[0].getReal());
        } else if (discriminant == 0) {
            answerType = 1;
            answerValue[0] = answerValue[1] = new Complex((-b + Math.sqrt(discriminant)) / (2 * a), 0);
        } else {
            answerType = 2;
            answerValue[0] = new Complex(-b / (2 * a), (Math.sqrt(-discriminant)) / (2 * a));
            answerValue[1] = new Complex(-b / (2 * a), -(Math.sqrt(-discriminant)) / (2 * a));
        }
    }

    Complex[] getAnswerValue() {
        return answerValue;
    }

    double getDiscriminant() {
        return discriminant;
    }

    int getAnswerType() {
        return answerType;
    }

    double getCoefficient(char coefficient) {
        if (coefficient == 'a') {
            return a;
        }
        if (coefficient == 'b') {
            return b;
        }
        if (coefficient == 'c') {
            return c;
        }
        return 0;
    }
}
