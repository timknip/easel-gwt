package easeljs.client.display.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class ShadowImpl extends JavaScriptObject {
	protected ShadowImpl() {}
	
	public static final native ShadowImpl create() /*-{
		return new $wnd.Shadow(0, 0, 0, 0);
	}-*/;
	
	public static final native ShadowImpl create(
			String color, 
			float offsetX, 
			float offsetY, 
			float blur) /*-{
		return new $wnd.Shadow(color, offsetX, offsetY, blur);
	}-*/;
	
	public static final native ShadowImpl getIdentity() /*-{
		return $wnd.Shadow.identity;
	}-*/;
	
	public final native ShadowImpl clone() /*-{
		return this.clone();
	}-*/;
	
	public final native int getColor() /*-{
		return this.color;
	}-*/;
	public final native void setColor(int color) /*-{
		this.color = color;
	}-*/;
	
	public final native float getOffsetX() /*-{
		return this.offsetX;
	}-*/;
	public final native void setOffsetX(float offsetX) /*-{
		this.offsetX = offsetX;
	}-*/;
	
	public final native float getOffsetY() /*-{
		return this.offsetY;
	}-*/;
	public final native void setOffsetY(float offsetY) /*-{
		this.offsetY = offsetY;
	}-*/;
	
	public final native float getBlur() /*-{
		return this.blur;
	}-*/;
	public final native void setBlur(float blur) /*-{
		this.blur = blur;
	}-*/;
}
