package easeljs.client.display.impl;

import com.google.gwt.core.client.JsArray;

public class ContainerImpl extends DisplayObjectImpl {
	protected ContainerImpl() {}
	
	public static native ContainerImpl create() /*-{
		return new $wnd.Container();
	}-*/;
	
	public final native DisplayObjectImpl addChild(
			DisplayObjectImpl child) /*-{
		return this.addChild(child);
	}-*/;
	
	public final native DisplayObjectImpl addChildAt(
			DisplayObjectImpl child, int index) /*-{
		return this.addChildAt(child, index);
	}-*/;
	
	public final native DisplayObjectImpl removeChild(
			DisplayObjectImpl child) /*-{
		return this.removeChild(child);
	}-*/;
	
	public final native DisplayObjectImpl removeChildAt(
			int index) /*-{
		return this.removeChildAt(index);
	}-*/;
	
	public final native void removeAllChildren() /*-{
		this.removeAllChildren();
	}-*/;
	
	public final native DisplayObjectImpl getChildAt(int index) /*-{
		return this.getChildAt(index);
	}-*/;
	
	public final native JsArray<DisplayObjectImpl> getChildren() /*-{
		return this.getChildren();
	}-*/;
	
	public final native boolean getMouseChildren() /*-{
		return this.mouseChildren;
	}-*/;
	
	public final native DisplayObjectImpl getChildIndex(DisplayObjectImpl child) /*-{
		return this.getChildIndex(child);
	}-*/;
	
	public final native int getNumChildren() /*-{
		return this.getNumChildren();
	}-*/;
	
	public final native void setMouseChildren(boolean value) /*-{
		this.mouseChildren = value;
	}-*/;
}
