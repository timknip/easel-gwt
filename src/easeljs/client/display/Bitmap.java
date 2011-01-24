package easeljs.client.display;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Image;

import easeljs.client.display.impl.BitmapImpl;

public class Bitmap extends DisplayObject {

	private Image image;
	
	public Bitmap(Image image) {
		this.overlay = BitmapImpl.create(image.getElement());
		this.image = image;
	}
	
	private Bitmap(BitmapImpl overlay) {
		this.overlay = overlay;
	}
	
	@Override
	public void cache(float x, float y, float w, float h) {
	}
	
	@Override
	public DisplayObject clone() {
		return new Bitmap((BitmapImpl)this.overlay.clone());
	}
	
	@Override
	public void draw(JavaScriptObject ctx, boolean ignoreCache) {
	}
	
	public Element getImageElement() {
		return ((BitmapImpl)overlay).getImage();
	}
	
	public Image getImage() {
		return image;
	}
}
