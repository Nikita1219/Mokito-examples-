package com.niit.mockito;

import static org.junit.Assert.*;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
	
	// @InjectMock annotation is used to create and inject  the mock object (injecting value at runtime ) 
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	//@mock annotation is used to create the object to be injected 
	@Mock
	CalculatorService calcService; // object of interface 
	
	@Test
	public void testAdd()
	{
		// add behaviour of calc service to add two numbers 
		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
		// test the add functionality
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.00);
		// Verify the behaviour
		verify(calcService).add(10.0,20.0);
	}
	
}
