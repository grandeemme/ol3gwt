package ol.gwt.geom;

import ol.gwt.Coordinate;

public class MultiPoint extends SimpleGeometry {
	protected MultiPoint() {
	}

	public static native MultiPoint create(Coordinate[] pts) /*-{
		return new $wnd.ol.geom.MultiPoint(pts);
	}-*/;

	public final native Coordinate[] getCoordinates()/*-{
		return this.getCoordinates()
	}-*/;
}
