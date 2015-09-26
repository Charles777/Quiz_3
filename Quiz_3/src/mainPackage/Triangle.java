package mainPackage;
import java.lang.Math;

public class Triangle extends GeometricObject 
{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	
	/**
	 * The base constructor, creates a triangle with all 3 sides of length 1.
	 */
	public Triangle() 
	{
		super();
	}

	/**
	 * Constructor that allows the setting of color and fill status, and sets all sides to length 1.
	 * @param color
	 * @param filled
	 */
	public Triangle(String color, boolean filled) 
	{
		
		super(color, filled);
		
	}
	
	/**
	 * Most complex constructor, allows the setting of all three sides to desired length, as well as color and fill status.
	 * @param s1
	 * @param s2
	 * @param s3
	 * @param color
	 * @param filled
	 */
	public Triangle(double s1, double s2, double s3, String color, boolean filled) 
	{
		
		super(color, filled);
		
		side1 = s1;
		side2 = s2;
		side3 = s3;
		
	}
	
	/**
	 * Creates a triangle with the inputed side lengths.
	 * @param s1
	 * @param s2
	 * @param s3
	 */
	public Triangle(double s1, double s2, double s3) 
	{
		super();
		
		side1 = s1;
		side2 = s2;
		side3 = s3;
		
	}

	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * @param side1 the side1 to set
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * @param side2 the side2 to set
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * @param side3 the side3 to set
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/** 
	 * Calculates and returns the area of the triangle
	 * @return Area
	 */
	@Override
	public double getArea() 
	{
		double p = (this.side1 + this.side2 + this.side3)/2.0;
		double x = (p) * (p - side1) * (p - side2) * (p - side3);
		double Area = Math.pow(x, 0.5);
		return Area;
	}

	/** 
	 * Calculates and returns the perimeter of the triangle
	 * @return Perimeter
	 */
	@Override
	public double getPerimeter() 
	{
		double Perimeter = this.side1 + this.side2 + this.side3;
		return Perimeter;
	}
	
	/**
	 * Returns a description of the triangle as a String
	 * @return Description
	 */
	@Override
	public String toString()
	{
		String s1 = ("Side 1: " + this.side1);
		String s2 = ("\nSide 2: " + this.side2);
		String s3 = ("\nSide 3: " + this.side3);
		String area = ("\nArea: " + this.getArea());
		String peri = ("\nPerimeter: " + this.getPerimeter());
		String color = ("\nColor: " + this.getColor());
		String fill = ("\nFilled: " + this.isFilled());
		String dc = ("\nDate Create: " + this.getDateCreated());
		
		return (s1 + s2 + s3 + area + peri + color + fill + dc);		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}










