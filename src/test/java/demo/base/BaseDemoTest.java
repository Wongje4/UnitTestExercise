package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_90() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 90;

        assertEquals(expected, baseDemo.sum(40, 50));
    }

    @Test
    public void should_return_100() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 100;

        assertEquals(expected, baseDemo.sum(120, -20));
    }
}
