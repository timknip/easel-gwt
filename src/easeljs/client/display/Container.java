package easeljs.client.display;

import java.util.ArrayList;

import easeljs.client.display.impl.ContainerImpl;
import easeljs.client.display.impl.DisplayObjectImpl;

public class Container extends DisplayObject {
	private ArrayList<DisplayObject> children = new ArrayList<DisplayObject>();
	
	public Container() {
		this(ContainerImpl.create());
	}
	
	public Container(ContainerImpl overlay) {
		this.overlay = overlay;
	}
	
	public DisplayObject addChild(DisplayObject child) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).addChild(child.getOverlay());
		if (impl != null) {
			children.add(child);
		}
		return (impl != null ? child : null);
	}
	
	public DisplayObject addChildAt(DisplayObject child, int index) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).addChildAt(child.getOverlay(), index);
		if (impl != null) {
			children.add(index, child);
		}
		return (impl != null ? child : null);
	}
	
	public DisplayObject removeChild(DisplayObject child) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).removeChild(child.getOverlay());
		if (impl != null) {
			children.remove(child);
		}
		return (impl != null ? child : null);
	}
	
	public DisplayObject removeChildAt(int index) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).removeChildAt(index);
		if (impl != null) {
			return children.remove(index);
		} else {
			return null;
		}
	}
	
	public void removeAllChildren() {
		((ContainerImpl) overlay).removeAllChildren();
		children.clear();
	}
	
	public DisplayObject getChildAt(int index) {
		DisplayObjectImpl impl =
			((ContainerImpl) overlay).getChildAt(index);
		if (impl != null) {
			return children.get(index);
		} else {
			return null;
		}
	}
	
	public int getChildIndex(DisplayObjectImpl child) {
		return ((ContainerImpl) overlay).getChildIndex(child);
	}
	public int getChildIndex(DisplayObject child) {
		return ((ContainerImpl) overlay).getChildIndex(child.getOverlay());
	}
	
	public ArrayList<DisplayObject> getChildren() {
		return children;
	}
	
	public boolean getMouseChildren() {
		return ((ContainerImpl) overlay).getMouseChildren();
	}
	
	public int getNumChildren() {
		return ((ContainerImpl) overlay).getNumChildren();
	}
	
	public void setMouseChildren(boolean mouseChildren) {
		((ContainerImpl) overlay).setMouseChildren(mouseChildren);
	}
}
