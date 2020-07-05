package HelloWorld;

import java.util.Random;

class KiyoshiZundoko {
    static void kiyoshi(){
        String zundoko;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i <= 4; i++){
            builder.append(randomGen(0));
        }
        zundoko = builder.toString();
        if (zundoko.equals(kiyoshiConst.EQUAL_ZUNDOKO)) {
            zundoko += kiyoshiConst.KIYOSHI;
        }
        System.out.println(zundoko);
    }

    private static String randomGen(int a) {
        if (a == 0) {
            if ((new Random().nextInt(2) == 0)) {
                return kiyoshiConst.ZUN;
            } else {
                return kiyoshiConst.DOKO;
            }
        } else {
            switch (new Random().nextInt(5)) {
                case 0:
                    return kiyoshiConst.HOT_DOG_1;
                case 1:
                    return kiyoshiConst.HOT_DOG_2;
                case 2:
                    return kiyoshiConst.HOT_DOG_3;
                case 3:
                    return kiyoshiConst.HOT_DOG_4;
                default:
                    return kiyoshiConst.HOT_DOG_5;
            }
        }
    }

    static void hotDog(){
        String hotDog;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i <= 4; i++){
            builder.append(randomGen(1));
        }
        hotDog = builder.toString();
        System.out.println(hotDog);
    }

}