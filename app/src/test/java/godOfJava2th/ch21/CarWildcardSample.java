package godOfJava2th.ch21;

import org.junit.jupiter.api.Test;

public class CarWildcardSample {

    @Test
    void test_callBoundedWildcardMethod(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Bus("Mustang"));
        boundedWildcardMethod(wildcard);
    }

    private void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value= c.getWildcard();
        System.out.println(value);
    }

}
