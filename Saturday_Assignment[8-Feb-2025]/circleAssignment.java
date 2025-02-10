package assignment;

class Circle {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	double getArea() {
		return Math.PI * radius * radius;
	}

	double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public class circleAssignment {
		public static void main(String[] args) {

			Circle circle = new Circle(7.0);

			System.out.println("Area: " + circle.getArea());
			System.out.println("Circumference: " + circle.getCircumference());
		}
	}
}


