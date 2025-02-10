package assignment;
import java.util.Scanner;
class Rectangle{
	int height;
	int width;
	int Area;
	int Perimeter;
	

Rectangle(int height ,int width){
	this.height=height;
	this.width=width;
	
}
void display() {
	Area =height * width;
	Perimeter = 2* (width +height );
	System.out.println("Area of Rectangle : "+ Area);
	System.out.println("Perimeter of Rectangle : "+ Perimeter);

}
}
public class rectangleAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a width value ");
		int width = sc.nextInt();
		System.out.println("Enter a height value ");
		int height = sc.nextInt();
		Rectangle Rec = new Rectangle(width , height) ;
		Rec.display();
		sc.close();
		
		

	}

}
