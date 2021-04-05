package assignmentset5;

public class Triangle {
	private Point point1;
	private Point point2;
	private Point point3;
	
	Triangle(){
		Point point1 = new Point(0,0);
		Point point2 = new Point(1,1);
		Point point3 = new Point(2,5);
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate){
		Point point1 = new Point(point1XCoordinate, point1YCoordinate);
		Point point2 = new Point(point2XCoordinate, point2YCoordinate);
		Point point3 = new Point(point3XCoordinate, point3YCoordinate);
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	Triangle(Point point1, Point point2, Point point3){
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	public double calculatePerimeter(){
		double d1 = point1.calculateDistance(point3);
		double d2 = point2.calculateDistance(point1);
		double d3 = point3.calculateDistance(point2);
		
		return d1+d2+d3;
	}
	
	public double calculateArea(){
		double d1 = point1.calculateDistance(point3);
		double d2 = point2.calculateDistance(point1);
		double d3 = point3.calculateDistance(point2);
		
		double s = (d1+d2+d3)/2;
		double d = s*(s-d1)*(s-d2)*(s-d3);
		double area = Math.sqrt(d);
		return Math.round(area*100.0)/100.0;
	}
	
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
		
		Point point1 = new Point(2, 1);
		Point point2 = new Point(4, 4);
		Point point3 = new Point(9, 1);
		Triangle triangle3 = new Triangle(point1, point2, point3);		
		
		System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
		System.out.println("Area of triangle1 is "+triangle1.calculateArea());
		
		System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
		System.out.println("Area of triangle2 is "+triangle2.calculateArea());
		
		System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
		System.out.println("Area of triangle3 is "+triangle3.calculateArea());
		

	}

}
