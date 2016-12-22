package ol.gwt.event;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Coordinate;
import ol.gwt.Map;
import ol.gwt.Pixel;

public class MapEvent extends JavaScriptObject implements Event {
	
	protected MapEvent(){}

	public final native Map getMap()/*-{
		return this.map;
	}-*/;

	public final native Coordinate getCoordinate()/*-{
		return this.coordinate;
	}-*/;

	public final native Pixel getPixel()/*-{
		return this.pixel;
	}-*/;
}
