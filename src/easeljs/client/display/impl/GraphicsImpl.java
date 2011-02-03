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
	
	/**
	* Sets the stroke style for the current subpath. Like all drawing methods, 
	* this can be chained, so you can define the stroke style and color 
	* in a single line of code like so:
	* myGraphics.setStrokeStyle(8).beginStroke("#F00");
	* 
	* @param thickness The width of the stroke.
	*/ 
	public final native GraphicsImpl setStrokeStyle(float thickness) /*-{
		return this.setStrokeStyle(thickness);
	}-*/;
	
	/**
	* Sets the stroke style for the current subpath. Like all drawing methods, 
	* this can be chained, so you can define the stroke style and color 
	* in a single line of code like so:
	* myGraphics.setStrokeStyle(8,"round").beginStroke("#F00");
	* 
	* @param thickness The width of the stroke.
	* @param caps Optional. Indicates the type of caps to use at the end of lines. One of butt, round, or square. Defaults to "butt".
	* @param joints Optional. Specifies the type of joints that should be used where two lines meet. One of bevel, round, or miter. Defaults to "miter".
	* @param miter Optional. If joints is set to "miter", then you can specify a miter limit ratio which controls at what point a mitered joint will be clipped.
	*/
	public final native GraphicsImpl setStrokeStyle(
			float thickness, String caps, String joints, String miterLimit) /*-{
		return this.setStrokeStyle(thickness, caps, joints, miterLimit);
	}-*/;
}