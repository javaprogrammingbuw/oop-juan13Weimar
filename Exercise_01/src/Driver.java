import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		//******RECTANGLE******
		System.out.println("Provide two lines to create a rectangle:");
		//System.out.println("Line 1, point 1, input x (enter) and y (enter):");
		int p1L1x = 0;
		int p1L1y = 0;
		//int p1L1x = scan.nextInt();
		//int p1L1y = scan.nextInt();
		//System.out.println("Line 1, point 2, input x (enter) and y (enter):");
		int p2L1x = 4;
		int p2L1y = 0;
		//int p2L1x= scan.nextInt();
		//int p2L1y = scan.nextInt();
		//System.out.println("Line 2, point 1, input x (enter) and y (enter):");
		int p1L2x = 0;
		int p1L2y = 0;
		//int p1L2x = scan.nextInt();
		//int p1L2y = scan.nextInt();
		//System.out.println("Line 2, point 2, input x (enter) and y (enter):");
		int p2L2x = 0;
		int p2L2y = 5;
		//int p2L2x = scan.nextInt();
		//int p2L2y = scan.nextInt();
		
		Point2D p1L1 = new Point2D(p1L1x, p1L1y);
		Point2D p2L1 = new Point2D(p2L1x, p2L1y);
		Point2D p1L2 = new Point2D(p1L2x, p1L2y);
		Point2D p2L2 = new Point2D(p2L2x, p2L2y);
		
		Line2D L1 = new Line2D(p1L1, p2L1);
		Line2D L2 = new Line2D(p1L2, p2L2);
		
		System.out.println("Height = " + L1.getLength());
		System.out.println("Width = " + L2.getLength());
		
		Rectangle rect = new Rectangle(L1, L2);
		rect.area();
		
		//*******TRIANGLE*********
		System.out.println("Now provide three lines to create a triangle:");
		
		Point2D tp1L1 = new Point2D(0, 0);
		Point2D tp2L1 = new Point2D(4, 0);
		Point2D tp1L2 = new Point2D(4, 0);
		Point2D tp2L2 = new Point2D(2, 5);
		Point2D tp1L3 = new Point2D(2, 5);
		Point2D tp2L3 = new Point2D(0, 0);
		
		Line2D tL1 = new Line2D(tp1L1, tp2L1);
		Line2D tL2 = new Line2D(tp1L2, tp2L2);
		Line2D tL3 = new Line2D(tp1L3, tp2L3);
		
		Triangle triangle = new Triangle(tL1,tL2,tL3);
		
		triangle.isValid();
		triangle.area();
		
	}

}
