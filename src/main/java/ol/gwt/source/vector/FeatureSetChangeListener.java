package ol.gwt.source.vector;

import ol.gwt.feature.Feature;

/**
 * Listener for feature changes (add / remove) in a VectorSource
 */
public interface FeatureSetChangeListener {

	public void featureDeleted(Feature feature);

	public void featureAdded(Feature feature);

}
