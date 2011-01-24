package easeljs.client.geom.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class Matrix2DImpl extends JavaScriptObject {
	protected Matrix2DImpl() {}
	
	public static final native Matrix2DImpl create() /*-{
		return new $wnd.Matrix2D();
	}-*/;
	public static final native Matrix2DImpl create(
			float a, float b, 
			float c, float d, 
			float tx, float ty) /*-{
		return new $wnd.Matrix2D(a, b, c, d, tx, ty);
	}-*/;
	
	/**
	 * Concatenates the specified matrix properties with this matrix. 
	 * You must provide values for all of the parameters.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param dx
	 * @param dy
	 */
	public final native void concat(
			float a, float b,
			float c, float d,
			float tx, float ty) /*-{
		this.concat(a, b, c, d, tx, ty);
	}-*/;
	
	/**
	 * Concatenates the specified matrix with this matrix.
	 * 
	 * @param matrix
	 */
	public final native void concatMatrix(Matrix2DImpl matrix) /*-{
		this.concat(matrix.a, matrix.b, matrix.c, matrix.d, matrix.tx, matrix.ty);
	}-*/;

	/**
	* Generates matrix properties from the specified display 
	* object transform properties, and concatenates them with this matrix.
	* For example, you can use this to generate a matrix from a display 
	* object: 
	* var mtx = new Matrix2D(); 
	* mtx.concatTransform(o.x, o.y, o.scaleX, o.scaleY, o.rotation);
	* @param x
	* @param y
	* @param scaleX
	* @param scaleY
	* @param rotation
	**/
	public final native void concatTransform(
			float x, float y,
			float scaleX, float scaleY,
			float rotation) /*-{
		this.concatTransform(x, y, scaleX, scaleY, rotation);
	}-*/;
	
	/**
	* Generates matrix properties from the specified display 
	* object transform properties, and concatenates them with this matrix.
	* For example, you can use this to generate a matrix from a 
	* display object: 
	* var mtx = new Matrix2D(); 
	* mtx.concatTransform(o.x, o.y, o.scaleX, o.scaleY, o.rotation);
	* @param x
	* @param y
	* @param scaleX
	* @param scaleY
	* @param rotation
	* @param regX Optional.
	* @param regY Optional.
	**/
	public final native void concatTransform(
			float x, float y,
			float scaleX, float scaleY,
			float rotation,
			float regX, float regY) /*-{
		this.concatTransform(x, y, scaleX, scaleY, rotation, regX, regY);
	}-*/;
	
	/**
	 * Applies a rotation transformation to the matrix.
	 * 
	 * @param angle
	 */
	public final native void rotate(float angle) /*-{
		this.rotate(angle);
	}-*/;
	
	/**
	 * Applies a scale transformation to the matrix.
	 * @param x
	 * @param y
	 */
	public final native void scale(float x, float y) /*-{
		this.scale(x, y);
	}-*/;
	
	/**
	 * Translates the matrix on the x and y axes.
	 * 
	 * @param x
	 * @param y
	 */
	public final native void translate(float x, float y) /*-{
		this.translate(x, y);
	}-*/;
	
	/**
	 * Sets the properties of the matrix to those of an identity matrix (one that applies a null transformation).
	 */
	public final native void identity() /*-{
		this.identity();
	}-*/;
	
	/**
	 * Inverts the matrix, causing it to perform the opposite transformation.
	 */
	public final native void invert() /*-{
		this.invert();
	}-*/;
	
	/**
	 * Returns a clone of this Matrix.
	 */
	public final native Matrix2DImpl clone() /*-{
		this.clone();
	}-*/;
	
	public final native float getA() /*-{
		return this.a;
	}-*/;
	
	public final native float getB() /*-{
		return this.b;
	}-*/;
	
	public final native float getC() /*-{
		return this.c;
	}-*/;
	
	public final native float getD() /*-{
		return this.d;
	}-*/;
	
	public final native float getTX() /*-{
		return this.tx;
	}-*/;
	
	public final native float getTY() /*-{
		return this.ty;
	}-*/;
	
	public final native void setA(float value) /*-{
		this.a = value;
	}-*/;
	
	public final native void setB(float value) /*-{
		this.b = value;
	}-*/;
	
	public final native void setC(float value) /*-{
		this.c = value;
	}-*/;
	
	public final native void setD(float value) /*-{
		this.d = value;
	}-*/;
	
	public final native void setTX(float value) /*-{
		this.ty = value;
	}-*/;
	
	public final native void setTY(float value) /*-{
		this.tx = value;
	}-*/;
}
