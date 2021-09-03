package org.junitdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tes {
@Test
	public void test1(){
		System.out.println("test1-@test");
		 
	}
	
@Before
	public void test2() {
		System.out.println("test2-@Before");	
	}
  @After
  public void test3() {
	  System.out.println("test3-@After");
  }
  @AfterClass
  public static void test4() {
	  System.out.println("test4-@AfterClass");
  }
  @BeforeClass
  public static void test5() {
	  System.out.println("test5-@BeforeClass");
	  
  }
  @Test
  public void test6() {
	  System.out.println("test6-@test");
  }
}
