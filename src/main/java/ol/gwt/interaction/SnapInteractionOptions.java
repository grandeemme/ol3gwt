package ol.gwt.interaction;

import ol.gwt.Collection;
import ol.gwt.feature.Feature;
import ol.gwt.source.VectorSource;

public class SnapInteractionOptions extends PointerInteraction {

	protected SnapInteractionOptions() {
	}

	public static final native SnapInteractionOptions create()/*-{
	 return {};
	}-*/;
	
	/**
	 * Sets destination collection for the drawn features
	 *
	 * @param features
	 */
	public final native void setFeatures(Collection<Feature> features)/*-{
		this.features = features;
	}-*/;

	/**
	 * Sets destination source for the drawn features
	 *
	 * @param source
	 */
	public final native void setSource(VectorSource source)/*-{
		this.source = source;
	}-*/;
}
