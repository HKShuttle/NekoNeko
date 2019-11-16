package NekoMathLibs;

public class test {
    public static void main(String[] args){
        Equation.quadEqn(1.0, -5.0, 4.0);
        System.out.println();
        Equation.quadEqn(1.0, -2.0, 1.0);
        System.out.println();
        Equation.quadEqn(1.0, -5.0, 0);
        System.out.println();
        Equation.quadEqn(0, -5.0, 4.0);
        System.out.println();
        Equation.quadEqn(1.0, 0.0, 16.0);
        System.out.println();
        Equation.quadEqn(1.0, 3.0, 9.0);
        System.out.println();
        Equation.quadEqn(1.0, -6.0, 13.0);
        System.out.println();
        quadSolver eq1 = new quadSolver(1.0, 0.0, 16.0);
        switch (eq1.ansType){
            case -1 :
                System.out.println("-------------------------");
                System.out.println("a = 0 の場合は解を持たない");
                System.out.println("-------------------------");
                break;
            case 0 :
                System.out.println("-------------------------");
                System.out.println("方程式 " + eq1.a + "x^2+" + eq1.b + "x+" + eq1.c + "=0");
                System.out.println("判別式D= " + eq1.discriminant);
                System.out.println("実数解: x = ( " + eq1.pAns1 + ", " + eq1.pAns2 + ")");
                System.out.println("-------------------------");
                break;
            case 1:
                System.out.println("-------------------------");
                System.out.println("方程式 " + eq1.a + "x^2+" + eq1.b + "x+" + eq1.c + "=0");
                System.out.println("判別式D= " + eq1.discriminant);
                System.out.println("重解: x = " + eq1.pAns1);
                System.out.println("-------------------------");
                break;
            case 2:
                System.out.println("-------------------------");
                System.out.println("方程式 " + eq1.a + "x^2+" + eq1.b + "x+" + eq1.c + "=0");
                System.out.println("判別式D= " + eq1.discriminant);
                System.out.println("虚数解 実部: " + eq1.nAnsRe + " 虚部: " + eq1.nAnsIm);
                System.out.println("-------------------------");
                break;
            default:
                System.out.println("-------------------------");
                System.out.println("内部エラー");
                System.out.println("-------------------------");
                break;
        }
    }
}
