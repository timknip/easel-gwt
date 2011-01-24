package easeljs.client.geom;

import easeljs.client.geom.impl.Matrix2DImpl;

public class Matrix2D {
	
	protected Matrix2DImpl impl;
	
	public Matrix2D() {
		this(Matrix2DImpl.create());
	}
	public Matrix2D(float a, float b,
			float c, float d,
			float tx, float ty) {
		this(Matrix2DImpl.create(a, b, c, d, tx, ty));
	}
	public Matrix2D(Matrix2DImpl impl) {
		setImpl(impl);
	}
	
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
	public void concat(
			float a, float b,
			float c, float d,
			float tx, float ty) {
		impl.concat(a, b, c, d, tx, ty);
	}
	
	/**
	 * Concatenates the specified matrix with this matrix.
	 * 
	 * @param matrix
	 */
	public void concatMatrix(Matrix2D matrix) {
		impl.concat(
			matrix.getA(), matrix.getB(), 
			matrix.getC(), matrix.getD(), 
			matrix.getTX(), matrix.getTY());
	};

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
	public void concatTransform(
			float x, float y,
			float scaleX, float scaleY,
			float rotation) {
		impl.concatTransform(x, y, scaleX, scaleY, rotation);
	}
	
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
	public void concatTransform(
			float x, float y,
			float scaleX, float scaleY,
			float rotation,
			float regX, float regY){
		impl.concatTransform(x, y, scaleX, scaleY, rotation, regX, regY);
	}
	
	public void rotate(float angle) {
		impl.rotate(angle);
	}
	
	public void scale(float x, float y) {
		impl.scale(x, y);
	}
	
	public void translate(float x, float y) {
		impl.translate(x, y);
	}
	
	public void identity() {
		impl.identity();
	}
	
	public void invert() {
		impl.invert();
	}
	
	public float getA() {
		return impl.getA();
	}
	
	public float getB() {
		return impl.getB();
	}
	
	public float getC() {
		return impl.getC();
	}
	
	public float getD() {
		return impl.getD();
	}
	
	public float getTX() {
		return impl.getTX();
	}
	
	public float getTY() {
		return impl.getTY();
	}
	
	public Matrix2DImpl getImpl() {
		return impl;
	}
	
	public void setA(float value) {
		impl.setA(value);
	}
	
	public void setB(float value) {
		impl.setB(value);
	}
	
	public void setC(float value) {
		impl.setC(value);
	}
	
	public void setD(float value) {
		impl.setD(value);
	}
	
	public void setTX(float value) {
		impl.setTX(value);
	}
	
	public void setTY(float value) {
		impl.setTY(value);
	}
	
	public void setImpl(Matrix2DImpl impl) {
		this.impl = impl;
	}
}
