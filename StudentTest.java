package com.niit.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentTest {
	
	@Mock
	StudentDAO studentDAO;
	
	@Test
	public void testGetDetails001() throws Exception
	{
		String rollNo ="111";
		Student student = new Student();
		student.setRollNo("111");
		when(studentDAO.getStudentDetails(rollNo)).thenReturn(student);
		StudentCheck studentCheck = new StudentCheck();
		//studentCheck.setStudDAO(studentDAO);
		Student stud = studentCheck.getDetails(rollNo);
		assertEquals("111",stud.getRollNo());
	}


}
