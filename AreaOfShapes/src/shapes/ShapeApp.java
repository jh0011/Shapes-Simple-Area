package shapes;
import java.util.Scanner;

public class ShapeApp {
	
	public static void main(String[] args){
		Shape rect1 = new Rectangle();
		Shape sq1 = new Square();
		Shape cir1 = new Circle();
		
		//rectangle
		rect1.setLength(getLength(rect1));
		rect1.setBreadth(getBreadth(rect1));
		
		//square
		sq1.setLength(getLength(sq1));
		sq1.setBreadth(getBreadth(sq1));
		
		//circle
		cir1.setLength(getLength(cir1));
		cir1.setBreadth(getBreadth(cir1));
		
		//area
		System.out.println("Area of rectangle is: " + rect1.getArea());
		System.out.println("Area of square is: " + sq1.getArea());
		System.out.println("Area of circle is: " + cir1.getArea());
		
		//perimeter
		System.out.println("Perimeter of rectangle is: " + rect1.getPerimeter());
		System.out.println("Perimeter of square is: " + sq1.getPerimeter());
		System.out.println("Perimeter of circle is: " + cir1.getPerimeter());
	}
	
	public static double getLength(Shape myShape){
		myShape.qnsLength();
		Scanner sc1 = new Scanner(System.in);
		int length = sc1.nextInt();
		return length;
	}
	
	public static double getBreadth(Shape myShape){
		myShape.qnsBreadth();
		Scanner sc1 = new Scanner(System.in);
		int breadth = sc1.nextInt();
		return breadth;
	}
	

}
