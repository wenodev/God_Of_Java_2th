package godOfJava2th.ch24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void test_add(){
        int n1 = 1;
        int n2 = 2;
        assertThat(calculator.add(n1,n2)).isEqualTo(3);
    }

}