package easeljs.client.display;

import com.google.gwt.user.client.Element;

import easeljs.client.display.impl.StageImpl;

public class Stage extends Container {
	
	private StageImpl impl;
	
	public Stage(Element canvas) {
		overlay = impl = StageImpl.create(canvas);
	}
	
	public void tick() {
		impl.tick();
	}
}
