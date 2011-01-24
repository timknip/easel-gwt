package easeljs.client.display.impl;


public class ShapeImpl extends DisplayObjectImpl {
	protected ShapeImpl() {}
	
	public static native ShapeImpl create() /*-{
		return new $wnd.Shape();
	}-*/;
	
	public final native GraphicsImpl getGraphics() /*-{
		return this.graphics;
	}-*/;
}
