
public class Rectangle implements iForm{
	// Attributes
	private Line2D height;
	private Line2D width;
	
	// Constructor
	public Rectangle(Line2D height, Line2D width) {
		this.setHeight(height);
		this.setWidth(width);
	}

	// Get and Set
	public Line2D getHeight() {
		return height;
	}
	public void setHeight(Line2D height) {
		this.height = height;
	}
	public Line2D getWidth() {
		return width;
	}
	public void setWidth(Line2D width) {
		this.width = width;
	}

	@Override
	public void area() {
		double area = this.height.getLength()*this.width.getLength();
		System.out.println("Area = " + area);
	}

	@Override
	public void circunference() {
		// TODO Auto-generated method stub
		
	}
}
