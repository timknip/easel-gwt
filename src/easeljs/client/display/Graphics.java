package easeljs.client.display;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Image;

import easeljs.client.display.impl.GraphicsImpl;

public class Graphics {

	private GraphicsImpl overlay;
	
	public Graphics(GraphicsImpl overlay) {
		this.overlay = overlay;
	}
	
	/**
	* Returns a CSS compatible color string based on the specified RGB numeric color values in the format "rgba(255,255,255,1.0)", or if alpha is null then in the format "rgb(255,255,255)". For example,
	* Graphics.getRGB(50,100,150,0.5) will return "rgba(50,100,150,0.5)".
	* @param r The red component for the color, between 0 and 0xFF (255).
	* @param g The green component for the color, between 0 and 0xFF (255).
	* @param b The blue component for the color, between 0 and 0xFF (255).
	*/
	public static String getRGB(int r, int g, int b) {
		return GraphicsImpl.getRGB(r, g, b);
	}
	
	/**
	* Returns a CSS compatible color string based on the specified RGB 
	* numeric color values in the format "rgba(255,255,255,1.0)", or if 
	* alpha is null then in the format "rgb(255,255,255)". For example,
	* Graphics.getRGB(50,100,150,0.5) will return "rgba(50,100,150,0.5)".
	* 
	* @param r The red component for the color, between 0 and 0xFF (255).
	* @param g The green component for the color, between 0 and 0xFF (255).
	* @param b The blue component for the color, between 0 and 0xFF (255).
	* @param alpha Optional. The alpha component for the color where 0 is fully transparent and 1 is fully opaque.
	*/
	public static String getRGB(int r, int g, int b, float alpha) {
		return GraphicsImpl.getRGB(r, g, b, alpha);
	}
	
	/**
	* Returns a CSS compatible color string based on the specified HSL 
	* numeric color values in the format "hsla(360,100,100,1.0)", or 
	* if alpha is null then in the format "hsl(360,100,100)". For example,
	* Graphics.getHSL(150,100,70) will return "hsl(150,100,70)".
	* 
	* @param hue The hue component for the color, between 0 and 360.
	* @param saturation The saturation component for the color, between 0 and 100.
	* @param lightness The lightness component for the color, between 0 and 100.
	*/
	public static String getHSL(int hue, int saturation, 
			int lightness) {
		return GraphicsImpl.getHSL(hue, saturation, lightness);
	}
	
	/**
	* Returns a CSS compatible color string based on the specified HSL 
	* numeric color values in the format "hsla(360,100,100,1.0)", or if
	* alpha is null then in the format "hsl(360,100,100)". For example,
	* Graphics.getHSL(150,100,70) will return "hsl(150,100,70)".
	* 
	* @param hue The hue component for the color, between 0 and 360.
	* @param saturation The saturation component for the color, between 0 and 100.
	* @param lightness The lightness component for the color, between 0 and 100.
	* @param alpha Optional. The alpha component for the color where 0 is fully transparent and 1 is fully opaque.
	*/
	public static String getHSL(int hue, int saturation, 
			int lightness, float alpha) {
		return GraphicsImpl.getHSL(hue, saturation, lightness, alpha);
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
	
	/**
	* Closes the current path, effectively drawing a line from the 
	* current drawing point to the first drawing point specified since 
	* the fill or stroke was last set.
	*/
	public Graphics closePath() {
		overlay.closePath();
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
	
	/**
	* Draws an arc with the specified control points and radius.  
	* For detailed information, read the 
	* <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#complex-shapes-(paths)">whatwg spec</a>.
	* 
	* @param x1
	* @param y1
	* @param x2
	* @param y2
	* @param radius
	*/
	public Graphics arcTo(float x1, float y1,
			float x2, float y2, float radius) {
		overlay.arcTo(x1, y1, x2, y2, radius);
		return this;
	}
	
	/**
	* Draws an arc defined by the radius, startAngle and endAngle arguments, 
	* centered at the position (x,y). 
	* For example arc(100,100,20,0,Math.PI*2) would draw a full circle with 
	* a radius of 20 centered at 100,100. For detailed information, 
	* read the <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#complex-shapes-(paths)">whatwg spec</a>.
	* 
	* @param x
	* @param y
	* @param radius
	* @param startAngle
	* @param endAngle
	* @param anticlockwise
	*/
	public Graphics arc(float x, float y, float radius, 
			float startAngle, float endAngle, boolean anticlockwise) {
		overlay.arc(x, y, radius, startAngle, endAngle, anticlockwise);
		return this;
	}
	
	/**
	* Draws a quadratic curve from the current drawing point to (x,y) using 
	* the control point (cpx,cpy).  For detailed information, 
	* read the <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#complex-shapes-(paths)">whatwg spec</a>.
	* 
	* @param cpx
	* @param cpy
	* @param x
	* @param y
	*/
	public Graphics quadraticCurveTo(float cpx, float cpy, 
			float x, float y) {
		overlay.quadraticCurveTo(cpx, cpy, x, y);
		return this;
	}
	
	/**
	* Draws a bezier curve from the current drawing point to (x,y) 
	* using the control points (cp1x,cp1y) and (cp2x,cp2y).  
	* For detailed information, read the <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#complex-shapes-(paths)">whatwg spec</a>.
	* 
	* @param cp1x
	* @param cp1y
	* @param cp2x
	* @param cp2y
	* @param x
	* @param y
	*/
	public Graphics bezierCurveTo(
			float cp1x, float cp1y, 
			float cp2x, float cp2y, 
			float x, float y) {
		overlay.bezierCurveTo(cp1x, cp1y, cp2x, cp2y, x, y);
		return this;
	}

	/**
	* Draws a rectangle at (x,y) with the specified width and height 
	* using the current fill and/or stroke.  
	* For detailed information, read the <a href="http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html#complex-shapes-(paths)">whatwg spec</a>.
	* 
	* @param cpx
	* @param cpy
	* @param x
	* @param y
	*/
	public Graphics rect(float x, float y, float w, float h) {
		overlay.rect(x, y, w, h);
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
