package com;

import org.junit.Test;
import com.Producer;

import static org.junit.Assert.*;

public class BaseTest {
    @Test public void testSomeLibraryMethod() {
        Producer classUnderTest = new Producer();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
