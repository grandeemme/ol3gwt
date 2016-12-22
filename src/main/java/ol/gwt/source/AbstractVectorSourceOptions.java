package ol.gwt.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import ol.gwt.Attribution;
import ol.gwt.FeatureLoader;
import ol.gwt.strategy.LoadingStrategy;

/**
 * Options for the vector source
 */
public class AbstractVectorSourceOptions extends JavaScriptObject {

	protected AbstractVectorSourceOptions() {
	}

	public final native void setAttributions(JsArray<Attribution> attributions)/*-{
		this.attributions = attributions;
	}-*/;

	public final native void setLogo(String logo)/*-{
		this.logo = logo;
	}-*/;

	/**
	 * Destination projection. If provided, features will be transformed to this projection. If not provided, features
	 * will not be transformed
	 *
	 * @param projection
	 */
	public final native void setProjection(String projection)/*-{
		this.projection = projection;
	}-*/;

	public final native void setLoader(FeatureLoader loader)/*-{
		this.loader = function(extent, resolution, projection) {
			loader.@ol.gwt.FeatureLoader::load(Lol/gwt/Extent;DI)(extent, resolution, projection);
		};
	}-*/;

	public final native void setStrategy(LoadingStrategy strategy)/*-{
		this.strategy = strategy;
	}-*/;
}
