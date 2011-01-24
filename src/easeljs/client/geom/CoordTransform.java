package easeljs.client.geom;

import easeljs.client.display.DisplayObject;
import easeljs.client.geom.impl.CoordTransformImpl;
import easeljs.client.geom.impl.Matrix2DImpl;
import easeljs.client.geom.impl.PointImpl;

public class CoordTransform {
	
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
	public static Point localToGlobal(float x, float y, 
			DisplayObject source) {
		return localToGlobal(x, y, source, null);
	}
	public static Point localToGlobal(float x, float y, 
			DisplayObject source, Point result) {
		
		PointImpl impl = CoordTransformImpl.localToGlobal(
				x, y, source.getOverlay());
		
		if (result != null) {
			result.setImpl(impl);
		} else {
			result = new Point(impl);
		}
		return result;
	}
	
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
	public static Point globalToLocal(float x, float y, 
			DisplayObject source) {
		return globalToLocal(x, y, source, null);
	}
	public static Point globalToLocal(float x, float y, 
			DisplayObject source, Point result) {
		
		PointImpl impl = CoordTransformImpl.globalToLocal(
				x, y, source.getOverlay());
		
		if (result != null) {
			result.setImpl(impl);
		} else {
			result = new Point(impl);
		}
		return result;
	}
	
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
	public static Point localToLocal(float x, float y, 
			DisplayObject source, DisplayObject target) {
		return localToLocal(x, y, source, target, null);
	}
	public static Point localToLocal(float x, float y, 
			DisplayObject source, DisplayObject target,
			Point result) {
		
		PointImpl impl = CoordTransformImpl.localToLocal(
				x, y, source.getOverlay(), target.getOverlay());
		
		if (result != null) {
			result.setImpl(impl);
		} else {
			result = new Point(impl);
		}
		return result;
	}
	
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
	public static Matrix2D getConcatenatedMatrix(DisplayObject target) {
		return getConcatenatedMatrix(target);
	}
	public static Matrix2D getConcatenatedMatrix(DisplayObject target, Matrix2D result) {
		Matrix2DImpl impl = 
			CoordTransformImpl.getConcatenatedMatrix(target.getOverlay());
		if (result != null) {
			result.setImpl(impl);
		} else {
			result = new Matrix2D(impl);
		}
		return result;
	}
}
