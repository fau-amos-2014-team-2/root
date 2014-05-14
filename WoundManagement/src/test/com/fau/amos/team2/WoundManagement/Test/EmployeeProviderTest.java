package com.fau.amos.team2.WoundManagement.Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fau.amos.team2.WoundManagement.Employee;
import com.fau.amos.team2.WoundManagement.EmployeeProvider;

public class EmployeeProviderTest {

	private EmployeeProvider sut;
	
	@Before
	public void TestInit() {
		sut = EmployeeProvider.getInstance();
	}
	
	@After
	public void TestCleanup() {
		sut = null;
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
	public final void testAdd() {
		// Arrange
		Employee e = new Employee();
		// Act
		Object actual = sut.add(e);
		// Assert
		Assert.assertNotNull("add returned null", actual);
	}

	@Test
	public final void testGetAllEmptyReturnsZero() {
		// Arrange
		int expected = 0;
		// Act
		int actual = sut.getAll().size();
		// Assert
		Assert.assertEquals("Empty container expected",expected, actual);
	}
	
	@Test
	public final void testGetAllOneAddReturnsOne() {
		// Arrange
		Employee e = new Employee();
		sut.add(e);
		int expected = 1;
		// Act
		int actual = sut.getAll().size();
		// Assert
		Assert.assertEquals("One element in container expected",expected, actual);
	}

	@Test
	public final void testGetByID() {
		// Arrange
		Employee expected = new Employee();
		Object id = sut.add(expected);
		// Act
		Employee actual = sut.getByID(id);
		// Assert
		Assert.assertNotNull("getByID return null",actual);
		Assert.assertEquals("Wrong id employee",expected, actual);
	}

	@Test
	public final void testGetByFirstName() {
		// Arrange
		Employee expected = new Employee();
		sut.add(expected);
		// Act
		Employee actual = sut.getByFirstName(expected.getFirstName());
		// Assert
		Assert.assertNotNull("getByID return null",actual);
		Assert.assertEquals("Wrong id employee",expected, actual);
	}
	
	@Test
	public final void testGetByFirstNameNameDoesntExistReturnsNull() {
		// Arrange
		Employee e = new Employee();
		e.setFirstName("firstname");
		sut.add(e);
		// Act
		Employee actual = sut.getByFirstName("Not existent");
		// Assert
		Assert.assertNull("Null expected",actual);
	}

}
