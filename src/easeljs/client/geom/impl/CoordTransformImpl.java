package easeljs.client.geom.impl;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.client.display.impl.DisplayObjectImpl;

public class CoordTransformImpl extends JavaScriptObject {
	protected CoordTransformImpl() {}
	
	/**
	* Transforms the specified x and y position from the coordinate space of the source display object
	* to the global (stage) coordinate space. For example, this could be used to position an HTML label
	* over a specific point on a nested display object. Returns a Point instance with x and y properties
	* correlating to the transformed coordinates on the stage.
	* @param x The x position in the source display object to transform.
	* @param y The y position in the source display object to transform.
	* @param target The source display object.
	* @return Point
	*/
	public static final native PointImpl localToGlobal(float x, float y, 
			DisplayObjectImpl source) /*-{
		return $wnd.CoordTransform.localToGlobal(x, y, source);
	}-*/;

	/**
	* Transforms the specified x and y position from the global (stage) coordinate space to the
	* coordinate space of the target display object. For example, this could be used to determine
	* the current mouse position within a specific display object. Returns a Point instance with x and y properties
	* correlating to the tranformed position in the target's coordinate space.
	* @param x The x position on the stage to transform.
	* @param y The y position on the stage to transform.
	* @param target The target display object.
	* @return Point
	*/
	public static final native PointImpl globalToLocal(float x, float y, 
			DisplayObjectImpl source) /*-{
		return $wnd.CoordTransform.globalToLocal(x, y, source);
	}-*/;
	
	/**
	* Transforms the specified x and y position from the coordinate space of the source display object to the
	* coordinate space of the target display object. Returns a Point instance with x and y properties
	* correlating to the tranformed position in the target's coordinate space. Effectively the same as calling
	* var pt = localToGlobal(x, y, source); pt = globalToLocal(pt.x, pt.y, target);
	* @param x The x position in the source display object to transform.
	* @param y The y position on the stage to transform.
	* @param source The display object that the original position is relative to.
	* @param target The target display object to which the coordinates will be transformed.
	* @return Point
	*/
	public static final native PointImpl localToLocal(float x, float y, 
			DisplayObjectImpl source, DisplayObjectImpl target) /*-{
		return $wnd.CoordTransform.localToLocal(x, y, source, target);
	}-*/;
	
	/**
	* Generates a concatenated Matrix2D object representing the combined tranform of
	* the target display object and all of its parent Containers. 
	* This can be used to transform positions between coordinate spaces, 
	* as with localToGlobal and globalToLocal.
	* 
	* @param target The target display object to which the coordinates will be transformed.
	* 
	* @return
	*/
	public static final native Matrix2DImpl getConcatenatedMatrix(DisplayObjectImpl target) /*-{
		return $wnd.CoordTransform.getConcatenatedMatrix(target);
	}-*/;
}
