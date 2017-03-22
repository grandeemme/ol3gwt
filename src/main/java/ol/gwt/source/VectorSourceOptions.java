package ol.gwt.source;

import com.google.gwt.core.client.JsArray;

import ol.gwt.Collection;
import ol.gwt.feature.Feature;
import ol.gwt.format.FeatureFormat;

/**
 * Vector source options passed to vector sources on construction
 */
public class VectorSourceOptions extends AbstractVectorSourceOptions {

	protected VectorSourceOptions() {
	}

	public static native final VectorSourceOptions create()/*-{
		return {};
	}-*/;

	public final native void setFeatures(JsArray<Feature> features)/*-{
		this.features = features;
	}-*/;

	public final native void setFeatureCollection(Collection<Feature> features)/*-{
		this.features = features;
	}-*/;

	public final native void setUrl(String url)/*-{
		this.url = url;
	}-*/;

	public final native void setFormat(FeatureFormat format)/*-{
		this.format = format;
	}-*/;

}
