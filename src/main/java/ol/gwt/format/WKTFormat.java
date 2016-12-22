package ol.gwt.format;

import ol.gwt.feature.Feature;
import ol.gwt.geom.Geometry;

/**
 * Reader/Writer for WKT features
 */
public class WKTFormat extends TextFeature {

	protected WKTFormat() {
	}

	public static final native WKTFormat create()/*-{
		return new $wnd.ol.format.WKT();
	}-*/;

	public static final native WKTFormat create(boolean splitCollection)/*-{
		return new $wnd.ol.format.WKT({
			splitCollection : splitCollection
		});
	}-*/;

	public final native Feature readFeature(String source, WKTFormatOptions opt_options)/*-{
		return this.readFeature(source, opt_options);
	}-*/;

	public final native Feature[] readFeatures(String source, WKTFormatOptions opt_options)/*-{
		return this.readFeatures(source, opt_options);
	}-*/;

	public final native Geometry readGeometry(String source, WKTFormatOptions opt_options)/*-{
		return this.readGeometry(source, opt_options);
	}-*/;

	public final native String writeFeatures(Feature[] features, WKTFormatOptions opt_options)/*-{
		return this.writeFeatures(features, opt_options);
	}-*/;

	public final native String writeFeature(Feature feature, WKTFormatOptions opt_options)/*-{
		return this.writeFeature(feature, opt_options);
	}-*/;

	public final native String writeGeometry(Geometry geometry)/*-{
		return this.writeGeometry(geometry);
	}-*/;

}
