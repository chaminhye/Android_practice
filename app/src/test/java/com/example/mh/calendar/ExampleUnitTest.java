package com.example.mh.calendar;

import android.app.Application;
import android.test.ApplicationTestCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest extends ApplicationTestCase<Application>{
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    public ExampleUnitTest() {
        super(Application.class);
    }
}