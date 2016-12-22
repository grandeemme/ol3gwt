package ol.gwt;

import ol.gwt.feature.Feature;
import ol.gwt.layer.Layer;

public interface FeatureCallback {

	public Feature onFeature(Feature feature, Layer layer);

}
