package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		super.setWidth(2);
		this.side = side;

	}

	public int getArea(){
		return (int) (Math.pow(this.side, 2));
	};

	public int getPerimeter(){
		return (4 * this.side);
	};


}



