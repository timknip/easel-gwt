package easeljs.client.display;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

import easeljs.client.display.impl.SpriteSheetImpl;

/**
 * Encapsulates the properties associated with a sprite sheet. 
 * A sprite sheet is a series of images (usually animation frames) 
 * combined into a single image on a regular grid. 
 * For example, an animation consisting of 8 100x100 images 
 * could be combined into a 400x200 sprite sheet (4 frames across by 2 high).
 * The simplest form of sprite sheet has values for the image, frameWidth, 
 * and frameHeight properties, but does not include frameData. 
 * It will then play all of the frames in the animation and loop 
 * if the loop property is true. In this simple mode, you can also 
 * set the totalFrames property if you have extraneous frames in your 
 * sprite sheet (for example, a 2x4 frame sprite sheet, with 
 * only 7 frames used).<br/><br/>
 * More complex sprite sheets include a frameData property, which provides 
 * named frames and animations which can be played and sequenced together. 
 * See frameData for more information.
 * 
 * @author timk
 */
public class SpriteSheet {
	protected SpriteSheetImpl impl;
	
	/**
	* Constructs a new SpriteSheet object.
	* @param image The Image, Canvas, or Video instance to use as a sprite sheet.
	* @param frameWidth The width in pixels of each frame on the sprite sheet.
	* @param frameHeight The height in pixels of each frame on the sprite sheet.
	* @param frameData Defines named frames and frame sequences. See the frameData property for more information.
	*/
	public SpriteSheet(Element image, 
			int frameWidth, int frameHeight) {
		this(SpriteSheetImpl.create(image, frameWidth, frameHeight));
	}
	
	/**
	* Constructs a new SpriteSheet object.
	* @param image The Image, Canvas, or Video instance to use as a sprite sheet.
	* @param frameWidth The width in pixels of each frame on the sprite sheet.
	* @param frameHeight The height in pixels of each frame on the sprite sheet.
	* @param frameData Defines named frames and frame sequences. See the frameData property for more information.
	*/
	public SpriteSheet(Element image, 
			int frameWidth, int frameHeight, 
			JavaScriptObject frameData) {
		this(SpriteSheetImpl.create(image, frameWidth, frameHeight, frameData));
	}
	
	protected SpriteSheet(SpriteSheetImpl impl) {
		setImpl(impl);
	}
	
	public SpriteSheet clone() {
		return new SpriteSheet(impl.clone());
	}
	
	/** 
	 * The Image, Canvas, or Video instance to use as a sprite sheet. 
	 */
	public Element getImage() {
		return impl.getImage();
	}

	/** 
	 * The width in pixels of each frame on the sprite sheet image. 
	 */
	public int getFrameWidth() {
		return impl.getFrameWidth();
	}
	
	/** 
	 * The height in pixels of each frame on the sprite sheet image. 
	 */
	public int getFrameHeight() {
		return impl.getFrameHeight();
	}
	
	/** 
	 * Defines named frames and frame sequences. 
	 * Frame data is specified as a generic object, where each property name will 
	 * be used to define a new named frame or sequence. 
	 * Named frames specify a frame number. Sequences are defined 
	 * using an array of 2 or 3 values: the start frame, 
	 * the end frame, and optionally the name of the next 
	 * sequence to play.<br/><br/>For example, examine the following 
	 * frame data:<br/>{walk:[0,20], shoot:[21,25,"walk"], 
	 * crouch:[26,30,false], stand:31}<br/>This will 
	 * create 3 sequences and a named frame. The first sequence will 
	 * be named "walk", and will loop frames 0 to 20 inclusive. 
	 * The second sequence will be named "shoot", and will play 
	 * frames 21 to 25 then play the walk sequence. 
	 * The third sequence "crouch" will play frames 26 to 30 then 
	 * pause on frame 30, due to false being passed as the next sequence. 
	 * The named frame "stand" will display frame 31. 
	 */
	public JavaScriptObject getFrameData() {
		return impl.getFrameData();
	}
	
	/** 
	 * The loop property is only used if no frameData 
	 * is specified, and indicates whether all frames 
	 * (as specified with totalFrames) should loop. If false, 
	 * the animation will play to totalFrames, then pause. 
	 */
	public boolean getLoop() {
		return impl.getLoop();
	}
	
	/** 
	 * Specifies the total number of frames in the sprite sheet 
	 * if no frameData is specified. This is useful for excluding
	 * extraneous frames (for example, if you have 7 frames in a 2x4 sprite sheet). 
	 * The total frames will be automatically calculated by BitmapSequence 
	 * based on frame and image dimensions if totalFrames is 0. 
	 */
	public int getTotalFrames() {
		return impl.getTotalFrames();
	}
	
	public SpriteSheetImpl getImpl() {
		return impl;
	}
	
	public void setImage(Element image) {
		impl.setImage(image);
	}
	
	public void setFrameWidth(int frameWidth) {
		impl.setFrameWidth(frameWidth);
	}
	
	public void setFrameHeight(int frameHeight) {
		impl.setFrameHeight(frameHeight);
	}
	
	public void setFrameData(JavaScriptObject frameData) {
		impl.setFrameData(frameData);
	}
	
	public void setLoop(boolean loop) {
		impl.setLoop(loop);
	}
	
	public void setTotalFrames(int totalFrames) {
		impl.setTotalFrames(totalFrames);
	}
	
	public void setImpl(SpriteSheetImpl impl) {
		this.impl = impl;
	}
}
