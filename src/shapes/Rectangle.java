package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
	public Rectangle(int length, int width) {
		super(length, width);
	}

	@Override
	public int getPerimeter() {
		return (this.length * 2) + (this.width * 2);
	}

	@Override
	public int getArea() {
		return this.length * this.width;
	}

	@Override
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

//	protected int length;
//
//	protected int width;
//
//	public Rectangle(int length, int width) {
//		this.length = length;
//		this.width = width;
//	}
//
//	public int getArea() {
//		return this.length * this.width;
//	}
//
//	public int getPerimeter() {
//		return (2 * this.length) + (2 * this.width);
//	}
//
//	public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public static void main(String[] args) {
//		Rectangle r = new Rectangle (8, 9);
//		int area = r.getArea();
//		System.out.println(area);
//	}
}
