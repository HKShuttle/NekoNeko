package NekoMathLibs;

public class Equation {
    private static double discriminant;
    public static void quadEqn(double a, double b, double c){

        discriminant = b * b - 4 * a * c;
        if(a == 0){
            System.out.println("-------------------------");
            System.out.println("a = 0 の場合は解を持たない");
            System.out.println("-------------------------");
            return;
        }
        if(discriminant > 0){
            double[] result = isPositive(a, b);
            System.out.println("-------------------------");
            System.out.println("実数解: x = ( " + result[0] + ", " + result[1] + ")");
            System.out.println("-------------------------");
        } else if (discriminant == 0){
            System.out.println("-------------------------");
            System.out.println("重解: x = " + isZero(a, b));
            System.out.println("-------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("虚数解: x = " + isNegative(a, b));
            System.out.println("-------------------------");
        }
    }
    private static double[] isPositive(double a, double b){
        double[] result = new double[2];
        result[0] = (- b +  Math.sqrt(discriminant)) / 2 * a;
        result[1] = (- b -  Math.sqrt(discriminant)) / 2 * a;
        return result;
    }
    private static double isZero(double a, double b){
        return (- b -  Math.sqrt(discriminant)) / 2 * a;
    }
    private static String isNegative(double a, double b){
        double ans1 = - ( b / (2 * a));
        double ans2 = (Math.sqrt(- discriminant)) / (2 * a);
        if((b / (2 * a)) == 0){
            return "± " + ans2 + "i";
        } else {
            return ans1 + " ± " + ans2 + "i";
        }
    }
}
