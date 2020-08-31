package MyShape;
     public class Square implements MyShape{

	double b;
        @Override
	public double Area(double b){
		this.b=b;

		return b*b;
	}
        @Override
	public double boundaryLength(double b){
		this.b=b;

		return 4*b;
	}
     }