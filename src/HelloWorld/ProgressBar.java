package HelloWorld;

public class ProgressBar {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            countProgress();
        }
    }

    private static void countProgress() {
        int j = 0;
        while(j < Integer.MAX_VALUE) {
            if(j % (Integer.MAX_VALUE / 64) == 0){
                System.out.print("■");
            }
            j++;
        }
        System.out.println();
    }

}
