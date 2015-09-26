package mainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTests 
{
	Triangle tri;
	
	@Before
	public void setUp() throws Exception 
	{
		tri = new Triangle(2,3,4);
	}

	@After
	public void tearDown() throws Exception 
	{
		tri = null;
	}

	@Test
	public void testArea() throws Exception 
	{
		assertEquals("Area calculations failed", (long)tri.getArea(), (long)2.90473751);
		System.out.println(tri.toString());	
		
	}
	
	public void testPerimeter() throws Exception 
	{
		assertEquals("Perimeter calculations failed", (long)tri.getPerimeter(), (long)9);
		System.out.println(tri.toString());	
		
	}

}
