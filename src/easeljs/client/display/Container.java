package easeljs.client.display;

import easeljs.client.display.impl.ContainerImpl;
import easeljs.client.display.impl.DisplayObjectImpl;

public class Container extends DisplayObject {
	
	public Container() {
		this(ContainerImpl.create());
	}
	
	public Container(ContainerImpl overlay) {
		this.overlay = overlay;
	}
	
	public DisplayObject addChild(DisplayObject child) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).addChild(child.getOverlay());
		return (impl != null ? child : null);
	}
	
	public DisplayObject addChildAt(DisplayObject child, int index) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).addChildAt(child.getOverlay(), index);
		return (impl != null ? child : null);
	}
	
	public DisplayObject removeChild(DisplayObject child) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).removeChild(child.getOverlay());
		return (impl != null ? child : null);
	}
	
	public void removeChildAt(int index) {
		((ContainerImpl) overlay).removeChildAt(index);
		// TODO: need return a DisplayObject
	}
	
	public void removeAllChildren() {
		((ContainerImpl) overlay).removeAllChildren();
	}
}
