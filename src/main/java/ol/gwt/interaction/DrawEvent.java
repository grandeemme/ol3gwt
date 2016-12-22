package ol.gwt.interaction;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.event.Event;
import ol.gwt.feature.Feature;

public class DrawEvent extends JavaScriptObject implements Event {

	protected DrawEvent() {
	}

	public final native Feature getFeature()/*-{
		return this.feature;
	}-*/;
}
