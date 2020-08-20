package shapes;

public class Circle implements Shape{

	double length;
	double breadth = 0; //adding a new random comment
	
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
	public double getArea() {
		// TODO Auto-generated method stub
		double radius = length / 2;
		return (Math.PI * radius * radius);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (Math.PI * length);
	}

	@Override
	public void qnsLength() {
		// TODO Auto-generated method stub
		System.out.println("Input length of the circle: ");
	}

	@Override
	public void qnsBreadth() {
		// TODO Auto-generated method stub
		System.out.println("Input breadth of the circle: ");
	}
	
}
