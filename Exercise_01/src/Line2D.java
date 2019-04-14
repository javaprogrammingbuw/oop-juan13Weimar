import java.math.*;
public class Line2D {
	// Attributes
	private Point2D start;
	private Point2D end;
	
	// Constructor
	public Line2D(Point2D start, Point2D end) {
		this.start = start;
		this.end = end;
	}

	
	
	// Methods
	public double getLength() {

		return (Math.sqrt(Math.pow((this.end.getX() - this.start.getX()), 2) + 
				Math.pow((this.end.getY() - this.start.getY()), 2)));
	}
	
	// Get and Set
	public Point2D getstart() {
		return start;
	}
	public void setstart(Point2D start) {
		this.start = start;
	}

	public Point2D getend() {
		return end;
	}

	public void setend(Point2D end) {
		this.end = end;
	}
}
