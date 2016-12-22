package ol.gwt;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Map extent
 */
public class Extent extends JsArray<JavaScriptObject> {

	public static native Extent create(double minX, double minY, double maxX, double maxY)/*-{
		return [ minX, minY, maxX, maxY ];
	}-*/;

	protected Extent() {
	}

	public native final double getMinX()/*-{
		return this[0];
	}-*/;

	public native final double getMinY()/*-{
		return this[1];
	}-*/;

	public native final double getMaxX()/*-{
		return this[2];
	}-*/;

	public native final double getMaxY()/*-{
		return this[3];
	}-*/;

	public native final boolean containsExtent(Extent e2)/*-{
		return $wnd.ol.extent.containsExtent(this, e2);
	}-*/;

	public native final Coordinate getCenter()/*-{
		return $wnd.ol.extent.getCenter(this);
	}-*/;
}
