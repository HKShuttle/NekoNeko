package HelloWorld;

public class ProgressBar {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++){
            countProgress();
        }
    }

    private static void countProgress() throws InterruptedException {
        int j = 0;
        while(j < (Integer.MAX_VALUE / 2)) {
            if(j % (Integer.MAX_VALUE / 32) == 0){
                System.out.print("#");
                Thread.sleep(50);
            }
            j++;
        }
        System.out.println();
    }

}
