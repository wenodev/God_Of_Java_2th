package godOfJava2th.ch24.homework;

import java.util.*;

public class RandomNumberStatistics {

    private final Integer DATA_BOUNDARY = 50;
    private Hashtable<Integer, Integer> hashtable;

    public RandomNumberStatistics() {
        hashtable = new Hashtable<>();
    }

    public static void main(String[] args) {
        RandomNumberStatistics randomNumberStatistics = new RandomNumberStatistics();
        randomNumberStatistics.getRandomNUmberStatistics();
    }

    public void getRandomNUmberStatistics(){
        Random random = new Random();
        for (int i=0; i<5000; i++){
            putCurrentNumber(random.nextInt(DATA_BOUNDARY) + 1);
        }
        printStatistics();
    }

    public void putCurrentNumber(Integer tempNumber){
        if (tempNumber == null) return;
        System.out.println(tempNumber);
        if (hashtable.contains(tempNumber)){
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        }else{
            hashtable.put(tempNumber, 1);
        }
    }

    public void printStatistics(){
        Set<Integer> integerSet  = hashtable.keySet();
        for (Integer integer : integerSet){
            if (integer % 10 - 1 ==0) System.out.println();
            System.out.println(integer);
        }
    }


}
