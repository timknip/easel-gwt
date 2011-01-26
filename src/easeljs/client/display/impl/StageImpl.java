package easeljs.client.display.impl;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.Element;

public class StageImpl extends ContainerImpl {
	protected StageImpl() {}
	
	public static native StageImpl create(Element canvas) /*-{
		return new $wnd.Stage(canvas);
	}-*/;
	
	public final native Element getCanvas() /*-{
		return this.canvas;
	}-*/;
	
	public final native JsArray<DisplayObjectImpl> getObjectsUnderPoint(float x, float y) /*-{
		return this.getObjectsUnderPoint(x, y);
	}-*/;
	
	public final native void tick() /*-{
		this.tick();
	}-*/;
}
