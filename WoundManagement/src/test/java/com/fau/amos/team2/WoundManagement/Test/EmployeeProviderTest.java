package com.fau.amos.team2.WoundManagement.Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;

public class EmployeeProviderTest extends ProviderUnitTest {

	private EmployeeProvider sut;
	
	private static Employee[] employees;
	private static String[] abb;
	private static String[] pwd;
	
	@BeforeClass
	protected static void ClassInit() { 
		abb = new String[] {
				"user1",
				"user2",
				"user3"
		};
		pwd = new String[] {
				"pwd1",
				"pwd2",
				"pwd3"
		};
		
		employees = new Employee[] {
			new Employee(),
			new Employee(),
			new Employee()
		};
		
		for(int i = 0; i < employees.length; ++i) {
			employees[i].setAbbreviation(abb[i]);
			employees[i].setPdaCode(pwd[i]);			
		}
	}
	
	@Before
	private void TestInit() {
		sut = EmployeeProvider.getInstance();
		sut.add(employees[0]);
		sut.add(employees[1]);
	}
	
	@After
	private void TestCleanup() {
		sut.deleteAll();
	}
	
	@Test
	public final void testGetInstanceTwiceIsNotNull() {
		// Act
		sut = EmployeeProvider.getInstance();
		sut = null;
		sut = EmployeeProvider.getInstance();
		// Assert
		Assert.assertNotNull("getInstance returned no object", sut);
	}

	@Test
	public final void testAddSize() {
		// Arrange
		Employee e = employees[0];
		// Act
		sut.add(e);
		int actual = sut.getAllItems().size();
		// Assert
		Assert.assertEquals(1, actual);
	}
	

	@Test
	public final void testAddSizeEmpty() {
		// Arrange
		
		// Act
		int actual = sut.getAllItems().size();
		// Assert
		Assert.assertEquals(0, actual);
	}

	@Test
	public final void testGetAllItems() {
		// Arrange
		Employee expected = employees[0];
		sut.add(expected);
		// Act
		Employee actual = sut.getAllItems().get(0);
		// Assert
		Assert.assertNotNull("getByID return null",actual);
		Assert.assertEquals("Wrong id employee",expected, actual);
	}
	
	@Test
	public final void testGetEmployeeByUsernameAndPassword()
	{
		// Arrange
		Employee expected = employees[0];
				
		// Act
		Employee actual = sut.getEmployeeByUsernameAndPassword(abb[0], pwd[0]);
	
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void testGetEmployeeByUsernameAndPasswordReturnsNullOnMissingEmployee()
	{
		// Arrange
		Employee expected = null;
				
		// Act
		Employee actual = sut.getEmployeeByUsernameAndPassword(abb[2], pwd[2]);
	
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void testGetEmployeeByUsername()
	{
		// Arrange
		Employee expected = employees[0];
				
		// Act
		Employee actual = sut.getEmployeeByUsername(abb[0]);
	
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void testGetEmployeeByUsernameReturnsNullOnMissingEmployee()
	{
		// Arrange
		Employee expected = null;
				
		// Act
		Employee actual = sut.getEmployeeByUsername(abb[2]);
	
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void testDeleteAll()
	{
		// Arrange
		Assert.assertNotSame(0, sut.getAllItems().size());		
		
		// Act
		sut.deleteAll();
	
		// Assert
		Assert.assertEquals(0, sut.getAllItems().size());
	}
}
