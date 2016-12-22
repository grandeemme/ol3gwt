package ol.gwt.geom;

import ol.gwt.Coordinate;
import ol.gwt.Extent;

public class Polygon extends SimpleGeometry {

	protected Polygon() {
	}

	public static native Polygon create(Coordinate[][] coordinates)/*-{
		return new $wnd.ol.geom.Polygon(coordinates);
	}-*/;

	public static native Polygon create(Coordinate[][] coordinates, GeometryLayout layout)/*-{
		return new $wnd.ol.geom.Polygon(coordinates, layout);
	}-*/;

	public static native Polygon fromExtent(Extent extent)/*-{
		return $wnd.ol.geom.Polygon.fromExtent(extent);
	}-*/;

	public static native Polygon fromLinearRings(LinearRing[] rings)/*-{
		var coords = [];
		for (i = 0; i < rings.length; i++) {
			coords[i] = rings[i].getCoordinates();
		}
		return new $wnd.ol.geom.Polygon(coords);
	}-*/;

	public static native Polygon fromCircle(Circle circle)/*-{
		return new $wnd.ol.geom.Polygon.fromCircle(circle);
	}-*/;

	public final native Coordinate[][] getCoordinates()/*-{
		return this.getCoordinates();
	}-*/;

	public final native LinearRing getLinearRing(int index)/*-{
		return this.getLinearRing(index);
	}-*/;

	public final native Point getInteriorPoint()/*-{
		return this.getInteriorPoint();
	}-*/;

}
