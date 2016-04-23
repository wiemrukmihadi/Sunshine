package com.example.pro13.sunshine.app.data;

import android.test.AndroidTestCase;

/**
 * Created by Pro13 on 4/16/16.
 */
public class PracticeTest extends AndroidTestCase{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testThatDemonstationAssertions() throws Throwable{
        int a = 5;
        int b = 3;
        int c = 5;
        int d = 10;

        assertEquals("X should be equal", a, c);
        assertTrue("Y should be true", d > a);
        assertFalse("Z should be false"     ,a == b);

    }
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void normolizedDateTest() throws Throwable{
//        Time time = new Time();
//        time.set(startDate);
//        int julianDay = Time.getJulianDay(startDate, time.gmtoff);
//        return time.setJulianDay(julianDay);

    }
}
