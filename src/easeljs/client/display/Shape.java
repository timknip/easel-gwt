package easeljs.client.display;

import easeljs.client.display.impl.GraphicsImpl;
import easeljs.client.display.impl.ShapeImpl;

public class Shape extends DisplayObject {
	
	private Graphics graphics;
	private ShapeImpl impl;
	
	public Shape() {
		this(ShapeImpl.create());
	}
	
	public Shape(ShapeImpl overlay) {
		this.overlay = this.impl = overlay;
		GraphicsImpl graphicsImpl =
			((ShapeImpl)this.overlay).getGraphics();
		graphics = new Graphics(graphicsImpl);
	}
	
	public Graphics getGraphics() {
		return graphics;
	}
	
	@Override
	public DisplayObject clone() {
		return new Shape((ShapeImpl)impl.clone());
	}
}
