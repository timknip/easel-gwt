package easeljs.client.geom.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class RectangleImpl extends JavaScriptObject {
	protected RectangleImpl() {}

	/**
	* Constructs a new Rectangle instance.
	* Represents a rectangle as defined by the points (x,y) and (x+w,y+h).
	*/
	public static native RectangleImpl create() /*-{
		return new $wnd.Rectangle();
	}-*/;
	
	/**
	* Constructs a new Rectangle instance.
	* Represents a rectangle as defined by the points (x,y) and (x+w,y+h).
	* @param x X position. Default is 0.
	* @param y Y position. Default is 0.
	* @param w Width. Default is 0.
	* @param h Height. Default is 0.
	*/
	public static native RectangleImpl create(float x, float y, float w, float h) /*-{
		return new $wnd.Rectangle(x, y, w, h);
	}-*/;
	
	public final native RectangleImpl clone() /*-{
		return this.clone();
	}-*/;

	public final native float getX() /*-{
		return this.x;
	}-*/;
	
	public final native void setX(float x) /*-{
		this.x = x;
	}-*/;
	
	public final native float getY() /*-{
		return this.y;
	}-*/;
	
	public final native void setY(float y) /*-{
		this.y = y;
	}-*/;

	public final native float getWidth() /*-{
		return this.w;
	}-*/;
	
	public final native void setWidth(float w) /*-{
		this.w = w;
	}-*/;

	public final native float getHeight() /*-{
		return this.h;
	}-*/;
	
	public final native void setHeight(float h) /*-{
		this.h = h;
	}-*/;
}
