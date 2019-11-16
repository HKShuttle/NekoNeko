package NekoMathLibs;

public class Equation2 {
    public double a, b, c;
    public double discriminant;
    public int ansType;
    public double pAns1;
    public double pAns2;
    public double nAnsRe;
    public double nAnsIm;
    public Equation2(double _a, double _b, double _c){
        a = _a;
        b = _b;
        c = _c;
        discriminant = b * b - 4 * a * c;
        if(a == 0){
            ansType = -1;
        } else if(discriminant > 0){
            ansType = 0;
            positiveAnswerer();
        } else if (discriminant == 0){
            ansType = 1;
            positiveAnswerer();
        } else {
            ansType = 2;
            isNegative(a, b);
        }
    }
    private void positiveAnswerer(){
        double[] temp = isPositive(a, b);
        pAns1 = temp[0];
        pAns2 = temp[1];
    }
    private double[] isPositive(double a, double b){
        double[] result = new double[2];
        result[0] = (- b +  Math.sqrt(discriminant)) / 2 * a;
        result[1] = (- b -  Math.sqrt(discriminant)) / 2 * a;
        return result;
    }
    private void isNegative(double a, double b){
        double resultRe =  b / (2 * a);
        nAnsIm = (Math.sqrt(- discriminant)) / (2 * a);
        if(resultRe == 0){
            nAnsRe = 0;
        } else {
            nAnsRe = - resultRe;
        }
    }
}
