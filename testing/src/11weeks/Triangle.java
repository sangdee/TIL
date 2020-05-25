/**
 * Triangle. The main function takes 3 positive whole-number lengths
 * to be typed in as command line arguments. The program responds
 * with a description of the triangle, as follows:
 *
 * <ul>
 *  <li><b>equilateral</b> - if all three sides have equal length
 *  <li><b>isosceles</b> - if two sides have equal length
 *  <li><b>right-angled</b> - if one angle is a right angle
 *  <li><b>scalene</b> - all sides different lengths, no right angles
 *  <li><b>impossible</b> - if the given side lengths do not form a triangle
 * </ul>
 * Area and perimeter of the triangle are calculated, too.
 *
 * @author Mikko Rusama, SoberIT
 * @version 26.8.2004
 */
public class Triangle
{
	private int side1, side2, side3;
	private static final String P_EQUILATERAL = "equilateral";
	private static final String P_ISOSCELES   = "isossceles";
	private static final String P_RIGHTANGLED = "right-angled";
	private static final String P_SCALENE     = "scalene";
	private static final String P_IMPOSSIBLE  = "impossible";

	/**
	 * Constuctor (without error checking)
	 * @param s1 length of the side1 as an integer.
	 * @param s2 length of the side2 as an integer.
	 * @param s3 length of the side3 as an integer.
	 */
	public Triangle(int s1, int s2, int s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	/**
	 * Sets the lenghts of the sides of this triangle.
	 * @param s1 length of the side1
	 * @param s2 length of the side2
	 * @param s3 length of the side3
	 * @return a reference to this triangle.
	 */
	public Triangle setSideLengths(int s1, int s2, int s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
		return this;
	}

	/**
	 * Gets the side lenghts.
	 * @return a comma separated list of side lengths
	 */
	public String getSideLengths()
	{
		return side1 + "," + side2 + "," + side3;
	}

	/**
	 * Gets the perimeter of the triangle.
	 * @return -1 if input values are invalid, otherwise the perimeter.
	 */
	public int getPerimeter()
	{  
		return side1 + side2 + side3;
	}

	/**
	 * Gets the area of the triangle.
	 * @return area of the triangle, -1.0 if triangle is impossible.
	 */
	public double getArea()
	{
		if (!isImpossible())
		{
			return Math.sqrt(getPerimeter()
			/ 2
			* (getPerimeter() / 2 - side1)
			* (getPerimeter() / 2 - side2)
			* (getPerimeter() / 2 - side3));
		}
		return -1;
	}

	/**
	 * Classifies the triangle. Possible types, returned as a string, are:
	 * <ul>
	 *  <li>equilateral - if all three sides have equal length
	 *  <li>isosceles - if two sides have equal length
	 *  <li>right-angled - if one angle is a right angle
	 *  <li>scalene - all sides different lengths, no right angles
	 *  <li>impossible - if the lengths can't form a triangle
	 * </ul>
	 * @return type of the triangle as a string.
	 */
	public String classify()
	{
		if (isImpossible())
		{
			return P_IMPOSSIBLE;
		}

		if (side1 == side2)
		{
			if (side2 == side3)
			{
				return P_EQUILATERAL;
			}
			else
			{
				return P_ISOSCELES;
			}
		}

		if (isRightAngled())
		{
			return P_RIGHTANGLED;
		}

		return P_SCALENE;
	}

	
	/**
	 * Checks if the triangle is right-angled. Note: right-angled triangle may
	 * also be isosceles.
	 * @return true if one angle is a right angle, otherwise false.
	 */
	public boolean isRightAngled()
	{
		int[] sides = new int[] { side1, side2, side3 };

		return sides[2]
			== Math.sqrt((long) sides[0] * sides[0] + (long) sides[1] * sides[1]);
	}

	
	/**
	 * Checks whether the given side lengths form a
	 * valid triangle.
	 * @return true if the given side lenghts do not form a triangle.
	 */
	public boolean isImpossible()
	{
		if (side1 <= 0 || side2 <= 0 || side3 <= 0)
		{
			return true;
		}
		return false;
	}

	/**
	 * Usage: java Quadrangle &lt;side1:int&gt; &lt;side2:int&gt; &lt;side3:int&gt;
	 * <p>Main method is only used for testing purposes, no unit tests need to
	 * be written for this method.</p>
	 */
	public static void main(String[] args)
	{
		Triangle triangle = null;
		try
		{
			triangle = new Triangle(
					Integer.parseInt(args[0]),
					Integer.parseInt(args[1]),
					Integer.parseInt(args[2]));
		}
		catch (Exception e)
		{
			System.out.println(
				"Usage: java Quadrangle <side1:int> <side2:int> <side3:int>");
			return;
		}
		System.out.println("Type: " + triangle.classify());
		System.out.println("Triangle sides: " + triangle.getSideLengths());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
	}

} // End of class.