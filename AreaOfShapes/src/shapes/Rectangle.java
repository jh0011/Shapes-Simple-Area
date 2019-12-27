package shapes;

public class Rectangle implements Shape{
	
	double length;
	double breadth;
	
	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public double getBreadth() {
		// TODO Auto-generated method stub
		return breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2 * length) + (2 * breadth);
	}

	@Override
	public void setBreadth(double breadth) {
		// TODO Auto-generated method stub
		this.breadth = breadth;
	}

	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
		this.length = length;
	}

	@Override
	public void qnsLength() {
		// TODO Auto-generated method stub
		System.out.println("Input length of rectangle: ");
	}

	@Override
	public void qnsBreadth() {
		// TODO Auto-generated method stub
		System.out.println("Input breadth of the rectangle: ");
	}


}
