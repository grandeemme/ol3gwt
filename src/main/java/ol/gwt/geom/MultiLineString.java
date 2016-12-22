package ol.gwt.geom;

import ol.gwt.Coordinate;

public class MultiLineString extends SimpleGeometry {
	protected MultiLineString() {

	}

	public static native MultiLineString create(Coordinate[][] coordinates)/*-{
		return new $wnd.ol.geom.MultiLineString(coordinates);
	}-*/;

	public static native MultiLineString create(Coordinate[][] coordinates, GeometryLayout layout)/*-{
		return new $wnd.ol.geom.MultiLineString(coordinates, layout);
	}-*/;

	public final native Coordinate[][] getCoordinates()/*-{
		return this.getCoordinates();
	}-*/;
}
