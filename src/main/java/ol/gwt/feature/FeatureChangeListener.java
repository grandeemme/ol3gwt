package ol.gwt.feature;

/**
 * Listener interface to be implemented by classes that want to listen feature changes (caused by interactions for example)
 */
public interface FeatureChangeListener {
    public void featureChanged(Feature feature);
}
