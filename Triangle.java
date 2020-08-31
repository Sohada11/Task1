package MyShape;
public class Triangle implements MyShape{

	double a;
        @Override
	public double Area(double a){
		this.a=a;

		return ((Math.sqrt(3))/2)*a*a;
	}
        @Override
	public double boundaryLength(double a){
		this.a=a;

		return 3*a;	
	}
    }
