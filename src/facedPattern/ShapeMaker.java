package facedPattern;

import javafx.scene.shape.Circle;

public class ShapeMaker {
private Shape circle;
private Shape rectangle;
private Shape squre;
public ShapeMaker()
{
	circle =new circle();
	squre=new squre();
	rectangle=new Rectagle();
	
}
public void drawcircle()
{
	circle.draw();
}
public void drawreactangle()
{
	rectangle.draw();
}
public void drawsquare()
{
	squre.draw();
}
}