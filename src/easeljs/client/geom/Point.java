package easeljs.client.geom;

import easeljs.client.geom.impl.PointImpl;

public class Point {
	
	protected PointImpl impl;
	
	public Point() {
		this(0, 0);
	}
	public Point(float x, float y) {
		this(PointImpl.create(x, y));
	}
	public Point(PointImpl impl) {
		this.impl = impl;
	}
	public float getX() {
		return impl.getX();
	}
	public float getY() {
		return impl.getY();
	}
	public PointImpl getImpl() {
		return impl;
	}
	public void setX(float x) {
		impl.setX(x);
	}
	public void setY(float y) {
		impl.setY(y);
	}
	public void setImpl(PointImpl impl) {
		this.impl = impl;
	}
}
