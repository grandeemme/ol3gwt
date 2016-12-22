package ol.gwt.geom;

import ol.gwt.Coordinate;

public class LineString extends SimpleGeometry {
	protected LineString() {

	}

	public static native LineString create(Coordinate[] pts) /*-{
		return new $wnd.ol.geom.LineString(pts);
	}-*/;

	public native final Coordinate[] getCoordinates()/*-{
		return this.getCoordinates()
	}-*/;

	public native final double getLength()/*-{
		return this.getLength()
	}-*/;

}
