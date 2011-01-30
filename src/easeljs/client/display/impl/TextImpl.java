package easeljs.client.display.impl;

public class TextImpl extends DisplayObjectImpl {
	protected TextImpl() {}
	
	public static TextImpl create() {
		return create("");
	}
	public static TextImpl create(String text) {
		return create(text, "12px bold Arial", "#000000");
	}
	
	public static TextImpl create(String text, String font) {
		return create(text, font, "#000000");
	}
	
	public static native TextImpl create(String text, String font, String color) /*-{
		return new $wnd.Text(text, font, color);
	}-*/;
	
	public final native String getColor() /*-{
		return this.color;
	}-*/;
	
	public final native String getFont() /*-{
		return this.font;
	}-*/;
	
	public final native String getText() /*-{
		return this.text;
	}-*/;
	
	public final native String getTextAlign() /*-{
		return this.textAlign;
	}-*/;
	
	public final native String getTextBaseline() /*-{
		return this.textBaseline;
	}-*/;
	
	public final native float getMaxWidth() /*-{
		return this.maxWidth;
	}-*/;
	
	public final native boolean getOutline() /*-{
		return this.outline;
	}-*/;
	
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;
	
	public final native void setFont(String font) /*-{
		this.font = font;
	}-*/;
	
	public final native void setText(String text) /*-{
		this.text = text;
	}-*/;
	
	public final native void setTextAlign(String textAlign) /*-{
		this.textAlign = textAlign;
	}-*/;
	
	public final native void setTextBaseline(String textBaseline) /*-{
		this.textBaseline = textBaseline;
	}-*/;
	
	public final native void setMaxWidth(float maxWidth) /*-{
		this.maxWidth = maxWidth;
	}-*/;
	
	public final native void setOutline(boolean outline) /*-{
		this.outline = outline;
	}-*/;
}
