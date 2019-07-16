package SelectCamera;

class SCLibs {
    static void genQuiz(int a){
        switch (a){
            case 1:
                System.out.println(SCConst.BUDGET_1);
                System.out.println(SCConst.BUDGET_2);
                break;
            case 2:
                System.out.println(SCConst.SIZE_1);
                System.out.println(SCConst.SIZE_2);
                break;
            case 3:
                System.out.println(SCConst.IS_EASY_1);
                System.out.println(SCConst.IS_EASY_2);
                break;
            case 4:
                System.out.println(SCConst.IS_MIRROR_LESS_1);
                System.out.println(SCConst.IS_MIRROR_LESS_2);
                break;
            case 5:
                System.out.println(SCConst.IS_HIGH_ISO_1);
                System.out.println(SCConst.IS_HIGH_ISO_2);
                break;
            case 6:
                System.out.println(SCConst.SENSOR_SIZE_1);
                System.out.println(SCConst.SENSOR_SIZE_2);
                break;
            case 7:
                System.out.println(SCConst.SENSOR_SIZE_1);
                System.out.println(SCConst.SENSOR_SIZE_3);
                break;
            case 8:
                System.out.println(SCConst.IS_SKILL_UP_1);
                System.out.println(SCConst.IS_SKILL_UP_2);
                break;
            default:
                System.out.println(SCConst.RTN_ERROR);
                break;
        }
    }

    // aは選択肢の数、bはstring変数
    static boolean errCheck(int a, String b){
        if(a == 2){
            if(!(b.equals("a|b"))){
                System.out.println(SCConst.FORCE_SET_A);
                System.out.println("errCheckメソッドに渡った答えは" + b + "でした");
                return true;
            } else {
                System.out.println("答え方あってます");
                return false;
            }
        } else if(a == 4){
            if(!(b.equals("a|b|c|d"))){
                System.out.println(SCConst.FORCE_SET_A);
                System.out.println("errCheckメソッドに渡った答えは" + b + "でした");
                return true;
            } else {
                System.out.println("答え方あってます");
                return false;
            }
        } else {
            System.out.println(SCConst.RTN_ERROR);
            return false;
        }
    }

    static void returnResult(){
        if(Main.isEasy.equals("b")){
            if(Main.size.equals("a")){
                    sayResult(SCConst.PWR_SHOT_1);
                    System.out.println(SCConst.PWR_SHOT_2);
            } else if(Main.budget.equals("a")) {
                    if(Main.isMirrorLess.equals("a")){
                        sayResult(SCConst.EOS_M_1);
                        System.out.println(SCConst.EOS_M_2);
                    } else {
                        sayResult(SCConst.EOS_9KD_1);
                        System.out.println(SCConst.EOS_9KD_2);
                    }
            } else if(Main.budget.equals("b")) {
                        sayResult(SCConst.EOS_80D_1);
                        System.out.println(SCConst.EOS_80D_2);
            } else if(Main.highISO.equals("a")){
                    sayResult(SCConst.EOS_7D_1);
                    System.out.println(SCConst.EOS_7D_2);
            } else if(Main.budget.equals("c")){
                    if(Main.isMirrorLess.equals("a")){
                        sayResult(SCConst.EOS_RP_1);
                        System.out.println(SCConst.EOS_RP_2);
                    } else {
                        sayResult(SCConst.EOS_6D_1);
                        System.out.println(SCConst.EOS_6D_2);
                    }
                }
            } else {
                if(Main.size.equals("a")){
                    sayResult(SCConst.PWR_SHOT_1);
                    System.out.println(SCConst.PWR_SHOT_2);
                } else if(Main.isMirrorLess.equals("a")){
                    sayResult(SCConst.EOS_M_1);
                    System.out.println(SCConst.EOS_M_2);
                } else {
                    sayResult(SCConst.EOS_KISS_1);
                    System.out.println(SCConst.EOS_KISS_2);
                }
            }
    }

    static void sayResult(String a){
        System.out.println("あなたにオススメのカメラは「" + a + "」です！");
    }

}
