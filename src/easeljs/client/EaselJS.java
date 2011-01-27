package easeljs.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;

import easeljs.client.display.Container;
import easeljs.client.display.Stage;

public class EaselJS extends Widget implements RequiresResize {

	private Stage stage;
	private Container container;
	private float panX = 0f;
	private float panY = 0f;
	private Element canvas;
	
	public EaselJS() {
		this(Window.getClientWidth(), Window.getClientHeight());
	}
	
	public EaselJS(int width, int height) {
		super();
		Element div = DOM.createDiv();
		canvas = DOM.createElement("canvas");
		canvas.setAttribute("width", ""+width);
		canvas.setAttribute("height", ""+height);
		canvas.setAttribute("style", "background-color: #cccccc;");
		div.appendChild(canvas);
		setElement(div);
		
		stage = new Stage(canvas);
		container = new Container();
		stage.addChild(container);
	}
	
	/**
	 * Gets the canvas element.
	 * 
	 * @return
	 */
	public Element getCanvasElement() {
		return canvas;
	}
	
	/**
	 * Gets the main container.
	 * 
	 * @return
	 */
	public Container getContainer() {
		return container;
	}
	
	/**
	 * Gets the stage.
	 * 
	 * @return
	 */
	public Stage getStage() {
		return stage;
	}

	@Override
	public void onResize() {
		int width = getOffsetWidth();
		int height = getOffsetHeight();
		
		canvas.setAttribute("width", ""+width);
		canvas.setAttribute("height", ""+height);
		
		container.setX(panX + (width/2));
		container.setY(panY + (height/2));
	
		stage.tick();
	}

	public float getPanX() {
		return panX;
	}

	public void setPanX(float panX) {
		this.panX = panX;
	}

	public float getPanY() {
		return panY;
	}

	public void setPanY(float panY) {
		this.panY = panY;
	}
}
