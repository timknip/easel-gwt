package easeljs.client.display.impl;

import com.google.gwt.core.client.JavaScriptObject;

public class GraphicsImpl extends JavaScriptObject {
	protected GraphicsImpl() {}
	
	public final native GraphicsImpl clear() /*-{
		return this.clear();
	}-*/;

	public final native GraphicsImpl beginBitmapFill(
			JavaScriptObject image) /*-{
		return this.beginBitmapFill(image);
	}-*/;
	
	public final native GraphicsImpl beginBitmapFill(
			JavaScriptObject image, String repetition) /*-{
		return this.beginBitmapFill(image, repetition);
	}-*/;
	
	public final native GraphicsImpl beginFill(String color) /*-{
		return this.beginFill(color);
	}-*/;
	
	public final native GraphicsImpl beginStroke(String color) /*-{
		return this.beginStroke(color);
	}-*/;
	
	public final native GraphicsImpl endFill() /*-{
		return this.endFill();
	}-*/;
	
	public final native GraphicsImpl endStroke() /*-{
		return this.endStroke();
	}-*/;
	
	public final native GraphicsImpl moveTo(float x, float y) /*-{
		return this.moveTo(x, y);
	}-*/;
	
	public final native GraphicsImpl lineTo(float x, float y) /*-{
		return this.lineTo(x, y);
	}-*/;
}