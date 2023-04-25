package testngframework;

import org.testng.annotations.*;

public class TestngAnnotationsDemoTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }

    @BeforeTest(groups = "regression")
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest(groups = "regression")
    public void afterTest() {
        System.out.println("AfterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("***************");
        System.out.println("AfterClass");
    }

    @BeforeMethod(groups = "regression")
    public void beforeMethod() {
        System.out.println("**************");
        System.out.println("BeforeMethod");
    }

    @Test(groups = "smoke")
    public void m1() {
        System.out.println("Test1-m1()");
    }

    @Test(groups = "smoke")
    public void m2() {
        System.out.println("Test2-m2()");
    }

    @Test(groups = "regression")
    public void m3() {
        System.out.println("Test3-m3()");
    }

    @Test(groups = "regression")
    public void m4() {
        System.out.println("Test3-m4()");
    }

    @AfterMethod(groups = "regression")
    public void afterMethod() {
        System.out.println("AfterMethod");
    }
}

