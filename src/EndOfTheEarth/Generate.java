package EndOfTheEarth;

class Generate {
    static String[] l = new String[10];
    static void generate(String a, String b, String c, String d, int n){
        l[0] = ConstOfGen.GEN1_1 + a + ConstOfGen.GEN1_2;
        l[1] = ConstOfGen.GEN02;
        l[2] = ConstOfGen.GEN03;
        l[3] = n + "、" + (n + 1) + b + ConstOfGen.GEN2;
        l[4] = c + ConstOfGen.GEN3;
        l[5] = ConstOfGen.GEN4;
        l[6] = ConstOfGen.GEN5_1 + d + ConstOfGen.GEN5_2;
        l[7] = ConstOfGen.GEN6;
        l[8] = ConstOfGen.GEN7;
        l[9] = ConstOfGen.GEN8;
    }
}
