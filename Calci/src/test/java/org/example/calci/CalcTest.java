package org.example.calci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void addPositiveNumbers(){
        var calci =new Calculator();
        assertEquals(5,calci.add(3,2));
        assertEquals(143,calci.add(12,131));

    }

    @Test
    void addZero(){
        var calci =new Calculator();
        assertEquals(0,calci.add(0,0));
    }

    @Test
    void addNegativePositiveNumbers(){
        var calci =new Calculator();
        assertEquals(5,calci.add(-3,8));
        assertEquals(-1,calci.add(-6,5));
        assertEquals(22,calci.add(44,-22));
        assertEquals(-34,calci.add(-16,-18));
    }

    @Test
    void addNegativeNumbers(){
        var calci =new Calculator();
        assertEquals(-34,calci.add(-16,-18));
    }
}