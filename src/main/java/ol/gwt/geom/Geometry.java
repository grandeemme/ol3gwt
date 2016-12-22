package ol.gwt.geom;

import com.google.gwt.core.client.JavaScriptObject;

import ol.gwt.Coordinate;
import ol.gwt.Extent;

/**
 * Wrapper for the geometry of a feature
 */
public class Geometry extends JavaScriptObject {
	protected Geometry() {
	}

	public final native void transform(String sourceProjection, String destinationProjection)/*-{
		this.transform(sourceProjection, destinationProjection);
	}-*/;

	public final native Geometry clone()/*-{
		return this.clone();
	}-*/;

	public final native String getType()/*-{
		return this.getType();
	}-*/;

	public final native Boolean containsCoordinate(Coordinate c)/*-{
		return this.containsCoordinate(c);
	}-*/;

	public final native Extent getExtent()/*-{
		return this.getExtent();
	}-*/;

	public final native Extent getExtent(Extent opt_extent)/*-{
		return this.getExtent(opt_extent);
	}-*/;

	public final native boolean intersectsExtent(Extent extent)/*-{
		var b = this.intersectsExtent(extent);
		return b | false;
	}-*/;

}
