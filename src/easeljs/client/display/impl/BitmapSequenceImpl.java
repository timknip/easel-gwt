package easeljs.client.display.impl;

public class BitmapSequenceImpl extends DisplayObjectImpl {
	protected BitmapSequenceImpl() {}
	
	public static native BitmapSequenceImpl create(SpriteSheetImpl spriteSheet) /*-{
		return new $wnd.BitmapSequence(spriteSheet);
	}-*/;
	
	public final native void gotoAndPlay(int frame) /*-{
		this.gotoAndPlay(frame);
	}-*/;
	
	public final native void gotoAndPlay(String frameOrSequence) /*-{
		this.gotoAndPlay(frameOrSequence);
	}-*/;
	
	public final native void gotoAndStop(int frame) /*-{
		this.gotoAndStop(frame);
	}-*/;
	
	public final native void gotoAndStop(String frameOrSequence) /*-{
		this.gotoAndStop(frameOrSequence);
	}-*/;	
	
	public final native int getCurrentFrame() /*-{
		return this.currentFrame;
	}-*/;
	
	public final native int getCurrentEndFrame() /*-{
		return this.currentEndFrame;
	}-*/;
	
	public final native String getCurrentSequence() /*-{
		return this.currentSequence;
	}-*/;
	
	public final native int getCurrentStartFrame() /*-{
		return this.currentStartFrame;
	}-*/;
	
	public final native String getNextSequence() /*-{
		return this.nextSequence;
	}-*/;	
	
	public final native boolean getPaused() /*-{
		return this.paused;
	}-*/;
	
	public final native SpriteSheetImpl getSpriteSheet() /*-{
		return this.spriteSheet;
	}-*/;
	
	public final native void setCurrentFrame(int frame) /*-{
		this.currentFrame = frame;
	}-*/;
	
	public final native void setPaused(boolean paused) /*-{
		this.paused = paused;
	}-*/;
	
	public final native void setSpriteSheet(SpriteSheetImpl spriteSheet) /*-{
		this.spriteSheet = spriteSheet;
	}-*/;
	
}
