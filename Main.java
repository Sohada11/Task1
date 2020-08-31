package MyShape;
import java.lang.Math;
import java.util.Scanner;
public class Main{
	
	public static void main(String args[]){
            Scanner s = new Scanner(System.in);

            System.out.println("Click 0 for Square Shape: ");
            System.out.println("Click 1 for Circle Shape: ");
            System.out.println("Click 2 for Triangle Shape: ");
            System.out.print("The desired no. is: ");
            long x = s.nextInt();
            Square m = new Square();
            Circle n = new Circle();
            Triangle o = new Triangle();
            
            if(x==0){
		System.out.println("You have chosen the Square shape: ");
		System.out.print("Please enter the length: ");
		double Square = s.nextDouble();

		System.out.println("Area of Square shape: " +m.Area(Square));
		System.out.println("Boundary length of the square is: " +m.boundaryLength(Square));
		}



	else if(x==1){
		System.out.println("You have chosen the Circle shape: ");
		System.out.print("Please enter the radius: ");
		double circle = s.nextDouble();

		System.out.println("Area of circle shape is: " +n.Area(circle));
		System.out.println("Boundary length of circle is: " +n.boundaryLength(circle));
		}



	else if(x==2){
		System.out.println("You have chosen the Triangle shape");
		System.out.print("Please enter the side of triangle: ");
		double triangle = s.nextDouble();
                
		System.out.println("Area of the Triangle is : " +o.Area(triangle));
		System.out.println("Boundary length of the Triangle is : " +o.boundaryLength(triangle));	
		}

	}
        }

        
     