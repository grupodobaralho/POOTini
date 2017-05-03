package composite;

/**
 * 
 * Line is a basic shape that does not support adding shapes  
 */
public class Line implements Shape {

	private int x1,y1;
	private int x2,y2;
	
	/**
	 * Create a line between point1 and point2
	 * @param point1X
	 * @param point1Y
	 * @param point2X
	 * @param point2Y
	 */
	public Line(int point1X, int point1Y, int point2X, int point2Y) {
		this.x1 = point1X;
		this.y1 = point1Y;
		this.x2 = point2X;
		this.y2 = point2Y;
	}
	
	@Override
	public Shape[] explodeShape() {


		// making a simple shape explode would return only the shape itself, there are no parts of this shape
			
		Shape[] shapeParts = {this};
	
		return shapeParts;
	
	}

	/**
	 * this method must be implemented in this simple shape
	 */
	public void renderShapeToScreen() {
		// logic to render this shape to screen
		System.out.println("Line: "+x1+","+y1+" - "+x2+","+y2);
	}

}