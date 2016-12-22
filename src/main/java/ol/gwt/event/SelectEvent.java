package ol.gwt.event;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.feature.Feature;

public class SelectEvent extends JavaScriptObject implements Event {

	protected SelectEvent() {
	}

	public final native Feature[] getDeselected()/*-{
		return this.deselected;
	}-*/;

	public final native MapBrowserEvent getMapBrowserEvent()/*-{
		return this.mapBrowserEvent;
	}-*/;

	public final native Feature[] getSelected()/*-{
		return this.selected;
	}-*/;

}
