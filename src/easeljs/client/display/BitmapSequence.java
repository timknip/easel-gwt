package easeljs.client.display;

import easeljs.client.display.impl.BitmapSequenceImpl;

public class BitmapSequence extends DisplayObject {
	
	protected BitmapSequenceImpl impl;
	protected SpriteSheet spriteSheet;
	
	public BitmapSequence(SpriteSheet spriteSheet) {
		this(BitmapSequenceImpl.create(spriteSheet.getImpl()));
		this.spriteSheet = spriteSheet;
	}
	
	protected BitmapSequence(BitmapSequenceImpl impl) {
		this.overlay = this.impl = impl;
	}
	
	@Override
	public DisplayObject clone() {
		return new BitmapSequence((BitmapSequenceImpl)impl.clone());
	}
	
	public void gotoAndPlay(int frame) {
		impl.gotoAndPlay(frame);
	}
	
	public void gotoAndPlay(String frameOrSequence) {
		impl.gotoAndPlay(frameOrSequence);
	}
	
	public void gotoAndStop(int frame) {
		impl.gotoAndStop(frame);
	}
	
	public void gotoAndStop(String frameOrSequence) {
		impl.gotoAndStop(frameOrSequence);
	}

	public int getCurrentFrame() {
		return impl.getCurrentFrame();
	}
	
	public int getCurrentEndFrame() {
		return impl.getCurrentEndFrame();
	}
	
	public String getCurrentSequence() {
		return impl.getCurrentSequence();
	}
	
	public int getCurrentStartFrame() {
		return impl.getCurrentStartFrame();
	}
	
	public BitmapSequenceImpl getImpl() {
		return impl;
	}
	
	public String getNextSequence() {
		return impl.getNextSequence();
	}
	
	public boolean getPaused() {
		return impl.getPaused();
	}
	
	public SpriteSheet getSpriteSheet() {
		return spriteSheet;
	}
	
	public void setCurrentFrame(int frame) {
		impl.setCurrentFrame(frame);
	}
	
	public void setImpl(BitmapSequenceImpl impl) {
		this.impl = impl;
	}
	
	public void setSpriteSheet(SpriteSheet spriteSheet) {
		impl.setSpriteSheet(spriteSheet.getImpl());
		this.spriteSheet = spriteSheet;
	}
}
