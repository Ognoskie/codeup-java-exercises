package shapes;

public class ShapesTest {
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(5, 8);
		int area =  box1.getArea();
		int perimeter = box1.getPerimeter();
		System.out.println(area);
		System.out.println(perimeter);
	}
}
