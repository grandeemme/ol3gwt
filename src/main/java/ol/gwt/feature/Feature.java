package ol.gwt.feature;

import com.google.gwt.core.client.JsArray;

import ol.gwt.Object;
import ol.gwt.geom.Geometry;
import ol.gwt.style.Style;

/**
 * A vector object for geographical features with a geometry and other attribute properties, similar to the features in
 * vector file formats like GeoJSON. Features can be styled individually or use the style of their vector layer.
 */
public class Feature extends Object {

	public static final String TEMP_ID = "TEMP_ID";

	protected Feature() {
	}

	public static final native Feature create()/*-{
		return new $wnd.ol.Feature();
	}-*/;

	public static final native Feature create(Geometry geometry)/*-{
		return new $wnd.ol.Feature(geometry);
	}-*/;

	public final native String getId()/*-{
		return this.getId();
	}-*/;

	public final native void setId(String id)/*-{
		this.setId(id);
	}-*/;

	public final native void setGeometry(Geometry geometry)/*-{
		this.setGeometry(geometry);
	}-*/;

	public final native Geometry getGeometry()/*-{
		return this.getGeometry();
	}-*/;

	public final native void setStyle(Style style)/*-{
		this.setStyle(style);
	}-*/;

	public final native void setStyles(JsArray<Style> styles)/*-{
		this.setStyle(styles);
	}-*/;

	public final native Style getStyle()/*-{
		return this.getStyle();
	}-*/;

	public final native JsArray<Style> getStyles()/*-{
		return this.getStyle();
	}-*/;

	public final native Feature clone()/*-{
		return this.clone();
	}-*/;

	public native final void addFeatureChangeListener(FeatureChangeListener listener)/*-{
		var that = this;
		var callback = function() {
			$entry(listener.@ol.gwt.feature.FeatureChangeListener::featureChanged(Lol/gwt/feature/Feature;)(that));
		};
		this.on("change", callback, this);
	}-*/;
}
