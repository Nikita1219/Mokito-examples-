package com.niit.mockito;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoHelloWorld {
	
	@Test
	public void demoGreets()
	{
		Demo d = mock(Demo.class); //create mock demo object to check the implementation of the method which is not there 
		when(d.greet()).thenReturn("HELLO_WORLD"); //adding behaviour
		System.out.println("Demo greets :" + d.greet()); // verfifying 
		assertEquals(d.greet(), "HELLO_WORLD");
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
}
