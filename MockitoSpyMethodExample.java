package com.niit.mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;

class MockitoSpyMethodExample {
	
	@Spy
	List<String> spyOnList ;
	
	@Test
	public void test()
	{
		List<String> list = new ArrayList<>();
		spyOnList = spy(list);
		
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10, spyOnList.size());
		
		//calling real methods since below methods are not stubbed
		spyOnList.add("Pankaj");
		spyOnList.add("neeti");
		assertEquals("Pankaj", spyOnList.get(0));
		assertEquals("neeti", spyOnList.get(1));
		
		System.out.println(spyOnList.get(0));
		System.out.println(spyOnList.get(1));
	}

}
