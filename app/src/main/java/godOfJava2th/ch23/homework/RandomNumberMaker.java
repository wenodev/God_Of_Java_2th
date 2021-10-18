package godOfJava2th.ch23.homework;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        for (int i=0; i<10; i++){
            System.out.println(randomNumberMaker.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber(){
        Random random = new Random();
        HashSet<Integer> integerHashSet = new HashSet<>();
        while (integerHashSet.size() != 6){
            integerHashSet.add(random.nextInt(101));
        }
        return integerHashSet;
    }
}
