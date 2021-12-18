public class Rectangle {
	public static void main(String args[]) {
		// variable length that stores length of rectangle
		int length = 5;
		// variable breadth that stores breadth of rectangle
		int breadth = 10;
		// formula to calculate area of rectangle:area=length+breadth
		int area = length + breadth;
		// print rectangle area
		System.out.println("Area of rectangle is=" + area);
		// Calculate the 'perimeter' using the formula
		int perimeter = 2 * (length + breadth);
		// print rectangle perimeter
		System.out.print("Perimeter of a rectangle is : " + perimeter);
	}
}