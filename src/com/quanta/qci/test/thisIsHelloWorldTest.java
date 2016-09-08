package com.quanta.qci.test;
import static org.junit.Assert.*;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.quanta.qci.thisIsHelloWorld;

import org.junit.Assert;

public class thisIsHelloWorldTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//啟動測試的前置
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//完成測試的後置
	}
	@Before
	public void setUp() throws Exception {
		//每一個test case 前執行
	}
	@After
	public void tearDown() throws Exception {
		//每一個test case 後執行
	}
	@Test
	public void helloTest1() {
		thisIsHelloWorld tis = new thisIsHelloWorld();
		Assert.assertEquals(tis.Hello1(), "Hello World");
	}
	@Test
	public void helloTest2() {
		thisIsHelloWorld tis = new thisIsHelloWorld();
		Assert.assertEquals(tis.HelloName(), "Hello World Shyang");
	}
	@Test
	public void helloTest3() {
		thisIsHelloWorld tis = new thisIsHelloWorld();
		Assert.assertEquals(tis.HelloName("Penny"), "Hello World Penny");
	}
}