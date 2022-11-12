package org.globant;

import org.testng.annotations.Test;

public class GroupAndSuites {
    @Test(groups = {"group1"})
    public void testConcact(){
        System.out.println("test 1");
    }
    @Test(groups = {"group2", "group3"})
    public void testCount(){
        System.out.println("test 2");
    }
    @Test(groups = {"group3"})
    public void testConcact2(){
        System.out.println("test 3");
    }
    @Test(groups = {"group1"})
    public void testCount2(){
        System.out.println("test 4");
    }
}
