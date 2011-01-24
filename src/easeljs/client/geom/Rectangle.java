package easeljs.client.geom;

import easeljs.client.geom.impl.RectangleImpl;

public class Rectangle {

	protected RectangleImpl impl;
	
	public Rectangle() {
		this(RectangleImpl.create());
	}
	public Rectangle(float x, float y, float w, float h) {
		this(RectangleImpl.create(x, y, w, h));
	}
	public Rectangle(RectangleImpl impl) {
		setImpl(impl);
	}
	
	public Rectangle clone() {
		return new Rectangle(impl.clone());
	}
	
	public float getX() {
		return impl.getX();
	}
	
	public float getY() {
		return impl.getY();
	}
	
	public float getWidth() {
		return impl.getWidth();
	}
	
	public float getHeight() {
		return impl.getHeight();
	}
	
	public RectangleImpl getImpl() {
		return impl;
	}
	
	public void setX(float value) {
		impl.setX(value);
	}
	
	public void setY(float value) {
		impl.setY(value);
	}
	
	public void setWidth(float value) {
		impl.setWidth(value);
	}
	
	public void setHeight(float value) {
		impl.setHeight(value);
	}
	
	public void setImpl(RectangleImpl impl) {
		this.impl = impl;
	}
}
