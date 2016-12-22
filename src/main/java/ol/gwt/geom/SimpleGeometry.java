package ol.gwt.geom;

import ol.gwt.Coordinate;

/**
 * Simple geometry
 *
 */
public class SimpleGeometry extends Geometry {
	protected SimpleGeometry() {
	}

	public native final Coordinate getLastCoordinate() /*-{
		return this.getLastCoordinate()
	}-*/;

	public native final Coordinate getFirstCoordinate()/*-{
		return this.getFirstCoordinate()
	}-*/;

	public native final String getProjection() /*-{
		return this.projection;
	}-*/;

	public native final void setProjection(String projection) /*-{
		this.projection = projection;
	}-*/;

	public native final void translate(double deltaX, double deltaY) /*-{
		this.translate(deltaX, deltaY)
	}-*/;

}
