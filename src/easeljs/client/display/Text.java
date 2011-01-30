package easeljs.client.display;

import easeljs.client.display.impl.TextImpl;

public class Text extends DisplayObject {
	protected TextImpl impl;
	
	public Text() {
		overlay = impl = TextImpl.create();
	}
	public Text(String text) {
		overlay = impl = TextImpl.create(text);
	}
	public Text(String text, String font) {
		overlay = impl = TextImpl.create(text, font);
	}
	public Text(String text, String font, String color) {
		overlay = impl = TextImpl.create(text, font, color);
	}
	
	/** 
	 * The color to draw the text in. Any valid value for the 
	 * CSS color attribute is acceptable (ex. "#F00"). 
	 */
	public String getColor() {
		return impl.getColor();
	}
	
	/** 
	 * The font style to use. Any valid value for the CSS font 
	 * attribute is acceptable (ex. "bold 36px Arial"). 
	 */
	public String getFont() {
		return impl.getFont();
	}
	
	/** 
	 * The text to display.
	 * 
	 * @return
	 */
	public String getText() {
		return impl.getText();
	}
	
	public String getTextAlign() {
		return impl.getTextAlign();
	}
	
	public String getTextBaseline() {
		return impl.getTextBaseline();
	}
	
	public float getMaxWidth() {
		return impl.getMaxWidth();
	}
	
	public boolean getOutline() {
		return impl.getOutline();
	}
	
	public void setColor(String color) {
		impl.setColor(color);
	}
	
	/** 
	 * The font style to use. Any valid value for the CSS font 
	 * attribute is acceptable (ex. "bold 36px Arial"). 
	 * 
	 * @param font
	 */
	public void setFont(String font) {
		impl.setFont(font);
	}
	
	public void setText(String text) {
		impl.setText(text);
	}
	
	public void setTextAlign(String textAlign) {
		impl.setTextAlign(textAlign);
	}
	
	public void setTextBaseline(String textBaseline) {
		impl.setTextBaseline(textBaseline);
	}
	
	public void setMaxWidth(int maxWidth) {
		setMaxWidth(maxWidth);
	}
	public void setMaxWidth(double maxWidth) {
		setMaxWidth(maxWidth);
	}
	public void setMaxWidth(float maxWidth) {
		impl.setMaxWidth(maxWidth);
	}
	
	public void setOutline(boolean outline) {
		impl.setOutline(outline);
	}
}
