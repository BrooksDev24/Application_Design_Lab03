package shapeProcess;

import shapePack.*;

public class ShapeExecute {

	public static void main(String[] args) {
		Square square = new Square();
		SemiCircle semiCircle = new SemiCircle();
		
		square.printShape();
		square.printRectangle();
		square.printSquare();
		semiCircle.printShape();
		semiCircle.printSemiCircle();
		semiCircle.printCricle();
		;

	}

}
