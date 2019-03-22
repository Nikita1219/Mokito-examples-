package com.niit.mockito;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class MockitoHelloWorld1 {
	
	private Demo d;
	
	@Before
	public void setupMock() 
	{
		d = mock(Demo.class);
		when(d.greet()).thenReturn("HELLO_WORLD");
	}
	
	@Test 
	public void fooGreets() 
	{
		System.out.println("Foo greets :" + d.greet());
		assertEquals("HELLO_WORLD", d.greet());	
	}
	
	@Test 
	public void barGreets() 
	{
		Bar bar = new Bar();
		assertEquals("HELLO_WORLD", bar.greet(d));	
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
}
