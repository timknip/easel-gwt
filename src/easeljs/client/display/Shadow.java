package easeljs.client.display;

import easeljs.client.display.impl.ShadowImpl;

public class Shadow {
	
	private ShadowImpl impl;
	
	public Shadow(String color, float offsetX, float offsetY, float blur) {
		this(ShadowImpl.create(color, offsetX, offsetY, blur));
	}
	
	public Shadow(ShadowImpl impl) {
		this.impl = impl;
	}
	
	public ShadowImpl getImpl() {
		return impl;
	}
}
