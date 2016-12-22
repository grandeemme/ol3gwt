package ol.gwt.proj;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Coordinate;
import ol.gwt.Extent;

/**
 * Projection object to be passed to underlying ol3.js api
 */
public class Projection extends JavaScriptObject {

	protected Projection() {
	}

	public static final native Projection get(String crsString)/*-{
		return $wnd.ol.proj.get(crsString);
	}-*/;

	public static final native Projection create(String code, Extent extent, String units)/*-{
		return new $wnd.ol.proj.Projection({
			code : code,
			extent : extent,
			units : units
		});
	}-*/;

	public static final native void addProjection(Projection projection)/*-{
		$wnd.ol.proj.addProjection(projection);
	}-*/;

	public final native Double getPointResolution(Double resolution, Coordinate point)/*-{
		this.getPointResolution(resolution, point);
	}-*/;

	public final native String getUnits()/*-{
		this.getUnits();
	}-*/;

	public final native String getCode() /*-{
		return this.getCode();
	}-*/;

	public final native void setExtent(Extent extent)/*-{
		this.setExtent(extent);
	}-*/;

	public final native Extent getExtent()/*-{
		return this.getExtent();
	}-*/;

}
