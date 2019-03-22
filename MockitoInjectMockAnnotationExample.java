package com.niit.mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoInjectMockAnnotationExample {
	
	@Mock
	List<String> mockList;
	
	@InjectMocks
	Fruits mockFruits;
	
	@Before
	public void setup()
	{
		//if we dont call below , we will get null pointer exception
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test()
	{
		when(mockList.get(0)).thenReturn("Apple");
		when(mockList.size()).thenReturn(1);
		assertEquals("Apple", mockList.get(0));
		assertEquals(1, mockList.size());
		
		//mockFruits names is using mockList , below assert confirm it
		assertEquals("Apple", mockFruits.getNames().get(0));
		assertEquals(1, mockFruits.getNames().size());
		
		mockList.add(1,"Mango");
		//below will print null because mockList.get(1) is not stubbed(an obj with an predefined value)
		System.out.println(mockList.get(1));
	}
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/

}
