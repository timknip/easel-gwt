package easeljs.client.geom.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class PointImpl extends JavaScriptObject {
	protected PointImpl() {}
	
	public static native PointImpl create(float x, float y) /*-{
		return new $wnd.Point(x, y);
	}-*/;
	
	public final native PointImpl clone() /*-{
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
}
