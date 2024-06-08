package phase2.hw8;

import java.util.concurrent.ThreadLocalRandom;

public class TestGetRandomDouble {

    public static void main(String[] args) {

        int getCount = 1;
        int tryCount = 1;
        double randomDouble;
        int result;
        int targetIntegerCount = 1;

        while (targetIntegerCount <= 10) {
            while (tryCount <= 3) {
                try {
                    randomDouble = getRandomDouble();
                    result = (int) (randomDouble * 10);
                    System.out.println("第" + getCount + "次取得 " + result + " 呼叫" + tryCount + "次");
                    targetIntegerCount++;
                    break;
                } catch (IllegalStateException ex) {
                    if (tryCount == 3) {
                        System.out.println("第" + getCount + "次取得 無法取得");
                        tryCount = 1;
                        break;
                    }
                    tryCount++;
                }
            }
            getCount++;
        }
    }

    //do not change
    public static double getRandomDouble() throws IllegalStateException{
        ThreadLocalRandom current = ThreadLocalRandom.current();
        if ( (int)(current.nextDouble()*10) %2 == 1 ){
            throw new IllegalStateException("Something wrong, please try again!");
        }
        return current.nextDouble();
    }
}
