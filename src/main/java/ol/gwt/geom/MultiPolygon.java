package ol.gwt.geom;

import ol.gwt.Coordinate;

public class MultiPolygon extends SimpleGeometry {
	protected MultiPolygon() {
	}

	public static native MultiPolygon create(Coordinate[][][] coordinates)/*-{
		return new $wnd.ol.geom.MultiPolygon(coordinates);
	}-*/;

	public static native MultiPolygon create(Coordinate[][][] coordinates, GeometryLayout layout)/*-{
		return new $wnd.ol.geom.MultiPolygon(coordinates, layout);
	}-*/;
}
