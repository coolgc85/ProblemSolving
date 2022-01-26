package coolgc;

import io.coolgc.BalancedString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BalancedStringTest {


    BalancedString r;


    @BeforeAll
    void init(){
        r = new BalancedString();
    }

    @Test
    void isBalancedWithBalanceExpression() {

        Assertions.assertTrue(r.isBalanced("{[]()[()]}"));

    }

    @Test
    void isBalancedWithNonBalanceExpression() {
        Assertions.assertFalse(r.isBalanced("{{{]]]"));
    }
}