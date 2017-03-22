package ol.gwt.interaction;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Collection;
import ol.gwt.event.Event;
import ol.gwt.feature.Feature;

public class ModifyEvent extends JavaScriptObject implements Event {

	protected ModifyEvent() {
	}

	public final native Collection<Feature> getFeatures()/*-{
		return this.features;
	}-*/;
}
