package easeljs.client.display;

import easeljs.client.display.impl.ContainerImpl;
import easeljs.client.display.impl.DisplayObjectImpl;

public class Container extends DisplayObject {
	
	public Container() {
		overlay = ContainerImpl.create();
	}
	
	public DisplayObject addChild(DisplayObject child) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).addChild(child.getOverlay());
		return (impl != null ? child : null);
	}
}
