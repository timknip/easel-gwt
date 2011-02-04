package easeljs.client.display.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

public class GraphicsImpl extends JavaScriptObject {
	protected GraphicsImpl() {}
	
	/**
	* Returns a CSS compatible color string based on the specified RGB numeric color values in the format "rgba(255,255,255,1.0)", or if alpha is null then in the format "rgb(255,255,255)". For example,
	* Graphics.getRGB(50,100,150,0.5) will return "rgba(50,100,150,0.5)".
	* @param r The red component for the color, between 0 and 0xFF (255).
	* @param g The green component for the color, between 0 and 0xFF (255).
	* @param b The blue component for the color, between 0 and 0xFF (255).
	*/
	public static final native String getRGB(int r, int g, int b) /*-{
		return $wnd.Graphics.getRGB(r, g, b);
	}-*/;
	
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
	public static final native String getRGB(int r, int g, int b, float alpha) /*-{
		return $wnd.Graphics.getRGB(r, g, b, alpha);
	}-*/;
	
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
	public static final native String getHSL(int hue, int saturation, 
			int lightness) /*-{
		return $wnd.Graphics.getHSL(hue, saturation, lightness);
	}-*/;
	
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
	public static final native String getHSL(int hue, int saturation, 
			int lightness, float alpha) /*-{
		return $wnd.Graphics.getHSL(hue, saturation, lightness, alpha);
	}-*/;
	
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
	public final native GraphicsImpl arcTo(float x1, float y1,
			float x2, float y2, float radius) /*-{
		return this.arcTo(x1, y1, x2, y2, radius);
	}-*/;
	
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
	public final native GraphicsImpl arc(float x, float y, float radius, 
			float startAngle, float endAngle, boolean anticlockwise) /*-{
		return this.arc(x, y, radius, startAngle, endAngle, anticlockwise);
	}-*/;
	
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
	public final native GraphicsImpl quadraticCurveTo(float cpx, float cpy, 
			float x, float y) /*-{
		return this.quadraticCurveTo(cpx, cpy, x, y);
	}-*/;
	
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
	public final native GraphicsImpl bezierCurveTo(
			float cp1x, float cp1y, 
			float cp2x, float cp2y, 
			float x, float y) /*-{
		return this.bezierCurveTo(cp1x, cp1y, cp2x, cp2y, x, y);
	}-*/;
	
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
	public final native GraphicsImpl rect(float x, float y, float w, float h) /*-{
		return this.rect(x, y, w, h);
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
	* Closes the current path, effectively drawing a line from the 
	* current drawing point to the first drawing point specified since 
	* the fill or stroke was last set.
	*/
	public final native GraphicsImpl closePath() /*-{
		return this.closePath();
	}-*/;
	
	/**
	* Begins a linear gradient fill defined by the line (x0,y0) to (x1,y1). 
	* This ends the current subpath. For example, the following code defines 
	* a black to white vertical gradient ranging from 20px to 120px, and 
	* draws a square to display it:<br/>
	* myGraphics.beginLinearGradientFill(["#000","#FFF"], [0,1], 0, 20, 0, 120)
	*   .drawRect(20,20,120,120);
	*   
	* @param colors An array of CSS compatible color values. For example, ["#F00","#00F"] would define a gradient drawing from red to blue.
	* @param ratios An array of gradient positions which correspond to the colors. For example, [0.1,0.9] would draw the first color to 10% then interpolating to the second color at 90%.
	* @param x0 The position of the first point defining the line that defines the gradient direction and size.
	* @param y0 The position of the first point defining the line that defines the gradient direction and size.
	* @param x1 The position of the second point defining the line that defines the gradient direction and size.
	* @param y1 The position of the second point defining the line that defines the gradient direction and size.
	*/
	public final native GraphicsImpl beginLinearGradientFill(
			JsArrayString colors, JsArrayNumber ratios,
			float x0, float y0, float x1, float y1) /*-{
		return this.beginLinearGradientFill(colors, ratios, x0, y0, x1, y1);
	}-*/;
	
	/**
	* Begins a radial gradient fill. This ends the current subpath. 
	* For example, the following code defines a red to blue radial gradient centered 
	* at (100,100), with a radius of 50, and draws a circle to display it:<br/>
	* myGraphics.beginRadialGradientFill(["#F00","#00F"], [0,1], 100, 100, 0, 100, 100, 50)
	* .drawCircle(100, 100, 50);
	* @param colors An array of CSS compatible color values. For example, ["#F00","#00F"] would define a gradient drawing from red to blue.
	* @param ratios An array of gradient positions which correspond to the colors. For example, [0.1,0.9] would draw the first color to 10% then interpolating to the second color at 90%.
	* @param x0 Center position of the inner circle that defines the gradient.
	* @param y0 Center position of the inner circle that defines the gradient.
	* @param r0 Radius of the inner circle that defines the gradient.
	* @param x1 Center position of the outer circle that defines the gradient.
	* @param y1 Center position of the outer circle that defines the gradient.
	* @param r1 Radius of the outer circle that defines the gradient.
	*/
	public final native GraphicsImpl beginRadialGradientFill(
			JsArrayString colors, JsArrayNumber ratios,
			float x0, float y0, float r0,
			float x1, float y1, float r1
			) /*-{
		return this.beginRadialGradientFill(colors, ratios, x0, y0, r0, x1, y1, r1);
	}-*/;
	
	public final native JsArrayNumber getNativeNumberArray(String raw) /*-{
		return raw;
	}-*/;
	
	public final native JsArrayString getNativeStringArray(String raw) /*-{
		return raw;
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