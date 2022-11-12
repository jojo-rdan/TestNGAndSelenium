package org.globant;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationTests {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Running before class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Running before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Running after test");
    }
    @BeforeMethod
    public void before(){
        System.out.println("Login in the app");
    }
    @AfterMethod
    public void after(){
        System.out.println("Login out the app");
    }
    @Test
    @Parameters({"stringA", "stringB"})
    public void testConcat(String a, String b){
        String result = a + b;
        Assert.assertEquals(result, "I love test automation");
    }
    @Test
    public void testCount(){
        String a = "I love";
        Assert.assertEquals(a.length(), 6);
    }
}
