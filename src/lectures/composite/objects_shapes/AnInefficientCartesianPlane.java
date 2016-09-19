package lectures.composite.objects_shapes;

import lectures.graphics.ALine;
import lectures.graphics.AStringShape;
import lectures.graphics.Line;
import lectures.graphics.StringShape;
import bus.uigen.ObjectEditor;
/**
 * Compare the constructor of this class with the previous one.
 * 
 * Compare setAxesLength() of this class with the one in the previous one. 
 * 
 * Compare one of the getters (say getAxis()) with the corresponding 
 * getter of the previous class.
 * 
 * 
 *
 */
public class AnInefficientCartesianPlane implements CartesianPlane {
	protected int originX, originY;
	protected int axesLength; 
	/*
	 * Do not instantiate components in the constructor
	 */
    public AnInefficientCartesianPlane (int theAxesLength, int theOriginX, int theOriginY ) {
    	axesLength = theAxesLength; 
    	originX = theOriginX;
    	originY = theOriginY;      
    }  
    /*
     * Create a new line and label each time the getter is called, 
     * based on axes length
     * 
     */
    
    public Line getXAxis() {
    	return new ALine(toXAxisX(), toXAxisY(), axesLength, 0);
    }
    public Line getYAxis() {
    	return new ALine(toYAxisX(), toYAxisY(), 0, axesLength);
    }    
    public StringShape getXLabel() {
    	return new AStringShape ("X", toXLabelX(), toXLabelY());
    }
    public StringShape getYLabel() {
    	return new AStringShape ("Y", toYLabelX(), toYLabelY());
    }
    public int getAxesLength() {
		return axesLength;
	}
	public void setAxesLength(int anAxesLength) {
		axesLength = anAxesLength;		
	}
	protected int toXAxisX() {
    	return originX - axesLength/2;
    }
	protected int toXAxisY() {
    	return originY;
    }
	protected int toYAxisX() {
    	return originX;
    }
	protected int toYAxisY() {
    	return originY - axesLength/2;
    }
	protected int toXLabelX() {
    	return originX + axesLength/2;    	
    }
	protected int toXLabelY() {
    	return originY;  	
    }
	protected int toYLabelX() {
    	return originX;    	
    }
	protected int toYLabelY() {
    	return originY - axesLength/2;  	
    }
    
   
    public static void main (String[] args) {
    	ObjectEditor.edit(new AnInefficientCartesianPlane(200, 125, 125));
    }
/*
 * Again, run in debug mode and stop at the breakpoint, and step into the getter, 
 * step return, and then step into the setter.
 * 
 * When the setter above is called, did any of the leaf nodes change in 
 * the structure?
 * 
 * Did any of the composite nodes change, that is, did they get new children or 
 * lose children?
 * 
 * Calling setAxesLength in AnInefficientCartesianPlane changes:
 * 		(a) only the leaf nodes in the physical structure.
 * 		(b) changes only composite nodes in the physical structure.
 * 		(c) changes both the leaf and composite nodes in the physical structure.
 *
 * Why is this class more inefficient?
 */
	
}