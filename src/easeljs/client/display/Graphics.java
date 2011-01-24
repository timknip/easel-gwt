package easeljs.client.display;

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
}
