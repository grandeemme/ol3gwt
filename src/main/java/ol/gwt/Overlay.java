package ol.gwt;

import com.google.gwt.dom.client.Element;

/**
 * Wrapper for an overlay displayed on a map
 */
public class Overlay extends Object {

	public static final String BOTTOM_LEFT = "bottom-left";
	public static final String BOTTOM_CENTER = "bottom-center";
	public static final String BOTTOM_RIGHT = "bottom-right";
	public static final String CENTER_LEFT = "center-left";
	public static final String CENTER_CENTER = "center-center";
	public static final String CENTER_RIGHT = "center-right";
	public static final String TOP_LEFT = "top-left";
	public static final String TOP_CENTER = "top-center";
	public static final String TOP_RIGHT = "top-right";

	protected Overlay() {

	}

	public static native Overlay create()
	/*-{
		return new $wnd.ol.Overlay();
	}-*/;

	public static native Overlay create(String elementHTML, Double[] offset, Coordinate position, String positioning) /*-{
		var element = document.createElement("div");
		element.innerHTML = elementHTML;

		return new $wnd.ol.Overlay({
			element : element,
			offset : offset,
			position : position,
			positioning : positioning
		});
	}-*/;

	public static native Overlay create(Element element, Double[] offset, Coordinate position, String positioning) /*-{
		return new $wnd.ol.Overlay({
			element : element,
			offset : offset,
			position : position,
			positioning : positioning
		});
	}-*/;

	public final native Element getElement()/*-{
		return this.getElement();
	}-*/;

	public final native Map getMap()/*-{
		return this.getMap();
	}-*/;

	public final native Double[] getOffset()/*-{
		return this.getOffset();
	}-*/;

	public final native Coordinate getPosition()/*-{
		return this.getPosition();
	}-*/;

	public final native String getPositioning()/*-{
		return this.getPositioning();
	}-*/;

	public final native void setElement(Element el)/*-{
		return this.setElement(el);
	}-*/;

	public final native void setElement(String el)/*-{
		var element = document.createElement("div");
		element.innerHTML = el;
		return this.setElement(element);
	}-*/;

	public final native void setMap(Map map)/*-{
		return this.setMap(map)
	}-*/;

	public final native void setOffset(Double[] offset)/*-{
		return this.setOffset(offset);
	}-*/;

	public final native void setPosition(Coordinate coord)/*-{
		return this.setPosition(coord);
	}-*/;

	public final native void setPositioning(String positioning)/*-{
		return this.setPositioning(positioning);
	}-*/;

	public final native void hide()/*-{
		return this.setPosition(undefined);
	}-*/;

}
