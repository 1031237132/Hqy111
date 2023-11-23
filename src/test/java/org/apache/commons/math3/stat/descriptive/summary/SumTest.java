package org.apache.commons.math3.stat.descriptive.summary;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
    public static void main(String[] args){
        Sum s = new Sum();
        s.increment(1);
        System.out.println(s.getN());

        Sum a = new Sum();
        a.increment(2);
        System.out.println(a.getResult());

        Sum b = new Sum();
        b.increment(5);
        b.increment(2);
        System.out.println(b.getN());
        System.out.println(b.getResult());
    }
    Sum s;
    @Before
    public void setUp() throws Exception {
        s = new Sum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void increment() {
        s.increment(1);
        assertEquals(1,s.getN());
    }
}
