package easeljs.client.display;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Image;

import easeljs.client.display.impl.GraphicsImpl;

public class Graphics {

	private GraphicsImpl overlay;
	
	public Graphics(GraphicsImpl overlay) {
		this.overlay = overlay;
	}
	
	public Graphics clear() {
		overlay.clear();
		return this;
	}
	
	public Graphics beginBitmapFill(Element image) {
		overlay.beginBitmapFill(image);
		return this;
	}
	
	public Graphics beginBitmapFill(Element image, String repeat) {
		overlay.beginBitmapFill(image, repeat);
		return this;
	}
	
	public Graphics beginBitmapFill(Image image) {
		overlay.beginBitmapFill(image.getElement());
		return this;
	}
	
	public Graphics beginBitmapFill(Image image, String repeat) {
		overlay.beginBitmapFill(image.getElement(), repeat);
		return this;
	}
	
	public Graphics beginFill(String color) {
		overlay.beginFill(color);
		return this;
	}
	
	public Graphics beginStroke(String color) {
		overlay.beginStroke(color);
		return this;
	}
	
	public Graphics endFill() {
		overlay.endFill();
		return this;
	}
	
	public Graphics moveTo(float x, float y) {
		overlay.moveTo(x, y);
		return this;
	}
	
	public Graphics lineTo(float x, float y) {
		overlay.lineTo(x, y);
		return this;
	}
	
	public Graphics endStroke() {
		overlay.endStroke();
		return this;
	}
	
	/**
	* Sets the stroke style for the current subpath. Like all drawing methods, 
	* this can be chained, so you can define the stroke style and color 
	* in a single line of code like so:
	* myGraphics.setStrokeStyle(8).beginStroke("#F00");
	* 
	* @param thickness The width of the stroke.
	*/ 
	public Graphics setStrokeStyle(float thickness) {
		overlay.setStrokeStyle(thickness);
		return this;
	}
	
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
	public Graphics setStrokeStyle(
			float thickness, String caps, String joints, String miterLimit) {
		overlay.setStrokeStyle(thickness, caps, joints, miterLimit);
		return this;
	}
}
