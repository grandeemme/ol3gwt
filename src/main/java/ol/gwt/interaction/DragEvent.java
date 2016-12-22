package ol.gwt.interaction;

import ol.gwt.event.Event;
import ol.gwt.feature.Feature;

public class DragEvent implements Event {

	Feature feature;

	public DragEvent(Feature feature) {
		super();
		this.feature = feature;
	}

	public Feature getFeature() {
		return feature;
	}

}
