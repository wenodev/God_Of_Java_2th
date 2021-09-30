package godOfJava2th.ch21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WildcardGenericTest {

    @Test
    void test_wildcard(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

    public void wildcardStringMethod(WildcardGeneric<String> c){
        String value = c.getWildcard();
        System.out.println(value);
    }

}