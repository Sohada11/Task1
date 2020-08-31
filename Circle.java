package MyShape;
 public class Circle implements MyShape{

	double c;
        @Override
	public double Area(double c){
		this.c=c;

		return 3.142*c*c;
	}
        @Override
	public double boundaryLength(double c){
		this.c=c;

		return 2*3.142*c;	
	}
    }
