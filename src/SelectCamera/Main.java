package SelectCamera;

import java.util.*;

public class Main {

    static String budget, size, isEasy, isMirrorLess, highISO, sensorSize;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(SCConst.INIT_1);
        System.out.println(SCConst.INIT_2);

        SCLibs.genQuiz(8);
        String isSkillUp = sc.next();
        if(isSkillUp.equals("b")){
            SCLibs.sayResult(SCConst.IPHONE_1);
            System.out.println(SCConst.IPHONE_2);
            return;
        }

        SCLibs.genQuiz(3);
        isEasy = sc.next();
        if(isEasy.equals("a")){
            SCLibs.genQuiz(4);
            isMirrorLess = sc.next();
            if(isMirrorLess.equals("a")){
                SCLibs.sayResult(SCConst.EOS_M_1);
                System.out.println(SCConst.EOS_M_2);
            }
        }

        SCLibs.genQuiz(3);
        isEasy = sc.next();
        if(SCLibs.errCheck(2,(isEasy))){
            isEasy = "a";
        }

        SCLibs.genQuiz(4);
        isMirrorLess = sc.next();
        if(SCLibs.errCheck(2,(isMirrorLess))){
            isMirrorLess = "a";
        }

        SCLibs.genQuiz(5);
        highISO = sc.next();
        if(SCLibs.errCheck(2,(highISO))){
            highISO = "a";
        }

        if(isMirrorLess.equals("a")){
            SCLibs.genQuiz(7);
        } else {
            SCLibs.genQuiz(6);
        }
        sensorSize = sc.next();

        SCLibs.genQuiz(8);
        isSkillUp = sc.next();
        if(SCLibs.errCheck(2,(isSkillUp))){
            isSkillUp = "a";
        }

        SCLibs.returnResult();

    }
}
