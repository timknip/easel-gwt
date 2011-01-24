package easeljs.client.display;

import com.google.gwt.core.client.JavaScriptObject;

import easeljs.client.display.impl.DisplayObjectImpl;

public class DisplayObject {

	protected DisplayObjectImpl overlay;
	protected Shadow shadow;
	
	public DisplayObject() {
		overlay = DisplayObjectImpl.create();
	}
	
	public DisplayObject(DisplayObjectImpl overlay) {
		this.overlay = overlay;
	}
	
	public void cache(float x, float y, float w, float h) {
		overlay.cache(x, y, w, h);
	}

	public DisplayObject clone() {
		return new DisplayObject(overlay.clone());
	}
	
	public void draw(JavaScriptObject ctx, boolean ignoreCache) {
		overlay.draw(ctx, ignoreCache);
	}
	
	public void uncache() {
		overlay.uncache();
	}
	
	public float getAlpha() {
		return overlay.getAlpha();
	}
	
	public void setAlpha(float alpha) {
		overlay.setAlpha(alpha);
	}
	
	public int getID() {
		return overlay.getID();
	}
	
	public void setID(int id) {
		overlay.setID(id);
	}
	
	public String getName() {
		return overlay.getName();
	}
	
	public void setName(String name) {
		overlay.setName(name);
	}
	
	public float getRegX() {
		return overlay.getRegX();
	}
	
	public void setRegX(float x) {
		overlay.setRegX(x);
	}
	
	public float getRegY() {
		return overlay.getRegY();
	}
	
	public void setRegY(float y) {
		overlay.setRegY(y);
	}
	
	public float getRotation() {
		return overlay.getRotation();
	}
	
	public void setRotation(float degrees) {
		overlay.setRotation(degrees);
	}
	
	public float getScaleX() {
		return overlay.getScaleX();
	}
	
	public void setScaleX(float x) {
		overlay.setScaleX(x);
	}
	
	public float getScaleY() {
		return overlay.getScaleY();
	}
	
	public void setScaleY(float y) {
		overlay.setScaleY(y);
	}
	
	public Shadow getShadow() {
		return shadow;
	}
	
	public void setShadow(Shadow shadow) {
		if (shadow != null) {
			overlay.setShadow(shadow.getImpl());
		} else {
			overlay.setShadow(null);
		}
	}
	
	public boolean inVisible() {
		return overlay.isVisible();
	}
	
	public void setVisible(boolean visible) {
		overlay.setVisible(visible);
	}
	
	public float getX() {
		return overlay.getX();
	}
	
	public void setX(float x) {
		overlay.setX(x);
	}
	
	public float getY() {
		return overlay.getY();
	}
	
	public void setY(float y) {
		overlay.setY(y);
	}
	
	public DisplayObjectImpl getOverlay() {
		return overlay;
	}
}
