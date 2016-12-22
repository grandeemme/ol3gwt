package ol.gwt.event;

import com.google.gwt.dom.client.NativeEvent;

public class MapBrowserEvent extends MapEvent {

	protected MapBrowserEvent() {
	}

	public final native boolean getDragging()/*-{
		return this.dragging ? true : false;
	}-*/;

	public final native NativeEvent getOriginalEvent()/*-{
		return this.originalEvent;
	}-*/;

}
