package easeljs.client.display.impl;

public class ContainerImpl extends DisplayObjectImpl {
	protected ContainerImpl() {}
	
	public static native ContainerImpl create() /*-{
		return new $wnd.Container();
	}-*/;
	
	public final native DisplayObjectImpl addChild(DisplayObjectImpl child) /*-{
		return this.addChild(child);
	}-*/;
}
