package shapes;

public class Square extends Quadrilateral {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;

	}

	public int getArea(){
		return (int) (Math.pow(this.side, 2));
	};

	public int getPerimeter(){
		return (4 * this.side);
	};

	@Override
	public void setLength(int length) {
		this.length = length;
		this.width = length;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
		this.length = width;
	}


}



