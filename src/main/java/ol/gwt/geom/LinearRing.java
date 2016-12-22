package ol.gwt.geom;

import ol.gwt.Coordinate;

public class LinearRing extends SimpleGeometry {
	protected LinearRing() {
	}

	public static native LinearRing create(Coordinate[] pts) /*-{
		return new $wnd.ol.geom.LinearRing(pts);
	}-*/;

	public final native Coordinate[] getCoordinates()/*-{
		return this.getCoordinates()
	}-*/;
}
