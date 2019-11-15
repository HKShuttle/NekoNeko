package NekoMathLibs;

public class Equation {
    public static double[] quadEqn(double a, double b, double c){
        double[] result = new double[2];
        double discriminant = b * b - 4 * a * c;
        result[0] = (- b +  Math.sqrt(discriminant)) / 2 * a;
        result[1] = (- b -  Math.sqrt(discriminant)) / 2 * a;
        return result;
    }
}
