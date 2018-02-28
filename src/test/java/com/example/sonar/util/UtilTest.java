package com.example.sonar.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collections;

/**
 * Unit test for simple App.
 */
public class UtilTest extends TestCase {

    private static final String HI = "Hi!";

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UtilTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(UtilTest.class);
    }

    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Util> constructor = Util.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    public void testNullIsEmpty() {
        assertTrue(Util.isEmpty(null));
    }

    public void testArrayIsEmpty() {
        assertTrue(Util.isEmpty(new String[]{}));
    }

    public void testMapIsEmpty() {
        assertTrue(Util.isEmpty(Collections.emptyMap()));
    }

    public void testListIsEmpty() {
        assertTrue(Util.isEmpty(Collections.emptyList()));
    }

    public void testObjectIsNotEmpty() {
        assertTrue(Util.isNotEmpty(new Object()));
    }

    public void testArrayIsNotEmpty() {
        assertTrue(Util.isNotEmpty(new String[]{HI}));
    }

    public void testMapIsNotEmpty() {
        assertTrue(Util.isNotEmpty(Collections.singletonMap(HI, HI)));
    }

    public void testListIsNotEmpty() {
        assertTrue(Util.isNotEmpty(Collections.singletonList(HI)));
    }
}
