import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project: HappyProgramming
 * FileName: CalculatorTest
 * Date: 2015-09-21
 * Time: 오후 11:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 60);
        assertEquals(70, result, 0);

    }

}
