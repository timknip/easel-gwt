package easeljs.client.display.impl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class BitmapImpl extends DisplayObjectImpl {
	protected BitmapImpl() {}
	
	public static native BitmapImpl create(JavaScriptObject image) /*-{
		return new $wnd.Bitmap(image);
	}-*/;
	
	public final native Element getImage() /*-{
		return this.image;
	}-*/;
}
