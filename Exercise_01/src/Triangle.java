
public class Triangle implements iForm{
	// Attributes
	private Line2D a;
	private Line2D b;
	private Line2D c;
	
	// Constructor
	public Triangle(Line2D line1, Line2D line2, Line2D line3) {
		this.a = line1;
		this.b = line2;
		this.c = line3;
	}
	
	// Methods
	public void isValid() {
		
		if(this.a.getstart().getX() == this.c.getend().getX() && 
				this.a.getstart().getY() == this.c.getend().getY() &&
				this.b.getstart().getX() == this.a.getend().getX() &&
				this.b.getstart().getY() == this.a.getend().getY() &&
				this.c.getstart().getX() == this.b.getend().getX() &&
				this.c.getstart().getY() == this.b.getend().getY()) {
			System.out.println("It is valid");
		}
		else {
			System.out.println("It is not valid");
		}
	}

	@Override
	public void area() {
		double alpha = Math.acos( (0.5 *Math.pow(this.a.getLength(), 2)-
									0.5*Math.pow(this.b.getLength(), 2)+
									0.5*Math.pow(this.c.getLength(), 2) ) /
									(this.b.getLength()*this.c.getLength()) );
		
		double beta = Math.acos( (0.5 *Math.pow(this.a.getLength(), 2)-
									0.5*Math.pow(this.b.getLength(), 2)+
									0.5*Math.pow(this.c.getLength(), 2) ) /
									(this.a.getLength()*this.c.getLength()) );
		
		double lambda = -beta -alpha + 180;
		
		double h = this.b.getLength() * Math.sin(lambda);  // It should be 5, not 5.38
		System.out.println("Triangle height = "+h);
		
		double area = h * this.a.getLength() / 2;
		System.out.println("Area = "+ area);
	}

	@Override
	public void circunference() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
